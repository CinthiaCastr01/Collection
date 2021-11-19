package Collection;

import java.util.ArrayList;
import java.util.Collection;

public class Collection1 {
	public static void main(String args[])
	{
		Collection<String> nomes = new ArrayList<String>();
		nomes.add("Ana");
		nomes.add("Leandro");
		nomes.add("Giovana");
		nomes.add("Marcos");
		nomes.add("Laura");
		System.out.println("Lista de nomes: "+nomes);
		nomes.remove("Marcos");
		System.out.println("Lista de nomes: "+nomes);
		/*if(nomes.isEmpty())
		{
			System.out.println("Lista vazia...");
		}
		else
		{
			System.out.println("Lista de nomes: "+nomes);
		}
		//System.out.println("Lista de nomes: "+nomes);*/
	}



}
