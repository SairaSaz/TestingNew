public class Task2_14 {
    public static void main(String[] args) {
        int[] result = retusnArray(7, 5);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
    public static int[] retusnArray( int len, int intValeas) {
        int [] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = intValeas;
        }
        return array;
    }
}
/*14. Написать метод, принимающий на вход два аргумента: len и initialValue,
 и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue.*/
