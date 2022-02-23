package br.fai.ex06;

public class Main {
	public static void main(String[] args) {
		Main app = new Main();
		app.start();
	}
	private void start(){
		String carros[] = {"civic", "gol", "palio", "uno"};
		int tamCarros = carros.length;
		String novaListaCarros[] = new String[tamCarros + 1];
			
		System.out.println("Lista original");
		exibeArray(carros);
		carros[1] = "L200"; 
		System.out.println("Lista nova");
		exibeArray(carros);
		novaListaCarros = carros;
		novaListaCarros[tamCarros - 1] = "gol";
		System.out.println("Lista nova");
		exibeArray(carros);
	}
	
	private void exibeArray(String carros[]) {
		for (String carro : carros) {
			System.out.println(carro);
		}
	}
	
}
