package aula12;

public class aula12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mamifero mamifero = new Mamifero();
		Cachorro cachorro = new Cachorro();
		Canguru canguru = new Canguru();
		
		mamifero.emitirSom();
		cachorro.emitirSom();
		canguru.emitirSom();
		
		mamifero.locomover();
		cachorro.locomover();
		canguru.locomover();
	}

}
