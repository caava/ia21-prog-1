package com.mycompany.exercicio002;
import java.util.Scanner;

public class Exercicio002 {
    static Scanner ler = new Scanner(System.in);
    
    public static class Quadrado{
        private int lado;
        
        public Quadrado(int lado){
            this.lado = lado;
        }
        
        public int mudarLado(){
            System.out.println("Digite o novo valor do lado ");
            this.lado = ler.nextInt();
            return this.lado;
        }
        
        public int Lado(){
            return this.lado;
        }
        
        public int Area(){
            return (this.lado * this.lado);
        }
    }
    
    
    
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(2);
        System.out.println(quadrado.Lado());
        System.out.println(quadrado.Area());
        quadrado.mudarLado();
        System.out.println(quadrado.Lado());
        System.out.println(quadrado.Area());
    }
    
}
