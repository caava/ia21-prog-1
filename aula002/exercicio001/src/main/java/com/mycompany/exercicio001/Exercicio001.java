package com.mycompany.exercicio001;

public class Exercicio001 {
    
    public static class Empregado{
        public int codigo;
        public String nome;
        public String email;
        public float salario;
        
        public Empregado(int cod, String nom, String mail, float sal){
            this.codigo = cod;
            this.nome = nom;
            this.email = mail;
            this.salario = sal;
        }
        
        public float get_salario(){
            return this.salario;
        }
        
        public float aumento_salarial(float percentual){
            return this.salario * percentual;
        }
    }
    
    public static class Chefe extends Empregado{
        private float beneficio;
    
        public Chefe(int cod, String nom, String mail, float sal, float ben){
            super(cod, nom, mail, sal);
            this.beneficio = ben;
        }
        
        public float aumento_salarial(float percentual){
            return this.salario * percentual + this.beneficio;
        }
    }
    
    public static class Estagiario extends Empregado{
        private int descontos;
        
        public Estagiario(int cod, String nom, String mail, float sal, int qtd){
            super(cod, nom, mail, sal);
            this.descontos = qtd;
        }
        
        public float aumento_salarial(float percentual){
            return this.salario * percentual - this.descontos;
        }
    }
    
    public static void main(String[] args) {
        Empregado empregado = new Empregado(1, "Pedro", "pedro@gmail.com", 1000);
        Chefe chefe = new Chefe(1, "Antônio", "antonio@gmail.com", 2000, 500);
        Estagiario estagiario = new Estagiario(1, "Cava", "cava@gmail.com", 800, 100);
        System.out.println(empregado.codigo + " " + empregado.nome + " " + empregado.email + " " + empregado.salario);
        System.out.println(empregado.aumento_salarial(2));
        System.out.println(chefe.codigo + " " + chefe.nome + " " + chefe.email + " " + chefe.salario + " " + chefe.beneficio);
        System.out.println(chefe.aumento_salarial(2));
        System.out.println(estagiario.codigo + " " + estagiario.nome + " " + estagiario.email + " " + estagiario.salario + " " + estagiario.descontos);
        System.out.println(estagiario.aumento_salarial(2));
    }
}
