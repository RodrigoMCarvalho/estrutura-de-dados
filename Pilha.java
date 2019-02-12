
class Pilha<T> extends EstruturaEstatica<T>{

	public Pilha(){
		super();
	}

	public Pilha(int capacidade){
		super(capacidade);
	}

	public void empilha(T elemento) {
		super.adiciona(elemento);
	}

	//retorna o tipo da pilha, pode ser String, Integer,...
	public T topo() { 
		if (this.isVazio()){
			return null;
		}
		return this.elementos[tamanho-1];
	}

	public T desempilha() {
		if (this.isVazio()){
			return null;
		}
		return this.elementos[--tamanho];	
	}
}