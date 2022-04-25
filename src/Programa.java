
public class Programa {
	
	static Usuario[] usuarios = new Usuario[1000];
	static int numUsuarios = 0;
	
	public static void main(String[] args) {
		
		boolean executando = true;
		
		while (executando) {
			System.out.println("Menu");
			System.out.println("1 - Cadastrar Usuario");
			System.out.println("9 - Sair");
			
			int opcao = Integer.parseInt(Console.readLine());
			
			switch (opcao) {
				case 1:
					break;
				case 9: 
					executando = false;
					break;
				default:
					System.out.println("Opção inválida!");
			}			
		}		
	}
	
	public static void adicionarUsuario() {
		
		System.out.println("Novo Usuário");
		
		System.out.print("Entre com o nome: ");
		String nome = Console.readLine();
		
		System.out.print("Entre com email: ");
		String email = Console.readLine();
		
		Usuario usuario = new Usuario();
		usuario.nome = nome;
		usuario.email = email;
		usuario.agenda = new Agenda();
		
		usuarios[numUsuarios++] = usuario;
	}
}
