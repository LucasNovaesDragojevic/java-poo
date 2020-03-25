package UltraEmojiCombat;

public class Lutador {

	public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
		this.altura = altura;
		this.setPeso(peso);
	}

	private String nome, nacionalidade, categoria;
	private int idade, vitorias, derrotas, empates;
	private float altura, peso;

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	private void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the nacionalidade
	 */
	private String getNacionalidade() {
		return nacionalidade;
	}

	/**
	 * @param nacionalidade the nacionalidade to set
	 */
	private void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	/**
	 * @return the categoria
	 */
	public String getCategoria() {
		return categoria;
	}

	/**
	 * @param categoria the categoria to set
	 */
	private void setCategoria() {
		if (this.getPeso() < 52.2) {
			this.categoria = "Inválido";
		} else if (this.getPeso() <= 70.3) {
			this.categoria = "Leve";
		} else if (this.getPeso() <= 83.9) {
			this.categoria = "Medio";
		} else if (this.getPeso() <= 120.2) {
			this.categoria = "Pesado";
		} else {
			this.categoria = "Inválido";
		}
	}

	/**
	 * @return the idade
	 */
	private int getIdade() {
		return idade;
	}

	/**
	 * @param idade the idade to set
	 */
	private void setIdade(int idade) {
		this.idade = idade;
	}

	/**
	 * @return the vitorias
	 */
	private int getVitorias() {
		return vitorias;
	}

	/**
	 * @param vitorias the vitorias to set
	 */
	private void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	/**
	 * @return the derrotas
	 */
	private int getDerrotas() {
		return derrotas;
	}

	/**
	 * @param derrotas the derrotas to set
	 */
	private void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	/**
	 * @return the empates
	 */
	private int getEmpates() {
		return empates;
	}

	/**
	 * @param empates the empates to set
	 */
	private void setEmpates(int empates) {
		this.empates = empates;
	}

	/**
	 * @return the altura
	 */
	private float getAltura() {
		return altura;
	}

	/**
	 * @param altura the altura to set
	 */
	private void setAltura(float altura) {
		this.altura = altura;
	}

	/**
	 * @return the peso
	 */
	private float getPeso() {
		return peso;
	}

	/**
	 * @param peso the peso to set
	 */
	private void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria();
	}
	
	public void apresentar() {
		System.out.println("");
		System.out.println("Chegou a hora! Apresentamos o lutador" + this.getNome());
		System.out.println("Diretamente de " + this.getNacionalidade());
		System.out.println("com " + this.getIdade() + " anos e " + this.getAltura() + " m de altura");
		System.out.println("pesando " + this.getPeso() + "Kg");
		System.out.println(this.getVitorias() + " vitórias ");
		System.out.println(this.getDerrotas() + " derrotas e ");
		System.out.println(this.getEmpates() + " empates!");
		System.out.println("");
	}
	
	public void status() {
		System.out.println(this.getNome() + " é um peso " + this.getCategoria());
		System.out.println("Ganhou " + this.getVitorias() + " vezes.");
		System.out.println("Perdeu " + this.getDerrotas() + " vezes.");
		System.out.println("Empatou " + this.getEmpates() + " vezes.");
	}
	
	public void ganharLuta() {
		this.setVitorias(this.getVitorias() + 1);
	}
	
	public void perderLuta() {
		this.setDerrotas(this.getDerrotas() + 1);
	}
	
	public void empatarLuta() {
		this.setEmpates(this.getEmpates() + 1);
	}
}
