/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula2;
import java.util.Scanner;

/**
 *
 * @author tatya
 */
public class Aula2 {

    public static void main(String[] args) {
      // Carro meuCarro = new Carro("Honda","City",2016,62000);
       //meuCarro.setFarolAceso(true);
       //meuCarro.setVelocidade(100);
       
      // meuCarro.exibirDetalhes();
       
       
       //Produto meuProduto  = new Produto("Mouse",2,100);
       //System.out.println(" Produto: " +meuProduto.getNome()+ " - Valor Total R$ " +meuProduto.valorTotal());
       
       //Cachorro meuCachorro = new Cachorro("sukita","fox paulistinha");
       //meuCachorro.setIdade(8);
       //meuCachorro.setCor("preta, marrom e branca");
       
       //meuCachorro.exibirInfos();
       
       //ContaBancaria minhaConta = new ContaBancaria(1234,"Taty",100);
     //  minhaConta.sacar(50);
       //System.out.println(minhaConta.consultarSaldo());
       //minhaConta.depositar(25);
       //System.out.println(minhaConta.consultarSaldo());
       
       //Estacionamento meuEstacionamento = new Estacionamento("1234","uno",8);
       //meuEstacionamento.setHoraSaida(10);
       //meuEstacionamento.calcularValorEstacionamento(meuEstacionamento.gethoraEntrada(),meuEstacionamento.gethoraSaida());
       
       //meuEstacionamento.exibirInfos();
       
       /*int[]vetor = new int [5];
       vetor[0] = 1;
       vetor[1] = 10;
       vetor [2] = 3;
       vetor [3] = 7;
       vetor [4] = 70;
       
       //modificando valores do vetor
       vetor[0] =  vetor [4];
       vetor[4] = 5;
       vetor[1] = vetor[2];
       System.out.println("Vetores: "+vetor[0]+ "  " +vetor[1] + " " +vetor[2]+ " "+vetor[3]+ " "+ vetor[4]);*/
       
    Scanner input  = new Scanner(System.in);
    
    /*System.out.print("Digite o tamanho do vetor: ");
    int tamanho = input.nextInt();
    
    int [] vetor = new int[tamanho];
    
    System.out.println("Digite os valores do vetor: ");
    for(int i = 0;i<tamanho;i++){
        vetor[i] = input.nextInt();
        
    }
    double  soma = 0;
    double media = 0.0;
    for(int i = 0;i<tamanho;i++){
        soma+=vetor[i];
    }
    media = soma/tamanho;
    
    System.out.print("A média dos valores é? "+media);*/
    
    /*int [] vetor = new int[5];
    int soma = 0;
    
    System.out.println("Digite 5  números inteiros: ");
    for(int i = 0;i<5;i++){
        vetor[i] = input.nextInt();
    }
    for(int i = 0;i<5;i++){
        soma+=vetor[i];
        
    }
    System.out.println("A soma dos 5 elemento de um vetor inteiro é "+soma);*/
              
   /* System.out.print("Digite o tamanho do vetor: ");
    int tamanho = input.nextInt();
    
    int [] vetor = new int[tamanho];
    
    System.out.println("Digite os valores do vetor: ");
    for(int i = 0;i<tamanho;i++){
        vetor[i] = input.nextInt();
        
    }
    int maiorValor = vetor[0];
    for(int i = 0;i<tamanho;i++){
        if(vetor[i]>maiorValor){
            maiorValor = vetor[i];
        }
    }
    System.out.println("O maior valor é: "+maiorValor);*/
   
   int [][] matriz = new int[3][3];
   System.out.println("Digite o valor da matriz ");
   for(int l = 0;l<3;l++){
       for(int c = 0;c<3;c++){
           matriz[l][c] = input.nextInt();
           
       }
       
   }
   
   int soma = 0;
   for(int l = 0;l<3;l++){
       for(int c = 0;c<3;c++){
           soma+=matriz[l][c];
           
       }
       
   }
   System.out.println("A soma das linhas e coluna da matriz é: "+soma);
       
        
    }
}
