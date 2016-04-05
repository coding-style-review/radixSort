import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class Main {

	
	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<Integer>();
		lista.add(9);
		lista.add(179);
		lista.add(139);
		lista.add(38);
		lista.add(10);
		lista.add(5);
		lista.add(36);
		sorteaza(lista);

	}

	private static void sorteaza(ArrayList<Integer> lista) {
		Integer maxim = Collections.max(lista);
		String ma = maxim.toString();
		int mmax = ma.length();
		System.out.println("Cel mai mare numar are "  +  mmax + " cifre");
		int m = 10;
		int n = 1;
		LinkedList<Integer> q0 = new LinkedList<Integer>();
		LinkedList<Integer> q1 = new LinkedList<Integer>();
		LinkedList<Integer> q2 = new LinkedList<Integer>();
		LinkedList<Integer> q3 = new LinkedList<Integer>();
		LinkedList<Integer> q4 = new LinkedList<Integer>();
		LinkedList<Integer> q5 = new LinkedList<Integer>();
		LinkedList<Integer> q6 = new LinkedList<Integer>();
		LinkedList<Integer> q7 = new LinkedList<Integer>();
		LinkedList<Integer> q8 = new LinkedList<Integer>();
		LinkedList<Integer> q9 = new LinkedList<Integer>();
		
		
		for (int i=0; i<mmax; i++){
			System.out.println("---------------Pasul " + i);
			for (int j=0; j<lista.size(); j++){
				int c = (int)lista.get(j) % m;
				int r = (int) c / n;
				System.out.println("Restul lui " + lista.get(j) + " este " + r);
				switch(r){
				case 0 : q0.add(lista.get(j));break;
				case 1 : q1.add(lista.get(j));break;
				case 2 : q2.add(lista.get(j));break;
				case 3 : q3.add(lista.get(j));break;
				case 4 : q4.add(lista.get(j));break;
				case 5 : q5.add(lista.get(j));break;
				case 6 : q6.add(lista.get(j));break;
				case 7 : q7.add(lista.get(j));break;
				case 8 : q8.add(lista.get(j));break;
				case 9 : q9.add(lista.get(j));break;
				}
				
			}
			ArrayList<Integer> listaNoua = new ArrayList<Integer>();
			//System.out.println(("Coada 0--------"));
			for (int j = 0; j<q0.size(); j++){
				
				int nr = q0.removeFirst();
				listaNoua.add(nr);
				System.out.println(nr);
				
			}
			//System.out.println(("Coada 1--------"));
			for (int j = 0; j<q1.size(); j++){
				int nr = q1.removeFirst();
				listaNoua.add(nr);
				System.out.println(nr);
				
			}
			//System.out.println(("Coada 2--------"));
			for (int j = 0; j<q2.size(); j++){
				int nr = q2.removeFirst();
				listaNoua.add(nr);
				System.out.println(nr);
				
			}
			//System.out.println(("Coada 3--------"));
			for (int j = 0; j<q3.size(); j++){
				int nr = q3.removeFirst();
				listaNoua.add(nr);
				System.out.println(nr);
				
			}
			//System.out.println(("Coada 4--------"));
			for (int j = 0; j<q4.size(); j++){
				int nr = q4.removeFirst();
				listaNoua.add(nr);
				System.out.println(nr);
				
			}
			//System.out.println(("Coada 5--------"));
			for (int j = 0; j<q5.size(); j++){
				int nr = q5.removeFirst();
				listaNoua.add(nr);
				System.out.println(nr);
				
			}
			//System.out.println(("Coada 6--------"));
			for (int j = 0; j<q6.size(); j++){
				int nr = q6.removeFirst();
				listaNoua.add(nr);
				System.out.println(nr);
				
			}
			//System.out.println(("Coada 7--------"));
			for (int j = 0; j<q7.size(); j++){
				int nr = q7.removeFirst();
				listaNoua.add(nr);
				System.out.println(nr);
				
			}
			//System.out.println(("Coada 8--------"));
			for (int j = 0; j<q8.size(); j++){
				int nr = q8.removeFirst();
				listaNoua.add(nr);
				System.out.println(nr);
				
			}
			System.out.println(("Coada 9--------"));
			System.out.println("Dimensiunea cozii " + q9.size());
			for (int j = 0; j<q9.size(); j++){
				
				int nr = q9.removeFirst();
				listaNoua.add(nr);
				System.out.println(nr);
				
			}
			lista = listaNoua;
			
			m = m * 10;
			n = n * 10;
			
			
		}
		
	}

}
