import java.util.Scanner;

class Ex6 {
	public static void main(String[] args){
		//criação de vetor com capacidade de 20
		Lista<Contato> lista = new Lista<Contato>(20);

		//criação de varáveis
		Scanner ler = new Scanner(System.in);

		//criar e adicionar contatos
		//criarContatoDinamicamente(5, lista);

		//criar um menu para que o usuário escolha a opção
		int opcao = 1;

		while(opcao != 0) {
			opcao = obterMenu(ler);

			switch(opção){
				case 1 : 
					adicionaContatoFinal(ler, lista);
				break;
				case 2 : 
					adicionaContatoPosicao(ler, lista);
				break;
			}
		}
	}

	private static void adicionaContatoFinal(Scanner ler, Lista<Contato> lista){
		System.out.println("Criando contato....");
		String nome = lerInformacao("Entre com o nome", ler);
		String telefone = lerInformacao("Entre com o telefone", ler);
		String email = lerInformacao("Entre com o email", ler);

		Contato contato = new Contato(nome, telefone, email);

		lista.adiciona(contato);
		System.out.println("Contato adicionado com sucesso!");
		System.out.println(contato);
	}

	private static void adicionaContatoPosicao(Scanner ler, Lista<Contato> lista){
		System.out.println("Criando contato....");
		String nome = lerInformacao("Entre com o nome", ler);
		String telefone = lerInformacao("Entre com o telefone", ler);
		String email = lerInformacao("Entre com o email", ler);

		Contato contato = new Contato(nome, telefone, email);

		int pos = lerInformacaoInt("Entre com a posicao a adicionar no contato:", ler);

		try {
			lista.adiciona(pos, contato);
			System.out.println("Contato adicionado com sucesso!");
			System.out.println(contato);
		} catch (Exception erro){
			System.out.println("Posica invalida, contato nao adicionado!");
		}
	}

	private static String lerInformacao(String msg, Scanner ler){
		System.out.println(msg);
		String entrada = ler.nextLine();
		return entrada;
	}

	private static String lerInformacaoInt(String msg, Scanner ler){
		boolean entradaValida = false;
		int num = 0;

		while(!entradaValida) {
			try {
				System.out.println(msg);
				String entrada = ler.nextLine();
				num = Integer.parseInt(entrada);
				entradaValida = true;
			} catch (Exception erro){
				System.out.println("Entrada invalida! Digite novamente!");
			}
		}
		return num;
	}

	private static int obterMenu(Scanner ler){
		boolean entradaInvalida = false;
		int opcao = 0;

		while(!entradaInvalida){
			System.out.println("Digite a opção desejada:");
			System.out.println("1 - Adiciona contato no final da lista");
			System.out.println("2 - Adiciona contato em uma posicao especifica");
			System.out.println("3 - Consulta contato de uma posicao especifica");
			System.out.println("4 - Consulta contato");
			System.out.println("5 - Consulta ultimo indice do contato");
			System.out.println("6 - Verifica se o contato exite");
			System.out.println("7 - Exclui por posicao ");
			System.out.println("8 - Exclui contato");
			System.out.println("9 - Verifica tamanho do lista");
			System.out.println("10 - Exclui todos os contatos da lista");
			System.out.println("11 - Imprime lista");
			System.out.println("0 - Sair");

			try {
				String entrada = ler.nextLine();
				opcao = Integer.parseInt(entrada);

				if(opcao >= 0 && opcao <= 11){
					entradaInvalida = true;
				} else {
					throw new Exception();
				}
			} catch (Exception erro){
				System.out.println("Entrada invalida! Tente novamente!");
				System.out.println("");
				System.out.println("");
			}
		}
		return opcao;
	}

	private static void criarContatoDinamicamente(int quantidade, Lista<Contato> lista) {
		Contato contato;
		for(int i=1; i<=quantidade; i++){
			contato = new Contato();
			contato.setNome("Contato" + i);
			contato.setTelefone("11111111"+ i);
			contato.setEmail("contato" + i + "@gmail.com");
			lista.adiciona(contato);
		}
	}	
}