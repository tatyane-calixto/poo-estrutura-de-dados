/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula2;

/**
 *
 * @author tatya
 */
public class ContaBancaria {
   // numero, saldo e titular 
    private int numero;
    private String titular;
    private double saldo;
    
    //construtor
    public ContaBancaria(int numero, String titular, double saldo){
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }
    
    //metodos get
    public int getNumero(){
        return numero;
    }
    
    public String getTitular(){
        return titular;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    //métodos set
    public void setNumero(int numero){
        this.numero = numero;
    }
     public void setTitular(String titular){
        this.titular = titular;
    }
     public void setSaldo(double saldo){
        this.saldo = saldo;
    }
     
     //métodos depositar, sacar e consultarSaldo 
     
     public void depositar(double valor){
         this.saldo +=valor;
     } 
     
     public void sacar(double valor){
         if(this.saldo >= valor){
             this.saldo-=valor;
         }
         else{
            System.out.println("Saldo Insuficiente");
         }
     }
     
     public double consultarSaldo(){
         return this.saldo;
     }
    
}
