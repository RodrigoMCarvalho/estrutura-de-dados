import java.util.Scanner;

class ExPilha6 {
	public static void main(String[] args) {

		Pilha<Integer> pilha = new Pilha<Integer>();
		Scanner ler = new Scanner(System.in);

		int cont = 1;
		int num;
		do {
			System.out.print("Digite um numero:");
			num = ler.nextInt();

			if(num % 2 == 0){
				System.out.println("Empilhando o numero " + num);
				pilha.empilha(num);
				System.out.println(pilha);
			} else {
				Integer desempilhado = pilha.desempilha();
				if (desempilhado == null){
					System.out.println("Pilha vazia!");
				} else {
					System.out.println("Numero impar, desempilhando um elemento da pilha " 
						+ desempilhado);
					System.out.println(pilha);
				}
			}
			cont++;
		} while (cont <= 10);

		while (!pilha.isVazio()){
			System.out.println("Desempilhando um elemento da pilha " + pilha.desempilha());
		}
		System.out.println("Todos os elementos foram desempilhados");
	}
}