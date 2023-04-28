/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.webiv;

/**
 *
 * @author tatya
 */
public class Funcionario extends Pessoa{
    private double salario;
    private String cargo; 
    
    //construtor
    public Funcionario(String nome, int idade, double salario,String cargo){
        super(nome,idade);
        this.salario = salario;
        this.cargo = cargo;
        
    }
    //get
    public double getSalario(){
        return salario;
    }
    public String getCargo(){
        return cargo;
    }
    
    //set
    public void setSalario(double salario){
        this.salario = salario;
    }
    public void setCargo(String cargo){
        this.cargo  = cargo;
    }
    
}
