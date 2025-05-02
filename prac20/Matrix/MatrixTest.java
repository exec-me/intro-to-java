///Написать класс Matrix, на основе обобщенного типа,
/// реализовать операции с матрицами
package prac20.Matrix;

public class MatrixTest {
    public static void main(String[] args) {
        // Создание матриц
        Matrix<Double> matrix1 = new Matrix<>(2, 3);
        matrix1.set(0, 0, 1.0);
        matrix1.set(0, 1, 2.0);
        matrix1.set(0, 2, 3.0);
        matrix1.set(1, 0, 4.0);
        matrix1.set(1, 1, 5.0);
        matrix1.set(1, 2, 6.0);

        Matrix<Double> matrix2 = new Matrix<>(2, 3);
        matrix2.set(0, 0, 7.0);
        matrix2.set(0, 1, 8.0);
        matrix2.set(0, 2, 9.0);
        matrix2.set(1, 0, 1.0);
        matrix2.set(1, 1, 2.0);
        matrix2.set(1, 2, 3.0);

        // Сложение
        System.out.println("Матрица 1:");
        System.out.println(matrix1);
        System.out.println("Матрица 2:");
        System.out.println(matrix2);
        System.out.println("Сложение:");
        System.out.println(matrix1.add(matrix2));

        // Транспонирование
        System.out.println("Транспонированная матрица 1:");
        System.out.println(matrix1.transpose());

        // Умножение
        Matrix<Double> matrix3 = new Matrix<>(3, 2);
        matrix3.set(0, 0, 1.0);
        matrix3.set(0, 1, 2.0);
        matrix3.set(1, 0, 3.0);
        matrix3.set(1, 1, 4.0);
        matrix3.set(2, 0, 5.0);
        matrix3.set(2, 1, 6.0);

        System.out.println("Матрица 3:");
        System.out.println(matrix3);
        System.out.println("Умножение матрицы 1 на матрицу 3:");
        System.out.println(matrix1.multiply(matrix3));
    }
}
