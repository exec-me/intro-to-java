package prac23.Ex4;

public abstract class BinaryOperation implements TripleExpression {
    protected final TripleExpression left;
    protected final TripleExpression right;

    public BinaryOperation(TripleExpression left, TripleExpression right) {
        this.left = left;
        this.right = right;
    }

    protected abstract int apply(int a, int b);

    @Override
    public int evaluate(int x, int y, int z) {
        int a = left.evaluate(x, y, z);
        int b = right.evaluate(x, y, z);
        return apply(a, b);
    }
}
