import java.util.Scanner;

class ExPilha7 {
	public static void main(String[] args) {

		Pilha<Integer> par = new Pilha<Integer>();
		Pilha<Integer> impar = new Pilha<Integer>();

		Scanner ler = new Scanner(System.in);

		System.out.println("Entre com um numero");

		for(int i = 1; i <= 10; i++) {
			int num = ler.nextInt();


			if(num == 0) {

				Integer desempilhado = par.desempilha();

				//PILHA PAR
				if(desempilhado == null) {
					System.out.println("Pilha PAR vazia!");
				} else {
					System.out.println("Desempilhando da pilha PAR: " + desempilhado);
				}

				desempilhado = impar.desempilha();

				//PILHA IMPAR
				if(desempilhado == null) {
					System.out.println("Pilha IMPAR vazia!");
				} else {
					System.out.println("Desempilhando da pilha IMPAR: " + desempilhado);
				}
				
			} else if ( num % 2 == 0){
				par.empilha(num);
				System.out.println("Empilhanado na pilha PAR");
			} else {
				impar.empilha(num);
				System.out.println("Empilhanado na pilha IMPAR");
			}
		}

		System.out.println("Desempilhanado todos os numeros da pilha PAR");

		while(!par.isVazio()){
			System.out.println("Desempilhanado da pilha PAR: " + par.desempilha());
		}

		System.out.println("Desempilhanado todos os numeros da pilha IMPAR");

		while(!impar.isVazio()){
			System.out.println("Desempilhanado da pilha IMPAR: " + impar.desempilha());
		}
	}
}