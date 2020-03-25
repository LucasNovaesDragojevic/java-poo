package aula03;

public class Aula03
{
	public static void main(String[] args)
	{
		Caneta caneta1 = new Caneta();
		caneta1.cor = "Azul";
		//caneta1.ponta = 0.5f;
		caneta1.tampada = false;
		caneta1.tampar();
		caneta1.status();
		
		System.out.println("");
		
		Caneta caneta2 = new Caneta();
		caneta2.modelo = "Bic";
		caneta2.cor = "Vermelha";
		caneta2.destampar();
		caneta2.status();
		caneta2.rabiscar();
	}
}