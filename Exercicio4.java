/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio4;
import java.util.Scanner;
/**
 *
 * @author lalas
 */
public class Exercicio4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int n = entrada.nextInt();

        int pecas = (n + 1) * (n + 2) / 2;

        System.out.println(pecas);
    }
    }
