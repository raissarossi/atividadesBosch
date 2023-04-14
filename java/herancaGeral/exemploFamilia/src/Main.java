public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        usuario.setIdade(20);
        System.out.println(usuario.getIdade());

        usuario.setNome("Leo");
        System.out.println(usuario.toString());
    }
}