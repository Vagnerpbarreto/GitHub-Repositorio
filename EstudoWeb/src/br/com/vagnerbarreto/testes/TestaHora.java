package br.com.vagnerbarreto.testes;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestaHora {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat formatador = new SimpleDateFormat("HH:mm");
		Date cal = new GregorianCalendar().getTime();
		Time time = new Time(cal.getTime());
		
		System.out.println(time.toString());
		
		
	
		
		

	}

}
