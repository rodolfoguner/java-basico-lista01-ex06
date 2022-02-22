package br.fai.ex06;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Main app = new Main();
		app.start();
	}
	private void start(){
		ArrayList<String> carros = new ArrayList<String>();
		carros.add("civic");
		carros.add("gol");
		carros.add("palio");
		carros.add("uno");
		System.out.println("Lista original");
		exibeArray(carros);
		carros.set(1, "L200");
		System.out.println("Lista nova");
		exibeArray(carros);
		carros.add("gol");
		System.out.println("Lista nova");
		exibeArray(carros);
	}
	
	private void exibeArray(ArrayList<String> carros) {
		carros.forEach(carro -> {
			System.out.println(carro);
		});
	}
	
}
