import java.util.Arrays;

public class Lesson2Homework {
    public static void main(String[] args) {

        //1.
        System.out.println("Task #1");
        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(invertArray(arr1)));
        System.out.println();

        //2.
        System.out.println("Task #2");
        System.out.println(Arrays.toString(fillArray()));
        System.out.println();

        //3.
        System.out.println("Task #3");
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(changeArray(arr3)));
        System.out.println();

        //4.
        System.out.println("Task #4");
        printTwoDimArr(fillDiagonal(10));
        System.out.println();

        //5.**
        System.out.println("Task #5");
        int[] arr5 = {8, 15, 0, -2, 27, 183, 280, -30, 38, 1038, 0, 2, 8, 20};
        findMaxMin(arr5);
        System.out.println();

        //6.**
        System.out.println("Task #6");
        int[] arr6 = {1, 1, 1, 1, 4};
        System.out.println(checkBalance(arr6));
        System.out.println();

        //7.****
        System.out.println("Task #7");
        int[] arr7 = {3, 6, 8, 1, 0};
        System.out.println(Arrays.toString(arr7));
        System.out.println(Arrays.toString(displace(arr7, -2)));
    }

    //1.
    public static int[] invertArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else if (arr[i] == 1) {
                arr[i] = 0;
            }
        }
        return arr;
    }

    //2.
    public static int[] fillArray() {
        int counter = 0;
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = counter;
            counter += 3;
        }
        return arr;
    }

    //3.
    public static int[] changeArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        return arr;
    }

    //4.
    public static int[][] fillDiagonal(int size) {
        int[][] arr = new int[size][size];
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][arr.length - 1 - i] = 1;
        }
        return arr;
    }

    public static void printTwoDimArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    //5.**
    public static void findMaxMin(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            } else if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Максимальное значение массива: " + max);
        System.out.println("Минимальное значение массива: " + min);
    }

    //6.**
    public static boolean checkBalance(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int diff = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            diff += arr[i];
            sum -= arr[i];
            if (diff == sum) {
                return true;
            }
        }
        return false;
    }

    //7.****
    public static int[] displace(int[] arr, int n) {
        int a = 0;
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                for (int j = arr.length - 1; j >= 0; j--) {
                    if (j == arr.length - 1) {
                        a = arr[arr.length -1];
                        arr[j] = arr[j - 1];
                    } else if (j == 0) {
                        arr[j] = a;
                    } else {
                        arr[j] = arr[j - 1];
                    }
                }
            }
        } else {
            for (int i = 0; i > n ; i--) {
                for (int j = 0; j < arr.length; j++) {
                    if (j == 0) {
                        a = arr[j];
                        arr[j] = arr[j + 1];
                    } else if (j == arr.length - 1) {
                        arr[arr.length - 1] = a;
                    } else {
                        arr[j] = arr[j + 1];
                    }
                }
            }
        }
        return arr;
    }
}
