/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula2;

/**
 *
 * @author tatya
 */
public class Produto {
   //atributos
    private String nome;
    private int quantidade;
    private double preco;
    
    //construtor
    public Produto(String nome, int quantidade,double preco){
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }
    
    //método get
    public String getNome(){
        return nome;
    }
    public int  getQuantidade(){
        return quantidade;
    }
    public double getPreco(){
        return preco;
    }
    
    //métodos SETS
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    //métodos da classe
    public double valorTotal(){
        return preco * quantidade;
    }
    
}
