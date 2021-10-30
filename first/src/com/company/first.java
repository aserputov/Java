package com.company;

import java.util.Scanner;

public class first {

    public void first() {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        //reading the number of elements from the that we want to enter
        n = sc.nextInt();
        //creates an array in the memory of length 10
        int[] array = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++){
            //reading array elements from the user
            array[i]=sc.nextInt();
        }

        int pivot = array[0];
        int j = 0;
        int k = 0;
        int y = 0;
        int y1 = 0;
        for(int i=1; i < n; i++){
            if(array[i] > array[0]) {
                j++;
            }else{
                y++;
            }
        }

        int[] array1 = new int[j];
        int[] array2 = new int[y];
        for (int i=1; i < n; i++) {
            if(array[i] > array[0]) {

                array1[k] = array[i];
                k++;
            }else{
                array2[y1] = array[i];
                y1++;
            }
        }

        for (int i=0; i < y ; i++) {
            array[i] = array2[i];
        }

        array[y] = pivot;

        int u = 0;
        for (int i=y+1; i < n; i++) {
            array[i] = array1[u];
            u++;
        }
        System.out.print("After the partition, the list is :");
        for (int i=0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        y = y+ 1;
        System.out.print("Pivot position: "+ y );
        System.out.println();
    }
}
// List<E> hand = new ArrayList<E>(handView);