package br.com.bd1;

public class ExerciciosInteger {
	
    public static Double somar(Double valor1, Double valor2){
		return valor1 + valor2;
	}
	
	public static Double subtrair(Double valor1, Double valor2){
		return valor1 - valor2;
	}
	
	public static Double multiplicar(Double valor1, Double valor2){
		return valor1 * valor2;
	}
	
	public static Double dividir(Double valor1, Double valor2){
		return valor1 / valor2;
	}

	public static boolean ehNumeroPar(Double valor1) {
		if (valor1 % 2 == 0)return true;
		else return false;
	}

	public static Double identificaMaior(Double valor1, Double valor2) {
		if(valor1 > valor2) return valor1;
		else return valor2;
	}
	
	public static Integer[] iniciaisImparesMaior100(Integer valorInicial){
		Integer[] impares = new Integer[50];
		Integer contador = 0;
		
		for(Integer i = valorInicial; i <= 100; i++){
			if(i % 2 != 0) {
				contador++;
				impares[contador] =  i;
			}
			
		}
		return impares;	
	}
	
}
