/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package racional;

/**
 *
 * @author lab211
 */
public class Main {
    
    public static void main(String[] args) {
        
        Racional a = new Racional( 3, 8);
        Racional b = new Racional (5, 12);
        
        //a.multiplicar(b);
        //System.out.println("A multiplicação é: "+ a);
        
        //a.dividir(b);
        //System.out.println("A divisão é: "+ a);
        
        //a.somar(b);
        //System.out.println("A soma é: "+ a);
        
        a.subtrair(b);
        System.out.println("A subitração é: "+ a);
    }
}
