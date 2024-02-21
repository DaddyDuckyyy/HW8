public class Task4 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3};
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 != 0) {
                arr1[i]++;
            }
            System.out.print(arr1[i] + " ");
        }
    }
}
