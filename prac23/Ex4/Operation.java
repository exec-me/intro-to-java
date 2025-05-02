package prac23.Ex4;


class Add extends BinaryOperation {
    public Add(TripleExpression left, TripleExpression right) {
        super(left, right);
    }

    @Override
    protected int apply(int a, int b) {
        long result = (long) a + b;
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            throw new ArithmeticException("overflow");
        }
        return (int) result;
    }
}

class Subtract extends BinaryOperation {
    public Subtract(TripleExpression left, TripleExpression right) {
        super(left, right);
    }

    @Override
    protected int apply(int a, int b) {
        long result = (long) a - b;
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            throw new ArithmeticException("overflow");
        }
        return (int) result;
    }
}

class Multiply extends BinaryOperation {
    public Multiply(TripleExpression left, TripleExpression right) {
        super(left, right);
    }

    @Override
    protected int apply(int a, int b) {
        long result = (long) a * b;
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            throw new ArithmeticException("overflow");
        }
        return (int) result;
    }
}

class Divide extends BinaryOperation {
    public Divide(TripleExpression left, TripleExpression right) {
        super(left, right);
    }

    @Override
    protected int apply(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("division by zero");
        }
        return a / b;
    }
}

class UnaryMinus implements TripleExpression {
    private final TripleExpression operand;

    public UnaryMinus(TripleExpression operand) {
        this.operand = operand;
    }

    @Override
    public int evaluate(int x, int y, int z) {
        int value = operand.evaluate(x, y, z);
        if (value == Integer.MIN_VALUE) {
            throw new ArithmeticException("overflow");
        }
        return -value;
    }
}
