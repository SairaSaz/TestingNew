public class Main_1 {
    public static void main(String[] args) {

        int[] numbers = {11, 22, 33, 44, 55, 66};
        System.out.println("Размер массива: " + numbers.length);

        try {
            int index = 8;
            int value = numbers[index];
            System.out.println("Элемент с индексом " + index + ": " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Поймали исключение ArrayIndexOutOfBoundsException!");
            System.out.println("Сообщение: " + e.getMessage());
        }
    }
}

