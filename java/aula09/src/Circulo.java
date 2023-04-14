public class Circulo {
    static double pi = Math.PI;
    double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    double calcularArea(){
        return this.pi*Math.pow(this.raio,2);
    }
    static double calcularAreaEstatica(double meuRaio){
        return pi*Math.pow(meuRaio,2);
    }
}
