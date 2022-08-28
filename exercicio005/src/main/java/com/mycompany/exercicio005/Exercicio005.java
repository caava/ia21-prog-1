package com.mycompany.exercicio005;
import java.util.Scanner;

public class Exercicio005 {

    static Scanner ler = new Scanner(System.in);
    
    public static class Pou{
        private String nome;
        private int fome;
        private int saude;
        private int idade;
    
    
        public Pou(String nome, int fome, int saude, int idd){
            this.nome = nome;
            this.fome = fome;
            this.saude = saude;
            this.idade = idd;
        }
        
        public int fome(){
            return this.fome;
        }
        
        public int idade(){
            return this.idade;
        }
        
        public int saude(){
            return this.saude;
        }
        
        public String nome(){
            return this.nome;
        }
        
        public int alterar_fome(){
            System.out.println("A fome é de " + this.fome + ". Como está a fome agora");
            this.fome = ler.nextInt();
            return this.fome;
        }
        
        public int alterar_idade(){
            System.out.println("A idade é de " + this.idade + ". Como está a idade agora");
            this.idade = ler.nextInt();
            return this.idade;
        }
        
        public int alterar_saude(){
            System.out.println("A saude é de " + this.saude + ". Como está a saude agora");
            this.saude = ler.nextInt();
            return this.saude;
        }
        
        public String alterar_nome(){
            System.out.println("O nome é " + this.nome + ". Como vai ser o nome agora");
            this.nome = ler.next();
            return this.nome;
        }
        
        public int humor(){
            return (this.saude - this.fome);
        }        
    }
    
    public static void main(String[] args) {
        Pou pou = new Pou("Plinio", 1, 99, 1);
        System.out.println(pou.nome + " " + pou.saude + " " + pou.fome + " " + pou.idade);
        System.out.println(pou.humor());
        pou.alterar_nome();
        pou.alterar_saude();
        pou.alterar_fome();
        pou.alterar_idade();
        System.out.println(pou.nome + " " + pou.saude + " " + pou.fome + " " + pou.idade);
        System.out.println(pou.humor());
    }
}