/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.web_iv_pii;

/**
 *
 * @author tatya
 */
public class Web_IV_PII {

    public static void main(String[] args) {
       /*Cachorro meuCachorro = new Cachorro();
       meuCachorro.andar();
       meuCachorro.comer();
       meuCachorro.latir();
       
       Gato meuGato = new Gato();
       meuGato.andar();
       meuGato.comer();
       meuGato.miar();
       
       Passaro meuPassaro = new Passaro();
       meuPassaro.andar();
       meuPassaro.comer();
       meuPassaro.voar();*/
       
       //Classe abstrata Veículo 
       Carro meuCarro = new Carro("Gol", 2010, "Volkswagen", 2);
       meuCarro.acelerar();
       meuCarro.frear();
       meuCarro.exibirDetalhes();
            
       Moto minhaMoto = new Moto("M 500", 2019, "Honda", 500);
       minhaMoto.acelerar();
       minhaMoto.frear();
       minhaMoto.exibirDetalhes();
       
      
         
    }
}
