public class Usuario {
    private int idade;
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade) {
        idade = Math.abs(idade);
        this.idade = idade;
    }


//    alt+insert -> toString()
    @Override
    public String toString() {
        return "My name is "+nome+", I'm "+idade+" years old!";
    }
}
