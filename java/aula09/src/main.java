public class main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook", 4000, 12);
        Produto p2 = p1.clone();
        System.out.println(p2.retornaStringFormatada());

    }
}