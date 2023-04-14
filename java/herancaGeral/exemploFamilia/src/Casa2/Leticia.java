package Casa2;
import Casa1.Maria;

public class Leticia {
    Maria sogra = new Maria();
    void teste(){
//        MENOR RELAÇÃO, SÓ ACESSA PUBLIC, POIS NÃO HERDOU 'MARIA'
//        System.out.println(sogra.segredo);
//        System.out.println(sogra.fazDentroDeCasa);
//        System.out.println(sogra.familiaSabe);
        System.out.println(sogra.todoMundoSabe);
    }
}
