package aula12;

public class Mamifero extends Animal {
	private String corPelo;

	public Mamifero() {
		super();
	}

	public Mamifero(String corPelo) {
		super();
		this.corPelo = corPelo;
	}

	@Override
	public void locomover() {
		// TODO Auto-generated method stub
		System.out.println("Correndo.");
	}

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		System.out.println("Mamando.");
	}

	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
		System.out.println("Som de mamífero.");
	}
	
	
}
