package prac401.task4;

public class Matrix {
    private double[][] data;
    private int rows;
    private int cols;

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.data = new double[rows][cols];
    }

    public void setElement(int row, int col, double value) {
        if (row >= 0 && row < rows && col >= 0 && col < cols) {
            data[row][col] = value;
        }
    }

    public Matrix add(Matrix other) {
        if (this.rows != other.rows || this.cols != other.cols) {
            throw new IllegalArgumentException("Matrix must be the same size");
        }
        Matrix result = new Matrix(rows, cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.data[i][j] = this.data[i][j] + other.data[i][j];
            }
        }
        return result;
    }

    public Matrix multiply(double scalar) {
        Matrix result = new Matrix(rows, cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.data[i][j] = this.data[i][j] * scalar;
            }
        }
        return result;
    }

    public Matrix multiply(Matrix other) {
        if (this.cols != other.rows) {
            throw new IllegalArgumentException("Cols 1st matrix must equals to rows of 2nd");
        }
        Matrix result = new Matrix(this.rows, other.cols);
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < other.cols; j++) {
                for (int k = 0; k < this.cols; k++) {
                    result.data[i][j] += this.data[i][k] * other.data[k][j];
                }
            }
        }
        return result;
    }

    public void print() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Matrix m1 = new Matrix(2, 2);
        m1.setElement(0, 0, 1);
        m1.setElement(0, 1, 2);
        m1.setElement(1, 0, 3);
        m1.setElement(1, 1, 4);

        Matrix m2 = new Matrix(2, 2);
        m2.setElement(0, 0, 5);
        m2.setElement(0, 1, 6);
        m2.setElement(1, 0, 7);
        m2.setElement(1, 1, 8);

        System.out.println("Matrix 1:");
        m1.print();
        System.out.println("Matrix 2:");
        m2.print();

        System.out.println("\nSum:");
        Matrix sum = m1.add(m2);
        sum.print();

        System.out.println("\nProduct on number:");
        Matrix scaled = m1.multiply(2);
        scaled.print();

        System.out.println("\nProduct:");
        Matrix product = m1.multiply(m2);
        product.print();
    }
}
