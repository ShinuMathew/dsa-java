package com.scaler.basic;

import java.util.Scanner;

public class Armstrong {

	/**
	 * You are given an integer N you need to print all the Armstrong Numbers between 1 to N.
	 * If sum of cubes of each digit of the number is equal to the number itself, then the number is called an Armstrong number.
	 * For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 ).
	 * */
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 1; i <= N; i++) {
            int n = i;
            int sum = 0;
            while(n > 0) {
                int r = n%10;
                sum += (r*r*r);
                n = n/10;
            }
            if(sum == i)
                System.out.println(i);
        }
    }
	
}
