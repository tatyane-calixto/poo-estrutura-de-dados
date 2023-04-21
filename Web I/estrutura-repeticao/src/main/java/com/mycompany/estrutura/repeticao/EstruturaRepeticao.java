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
        
        Scanner  input = new Scanner(System.in);
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
        /*
        
        int numero = 1,soma = 0;
        
        while(numero!=0)
        {
            System.err.println("Digite um número: ");
            numero = innput.nextInt();
            soma+=numero; //soma = soma + numero;
        }
        System.out.println("A soma do número é: "+soma);*/
        
        //calcular tempo
        
        /*
        double tentativa = 0,somaTempo = 0,tempo;
        double  media ;
        
        System.out.print("Digite o tempo da tentativa: ");
        tempo = input.nextInt();
        
        while(tempo > 0)
        {
            somaTempo+= tempo; // somaTempo = somaTempo + tempo;
            tentativa++; // tentativa = tentativa + 1;
           
            System.out.print("Digite o tempo da tentativa: ");
            tempo = input.nextInt();             
        }
        System.out.println(somaTempo);
        System.out.println(tentativa);
        media = somaTempo/tentativa;
        System.out.print("A media de tempo para a tarefa é: " + media);*/
        
        //inteiro positivo
              
        /*
        int numero = 0, soma = 0,i = 0;
        boolean numeroValido = false;
        
        do {          
            System.out.print("Digite um valor inteiro e positivo: ");
            numero = input.nextInt();
            
            if(numero <= 0){
               System.out.println("Número inválido");
               
            }
            else
            {
                numeroValido = true;
            }
            
        } while (!numeroValido);
        
        do {      
            if( i%2 == 0 ){
                soma+=i;
                System.out.println("Valor de i:"+ i);
                System.out.println("Soma: " + soma);
                
             
            }
            i++;
            
        } while (i <=numero);
        
        System.out.print("A soma dos número pares é: "+ soma);*/
        
        //senha válida
        /*
        String senhaCorreta = "123456",senha;
        
        do {            
            System.out.print("Digite a sua senha: ");
            senha = input.nextLine();
            
        } while (!senha.equals(senhaCorreta));
        
        System.out.println("Senha correta. Acesso permitido");*/
        
        //Cadastro
              
        /*String nome, descricao = "";
        double valorCompra, totalGasto = 0;
        
        do {       
            System.out.print("Digite o nome do cliente: ");
            nome = input.nextLine();
            
            while(!descricao.equals("fim")){
               System.out.print("Digite a descrição da compra ou finalizar: ");
               descricao = input.nextLine(); 
                
                if(!descricao.equals("fim")){
                    System.out.print("Digite o valor da compra: ");
                    valorCompra = input.nextDouble();
                    totalGasto += valorCompra; // totalGasto = totalGasto = valorCompra;
                    input.nextLine();
                }
            }
            System.out.println("O total gasto pelo cliente: "+nome+ " foi R$ "+totalGasto);
            
        } while (true);*/
        
        //números pares 1 - 100
        /*int soma = 0;
        for (int i = 1; i <= 100; i++) {
            if(i % 2 == 0){
                soma+=i;
            }
        }
        System.out.print("A soma dos números pares entre 1 - 100 é:"+ soma);*/
        
        //tabuada
        /*int num;
        System.out.print("Digite o número da tabuada ");
        num = input.nextInt();
        
        System.out.println("Tabuada do "+num + ":");
        for (int i = 1; i <=10; i++) {
            System.err.println(num + " x " + i + " = "+num*i);  
        }*/
        
        //faturamento
        double faturamentoTotal = 0, preco,faturamentoProduto;
        int quantidadeProduto;
        
        for (int i = 1; i <=3; i++) {
            System.out.println("Digite o preço do produto "+ i+": ");
            preco = input.nextDouble();
            
            System.out.println("Digite a quantidade do produto "+ i+": ");
            quantidadeProduto = input.nextInt();
            
            faturamentoProduto = preco * quantidadeProduto;
            faturamentoTotal+=faturamentoProduto;
       
        }
        System.out.println("O faturamento total é de R$ " + faturamentoTotal);
        

        
        
        
        
        
        
        
        
        
        
        
        
        

        
        
        
        
        
        
        
        
        

        
        
        
        
         
        

        
        

        
        
        
    }
}
