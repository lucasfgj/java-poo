import models.Pessoa;

public class Main {
    public static void main(String[] args) {
        //String nome;
        //int idade;

        //nome = "Marta";
        //idade = 25;
        
        //System.out.println("Nome: " + nome);
        //System.out.println("Idade: " + idade);

        Pessoa pessoa = new Pessoa("Marta", 25, "marta@gmail.com");

        pessoa.setNome("José");

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Email: " + pessoa.getEmail());
        //pessoa.nome = "Marta";
    }
}
