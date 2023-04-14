package com.company;

public class Main {

    public static void main(String[] args) {
//        Carro carro = new Carro();
//        System.out.println(carro.estaLigado());
//        carro.ligar();
//        System.out.println(carro.estaLigado());
//        System.out.println(carro.motor.giros());
//        carro.acelerar();
//        carro.acelerar();
//        System.out.println(carro.motor.giros());
//        carro.frear();
//        System.out.println(carro.motor.giros());

//        Compra compra = new Compra();
//        compra.cliente="jão";
//        compra.adicionarItem(new Item("Notebook", 1, 5000));
//        compra.adicionarItem(new Item("Iphone", 1, 8000));
//        compra.adicionarItem(new Item("Amazon Echo", 1, 1200));
//        System.out.println(compra.itens.size());
//        System.out.println(compra.obterValorTotal());

        Aluno aluno1 = new Aluno("João");
        Aluno aluno2 = new Aluno("Maria");
        Aluno aluno3 = new Aluno("Pedro");
        Curso curso1 = new Curso("Java");
        Curso curso2 = new Curso("Pyhton");
        Curso curso3 = new Curso("VsDia");
        curso1.adicionarAluno(aluno1);
        curso1.adicionarAluno(aluno2);
        curso2.adicionarAluno(aluno1);
        curso2.adicionarAluno(aluno2);
        aluno1.adicionarCurso(curso1);
        aluno2.adicionarCurso(curso3);
        aluno3.adicionarCurso(curso2);
    }
}
