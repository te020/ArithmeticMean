package com.company;

import java.util.Scanner;

public class Main {
    static String scanLine() {
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }
    public static void main(String[] args) {
        int start, end, length, var, aux;
        int mean = 0;
        System.out.println("Arithmetic mean algorithm");
        System.out.println("""
            Write 1 or 2 depending the case:\s
            1 - arithmetic mean of a certain number range\s
            2 - arithmetic mean of a certain count of numbers""");
        var = Integer.parseInt(scanLine());
        switch (var) {
            case 1 -> {
                System.out.println("Write the initial start of the range");
                start = Integer.parseInt(scanLine());
                System.out.println("Write the end of the range");
                end = Integer.parseInt(scanLine());
                if(start > end){
                    aux = start;
                    start = end;
                    end = aux;
                }
                for(int i = start; i <= end; ++i) {
                    mean = mean + i;
                }
                System.out.println("The arithmetic mean of the numbers between " + start + " and " + end + " is: " + mean / (end - start + 1));
            }
            case 2 -> {
                System.out.println("Write the maximum no. of values you want to calculate:");
                length = Integer.parseInt(scanLine());
                int[] arr = new int[length+1];
                System.out.print("Enter " + length + " Numbers : ");
                for(int i = 0; i < length; ++i){
                    arr[i] = Integer.parseInt(scanLine());
                    mean = mean + arr[i];
                }
                System.out.println("The arithmetic mean is: " + mean/length);
            }
            default -> System.out.println("Please choose between 1 or 2");
        }

    }
}
