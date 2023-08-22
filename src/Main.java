public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static void task1 () {
        System.out.println("\n Задача 1 (+ Задача 2): Массивы \n");

        int [] first = new int [3];
        first [0] = 1;
        first [1] = 2;
        first [2] = 3;
        for (int i = 0; i < 3; i++) {
            if (i < 2) {
                System.out.print(first[i] + ", ");
            } else {
                System.out.println(first [i] + "\n");
            }
        }

        double [] second = new double[3];
        second [0] = 1.57;
        second [1] = 7.654;
        second [2] = 9.986;
        for (int i = 0; i < 3; i++) {
            if (i < 2) {
                System.out.print(second[i] + ", ");
            } else {
                System.out.println(second [i] + "\n");
            }
        }

        int [] third = {22, 91, 9, 12};
        for (int i = 0; i < 4; i++) {
            if (i < 3) {
                System.out.print(third[i] + ", ");
            } else {
                System.out.println(third [i] + "\n");
            }
        }
    }
}