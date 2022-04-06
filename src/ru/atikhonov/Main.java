package ru.atikhonov;

public class Main {

    public static void main(String[] args) {
        //Задание 1
        int[] integers = new int[3];
        integers[0] = 1;
        integers[1] = 2;
        integers[2] = 3;
        float[] floats = {1.57f, 7.654f, 9.986f};
        short[] shorts = {1, 2, 3, 4, 5};
        //Задание 2
        for (int i = 0; i < integers.length; i++) {
            System.out.print(integers[i]);
            if (i == integers.length - 1) {
                System.out.println();
                break;
            }
            System.out.print(", ");
        }
        for (int i = 0; i < floats.length; i++) {
            System.out.print(floats[i]);
            if (i == floats.length - 1) {
                System.out.println();
                break;
            }
            System.out.print(", ");
        }
        for (int i = 0; i < shorts.length; i++) {
            System.out.print(shorts[i]);
            if (i == shorts.length - 1) {
                System.out.println();
                break;
            }
            System.out.print(", ");
        }
        //Задание 3
        for (int i = integers.length - 1; i >= 0; i--) {
            System.out.print(integers[i]);
            if (i == 0) {
                System.out.println();
                break;
            }
            System.out.print(", ");
        }
        for (int i = floats.length - 1; i >= 0 ; i--) {
            System.out.print(floats[i]);
            if (i == 0) {
                System.out.println();
                break;
            }
            System.out.print(", ");
        }
        for (int i = shorts.length - 1; i >= 0 ; i--) {
            System.out.print(shorts[i]);
            if (i == 0) {
                System.out.println();
                break;
            }
            System.out.print(", ");
        }
        //Задание 4
        for (int i = 0; i < integers.length; i++) {
            if (integers[i] % 2 != 0) integers[i] += 1;
            System.out.print(integers[i]);
            if (i == integers.length - 1) break;
            System.out.print(", ");
        }
    }
}
