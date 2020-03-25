package aula13;

public class aula13 {

	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro();
		cachorro.reagir("Olá");
		cachorro.reagir("Vai apanhar");
		cachorro.reagir(11, 45);
		cachorro.reagir(21, 00);
		cachorro.reagir(true);
		cachorro.reagir(false);
		cachorro.reagir(2, 12.5f);
		cachorro.reagir(17, 4.5f);
	}
}