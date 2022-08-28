package com.mycompany.exercicio001;
import java.util.Scanner;

public class Exercicio001 {
    static Scanner tec = new Scanner(System.in);
    
    public static class Bola {
        private String cor;
        private int circunferencia;
        private String material;
    
    
        public Bola(String cor, int circ, String mat){
            this.cor = cor;
            this.circunferencia = circ;
            this.material = mat;
        }
    
        public String trocaCor(){
            System.out.println(" digite a nova cor ");
            this.cor = tec.next();
            return this.cor;
        }
    
        public String mostraCor(){
            return this.cor;
        }
    }
    
    public static void main(String[] args) {
        Bola bola = new Bola("vermelho", 2, "couro");
        System.out.print("A cor da bola é " + bola.mostraCor() + ".");
        bola.trocaCor();
        System.out.print("A nova cor da bola é " + bola.mostraCor());
        System.out.print(", a circunferencia da bola é " + bola.circunferencia + " e o material dela é "  + bola.material);
    }
}
