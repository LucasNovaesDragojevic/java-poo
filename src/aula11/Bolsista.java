package aula11;

public class Bolsista extends Aluno {
	private float bolsa;

	public Bolsista() {
		super();
	}

	public Bolsista(float bolsa) {
		super();
		this.bolsa = bolsa;
	}

	public float getBolsa() {
		return bolsa;
	}

	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}
	
	public void renovarBolsa() {
		System.out.println("Bolsa renovada.");
	}
	
	@Override
	public void pagarMensalidade() {
		System.out.println("Bolsista não paga mensalidade.");
	}
}
