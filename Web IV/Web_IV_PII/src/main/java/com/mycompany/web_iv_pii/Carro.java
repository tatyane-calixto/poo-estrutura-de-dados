/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.web_iv_pii;

/**
 *
 * @author tatya
 */
public class Carro extends Veiculo{
    private int numPortas;
    
    //construtor
    public Carro (String modelo, int ano, String marca,int numPortas){
        super(modelo,ano,marca);
        this.numPortas = numPortas;
    }
    
    //get
    public int getNumPortas(){
        return numPortas;
    }
    
    //set
    public void setNumPortas(int numPortas){
        this.numPortas = numPortas;
    }
    
    @Override
    public void acelerar(){
        System.out.println("Carro acelerando...");
    }
    
    @Override
    public void frear(){
        System.out.println("Carro freando...");
    }
    @Override
    public void exibirDetalhes(){
        System.out.println("######### Carro #########");
       System.out.println(getMarca());
       System.out.println(getModelo());
       System.out.println(getAno());
       System.out.println((getNumPortas()));
       System.out.println("##################");
       
    }
    
    
}
