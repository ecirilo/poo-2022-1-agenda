
public class Agenda {

	private Compromisso[] compromissos = new Compromisso[100];
	private Integer numCompromissos = 0;
	
	public void adicionarCompromisso(Compromisso compromisso) {
		compromissos[numCompromissos++ ] = compromisso;
	}
	
	public String toString() {
		String conteudo = "";
				
		conteudo += "========\n";
		for (int x = 0; x < numCompromissos; x++) {
			conteudo += compromissos[x].toString() + "\n";
		}
		conteudo += "========\n";
		
		return conteudo;
	}
	
}
