package prac23.Ex4;

public class ExpressionParser {
    private String expression;
    private int pos;

    public TripleExpression parse(String expr) {
        if (expr == null || expr.trim().isEmpty()) {
            throw new IllegalArgumentException("Expression cannot be empty");
        }
        this.expression = expr.replaceAll("\\s+", "");
        this.pos = 0;
        TripleExpression result = parseAddSubtract();
        if (pos < expression.length()) {
            throw new IllegalArgumentException("Unexpected character at position " + pos + ": " + expression.charAt(pos));
        }
        return result;
    }

    private TripleExpression parseAddSubtract() {
        TripleExpression result = parseMultiplyDivide();
        while (pos < expression.length()) {
            char op = expression.charAt(pos);
            if (op != '+' && op != '-') {
                break;
            }
            pos++;
            TripleExpression right = parseMultiplyDivide();
            if (op == '+') {
                result = new Add(result, right);
            } else {
                result = new Subtract(result, right);
            }
        }
        return result;
    }

    private TripleExpression parseMultiplyDivide() {
        TripleExpression result = parseUnary();
        while (pos < expression.length()) {
            char op = expression.charAt(pos);
            if (op != '*' && op != '/') {
                break;
            }
            pos++;
            TripleExpression right = parseUnary();
            if (op == '*') {
                result = new Multiply(result, right);
            } else {
                result = new Divide(result, right);
            }
        }
        return result;
    }

    private TripleExpression parseUnary() {
        if (pos >= expression.length()) {
            throw new IllegalArgumentException("Unexpected end of expression");
        }
        char c = expression.charAt(pos);
        if (c == '-') {
            pos++;
            TripleExpression operand = parseUnary();
            return new UnaryMinus(operand);
        } else if (c == '(') {
            pos++;
            TripleExpression result = parseAddSubtract();
            if (pos >= expression.length() || expression.charAt(pos) != ')') {
                throw new IllegalArgumentException("Expected closing parenthesis at position " + pos);
            }
            pos++;
            return result;
        } else if (Character.isDigit(c)) {
            return parseNumber();
        } else if (Character.isLetter(c)) {
            return parseVariable();
        } else {
            throw new IllegalArgumentException("Unexpected character at position " + pos + ": " + c);
        }
    }

    private TripleExpression parseNumber() {
        StringBuilder number = new StringBuilder();
        while (pos < expression.length() && Character.isDigit(expression.charAt(pos))) {
            number.append(expression.charAt(pos));
            pos++;
        }
        try {
            return new Const(Integer.parseInt(number.toString()));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Number too large at position " + (pos - number.length()));
        }
    }

    private TripleExpression parseVariable() {
        if (pos >= expression.length()) {
            throw new IllegalArgumentException("Unexpected end of expression");
        }
        char c = expression.charAt(pos);
        if (c == 'x' || c == 'y' || c == 'z') {
            pos++;
            return new Variable(String.valueOf(c));
        }
        throw new IllegalArgumentException("Invalid variable at position " + pos + ": " + c);
    }
}