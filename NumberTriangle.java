/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NumberTriangle;

import java.util.Scanner;

/**
 *
 * @author Master Irfak
 */
public class NumberTriangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Height Input : ");
        int height = input.nextInt();
        for (int i = 0; i <= height; i++) {
            for (int j = (height - 1); j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
