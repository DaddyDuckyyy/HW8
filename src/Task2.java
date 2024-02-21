public class Task2 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3};
        double[] arr2 = new double[]{1.57, 7.654, 9.986};
        String[] arr3 = new String[2];
        arr3[0] = "yes";
        arr3[1] = "no";

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]);
            if (i != arr1.length - 1) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]);
            if (i != arr2.length - 1) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]);
            if (i != arr3.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
