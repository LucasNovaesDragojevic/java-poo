package ProjetoLivro;

public class Pessoa {

	private String nome;
	private int idade;
	private String sexo;
	
	Pessoa(String nome, int idade, String sexo) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}
	
	public String getNome() {
		return nome;
	}
	private void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	private void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSexo() {
		return sexo;
	}
	private void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	private void fazerAniversario() {
		this.setIdade(this.getIdade() + 1);
	}
}
