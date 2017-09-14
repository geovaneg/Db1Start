package br.com.bd1.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.bd1.ExerciciosDouble;

public class ExerciciosDoubleTest {
	
	@Test
	public void exibeMenorValorDoisTest(){
		Assert.assertTrue(10.0 == ExerciciosDouble.exibeMenorValorDois(10.0, 11.0));
	}
	
	@Test
	public void exibeMenorValorTresTest(){
		Assert.assertTrue(12.0 == ExerciciosDouble.exibeMenorValorTres(100.0, 110.0, 12.0));
	}
	
	@Test
	public void exibeMediaTresTest(){
		Assert.assertTrue(110.0 == ExerciciosDouble.exibeMediaTres(100.0, 110.0, 120.0));
	}
	
	@Test
	public void exibeAreatrianguloTest(){
		Assert.assertTrue(2.0 == ExerciciosDouble.exibeAreatriangulo(2.0, 2.0));
	}
}
