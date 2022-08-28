package com.mycompany.mavenproject1;

public class Mavenproject1 {
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
    public static void main(String[] args) {
        Veiculos minivan = new Veiculos(7,80,9);
        Veiculos sportcar = new Veiculos(2,9,35);
        System.out.print("Minivan pode transportar " + minivan.get_passageiros() + " passageiros ");
        System.out.println("com uma autonomia de " + minivan.calcular_consumo() + " quilômetros");
        System.out.print("Carro esporte pode transportar " + sportcar.get_passageiros() + "passageiros ");
        System.out.println("com uma autonomia de " + sportcar.calcular_consumo() + " quilômetros");
    }
}
