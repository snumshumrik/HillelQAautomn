public class chetne2 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 8, 4, 5, 6, 1, 5};
        printOddNumbers(arr);
    }

    public static void printOddNumbers(int[] arr) {
        for (int x = 0; x < arr.length; x++)
            if (arr[x] % 2 != 0)
                System.out.print(arr[x] + ", ");
    }
}
