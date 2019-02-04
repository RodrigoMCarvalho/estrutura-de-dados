import java.util.ArrayList;

class Ex5 {
	public static void main(String[] args){

		ArrayList<String> arrayList = new ArrayList<String>(5);
		Lista<String> lista = new Lista<String>(3);

		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");

		System.out.println(arrayList);

		arrayList.clear();

		System.out.println(arrayList);

		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("C");

		System.out.println(lista);

		lista.limpa();

		System.out.println(lista);
	}
}