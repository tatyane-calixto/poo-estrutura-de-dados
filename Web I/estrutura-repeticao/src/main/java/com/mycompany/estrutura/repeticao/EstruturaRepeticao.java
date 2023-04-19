/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estrutura.repeticao;
import java.util.Scanner;
/**
 *
 * @author tatya
 */
public class EstruturaRepeticao {

    public static void main(String[] args) {
        //números pares 1-10
        
       /* int i = 1;
        
        while(i <= 10)
        {
            if(i % 2 == 0)
            {
                System.out.println(i);
            }
            i++;
        }*/
        
        //soma números digitados
        Scanner sc = new Scanner(System.in);
        
        int numero = 1,soma = 0;
        
        while(numero!=0)
        {
            System.err.println("Digite um número: ");
            numero = sc.nextInt();
            soma+=numero; //soma = soma + numero;
        }
        System.out.println("A soma do número é: "+soma);
        
        
        
    }
}
