package classe;

import java.util.Calendar;

public class Data {
	
	Calendar c = Calendar.getInstance();
	
	int dia = c.get(Calendar.DAY_OF_MONTH);
	int mes = c.get(Calendar.MONTH);
	int ano = c.get(Calendar.YEAR);
	
	Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	Data(){}
	
	String obterData(){
		return String.format("%d/%d/%d", dia, mes, ano);
	}
}
