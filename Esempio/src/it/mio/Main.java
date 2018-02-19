package it.mio;

import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		List<String> listMessage= new ArrayList<>();
		
		listMessage.add("Buongiorno");
		listMessage.add("Arrivederci");
		
		for(String m: listMessage) {
			System.out.println(m);
		}

	}

}
