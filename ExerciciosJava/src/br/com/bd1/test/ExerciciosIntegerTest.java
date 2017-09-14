package br.com.bd1.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.bd1.ExerciciosInteger;

public class ExerciciosIntegerTest {
	
	@Test
	public void somarTest(){
		Assert.assertTrue(ExerciciosInteger.somar(5d, 2d) == 7d);
	}
	
	@Test
	public void subtrairTest(){
		Assert.assertTrue(ExerciciosInteger.subtrair(5d, 2d) == 3d);
	}
	
	@Test
	public void dividirTest(){
		Assert.assertTrue(ExerciciosInteger.dividir(5d, 2d) == 2.5);
	}
	
	@Test
	public void multiplicarTest(){
		Assert.assertTrue(ExerciciosInteger.multiplicar(5d, 2d) == 10d);
	}
	
	@Test
	public void ehNumeroParTest(){
		Assert.assertTrue(ExerciciosInteger.ehNumeroPar(4d) == true);
	}
	
	@Test
	public void identificaMaiorTest(){
		Assert.assertTrue(ExerciciosInteger.identificaMaior(4d,5d) == 5d);
	}
	
	@Test
	public void iniciaisImparesMaior100Test(){
		Integer contador = 0;
		
		for(Integer i = 10; i <= 100; i++){
			if(i % 2 != 0){
				contador ++;
				Assert.assertTrue(ExerciciosInteger.iniciaisImparesMaior100(10)[contador] == i);
			}
		}
		
	}
	
	
}
