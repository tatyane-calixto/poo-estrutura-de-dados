/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.webiv;
import java.util.Scanner;

/**
 *
 * @author tatya
 */
public class WebIV {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        
        /*int[] numeros = new int[5];
        
        System.out.println("Digite 5 números inteiros: ");
        
        for(int i = 0;i<numeros.length;i++){
            numeros[i]  = input.nextInt();
        }
        System.out.println("Os números informados foram: ");
        
        for(int i = 0;i<numeros.length;i++){
            System.out.println(numeros[i]);
            
        }*/
        
        /*int[] idades = new int[5];
        int soma = 0;
        double media; 
        System.out.println("Digite os valores das idades: ");
        for(int i = 0;i<idades.length;i++){
            idades[i] = input.nextInt();
            soma +=idades[i];
        }
        media = (double)soma/5;
        System.out.println("A média das idades é: "+ media);*/
        
        /*double [][]notas = new double[3][3];
        //for  para inserir notas
        for(int i=0; i< notas.length;i++){
            System.out.println("Digite a nota do estudante " + (i+1) +" : ");
            for(int j=0;j <notas[i].length;j++ ){
            System.out.println("Nota "+ (j+1) +" : ");
            notas[i][j] = input.nextDouble();
               
           }
        }*/
        
        //for para calcular a média
        /*for(int i = 0;i<notas.length;i++){
            double soma = 0;
            for(int j = 0;j<notas[i].length;j++){
                soma+=notas[i][j];
                //System.out.println("Soma : "+soma);
                
            }
            double media = soma/notas.length;
            System.out.println("Média do aluno: "+(i+1)+ " - "+media);
            
            if(media>=7){
                System.out.println("Estudante Aprovado!");
                
            }
            else if(media>=5){
                System.out.println("Estudante em Recuperação!");
                
            }
            else
            {
                System.out.println("Estudante Reprovado!");
            }
            
        }*/
        
        
        //Herança veículo
        /*Carro meuCarro = new Carro();
        meuCarro.setModelo("Gol");
        meuCarro.setAno(2010);
        meuCarro.setMarca("Volkswagen");
        meuCarro.setNumPortas(2);
        
        Moto minhaMoto = new Moto();
        minhaMoto.setModelo("M 500");
        minhaMoto.setAno(2019);
        minhaMoto.setMarca("Honda");
        minhaMoto.setCilindradas(500);
        
        System.out.println("Carro: "+meuCarro.getMarca() + " - " + meuCarro.getModelo() + " - ano: "+meuCarro.getAno() + " - portas: "+meuCarro.getNumPortas());
        System.out.println("Moto: "+minhaMoto.getMarca() + " - " + minhaMoto.getModelo() + " - ano: "+minhaMoto.getAno() + " - cilindradas: "+minhaMoto.getCilindradas());*/
        
        //Herança Pessoa
        /*Funcionario meuFuncionario = new Funcionario("Maria", 20, 2500, "Desenvolvedora Júnior");
        
        System.out.println(meuFuncionario.getNome() + " tem "+meuFuncionario.getIdade() +" anos e " + " possui o salário de R$ " +meuFuncionario.getSalario()+ " e seu cargo é "+meuFuncionario.getCargo());*/
        
        //Herança Animal
        Cachorro meuCachorro = new Cachorro();
        meuCachorro.setNome("Caramelo"); 
        meuCachorro.comer();
        meuCachorro.latir();
        
        Gato meuGato = new Gato();
        meuGato.setNome("Fofinho");
        meuGato.comer();
        meuGato.miar();
        
        
        
        
        
        
    }
}
