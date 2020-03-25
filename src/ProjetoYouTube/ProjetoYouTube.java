package ProjetoYouTube;

public class ProjetoYouTube {

	public static void main(String[] args) {
		Video video[] = new Video[3];
		video[0] = new Video("Aula 1 de POO");
		video[1] = new Video("Aula 12 de PHP");
		video[2] = new Video("Aula 10 de HTML5");
		
		Gafanhoto gafanhoto = new Gafanhoto("Jubisreison", "M", 22, "juba", 0);
		
		Visualizacao visualizacao = new Visualizacao(gafanhoto, video[2]);
		visualizacao.avaliar(50.5f);
		visualizacao.avaliar();
		visualizacao.avaliar(19);
		
		System.out.println(video[0].toString());
		System.out.println(gafanhoto.toString());
		System.out.println(visualizacao.toString());
	}
}
