package ProjetoYouTube;

public final class Gafanhoto extends Pessoa {
	private String login;
	private int totalAssistido;
	
	public Gafanhoto(String nome, String sexo, int idade, String login, int totalAssistido) {
		super(nome, sexo, idade);
		this.login = login;
		this.totalAssistido = totalAssistido;
	}

	public final String getLogin() {
		return login;
	}

	public final void setLogin(String login) {
		this.login = login;
	}

	public final int getTotalAssistido() {
		return totalAssistido;
	}

	public final void setTotalAssistido(int totalAssistido) {
		this.totalAssistido = totalAssistido;
	}

	@Override
	public String toString() {
		return "Gafanhoto [ " + super.toString() + "\n login=" + login + ", totalAssistido=" + totalAssistido + "]";
	}
	
}
