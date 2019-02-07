import java.util.Scanner;

class Ex6 {
	public static void main(String[] args){
		//criação de vetor com capacidade de 20
		Lista<Contato> lista = new Lista<Contato>(20);

		//criação de varáveis
		Scanner ler = new Scanner(System.in);

		//criar e adicionar contatos
		criarContatoDinamicamente(5, lista);

		//criar um menu para que o usuário escolha a opção
		int opcao = 1;

		while(opcao != 0) {
			opcao = obterMenu(ler);

			switch(opcao){
				case 1: 
					adicionaContatoFinal(ler, lista);
				break;
				case 2: 
					adicionaContatoPosicao(ler, lista);
				break;
				case 3:
					obterContatoPosicao(ler, lista);
				break;
				case 4:
					obterContato(ler, lista);
				break;
				case 5:
					pesquisarUltimoIndice(ler, lista);
				break;
				case 6:
					pesquisarContatoExiste(ler, lista);
				break;
				case 7:
					excluirPorPosicao(ler, lista);
				break;
				case 8:
					excluirContato(ler, lista);
				break;
				case 9:
					ImprimeTamanhoVetor(lista);
				break;
				case 10:
					limparVetor(lista);
				break;
				case 11:
					imprimirVetor(lista);
				break;
			}
		}
		System.out.println("Usuario digitou 0, fim do programa!");
	}

	private static void imprimirVetor(Lista<Contato> lista) {
		System.out.println(lista);
	}

	private static void limparVetor(Lista<Contato> lista) {
		lista.limpa();
		System.out.println("Todos os contatos foram excluidos");
	}

	private static void ImprimeTamanhoVetor(Lista<Contato> lista) {
		System.out.println("O tamanho do vetor e " + lista.tamanho());
	}

	private static void excluirContato(Scanner ler, Lista<Contato> lista) {
		int pos = lerInformacaoInt("Entre com o contato a ser removido", ler);
		Contato contato = lista.busca(pos);

		try {
			lista.remove(contato);
			System.out.println("Contato excluido com sucesso!");

		} catch (Exception erro) {
			System.out.println("Posicao invalida!");
		}
	}

	private static void excluirPorPosicao(Scanner ler, Lista<Contato> lista) {
		int pos = lerInformacaoInt("Entre com a posicao a ser removida", ler);

		try {
			lista.remove(pos);
			System.out.println("Contato excluido com sucesso!");

		} catch (Exception erro) {
			System.out.println("Posicao invalida!");
		}
	}

	private static void pesquisarContatoExiste(Scanner ler, Lista<Contato> lista) {
		int pos = lerInformacaoInt("Entre com a posicao a ser pesquisada", ler);

		try {
			Contato contato = lista.busca(pos);

			boolean exite = lista.contem(contato);
			if(exite) {
				System.out.println("Contato existente:");
				System.out.println(contato);
			} else {
				System.out.println("Usuario nao existe");
			}
		} catch (Exception erro) {
			System.out.println("Posicao invalida!");
		}
	}

	private static void pesquisarUltimoIndice(Scanner ler, Lista<Contato> lista) {
		int pos = lerInformacaoInt("Entre com a posicao a ser pesquisada", ler);

		try {
			Contato contato = lista.busca(pos);
			System.out.println("Contato existente:");
			System.out.println(contato);

			System.out.println("Fazendo pesquisa do ultimo indice do contato encontrado:");
			pos = lista.ultimoIndice(contato);

			System.out.println("Contato encontrado na posicao: " + pos);

		} catch (Exception erro) {
			System.out.println("Posicao invalida!");
		}
	}

	private static void obterContato(Scanner ler, Lista<Contato> lista) {
		int pos = lerInformacaoInt("Entre com a posicao a ser pesquisada", ler);

		try {
			Contato contato = lista.busca(pos);
			System.out.println("Contato existente:");
			System.out.println(contato);

			System.out.println("Fazendo pesquisa do contato encontrado:");
			pos = lista.busca(contato);

			System.out.println("Contato encontrado na posicao: " + pos);

		} catch (Exception erro) {
			System.out.println("Posicao invalida!");
		}
	}

	private static void obterContatoPosicao(Scanner ler, Lista<Contato> lista) {
		int pos = lerInformacaoInt("Entre com a posicao a ser pesquisada", ler);

		try {
			Contato contato = lista.busca(pos);
			System.out.println("Contato existente:");
			System.out.println(contato);
		} catch (Exception erro) {
			System.out.println("Posicao invalida!");
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

	private static int lerInformacaoInt(String msg, Scanner ler){
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
			System.out.println(" 1 - Adiciona contato no final da lista");
			System.out.println(" 2 - Adiciona contato em uma posicao especifica");
			System.out.println(" 3 - Consulta contato de uma posicao especifica");
			System.out.println(" 4 - Consulta contato");
			System.out.println(" 5 - Consulta ultimo indice do contato");
			System.out.println(" 6 - Verifica se o contato exite");
			System.out.println(" 7 - Exclui por posicao ");
			System.out.println(" 8 - Exclui contato");
			System.out.println(" 9 - Verifica tamanho do lista");
			System.out.println("10 - Exclui todos os contatos da lista");
			System.out.println("11 - Imprime lista");
			System.out.println(" 0 - Sair");

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