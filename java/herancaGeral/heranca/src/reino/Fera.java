package exemplo01;

public class Fera extends Jogador {
    @Override
    boolean atacar(Jogador oponente){
        super.atacar(oponente);
        super.atacar(oponente);
        super.atacar(oponente);

        return true;
    }

}
