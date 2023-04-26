/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula2;

/**
 *
 * @author tatya
 */
public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private double preco;
    private boolean farolAceso;
    private int velocidade;

    // Construtor
    public Carro(String marca, String modelo, int ano, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
        this.farolAceso = false;
        this.velocidade = 0;
    }
    
    //Métodos Getters
    public String getMarca(){
        return marca;
    }
    
     public String getModelo(){
        return modelo;
    }
     
    public int ano(){
        return ano;
    }
      
    public double  getPreco(){
        return preco;
    }
    
    public boolean getFarolAceso(){
        return farolAceso;
    }
     
    public int  getVelocidade(){
        return velocidade;
    }
    
    //Métodos Setters
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public void setAno(int  ano){
        this.ano = ano;
    }
    public void setPreco(double  preco){
        this.preco = preco;
    }
    
    public void setFarolAceso(boolean  farolAceso){
        this.farolAceso = farolAceso;
    }
    
    public void setVelocidade(int  velocidade){
        this.velocidade = velocidade;
    }
    
    //Métodos da classe
    
    public void acelerar(int incremento){
        velocidade+=incremento; // velocidade = velocidade + incremento;
    }
    
    public void frear(int decremento){
        if(velocidade - decremento >=0){
            velocidade-=decremento; //velocidade = velocidade - decremento;
        }
        else{
            velocidade = 0;
        }
        
    }
    
    public void acenderFarol(){
        farolAceso = true;
    }
    public void apagarFarol(){
        farolAceso = false;
    }
    
    //exibir as informações do carro
    public void exibirDetalhes(){
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Ano: "+ano);
        System.out.println("Preço: "+preco);
        System.out.println("Farol Aceso: "+farolAceso);
        System.out.println("Velocidade: "+velocidade);
        
    }
    

    
}