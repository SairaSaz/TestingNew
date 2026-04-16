public class Lesson2 {
    public static void main(String[] args) {
        isSumInRange10To20();
    }
    public static void isSumInRange10To20() {
        int a = 12;
        int b = 2;
        int sum = a + b;
        if (sum >10 && sum < 20) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

    }
}