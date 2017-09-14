package br.com.bd1.test;


import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.junit.Assert;
import org.junit.Test;

import br.com.bd1.ExerciciosData;
import br.com.bd1.ExerciciosString;
import sun.util.calendar.BaseCalendar.Date;

public class ExerciciosDataTest {

	@Test
	public void anoEhBisextoTest(){
		Assert.assertEquals(true, ExerciciosData.anoEhBisexto(2016));
	}
	
	@Test
	public void dataDiaUtilTest(){
		Calendar data = Calendar.getInstance();
		data.set(2017, 01, 01);
		Assert.assertEquals(true, ExerciciosData.dataDiaUtil(data));
	}
	
	@Test
	public void calculaIdadeTest() {
		Calendar dataNascimento = Calendar.getInstance();
		dataNascimento.set(1996, 3, 19);
	    Assert.assertEquals(21, ExerciciosData.calculaIdade(dataNascimento));
	}
	
	@Test
	public void calculaDiasTest() {
		Calendar data1 = Calendar.getInstance();
		Calendar data2 = Calendar.getInstance();
		data1.set(2017, 9, 1);
		data2.set(2017, 9, 13);
	    Assert.assertTrue(12 == ExerciciosData.calculaDias(data1, data2));
	}
	
	@Test
	public void calculaMesTest() {
		Calendar data1 = Calendar.getInstance();
		Calendar data2 = Calendar.getInstance();
		data1.set(2017, 1, 1);
		data2.set(2017, 9, 13);
	    Assert.assertTrue(8 == ExerciciosData.calculaMes(data1, data2));
	}
	
	@Test
	public void calculaAnoTest() {
		Calendar data1 = Calendar.getInstance();
		Calendar data2 = Calendar.getInstance();
		data1.set(2016, 1, 1);
		data2.set(2017, 1, 13);
	    Assert.assertTrue(1 == ExerciciosData.calculaAno(data1, data2));
	}
	
	@Test
	public void calculaHoraTest() {
		Calendar hora1 = Calendar.getInstance();
		Calendar hora2 = Calendar.getInstance();
		
		hora1.set(Calendar.HOUR,8);
		hora1.set(Calendar.MINUTE,50);
		hora1.set(Calendar.SECOND,00);
		
		hora2.set(Calendar.HOUR,10);
		hora2.set(Calendar.MINUTE,50);
		hora2.set(Calendar.SECOND,00);
		
	    Assert.assertTrue(2.0 == ExerciciosData.calculaHora(hora1, hora2));
	}
	
}
