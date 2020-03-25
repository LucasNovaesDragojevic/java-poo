package aula05;

public class Aula05
{
	public static void main(String[] args)
	{
		ContaBanco conta1 = new ContaBanco();
		conta1.setNumeroConta(8546);
		conta1.setDono("Jubileu");
		conta1.abrirConta("CC");
		
		ContaBanco conta2 = new ContaBanco();
		conta2.setNumeroConta(6447);
		conta2.setDono("Geruza");
		conta2.abrirConta("CP");
		
		conta1.depositar(100);
		conta2.depositar(500);
		conta2.sacar(50);
		
		conta1.estadoAtual();
		conta2.estadoAtual();
	}
}