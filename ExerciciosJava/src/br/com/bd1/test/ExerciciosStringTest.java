package br.com.bd1.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.bd1.ExerciciosString;

public class ExerciciosStringTest {
	
	@Test
	public void retornaMaiusculoTest(){
		Assert.assertEquals("OLA", ExerciciosString.retornaMaiusculo("ola"));
	}
	
	@Test
	public void retornaMinusculoTest(){
		Assert.assertEquals("ola", ExerciciosString.retornaMinusculo("Ola"));
	}
	
	@Test
	public void retornaQuantidadeLetrasTest(){
		Assert.assertTrue(8 == ExerciciosString.retornaQuantidadeLetras("DB1START"));
	}
	
	@Test
	public void retornaQuantidadeEspacoELetrasTest(){
		Assert.assertTrue(10 == ExerciciosString.retornaQuantidadeEspacoELetras(" DB1START "));
	}
	
	@Test
	public void retornaQuantidadeLetrasComEspacoTest(){
		Assert.assertTrue(8 == ExerciciosString.retornaQuantidadeLetrasComEspaco(" DB1START "));
	}
	
	@Test
	public void retornaPalavraComTresLetrasTest(){
		Assert.assertEquals("Geov", ExerciciosString.retornaPalavraComTresLetras("Geovane"));
	}
	
	@Test
	public void retornaPalavraApartirDaTerceiraLetraTeste(){
		Assert.assertEquals("vane", ExerciciosString.retornaPalavraApartirDaTerceiraLetra("Geovane"));
	}
	
	@Test
	public void retornaPalavraUltimasQuatroLetrasTeste(){
		Assert.assertEquals("vane", ExerciciosString.retornaPalavraUltimasQuatroLetras("Geovane"));
	}
	
	@Test
	public void retornaPalavraTrocadaPorAlunoNoInicioTeste(){
		Assert.assertEquals("Aluno Gasparello", ExerciciosString.retornaPalavraTrocadaPorAlunoNoInicio("Geovane Gasparello"));
	}
	
	@Test
	public void retornaPalavraSemVirgulaTest(){
		Assert.assertEquals("banana maçã melancia", ExerciciosString.retornaPalavraSemVirgula("banana,maçã,melancia"));
	}
	
	@Test
	public void retornaQuantidadeDeVogalTest(){
		Assert.assertEquals(4, ExerciciosString.retornaQuantidadeDeVogal("aeicco"));
	}
	
	@Test
	public void retornaPalavraAoContrarioTest(){
		Assert.assertEquals("odnatnet uotse", ExerciciosString.retornaPalavraAoContrario("estou tentando"));
	}
	
	
}
