public class Main_5 {
    public static void checkArraySize(String[][] array) throws MyArraySizeException {
        if (array.length != 4) {
            throw new MyArraySizeException("Ошибка! Строк должно быть 4");
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException(
                        "Ошибка! должно быть 4 столбца, а не "
                                + array[i].length);
            }
        }
    }

    public static void main(String[] args) {
        String[][] table = new String[4][5];
        try {
            checkArraySize(table);
            System.out.println("Размер правильный");
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());

        }
    }
}
