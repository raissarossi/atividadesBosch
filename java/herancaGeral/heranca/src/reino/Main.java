package exemplo01;

import exemplo01.Fera;
import exemplo01.Guerreiro;

public class Main {

    public static void main(String[] args) {
//        Jogador j1 = new Jogador();
//        j1.x=10;
//        j1.y=10;
//        Jogador j2 = new Jogador();
//        j2.x=10;
//        j2.y=11;
//
//        System.out.println(j1.vida);
//        System.out.println(j2.vida);
//
//        j1.atacar(j2);
//
//        System.out.println(j1.vida);
//        System.out.println(j2.vida);
        Guerreiro g1 = new Guerreiro();
        g1.x=10;
        g1.y=10;
        Fera f1 = new Fera();
        f1.x=10;
        f1.y=11;
        System.out.println(g1.vida);
        System.out.println(f1.vida);

        g1.atacar(f1);
        f1.atacar(g1);

        System.out.println(g1.vida);
        System.out.println(f1.vida);


    }
}
