/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio5;
import java.util.Scanner;
/**
 *
 * @author lalas
 */
public class Exercicio5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int n1 = entrada.nextInt();
        int d1 = entrada.nextInt();
        int v1 = entrada.nextInt();

        int n2 = entrada.nextInt();
        int d2 = entrada.nextInt();
        int v2 = entrada.nextInt();

        double tempo1 = (double) d1 / (v1 * 1000.0 / 3600.0);
        double tempo2 = (double) d2 / (v2 * 1000.0 / 3600.0);

        if (tempo1 < tempo2) {
            System.out.println(n1);
        } else {
            System.out.println(n2);
        }
    }
}
