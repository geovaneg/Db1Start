package br.com.bd1;

public class ExerciciosString {

	public static String retornaMaiusculo(String palavra) {
		return palavra.toUpperCase();
	}

	public static String retornaMinusculo(String palavra) {
		return palavra.toLowerCase();
	}
	
	public static Integer retornaQuantidadeLetras(String palavra) {
		return palavra.length();
	}

	public static Integer retornaQuantidadeEspacoELetras(String palavra) {
		return palavra.length();
	}
	
	public static Integer retornaQuantidadeLetrasComEspaco(String palavra) {
		String palavraSemEspaco;
		palavraSemEspaco = palavra.replaceAll(" ","");
		return palavraSemEspaco.length();
	}

	public static String retornaPalavraComTresLetras(String palavra) {
		return palavra.substring(0,4);
	}
	
	public static String retornaPalavraApartirDaTerceiraLetra(String palavra) {
		return palavra.substring(3,palavra.length());
	}
	
	public static String retornaPalavraUltimasQuatroLetras(String palavra) {
		return palavra.substring(palavra.length() - 4, palavra.length());
	}

	public static String retornaPalavraTrocadaPorAlunoNoInicio(String palavra) {
		String novaPalavra;
		novaPalavra = "Aluno" + palavra.replaceFirst(palavra.split(" ")[0], "");
		return novaPalavra;
	}

	public static String retornaPalavraSemVirgula(String palavra) {
		return palavra.replaceAll(","," ");
	}
	
	public static int retornaQuantidadeDeVogal (String palavra){
        int contarVogais = 0;
        palavra.toLowerCase();
        for (int i = 0; i < palavra.length(); i++){
            String c = palavra.substring(i,i+1);
            
            if (c.equals("a") || c.equals("e") || c.equals("i") || c.equals("o") || c.equals("u"))
                contarVogais++;
        }
        return contarVogais;
    }

	public static String retornaPalavraAoContrario(String palavra) {
		Integer quantidadeLetra = palavra.length();
		
		String[] palavraQuebrada  = new String[quantidadeLetra];
		String palavraInvertida  = "";
		
		for(Integer i = 0; i < quantidadeLetra; i++){
			palavraQuebrada[i] = palavra.substring(i,i+1);
		}
		
		for(Integer i = quantidadeLetra - 1; i >= 0; i--){
			palavraInvertida  = palavraInvertida + palavraQuebrada[i];
		}

		return palavraInvertida;
	}


}
