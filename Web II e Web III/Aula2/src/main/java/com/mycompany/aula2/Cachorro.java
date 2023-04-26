/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula2;

/**
 *
 * @author tatya
 */
public class Cachorro {
    //atributos
    private String nome;
    private int idade;
    private String raca;
    private String cor;
    
    //construtor
    public Cachorro(String nome, String raca){
        this.nome = nome;
        this.raca = raca;
    }
    
    //métodos get
    public String getNome(){
        return nome;
    }
    public String getRaca(){
        return raca;
    }
    
    public int  getIdade(){
        return idade;
    }
    public String getCor(){
        return cor;
    }
    
    //método set
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setRaca(String raca){
        this.raca = raca;
    }
     public void setCor(String cor){
        this.cor = cor;
    }
    
     //métodos
     public void latir(){
         System.out.println("Au Au");
     }
     public void exibirInfos(){
         System.out.println("Nome: "+nome);
         System.out.println("Raça: "+raca);
         System.out.println("Idade: "+idade);
         System.out.println("Cor: "+cor);
         
     }
    
    
    
    
    
}
