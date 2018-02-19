package it.mio;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> listMessage= new ArrayList<>();
		
		listMessage.add("Buongiorno");
		listMessage.add("Arrivederci");
		listMessage.add("ciao");
		listMessage.add("Addio");
		listMessage.add("Nessun saluto");
		for(String m: listMessage) {
			System.out.println(m);
		}

	}

}
