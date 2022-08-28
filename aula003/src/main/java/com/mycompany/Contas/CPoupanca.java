package com.mycompany.Contas;

public class CPoupanca extends CCorrente {
    private double saldominimo;
    
    public CPoupanca(int num, double sal, Cliente cli, double salmin) {
        super(num,sal,cli);
        this.saldominimo = salmin;
    }
    
//@override
    public void debitar(double valor) {
        if(valor <= super.getSaldo()) {
            super.setSaldo(super.getSaldo()-valor);
            if (super.getSaldo()< this.saldominimo)
                this.saldominimo = super.getSaldo();
        }else{
            System.out.println("Saldo Insuficiente");
        }
    }
    public void atualizarSaldo() {
        super.setSaldo(super.getSaldo() +(this.saldominimo*0.05));
        this.saldominimo = super.getSaldo();
    }
    
    public double getSaldoMinimo() {
        return this.saldominimo;
    }
    
    public String toString() {
        return (super.toString() + " Saldo Mínimo " + this.saldominimo);
    }
}