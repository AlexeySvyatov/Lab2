package com.company;

import java.util.Scanner;

public class Main {
        // var 16
        public static void main(String[] args){
                Scanner in = new Scanner(System.in);
                System.out.print("Enter number >= 1 - ");
                int n = in.nextInt();
                int s = 0;
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= i; j++) {
                        s += j;
                    }
                }

                System.out.print(s);
            }
        }
