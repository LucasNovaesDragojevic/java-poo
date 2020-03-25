package UltraEmojiCombat;

import java.util.Random;

public class Luta {

	private Lutador desafiado, desafiante;
	private int rounds;
	private boolean aprovada;
	
	public Luta() {
		
	}

	private Lutador getDesafiado() {
		return desafiado;
	}

	private void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	private Lutador getDesafiante() {
		return desafiante;
	}

	private void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	private int getRounds() {
		return rounds;
	}

	private void setRounds(int rounds) {
		this.rounds = rounds;
	}

	private boolean isAprovada() {
		return aprovada;
	}

	private void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
	
	public void marcarLuta(Lutador lutador1, Lutador lutador2) {
		if (lutador1.getCategoria().equals(lutador2.getCategoria()) && lutador1 != lutador2) {
			this.setAprovada(true);
			this.setDesafiado(lutador1);
			this.setDesafiante(lutador2);
		} else {
			this.setAprovada(false);
			this.setDesafiado(null);
			this.setDesafiante(null);
		}
	}
	
	public void lutar() {
		if (this.isAprovada()) {
			// Apresentação
			System.out.println("### DESAFIADO ###");
			this.getDesafiado().apresentar();
			System.out.println("### DESAFIANTE ###");
			this.getDesafiante().apresentar();
			
			// Lutando
			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3);
			
			// Resultado da luta
			switch (vencedor) {
				case 0: // Empate
					System.out.println("Empatou");
					this.getDesafiado().empatarLuta();
					this.getDesafiante().empatarLuta();
					break;
				case 1: // Desafiado vence
					System.out.println("Vitória do " + this.getDesafiado().getNome());
					this.getDesafiado().ganharLuta();
					this.getDesafiante().perderLuta();
					break;
				case 2: // Desafiante vence
					System.out.println("Vitória do " + this.getDesafiante().getNome());
					this.getDesafiado().perderLuta();
					this.getDesafiante().ganharLuta();
					break;
			}
		} else {
			System.out.println("A luta não pode acontecer.");
		}
	}
}
