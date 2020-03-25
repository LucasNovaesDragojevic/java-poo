package ProjetoPessoas;

public class Professor extends Pessoa {
	private String especialidade;
	private float salario;
	
	public Professor() {
		super();
	}

	public Professor(String especialidade, float salario) {
		super();
		this.especialidade = especialidade;
		this.salario = salario;
	}

	private String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	private float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	public void receberAumento(float aumento) {
		this.setSalario(this.getSalario() + aumento);
	}
}
