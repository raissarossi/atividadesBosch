package Casa2;
import Casa1.Maria;

public class Joao extends Maria{
    void teste(){
//        SÓ PEGA PUBLIC E PROTECT DE OUTRA PASTA PQ HERDOU 'MARIA'
//        System.out.println(super.segredo);
//        System.out.println(super.fazDentroDeCasa);
        System.out.println(super.familiaSabe);
        System.out.println(super.todoMundoSabe);
    }
}
