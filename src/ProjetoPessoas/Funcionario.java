package ProjetoPessoas;

public class Funcionario extends Pessoa {
	private String setor;
	private boolean trabalhando;
	
	public Funcionario() {
		super();
	}

	public Funcionario(String setor, boolean trabalhando) {
		super();
		this.setor = setor;
		this.trabalhando = trabalhando;
	}

	private String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	private boolean isTrabalhando() {
		return trabalhando;
	}

	private void setTrabalhando(boolean trabalhando) {
		this.trabalhando = trabalhando;
	}
	
	public void mudarTrabalho() {
		this.setTrabalhando(!this.isTrabalhando());
	}
}
