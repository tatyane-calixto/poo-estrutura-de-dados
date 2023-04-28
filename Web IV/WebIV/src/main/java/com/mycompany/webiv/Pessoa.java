/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.webiv;

/**
 *
 * @author tatya
 */
public class Pessoa {
    private String nome;
    private int  idade;
    
    //construtos
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
        
    }
    
    //get
    public String getNome(){
        return nome;
    }
    public int  getIdade(){
        return idade;
    }
    
    //set
    public void setNome(String nome){
        this.nome = nome;
    }
    
     public void setIdade(int idade){
        this.idade = idade;
    }
     
    
}
