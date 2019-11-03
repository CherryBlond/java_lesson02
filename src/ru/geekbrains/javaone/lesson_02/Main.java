package ru.geekbrains.javaone.lesson_02;

public class Main {
    public static void main(String[] args) {
        System.out.println("task_1");
        task_1();
        System.out.println("task_2");
        task_2();
        System.out.println("task_3");
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        task_3(arr);
        System.out.println("task_4");
        task_4();
        System.out.println("task_5");
        task_5();
        System.out.println("task_6");
        boolean match_01 = task_6(new int[]{1, 1, 1, 2, 1});
        System.out.println(match_01);
        boolean match_02 = task_6(new int[]{2, 1, 1, 2, 1});
        System.out.println(match_02);
        boolean match_03 = task_6(new int[]{10, 1, 2, 3, 4});
        System.out.println(match_03);
    }

    private static void task_1() {
        int[] arr = {1, 0, 0, 1, 1, 0, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void task_2() {
        int[] arr = new int[8];
        int b = 1;

        for (int i = 0; i < arr.length; i++, b = b + 3) {
            arr[i] = b;
            System.out.println(arr[i]);
        }
    }

    private static void task_3(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) arr[i] = arr[i] * 2;
            System.out.println(arr[i]);
        }
    }

    private static void task_4() {
        int[] arr = {3, 5, 78, 9, 25, 15, 7, 35};
        int max = task_4_max(arr);
        int min = task_4_min(arr);
        System.out.println(max);
        System.out.println(min);
    }

    private static int task_4_max(int[] arr) {
        int x = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (x < arr[i]) x = arr[i];
        }
        return x;
    }

    private static int task_4_min(int[] arr) {
        int x = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (x > arr[i]) x = arr[i];
        }
        return x;
    }

    private static void task_5() {
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) arr[i][j] = 1;
                if (i + j == arr.length - 1) arr[i][j] = 1;
                System.out.println(arr[i][j]);
            }
            System.out.println("");
        }
    }

    private static boolean task_6(int[] arr) {
        int sum_left = 0;
        int sum_right = 0;
        for (int i = 0; i < arr.length; i++) {
            sum_left = sum_left + arr[i];

            sum_right = 0;
            for (int j = i + 1; j < arr.length; j++) {
                sum_right = sum_right + arr[j];
            }
            if (sum_left == sum_right) return true;
        }
        return false;
    }
}
