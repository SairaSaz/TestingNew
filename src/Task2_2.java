public class Task2_2 {
    public static void main(String [] args) {
    printColor();
}
    static void printColor() {
        int value = 5;
        if (value < 0) {
            System.out.println("Красный");
        }
        else if (value > 0 && value < 100) {
            System.out.println("Желтый");
        }
        else {
            System.out.println("Зеленый");
        }

    }
}