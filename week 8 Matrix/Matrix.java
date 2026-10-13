public class Matrix implements Cloneable {

    private int rows;
    private int columns;
    private int[] data;

    // Constructor
    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.data = new int[rows * columns];
    }

    // Constructor with source array
    public Matrix(int rows, int columns, int[] source) {
        this.rows = rows;
        this.columns = columns;

        this.data = new int[source.length];

        for (int i = 0; i < source.length; i++) {
            this.data[i] = source[i];
        }
    }

    // Get value
    public int get(int row, int column) {
        int index = row * columns + column;
        return data[index];
    }

    // Set value
    public void set(int row, int column, int value) {
        int index = row * columns + column;
        data[index] = value;
    }

    // Shallow copy
    @Override
    public Matrix clone() throws CloneNotSupportedException {
        return (Matrix) super.clone();
    }

    // Deep copy
    public Matrix deepCopy() {
        Matrix newMatrix = new Matrix(this.rows, this.columns);

        for (int i = 0; i < this.data.length; i++) {
            newMatrix.data[i] = this.data[i];
        }

        return newMatrix;
    }

    // To String
    @Override
    public String toString() {
        String result = "[";

        for (int row = 0; row < rows; row++) {
            result += "[";

            for (int column = 0; column < columns; column++) {
                result += get(row, column);

                if (column < columns - 1) {
                    result += ", ";
                }
            }

            result += "]";

            if (row < rows - 1) {
                result += ", ";
            }
        }

        result += "]";

        return result;
    }
}
