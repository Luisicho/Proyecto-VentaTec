/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulos;

/**
 *
 * @author LUIS INC
 */
public class Modulo_Principal {
    private char Estado;
    
    public Modulo_Principal(){
        Estado = 'A';
    }
     public void setEstado(char status){
         Estado = status;
         System.out.println("Estado real: "+Estado);
    }
     public char getEstado(){
         return Estado;
     }
}