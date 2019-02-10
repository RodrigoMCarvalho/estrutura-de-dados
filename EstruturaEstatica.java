

class EstruturaEstatica<T> {
	
	protected T[] elementos;
	protected int tamanho;

	public EstruturaEstatica(int capacidade) {
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0;
	}

	public EstruturaEstatica() {
		this(10);
	}

	//adiciona um valor no final do vetor
	protected boolean adiciona(T elemento){
		this.aumentaCapacidade();
		if(this.tamanho < this.elementos.length){
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		} 
		return false;
	}

	//adiciona um valor numa posicao informada
	protected boolean adiciona(int posicao, T elemento) {

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

	protected void remove(int posicao){
		if (!(posicao >= 0 && posicao < tamanho)){
			throw new IllegalArgumentException("Posicao invalida");
		}
		for (int i=posicao; i<tamanho-1; i++){
			elementos[i] = elementos[i+1];
		}
		tamanho--;
	}

	@SuppressWarnings("unchecked")
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

	private void validaPosicao(int posicao) {
		//busca se a posicao é válida
		if(!(posicao >= 0 && posicao < tamanho)){
			throw new IllegalArgumentException("Posicao invalida!");
		}
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