/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio2;
import java.util.Scanner;
/**
 *
 * @author lalas
 */
public class Exercicio2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int vitorias = 0;

        for (int i = 0; i < 6; i++) {
            String resultado = entrada.next();

            if (resultado.equals("V")) {
                vitorias++;
            }
        }

        if (vitorias == 5 || vitorias == 6) {
            System.out.println(1);
        } else if (vitorias == 3 || vitorias == 4) {
            System.out.println(2);
        } else if (vitorias == 1 || vitorias == 2) {
            System.out.println(1);
        } else {
            System.out.println(-1);
        }
    }
}
