public class sum {
    public static void main(String[] args){
        int[] nums = {6, 7, 8, 9, 10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44};
        int sum = 0;

        for (int i = 0; i < nums.length; i++) sum += nums[i];
        System.out.println("Сумма = " + sum);
    }
}
