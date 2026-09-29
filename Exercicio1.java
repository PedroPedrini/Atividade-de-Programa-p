/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio1;

import java.util.Scanner;

/**
 *
 * @author lalas
 */
public class Exercicio1 {
public static void main(String[] args) {
    
     
        Scanner entrada = new Scanner(System.in);

        int cibele = entrada.nextInt();
        int camila = entrada.nextInt();
        int celeste = entrada.nextInt();

        if (cibele < camila && camila < celeste) {
            System.out.println(camila);
        } else if (cibele < celeste && celeste < camila) {
            System.out.println(celeste);
        } else {
            System.out.println(cibele);
        }
    }
}