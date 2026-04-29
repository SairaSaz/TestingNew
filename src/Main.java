public class Main {
    public static int sumArrayElements(String[][] array)
            throws MyArraySizeException, MyArrayDataException {

        if (array.length != 4) {
            throw new MyArraySizeException("Ошибка! Строк должно быть 4, а у вас " + array.length);
        }

        for (int i = 0; i < 4; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException("Ошибка! В строке " + i +
                        " должно быть 4 столбца, а у вас " + array[i].length);
            }
        }

        int sum = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    int number = Integer.parseInt(array[i][j]);
                    sum = sum + number;
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j, array[i][j]);
                }
            }
        }

        return sum;
    }

    public static void main(String[] args) {

        String[][] array = {
                {"1", "2", "3", "4"},
                {"5","6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            int result = sumArrayElements(array);
            System.out.println("Сумма всех элементов: " + result);
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
            System.out.println("Строка: " + e.getRow() + ", Столбец: " + e.getColumn());
            System.out.println("Значение: " + e.getValue());
        }
    }
}


