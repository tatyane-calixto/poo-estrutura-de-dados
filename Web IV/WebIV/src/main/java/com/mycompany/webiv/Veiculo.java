/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.webiv;

/**
 *
 * @author tatya
 */
public class Veiculo {
    private String modelo;
    private int ano;
    private String marca;
    
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
    
}
