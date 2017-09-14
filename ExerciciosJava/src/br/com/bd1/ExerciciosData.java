package br.com.bd1;

import java.util.Calendar;

public class ExerciciosData {

	public static Boolean anoEhBisexto(Integer ano) {
		if(ano % 400 == 0) return true;
	    else if((ano % 4 == 0) && (ano % 100 != 0)) return true;
	    else return false;
	}

	public static Boolean dataDiaUtil(Calendar data) {
		Integer day = data.get(Calendar.DAY_OF_WEEK);
		if(day == 0 || day == 6)return false;
		else return true;
	}
	
	public static int calculaIdade(Calendar dataNascimento) {
	    Calendar hoje = Calendar.getInstance();  
	    hoje.getTime();
	    
	    Integer idade = hoje.get(Calendar.YEAR) - dataNascimento.get(Calendar.YEAR); 

	    if (hoje.get(Calendar.MONTH) < dataNascimento.get(Calendar.MONTH)) {
	      idade--;  
	    } 
	    else 
	    { 
	        if (hoje.get(Calendar.MONTH) == dataNascimento.get(Calendar.MONTH) && hoje.get(Calendar.DAY_OF_MONTH) < dataNascimento.get(Calendar.DAY_OF_MONTH)) {
	            idade--; 
	        }
	    }

	    return idade;
	}

	public static Integer calculaDias(Calendar data1, Calendar data2) {
		return data2.get(Calendar.DAY_OF_YEAR) - data1.get(Calendar.DAY_OF_YEAR); 
	}

	public static Integer calculaMes(Calendar data1, Calendar data2) {
		return data2.get(Calendar.MONTH) - data1.get(Calendar.MONTH); 
	}
	
	public static Integer calculaAno(Calendar data1, Calendar data2) {
		return data2.get(Calendar.YEAR) - data1.get(Calendar.YEAR); 
	}

	public static Double calculaHora(Calendar hora1, Calendar hora2) {
		Long diferenca = hora2.getTimeInMillis() - hora1.getTimeInMillis();
		
		Integer horas = (60 * 60 * 1000);
		
		Long diferencaHoras = diferenca / horas;
		
		Long diferencaMinutos = (diferenca % horas) / (60 * 1000);

        return diferencaHoras.doubleValue();
        
	}
	
}
