package aula12;

public class Peixe extends Animal{
	private String corEscama;

	public Peixe() {
		super();
	}

	public Peixe(String corEscama) {
		super();
		this.corEscama = corEscama;
	}

	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}

	@Override
	public void locomover() {
		// TODO Auto-generated method stub
		System.out.println("Nadando.");
	}

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		System.out.println("Comendo subst�ncias");
	}

	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
		System.out.println("Peixe n�o faz som.");
	}
	
	public void soltarBolha() {
		System.out.println("Soltou bolha.");
	}
}
