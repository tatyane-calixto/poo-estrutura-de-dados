/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.webiv;

/**
 *
 * @author tatya
 */
public class Animal {
    private String nome;
    
    //get
    public String getNome(){
        return nome;
    }
    
    //set
    public void setNome(String nome){
        this.nome = nome;
    }
    
       //método
       public void comer(){
           System.out.println(nome + " está comendo.");
       }
    
}
