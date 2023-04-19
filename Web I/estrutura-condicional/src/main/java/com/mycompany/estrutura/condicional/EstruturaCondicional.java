/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estrutura.condicional;
import java.util.Scanner;

/**
 *
 * @author taty
 */
public class EstruturaCondicional {

    public static void main(String[] args) {
        //mês
       Scanner sc = new Scanner(System.in);
       /*String nomeMes;
       
       System.out.print("Digite o número do mês que você quer saber: ");
       int mes = sc.nextInt();
       
        switch (mes) 
        {
            case 1:
                nomeMes = "Janeiro";                
                break;
            case 2:
                nomeMes = "Fevereiro";
                break;
            case 3: 
                nomeMes = "Março";
                break;
            case 4:
                nomeMes = "Abril";
                break;
            case 5:
                nomeMes = "Maio";
                break;
            case 6:
                nomeMes = "Junho";
                break;
            case 7:
                nomeMes = "Julho";
                break;
            case 8:
                nomeMes = "Agosto";
                break;
            case 9:
                nomeMes = "Setembro";
                break;
            case 10:
                nomeMes = "Outubro";
                break;
            case 11:
                nomeMes = "Novembro";
                break;
            case 12:
                nomeMes = "Dezembro";
                break;
              
            default:
                nomeMes = "Mês inválido";
                break;
        }
        System.out.println("O mês correspondente é "+nomeMes);*/
       
       //notas
       /*double nota1, nota2, nota3,media;
        System.out.println("Digite a nota 1: ");
        nota1 = sc.nextDouble();
        
        System.out.println("Digite a nota2: ");
        nota2 = sc.nextDouble();
        
        System.out.println("Digite a nota3: ");
        nota3 = sc.nextDouble();
        
        media = (nota1+nota2+nota3)/3;
        
        System.out.println("A média é: " + media);*/
         
    
    //Produtos
    double preco;
    
    System.out.print("Digite o preço do produto: ");
    preco = sc.nextDouble();
    /*Classe A: Preço até R$ 50,00
    Classe B: Preço entre R$ 50,00 e R$ 100,00
    Classe C: Preço acima de R$ 100,00*/

    if(preco <= 50)
    {
        System.out.println("Classe A");
    }
    else if (preco > 50 && preco <= 100)
    {
        System.out.println("Classe B");
    }
    else 
    {
        System.out.println("Classe C");
    }
    
       
    }
}
