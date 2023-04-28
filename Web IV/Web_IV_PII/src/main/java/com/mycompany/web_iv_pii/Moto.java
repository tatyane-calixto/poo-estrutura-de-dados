/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.web_iv_pii;

/**
 *
 * @author tatya
 */
public class Moto extends Veiculo{
    private int cilindradas;
    
    //construtor
    public Moto (String modelo, int ano, String marca,int cilindradas){
        super(modelo,ano,marca);
        this.cilindradas = cilindradas;
    }
    //get
    public int getCilindradas(){
        return cilindradas;
    }
    
    //set
    public void setCilindradas(int cilindradas){
        this.cilindradas =  cilindradas;
    }
    
    @Override
    public void acelerar(){
        System.out.println("Moto  acelerando...");
    }
    
    @Override
    public void frear(){
        System.out.println("Moto freando...");
    }
    @Override
    public void exibirDetalhes(){
        System.out.println("######### Moto #########");
       System.out.println(getMarca());
       System.out.println(getModelo());
       System.out.println(getAno());
       System.out.println((getCilindradas()));
       System.out.println("##################");
       
    }
}
