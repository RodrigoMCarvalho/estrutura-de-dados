import java.util.Arrays;

class Vetor {

	private String[] elementos;
	int tamanho;

	public Vetor(int capacidade){
		this.elementos = new String[capacidade];
	}

	/*
	public void adiciona(String elemento) { //adiciona no primeiro campo vazio
		for(int i=0; i < this.elementos.length; i++) {
			if(this.elementos[i] == null) {
				this.elementos[i] = elemento;
				break;
			}
		}
	}*/

	public boolean adiciona(String elemento){
		this.aumentaCapacidade();
		if(this.tamanho < this.elementos.length){
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		} 
		return false;
	}

	//adiciona um valor numa posicao informada
	public boolean adiciona(int posicao, String elemento) {

		//busca se a posicao é válida
		if(!(posicao >= 0 && posicao < tamanho)){
			throw new IllegalArgumentException("Posicao invalida!");
		}
		this.aumentaCapacidade();

		//move todos os elementos
		for(int i=this.tamanho; i >= posicao; i--) {
			this.elementos[i + 1] = this.elementos[i];
		} 
		this.elementos[posicao] = elemento;
		this.tamanho++;	

		return true;
	}

	//private pois só será usado dentro da classe Vetor
	private void aumentaCapacidade() {

		//se o tamanho do vetor for igual a capacidade do vetor
		if(this.tamanho == this.elementos.length){
			//cria um novo vetor com a capacidade dobrada
			String[] elementosNovos = new String[this.elementos.length * 2];
			//realizada uma cópia dos elementos para o vetor novo
			for(int i=0; i < this.elementos.length; i++) {
			elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}

	public String busca(int posicao) {
		if(!(posicao >= 0 && posicao < tamanho)){
			throw new IllegalArgumentException("Posicao invalida!");
		} 
			return this.elementos[posicao];
	}

	public int busca(String elemento) {
		for(int i = 0; i < this.tamanho; i++){
			if(this.elementos[i].equals(elemento)){
				return i;
			}
		}
		return -1;
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