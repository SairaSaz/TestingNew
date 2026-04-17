public class Task2_12 {
    public static void main(String[] args) {
        int[] nums = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        //Убрать комменты,чтобы увидеть массив "Было"//
       /* for (int i = 0; i < nums.length; i++) {
           System.out.print(nums[i] + " ");}
        System.out.println();*/
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 6) {
                nums[i] = nums[i] * 2;
            }
            System.out.print(nums[i] + " ");
        }
    }
}//12. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
