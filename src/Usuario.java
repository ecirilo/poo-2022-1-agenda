
public class Usuario {
	
	private String nome;
	private String email;
	private Agenda agenda;
	
	//Método construtor
	public Usuario() {
		this.agenda = new Agenda();
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) throws EmailInvalidoException, DominioException {
		if (!email.contains("@")) {
			throw new EmailInvalidoException(email);
		} else if (!email.contains(".com")) {
			throw new DominioException();
		}
		
		this.email = email;
	}

	public Agenda getAgenda() {
		return agenda;
	}
	
	public String toString() {
		return nome + " - " + email;
	}
}
