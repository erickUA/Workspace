package ejemplosThread.ejemplos.carrera;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Programa {

	public static void main(String[] args) {

		String text = "buenos dias buenos dias";
		String[] palabras = text.split(" ");

		Map<String, Integer> mapa = new HashMap<>();

		for (int i = 0; i < palabras.length; i++) {
			if (!mapa.containsKey(palabras[i])) {
				mapa.put(palabras[i], 1);
			} else {
				mapa.put(palabras[i], mapa.get(palabras[i]) + 1);
			}
		}
		Iterator<Entry<String, Integer>> it = mapa.entrySet().iterator();
		while (it.hasNext()) {
			Entry<String, Integer> e = it.next();
			System.out.println(e.getKey() + " " + e.getValue());
		}
	}
}
