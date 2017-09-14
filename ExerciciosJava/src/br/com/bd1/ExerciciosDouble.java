package br.com.bd1;

public class ExerciciosDouble {

	public static Double exibeMenorValorDois(Double valor1, Double valor2) {
		if (valor1 < valor2) return valor1;
		else return valor2;
	}

	public static Double exibeMenorValorTres(Double valor1, Double valor2, Double valor3) {
		if (valor1 < valor2){
			if (valor1 < valor3) return valor1;
			else return valor3;		
		}
		else{
			if (valor2 < valor3) return valor2;
			else return valor3;
		}
	}

	public static Double exibeMediaTres(Double valor1, Double valor2, Double valor3) {
		return (valor1 + valor2 + valor3) / 3;
	}

	public static Double exibeAreatriangulo(double base, double altura) {
		return (base * altura) / 2;
	}

}
