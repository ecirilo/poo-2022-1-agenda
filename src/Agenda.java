import java.util.ArrayList;
import java.util.List;

public class Agenda {

	private List<Compromisso> compromissos = new ArrayList<>();
	
	public void adicionarCompromisso(Compromisso compromisso) {
		compromissos.add(compromisso);
	}
	
	public List<Compromisso> getCompromissos() {
		return compromissos;
	}
	
	public String toString() {
		String conteudo = "";
				
		conteudo += "========\n";
		for (Compromisso compromisso: compromissos) {
			conteudo += compromisso.toString() + "\n";
		}
		conteudo += "========\n";
		
		return conteudo;
	}
	
}
