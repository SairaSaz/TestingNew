public class Task2_9 {
    public static void main(String[] args) {
        boolean result = itLeapYears (2015);
            System.out.println(result);
        }

        public static boolean itLeapYears ( int yers) {
            if (yers % 400 == 0) {
                return true;
            }
            if (yers % 100 == 0) {
                return false;
            }
            if (yers % 4 == 0) {
                return true;
            }
            return false;
        }
}