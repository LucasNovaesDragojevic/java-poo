package aula03;

public class Caneta
{
	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	protected boolean tampada;
	
	void status()
	{
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Uma caneta " + this.cor);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Carga: " + this.carga);
		System.out.println("Está tampada? " + this.tampada);
	}
	
	public void rabiscar()
	{
		if (tampada)
		{
			System.out.print("Erro");
		}
		else
		{
			System.out.print("Rabisco");
		}
	}
	
	protected void tampar()
	{
		tampada = true;
	}
	
	protected void destampar()
	{
		tampada = false;
	}
}