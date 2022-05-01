
public class Compromisso {
	
	private String assunto;
	private Integer horaInicio;
	private Integer horaTermino;
	
	public String getAssunto() {
		return assunto;
	}
	
	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}
	
	public Integer getHoraInicio() {
		return horaInicio;
	}
	
	public void setHoraInicio(Integer horaInicio) {
		this.horaInicio = horaInicio;
	}
	
	public Integer getHoraTermino() {
		return horaTermino;
	}
	
	public void setHoraTermino(Integer horaTermino) {
		this.horaTermino = horaTermino;
	}
	
	public String toString() {
		return "Assunto: " + assunto + 
				" - Inicio/Termino: " + 
				horaInicio + "/" + horaTermino;	
	}
}
