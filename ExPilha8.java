class ExPilha8 {
	public static void main(String[] args) {

		Pilha<Livro> pilha = new Pilha<Livro>(20);

		Livro livro1 = new Livro();
		livro1.setNome("Aprendendo Java 8");
		livro1.setAutor("Rodrigo Moreira");
		livro1.setAnoLancamento(2019);
		livro1.setIsbn("824241S74SA");

		Livro livro2 = new Livro();
		livro2.setNome("Procedure com PL/SQL");
		livro2.setAutor("Rodrigo Moreira");
		livro2.setAnoLancamento(2019);
		livro2.setIsbn("95654SA661S");

		Livro livro3 = new Livro();
		livro3.setNome("Aprenda MongoDB");
		livro3.setAutor("Gustavo Moreira");
		livro3.setAnoLancamento(2017);
		livro3.setIsbn("9S4698SSA232");

		System.out.println("Pilha está vazia? " + pilha.isVazio());

		pilha.empilha(livro1);
		pilha.empilha(livro2);
		pilha.empilha(livro3);

		System.out.println("Pilha de livros criada.");
		System.out.println(pilha.tamanho() + " livros empilhados.");
		System.out.println(pilha);

		while(!pilha.isVazio()){
			System.out.println("Desempilhando livro: " + pilha.desempilha());
		}
		
	}
}