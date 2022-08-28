package com.mycompany.exercicio003;
import java.util.Scanner;

public class Exercicio003 {
    static Scanner ler = new Scanner(System.in);
    
    public static class Pessoa{
        private String nome;
        private int idade;
        private float peso;
        private double altura;
        
        public Pessoa(String nome, int idd, float peso, double alt){
            this.nome = nome;
            this.idade = idd;
            this.peso = peso;
            this.altura = alt;
        }
        
        public int envelhecer(){
            if (this.idade < 21){
                this.altura = (this.altura + 0.5);
            }
            this.idade++;
            return this.idade;
        }
        
        public float engordar(){
            System.out.println("Indique o peso ganho ");
            this.peso = this.peso + ler.nextFloat();
            return this.peso;
        }
        
        public float emagrecer(){
            System.out.println("Indique o peso perdido ");
            this.peso = this.peso - ler.nextFloat();
            return this.peso;
        }
        
        public double crescer(){
            System.out.println("Indique a altura ganha ");
            this.altura = this.altura + ler.nextDouble();
            return this.altura;
        }
    }
    
    
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Pedro", 17, 60, 182);
        System.out.println(pessoa.nome + " " + pessoa.altura + " " + pessoa.peso + " " + pessoa.idade);
        pessoa.envelhecer();
        System.out.println(pessoa.altura + " " + pessoa.idade);
        pessoa.engordar();
        System.out.println(pessoa.peso);
        pessoa.emagrecer();
        System.out.println(pessoa.peso);
    }
}
