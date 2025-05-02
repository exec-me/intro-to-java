package prac20.Matrix;

// Обобщённый класс Matrix, параметризованный типом T, который должен наследоваться от Number
public class Matrix<T extends Number> {
    private T[][] matrix; // Двумерный массив для хранения элементов матрицы
    private int rows;     // Количество строк
    private int cols;     // Количество столбцов

    // Конструктор матрицы заданного размера
    @SuppressWarnings("unchecked")
    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        // Создание массива обобщённого типа с приведением
        this.matrix = (T[][]) new Number[rows][cols];
    }

    // Метод установки значения в ячейку (row, col)
    public void set(int row, int col, T value) {
        if (row >= rows || col >= cols || row < 0 || col < 0) {
            throw new IllegalArgumentException("Недопустимые индексы");
        }
        matrix[row][col] = value;
    }

    // Метод получения значения из ячейки (row, col)
    public T get(int row, int col) {
        if (row >= rows || col >= cols || row < 0 || col < 0) {
            throw new IllegalArgumentException("Недопустимые индексы");
        }
        return matrix[row][col];
    }

    // Метод сложения двух матриц одинакового размера
    public Matrix<T> add(Matrix<T> other) {
        if (this.rows != other.rows || this.cols != other.cols) {
            throw new IllegalArgumentException("Размеры матриц не совпадают");
        }
        Matrix<T> result = new Matrix<>(rows, cols);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // Преобразование к double для сложения и обратно к T (через Double)
                double sum = this.matrix[i][j].doubleValue() + other.matrix[i][j].doubleValue();
                result.set(i, j, (T) Double.valueOf(sum)); // Приведение к T
            }
        }
        return result;
    }

    // Метод умножения матриц: this * other
    public Matrix<T> multiply(Matrix<T> other) {
        if (this.cols != other.rows) {
            throw new IllegalArgumentException("Нельзя умножить матрицы: неподходящие размеры");
        }
        Matrix<T> result = new Matrix<>(this.rows, other.cols);

        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < other.cols; j++) {
                double sum = 0;
                for (int k = 0; k < this.cols; k++) {
                    sum += this.matrix[i][k].doubleValue() * other.matrix[k][j].doubleValue();
                }
                result.set(i, j, (T) Double.valueOf(sum)); // Преобразование обратно к T
            }
        }
        return result;
    }

    // Метод транспонирования матрицы (замена строк и столбцов)
    public Matrix<T> transpose() {
        Matrix<T> result = new Matrix<>(cols, rows);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.set(j, i, matrix[i][j]); // Перестановка индексов
            }
        }
        return result;
    }

    // Метод для строкового представления матрицы
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sb.append(matrix[i][j]).append("\t");
            }
            sb.append("\n");
        }

        return sb.toString();
    }
}

