package com.company;

public class Carro {
    Motor motor = new Motor();

    void acelerar(){
        motor.fatorInjecao+=0.4;
    }
    void frear(){
        motor.fatorInjecao-=0.4;
    }
    void ligar(){
        motor.ignicao=true;
    }
    void desligar(){
        motor.ignicao=false;
    }
    boolean estaLigado(){
        return motor.ignicao;
    }
}
