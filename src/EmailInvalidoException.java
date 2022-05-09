
public class EmailInvalidoException extends Exception {

	private String email;
	
	public EmailInvalidoException(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}
}
