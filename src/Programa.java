import java.util.List;

public class Programa {
	
	static Usuario[] usuarios = new Usuario[1000];
	static int numUsuarios = 0;
	
	public static void main(String[] args) {
		
		boolean executando = true;
		
		while (executando) {
			System.out.println("Menu");
			System.out.println("1 - Cadastrar Usuario");
			System.out.println("2 - Listar Usuarios");
			System.out.println("3 - Cadastrar Reuniao");
			System.out.println("4 - Cadastrar Tarefa");
			System.out.println("6 - Imprimir Agenda");
			System.out.println("9 - Sair");
			
			int opcao = Integer.parseInt(Console.readLine());
			
			switch (opcao) {
				case 1:
					adicionarUsuario();
					break;
				case 2:
					listarUsuarios();
					break;
				case 3:
					adicionarReuniao();
					break;
				case 4:
					adicionarTarefa();
					break;
				case 6:
					imprimirAgenda();
					break;
				case 9: 
					executando = false;
					break;
				default:
					System.out.println("Opção inválida!");
			}			
		}		
	}
	
	public static void imprimirAgenda() {
		System.out.println("Imprimir Agenda");
		
		System.out.print("Entre com o ID do usuário: ");
		Integer idUsuario = Integer.parseInt(Console.readLine());
		
		List<Compromisso> compromissos = usuarios[idUsuario].getAgenda().getCompromissos();
		for (int x = 0; x < compromissos.size(); x++) {
			System.out.println(compromissos.get(x).toString());
		}		
	}
	
	public static void listarUsuarios() {
		for (int x = 0; x < numUsuarios; x++) {
			Usuario usuario = usuarios[x];
			System.out.println(usuario.toString());
		}
	}
	
	public static void adicionarUsuario() {
		
		System.out.println("Novo Usuário");
		
		System.out.print("Entre com o nome: ");
		String nome = Console.readLine();
		
		System.out.print("Entre com email: ");
		String email = Console.readLine();
		
		try {
			Usuario usuario = new Usuario();
			usuario.setNome(nome);
			usuario.setEmail(email);
			
			usuarios[numUsuarios++] = usuario;
		} catch (EmailInvalidoException | DominioException e) {
			System.out.print("Email inválido!");
		}
	}
	
	public static void adicionarReuniao() {
		
		System.out.println("Nova Reunião");
		
		System.out.print("Entre com o ID do usuário: ");
		Integer idUsuario = Integer.parseInt(Console.readLine());
		
		System.out.print("Entre com o assunto: ");
		String assunto = Console.readLine();
		
		System.out.print("Entre com o hora inicio: ");
		Integer horaInicio = Integer.parseInt(Console.readLine());
		
		System.out.print("Entre com o hora termino: ");
		Integer horaTermino = Integer.parseInt(Console.readLine());
		
		System.out.print("Entre com o local: ");
		String local = Console.readLine();
		
		System.out.print("Entre com a obrigatoriedade: ");
		Boolean presenca = Boolean.parseBoolean(Console.readLine());
		
		Reuniao reuniao = new Reuniao();
		reuniao.setAssunto(assunto);
		reuniao.setHoraInicio(horaInicio);
		reuniao.setHoraTermino(horaTermino);
		reuniao.setLocal(local);
		reuniao.setPresenca(presenca);
		
		Usuario usuario = usuarios[idUsuario];
		Agenda agenda = usuario.getAgenda();
		agenda.adicionarCompromisso(reuniao);
	}
	
	public static void adicionarTarefa() {
		
		System.out.println("Nova Tarefa");
		
		System.out.print("Entre com o ID do usuário: ");
		Integer idUsuario = Integer.parseInt(Console.readLine());
		
		System.out.print("Entre com o assunto: ");
		String assunto = Console.readLine();
		
		System.out.print("Entre com o hora inicio: ");
		Integer horaInicio = Integer.parseInt(Console.readLine());
		
		System.out.print("Entre com o hora termino: ");
		Integer horaTermino = Integer.parseInt(Console.readLine());
		
		System.out.print("Entre com o esforco: ");
		Integer esforco = Integer.parseInt(Console.readLine());
		
		System.out.print("Entre com a prioridade: ");
		Integer prioridade = Integer.parseInt(Console.readLine());
		
		Tarefa tarefa = new Tarefa();
		tarefa.setAssunto(assunto);
		tarefa.setHoraInicio(horaInicio);
		tarefa.setHoraTermino(horaTermino);
		tarefa.setEsforco(esforco);
		tarefa.setPrioridade(prioridade);
		
		Usuario usuario = usuarios[idUsuario];
		Agenda agenda = usuario.getAgenda();
		agenda.adicionarCompromisso(tarefa);
	}
}
