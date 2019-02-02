import java.util.Arrays;

//Generalizar o tipo do vetor
class Lista<T> {

	private T[] elementos;
	int tamanho;

	public Lista(int capacidade){
		this.elementos = (T[]) new Object[capacidade];
	}

	private void validaPosicao(int posicao) {
		//busca se a posicao é válida
		if(!(posicao >= 0 && posicao < tamanho)){
			throw new IllegalArgumentException("Posicao invalida!");
		}
	}

	public boolean adiciona(T elemento){
		this.aumentaCapacidade();
		if(this.tamanho < this.elementos.length){
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		} 
		return false;
	}

	//adiciona um valor numa posicao informada
	public boolean adiciona(int posicao, T elemento) {

		validaPosicao(posicao);
		this.aumentaCapacidade();

		//move todos os elementos
		for(int i=this.tamanho; i >= posicao; i--) {
			this.elementos[i + 1] = this.elementos[i];
		} 
		this.elementos[posicao] = elemento;
		this.tamanho++;	

		return true;
	}

	// B D E F -> posicao a ser removida 1 (G)
	// 0 1 2 3 -> tamanho = 4
	// vetor[1] = vetor[2]
	// vetor[2] = vetor[3] // vetor[3] = vetor[4]
	public void remove(int posicao) {
		validaPosicao(posicao);
		for(int i=posicao; i < this.tamanho-1; i++) {
			this.elementos[i] = this.elementos[i+1];
		}
		this.tamanho--;
	}

	//private pois só será usado dentro da classe Vetor
	private void aumentaCapacidade() {

		//se o tamanho do vetor for igual a capacidade do vetor
		if(this.tamanho == this.elementos.length){
			//cria um novo vetor com a capacidade dobrada
			T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
			//realizada uma cópia dos elementos para o vetor novo
			for(int i=0; i < this.elementos.length; i++) {
			elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}

	public Object busca(int posicao) {
		validaPosicao(posicao);
		return this.elementos[posicao];
	}

	public int busca(T elemento) {
		for(int i = 0; i < this.tamanho; i++){
			if(this.elementos[i].equals(elemento)){
				return i;
			}
		}
		return -1;
	}

	public boolean contem(T elemento) {
		/*int pos = busca(elemento);
		if(pos > -1){
			return true;
		}
		return false;*/

		return busca(elemento) > -1;
	}

	public int tamanho(){
		return this.tamanho;
	}

	@Override
	public String toString() {

		StringBuilder s = new StringBuilder();
		s.append("[");

		for(int i = 0; i < this.tamanho-1; i++){
			s.append(this.elementos[i]);
			s.append(", ");
		}
		if (this.tamanho>0){
			s.append(this.elementos[this.tamanho - 1]);
		}
		s.append("]");
		return s.toString();
		//return "Vetor [elementos=" + Arrays.toString(elementos) + "]";
	}
}