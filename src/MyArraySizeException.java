public class MyArraySizeException extends Exception {
    public MyArraySizeException(String text) {
        super(text);
    }
}
class MyArrayDataException extends Exception {

    private int row;
    private int column;
    private String value;

    public MyArrayDataException(int row, int col, String value) {
        super("Ошибка в ячейке [" + row + "][" + col + "]: '" + value + "' не является числом");
        this.row = row;
        this.column = col;
        this.value = value;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public String getValue() {
        return value;
    }
}
