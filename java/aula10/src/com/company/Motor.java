package com.company;

public class Motor {
    double fatorInjecao = 1;
    boolean ignicao = false;
    int giros(){
        if(!ignicao){
            return 0;
        }else{
            return(int) Math.round(fatorInjecao*3000);
        }
    }
}
