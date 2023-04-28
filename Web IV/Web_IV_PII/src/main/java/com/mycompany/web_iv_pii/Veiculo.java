/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.web_iv_pii;

/**
 *
 * @author tatya
 */
public abstract class Veiculo {
    private String modelo;
    private int ano;
    private String marca;
    
    //construtor
    public Veiculo (String modelo, int ano, String marca){
        this.modelo = modelo;
        this.ano = ano;
        this.marca = marca;
        
    }
    //get
    public String getModelo(){
        return modelo;
    }
    public int getAno(){
        return ano;
    }
     public String getMarca(){
        return marca;
    }
     
     //set
     public void setModelo(String modelo){
         this.modelo = modelo;
         
     }
     
     public void setAno(int ano){
         this.ano = ano;
         
     }
     
     public void setMarca(String marca){
         this.marca = marca;
         
     }
     //métodos
     public abstract void acelerar();
     public abstract void frear();
     public abstract void exibirDetalhes();
     
    
}
