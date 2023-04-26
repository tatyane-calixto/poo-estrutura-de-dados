/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula2;



/**
 *
 * @author tatya
 */
public class Estacionamento {
    //atributos
    private String placa;
    private String modelo;
    private int horaEntrada;
    private int horaSaida;
    
    //construtor 
    public Estacionamento(String placa, String modelo,int horaEntrada){
        this.modelo = modelo;
        this.placa = placa;
        this.horaEntrada = horaEntrada;
               
    }
    
    //metodo get
    public String getModelo(){
        return modelo;
    }
     public String getPlaca(){
        return placa;
    }
     public int gethoraEntrada(){
         return horaEntrada;
     }
     public int gethoraSaida(){
         return horaSaida;
     }
     
     //set
     public void setModelo(String modelo){
         this.modelo = modelo;
     }
      public void setPlaca(String placa){
         this.placa = placa;
     }
       public void setHoraEntrada(int horaEntrada){
         this.horaEntrada = horaEntrada;
     }
     public void setHoraSaida(int horaSaida){
         this.horaSaida = horaSaida;
     }
     
     //metodos
     public int calcularValorEstacionamento(int horaEntrada, int horaSaida){
         int tempo = 0;
         tempo = horaSaida - horaEntrada;
         
         return tempo * 5;
     }
     
     public void exibirInfos(){
         System.out.println("Carro: " + modelo+ ", placa: " +placa+ " valor R$ "+calcularValorEstacionamento(horaEntrada, horaSaida));
     }
     
     
    
    
    
}
