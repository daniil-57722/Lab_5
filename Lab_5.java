package com.example.helloworld;

import java.util.Scanner;

public class Lab_5 { public static void main(String[] args) {

    int max = 0;
    int imax = 0;
    int jmax = 0;
    Scanner input = new Scanner(System.in);
    System.out.println("enter quanity of strings");
    int size1 = input.nextInt();


    int arrayX[][] = new int[size1][size1];

    for (int i = 0; i < arrayX.length; i++) {
        for (int j = 0; j < arrayX[i].length; j++) {
            System.out.print("Введите элемент arr[" + i + "][" + j + "]:");
            arrayX[i][j] = input.nextInt();
            if (arrayX[i][j] > max){
                max = arrayX[i][j];
            imax = i;
            jmax = j;
            }
        }
    }

    for (int i = 0; i < arrayX.length; i++) {
        System.out.print('\n');
        for (int j = 0; j < arrayX[i].length; j++) {
                System.out.print(arrayX[i][j]);
            }
        }
    for (int i = 0; i<arrayX.length; i++) {
        System.out.print('\n');
        for (int j = 0; j < arrayX[i].length; j++) {
            if (i!=imax && j!=jmax){
                System.out.print(arrayX[i][j]);
                }
            }
        }
    }
}
