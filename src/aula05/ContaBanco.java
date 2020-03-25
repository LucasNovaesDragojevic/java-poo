package aula05;

public class ContaBanco 
{
	private int numeroConta;
	private String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	public ContaBanco()
	{
		
	}
	
	public int getNumeroConta() 
	{
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) 
	{
		this.numeroConta = numeroConta;
	}

	public String getTipo() 
	{
		return tipo;
	}

	public void setTipo(String tipo) 
	{
		this.tipo = tipo;
	}

	public String getDono() 
	{
		return dono;
	}

	public void setDono(String dono)
	{
		this.dono = dono;
	}

	public float getSaldo()
	{
		return saldo;
	}

	public void setSaldo(float saldo)
	{
		this.saldo = saldo;
	}

	public boolean getStatus()
	{
		return status;
	}

	public void setStatus(boolean status)
	{
		this.status = status;
	}

	public void abrirConta(String tipo)
	{
		setTipo(tipo);
		setStatus(true);
		if (tipo.equals("CC"))
		{
			setSaldo(50);
		}
		else if (tipo.equals("CP"))
		{
			setSaldo(150);
		}
		System.out.println("Conta aberta com sucesso.");
	}
	
	public void fecharConta()
	{
		if(getSaldo() > 0)
		{
			System.out.println("Conta não pode ser fechada porque ainda tem saldo.");
		}
		else if (getSaldo() < 0)
		{
			System.out.println("Conta não pode ser fechada pois tem débito.");
		}
		else
		{
			System.out.println("Conta fechada com sucesso.");
		}
	}
	
	public void depositar(float valor)
	{
		if (getStatus())
		{
			setSaldo(getSaldo() + valor);
			System.out.println("Depósito realizado na conta de " + getDono());
		}
		else
		{
			System.out.println("Impossível depositar em conta fechada.");
		}
	}
	
	public void sacar(float valor)
	{
		if (getStatus())
		{
			if (getSaldo() > valor)
			{
				setSaldo(getSaldo() - valor);
				System.out.println("Saque realizado.");
			}
			else
			{
				System.out.println("Saldo insufuciente.");
			}
		}
		else
		{
			System.out.println("Impossível sacar.");
		}
	}
	
	public void pagarMensal()
	{
		float valor = 0;
		if (getTipo().equals("CC"))
		{
			valor = 12;
		}
		else if (getTipo().equals("CP"))
		{
			valor = 20;
		}
		
		if (getStatus())
		{
			if (getSaldo() > valor)
			{
				setSaldo(getSaldo() - valor);
				System.out.println("Mensalidade paga.");
			}
			else
			{
				System.out.println("Saldo insuficiente para pagar mensalidade.");
			}
		}
		else
		{
			System.out.println("Impossível pagar conta inativa.");
		}
	}

	public void estadoAtual()
	{
		System.out.println("Conta: " + getNumeroConta());
		System.out.println("Tipo: " + getTipo());
		System.out.println("Dono: " + getDono());
		System.out.println("Saldo: " + getSaldo());
		System.out.println("Status: " + getStatus());
	}
}