package com.mycompany.Contas;

class CEspecial extends CCorrente {
    private int limite;

    public CEspecial(int num, double sal, Cliente cli, int lim) {
        super(num, sal, cli);
        this.limite = lim;
    }

 @Override
    public void debitar(double valor){
        if (valor <=(super.getSaldo() + this.limite)){
            super.setSaldo(super.getSaldo() - valor);
        }   else    {
            System.out.print("Saldo Insuficiente");
        }
    }

    public String toString(){
        return (super.toString() + " Limite:" + this.limite);
    }
}
