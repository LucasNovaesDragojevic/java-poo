package aula12;

public class Ave extends Animal {
	private String corPena;

	public Ave() {
		super();
	}

	public Ave(String corPena) {
		super();
		this.corPena = corPena;
	}

	public String getCorPena() {
		return corPena;
	}

	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}

	@Override
	public void locomover() {
		// TODO Auto-generated method stub
		System.out.println("Voar.");
	}

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		System.out.println("Ciscar.");
	}

	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
		System.out.println("Piar.");
	}
	
	public void construirNinho() {
		System.out.println("Construiu ninho.");
	}
}
