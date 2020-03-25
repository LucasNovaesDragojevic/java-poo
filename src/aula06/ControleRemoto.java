package aula06;

public class ControleRemoto implements Controlador {
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	public ControleRemoto() {
		this.setVolume(50);
		this.setLigado(false);
		this.setTocando(false);
	}

	/**
	 * @return the volume
	 */
	private int getVolume() {
		return volume;
	}

	/**
	 * @param volume the volume to set
	 */
	private void setVolume(int volume) {
		this.volume = volume;
	}

	/**
	 * @return the ligado
	 */
	private boolean isLigado() {
		return ligado;
	}

	/**
	 * @param ligado the ligado to set
	 */
	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	/**
	 * @return the tocando
	 */
	private boolean isTocando() {
		return tocando;
	}

	/**
	 * @param tocando the tocando to set
	 */
	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}

	@Override
	public void ligar() {
		this.setLigado(true);
	}

	@Override
	public void desligar() {
		this.setLigado(false);
	}

	@Override
	public void abrirMenu() {
		System.out.println("----MENU----");
		System.out.println("Está ligado? " + this.isLigado());
		System.out.println("Está tocando? " + this.isTocando());
		System.out.println("Volume: " + this.getVolume());
		for (int i = 0; i <= this.getVolume(); i += 10) {
			System.out.print("|");
		}
		System.out.println("");
	}

	@Override
	public void fecharMenu() {
		if (this.isLigado()) {
			System.out.println("Fechando Menu...");
		} else {
			System.out.println("Não foi possível fechar o menu.");
		}
	}

	@Override
	public void maisVolume() {
		if (this.isLigado()) {
			this.setVolume(this.getVolume() + 5);
		} else {
			System.out.println("Não foi possível aumentar o volume.");
		}
	}

	@Override
	public void menosVolume() {
		if (this.isLigado()) {
			this.setVolume(this.getVolume() - 5);
		} else {
			System.out.println("Não foi possível diminuir o volume.");
		}
	}

	@Override
	public void ligarMudo() {
		if (this.isLigado() && this.getVolume() > 0) {
			this.setVolume(0);
		} else {
			System.out.println("Não foi possível ligar o mudo.");
		}
	}

	@Override
	public void desligarMudo() {
		if (this.isLigado() && this.getVolume() == 0) {
			this.setVolume(50);
		} else {
			System.out.println("Não foi possível desligar o mudo.");
		}
	}

	@Override
	public void play() {
		if (this.isLigado() && !(this.isTocando())) {
			this.setTocando(true);
		} else {
			System.out.println("Não foi possível tocar");
		}
	}

	@Override
	public void pause() {
		if (this.isLigado() && this.isTocando()) {
			this.setTocando(false);
		} else {
			System.out.println("Não foi possível pausar.");
		}
	}
}
