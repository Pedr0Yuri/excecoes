

public class Usuario {
    private String nome;
    private int idade;
    
    public void setNome(String nome) throws NomeInvalidoException {
        if (nome ==null || nome.equals ("")) {
            throw new NomeInvalidoException("Nome inválido! O nome não pode ser vazio ou conter números.");
        }
        this.nome = nome;
    }
    public void setIdade(int idade) throws IdadeInvalidaException {
        if (idade < 18 || idade > 100) {
            throw new IdadeInvalidaException("Idade inválida! A idade deve estar entre 18 e 100 anos.");
        }
        this.idade = idade;
    }
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
}