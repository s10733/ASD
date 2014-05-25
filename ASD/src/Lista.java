import java.util.ArrayList;
import java.util.List;


public class Lista {

	public Lista(String string) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<String>();
		Lista newlist = new Lista("a");
		
		lista.add("10.0.0.1");
		lista.add("10.200.0.16");
		System.out.println(lista);
		if(lista.get(0).equals("10.0.0.1")){
			System.out.println("jest ok");
		}
		else
		{
			System.out.println("jest Ÿle");
		}
		
		int index = lista.indexOf("10.0.0.1");
		System.out.println(index);
		System.out.println(lista);
	}

}
