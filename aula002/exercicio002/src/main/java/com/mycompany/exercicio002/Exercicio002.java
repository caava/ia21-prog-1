package com.mycompany.exercicio002;

public class Exercicio002 {

    public static class Animal{
        public String nome;
        public String raca;
        
        public Animal(String nom, String rac){
            this.nome = nom;
            this.raca = rac;
        }
        
        public String animal(){
            return this.nome;
        }
        
        public String caminha(){
            return "poc poc poc";
        }
    }
    
    public static class Cachorro extends Animal {
        public Cachorro(String nom, String rac){
            super(nom, rac);
        }
        
        public String late(){
            return "au au";
        }
    }
    
    public static class Gato extends Animal {
        public Gato(String nom, String rac){
            super(nom, rac);
        }
        
        public String mia(){
            return "miau";
        }
    }
    
    public static void main(String[] args) {
        Animal animal = new Animal("Prikito", "Galinha");
        Cachorro cachorro = new Cachorro("Sharon", "Labrador");
        Gato gato = new Gato("Mozi", "Vira-lata");
        System.out.println(animal.nome + " " + animal.raca);
        System.out.println(animal.caminha());
        System.out.println(cachorro.nome + " " + cachorro.raca);
        System.out.println(cachorro.late());
        System.out.println(cachorro.caminha());
        System.out.println(gato.nome + " " + gato.raca);
        System.out.println(gato.mia());
        System.out.println(gato.caminha());
    }
}