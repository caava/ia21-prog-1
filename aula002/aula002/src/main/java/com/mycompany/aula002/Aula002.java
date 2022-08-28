package com.mycompany.aula002;

public class Aula002 {
    public static class Veiculos {
        private int passageiros;
        private int combustivel;
        private int consumo;

        public Veiculos(int pass, int comb, int cons){
             this.passageiros = pass;
            this.combustivel = comb;
            this.consumo = cons;
        }

        public int calcular_consumo(){
            return (this.combustivel*this.consumo);
        }

        public int get_passageiros(){
            return this.passageiros;
        }
    }  
    
    public static class Moto extends Veiculos {
        private String marca;
        
        public Moto(int pass, int comb, int cons, String mar){
            super(pass, comb, cons);
            this.marca = mar;
        }
        
        public String get_marca(){
            return this.marca;
        }
    }

    public static void main(String[] args) {
        Veiculos minivan = new Veiculos(7,80,9);
        Veiculos sportcar = new Veiculos(2,9,35);
        Moto moto = new Moto(2, 10, 20, "Honda");
        System.out.print("Minivan pode transportar " + minivan.get_passageiros() + " passageiros ");
        System.out.println("com uma autonomia de " + minivan.calcular_consumo() + " quilômetros");
        System.out.print("Carro esporte pode transportar " + sportcar.get_passageiros() + " passageiros ");
        System.out.println("com uma autonomia de " + sportcar.calcular_consumo() + " quilômetros");
        System.out.print("Moto " + moto.get_marca() + " pode transportar " + moto.get_passageiros() + " passageiros");
        System.out.println(" com uma autonimia de " + moto.calcular_consumo() + " quilòmetros");
    }
}
