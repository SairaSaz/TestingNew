public class Lesson2 {
    static void main(String [] args) {
       checkSumSing();
       }

    static void checkSumSing() {
        int a = 1;
        int b = 2;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Сумма отрицательная");
        }

    }
}
