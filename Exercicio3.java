/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio3;
import java.util.Scanner;
/**
 *
 * @author lalas
 */
public class Exercicio3 {

    

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int s = entrada.nextInt();
        int a = entrada.nextInt();
        int b = entrada.nextInt();

        int quantidade = 0;

        for (int i = a; i <= b; i++) {
            int numero = i;
            int soma = 0;

            while (numero > 0) {
                soma += numero % 10;
                numero /= 10;
            }

            if (soma == s) {
                quantidade++;
            }
        }

        System.out.println(quantidade);
    }
}
}
