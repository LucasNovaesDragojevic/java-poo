package ProjetoLivro;

public class Livro implements Publicacao{
	
	private String titulo;
	private String autor;
	private int totalPaginas;
	private int paginaAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	Livro(String titulo, String autor, int totalPaginas, Pessoa leitor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.totalPaginas = totalPaginas;
		this.paginaAtual = 0;
		this.aberto = false;
		this.leitor = leitor;
	}

	private String getTitulo() {
		return titulo;
	}

	private void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	private String getAutor() {
		return autor;
	}

	private void setAutor(String autor) {
		this.autor = autor;
	}

	private int getTotalPaginas() {
		return totalPaginas;
	}

	private void setTotalPaginas(int totalPaginas) {
		this.totalPaginas = totalPaginas;
	}

	private int getPaginaAtual() {
		return paginaAtual;
	}

	private void setPaginaAtual(int paginaAtual) {
		this.paginaAtual = paginaAtual;
	}

	private boolean isAberto() {
		return aberto;
	}

	private void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	private Pessoa getLeitor() {
		return leitor;
	}

	private void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}

	public String detalhes() {
		return "Livro [titulo=" + titulo 
				+ ",\n autor=" + autor 
				+ ",\n totalPaginas=" + totalPaginas 
				+ ",\n paginaAtual=" + paginaAtual 
				+ ",\n aberto=" + aberto 
				+ ",\n leitor=" + leitor.getNome() 
				+ ",\n idade=" + leitor.getIdade() 
				+ ",\n sexo=" + leitor.getSexo() + "]";
	}

	@Override
	public void abrir() {
		// TODO Auto-generated method stub
		this.setAberto(true);
	}

	@Override
	public void fechar() {
		// TODO Auto-generated method stub
		this.setAberto(false);
	}

	@Override
	public void folhear(int pagina) {
		// TODO Auto-generated method stub
		if (pagina > this.getTotalPaginas()) {
			this.setPaginaAtual(0);
		} else {
			this.setPaginaAtual(pagina);
		}
	}

	@Override
	public void avancarPagina() {
		// TODO Auto-generated method stub
		this.setPaginaAtual(this.getPaginaAtual() + 1);
	}

	@Override
	public void voltarPagina() {
		// TODO Auto-generated method stub
		this.setPaginaAtual(this.getPaginaAtual() - 1);
	}
}
