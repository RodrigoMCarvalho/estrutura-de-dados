import java.util.ArrayList;

class ExVetor8 {
	public static void main(String[] args){

	ArrayList arrayList = new ArrayList<String>(); 

	arrayList.add("A");
	arrayList.add("C");
	System.out.println(arrayList);

	arrayList.add(1, "B");
	System.out.println(arrayList);

	System.out.println(arrayList.size());

	boolean exite = arrayList.contains("C");
	System.out.println(exite);

	int pos = arrayList.indexOf("D");
	if(pos > -1){
		System.out.println("O elemente informado exite na posicao " + pos);
	} else {
		System.out.println("Elemento nao exite!");
	}
	
	System.out.println(arrayList.get(0));

	arrayList.remove(0);
	arrayList.remove("C");

	System.out.println(arrayList);






	}
}