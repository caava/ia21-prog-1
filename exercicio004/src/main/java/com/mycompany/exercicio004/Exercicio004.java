package com.mycompany.exercicio004;

public class Exercicio004 {

    public static class TV{
        private int canal;
        private int volume;
        
        public TV(int can, int vol){
        this.canal = can;
        this.volume = vol;
        }
        
        public int aumentar_canal(){
            if(this.canal > 0 && this.canal < 999){
                this.canal++;
            }
            return this.canal;
        }
        
        public int diminuir_canal(){
            if(this.canal > 1 && this.canal < 1000){
                this.canal--;
            }
            return this.canal;
        }
        
        public int diminuir_volume(){
            if(this.volume > 0 && this.volume < 101){
                this.volume--;
            }
            return this.volume;
        }
        
        public int aumentar_volume(){
            if(this.volume >= 0 && this.volume < 99){
                this.volume++;
            }
            return this.volume;
        }
    }
    
    public static void main(String[] args) {
        TV tv = new TV(1, 0);
        System.out.println(tv.canal + " " + tv.volume);
        tv.aumentar_canal();
        tv.aumentar_volume();
        System.out.println(tv.canal + " " + tv.volume);
        tv.diminuir_canal();
        tv.diminuir_volume();
        System.out.println(tv.canal + " " + tv.volume);
    }
}
