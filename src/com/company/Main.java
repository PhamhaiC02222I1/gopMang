package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng1 : ");
        int n1 = scanner.nextInt();

        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            System.out.printf(" Nhập arr1["+ i + "] : ");
            arr1[i] = scanner.nextInt();

        }show(arr1);
        System.out.println("");
        System.out.print("Nhập số phần tử của mảng 2 : ");
        int n2 = scanner.nextInt();

        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            System.out.printf(" Nhập arr2["+ i + "] : ");
            arr2[i] = scanner.nextInt();

        }show(arr2);
        System.out.println("");
        int[] arr3=new int[arr1.length+ arr2.length];
        int length=arr1.length+ arr2.length;
        for (int i=0;i< arr1.length;i++){
           arr3[i]=arr1[i];
        }
        int k=0;
        for (int i= arr2.length-1;i< length;i++){
            arr3[i]=arr2[k];
            k++;
        }
        show(arr3);
    }
    public static void show(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf(arr[i] + " ");
        }
    }
}
