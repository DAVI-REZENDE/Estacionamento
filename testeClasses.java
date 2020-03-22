import java.util.Calendar;
import java.util.Locale;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.GregorianCalendar;

public class testeClasses {
	public static void main(String[] args) throws ParseException {

        
		Calendar c = Calendar.getInstance();
        Date data = c.getTime();
         
        Locale brasil = new Locale("pt", "BR"); //Retorna do país e a língua
        
         
        DateFormat f2 = DateFormat.getDateInstance(DateFormat.FULL, brasil);
        System.out.println("Data e hora brasileira: "+f2.format(data));
        
       
        
//        int dia = c.get(Calendar.DATE);
//        int mes = c.get(Calendar.MONTH);
//        int ano = c.get(Calendar.YEAR);
//        int hora = c.get(Calendar.HOUR_OF_DAY);
//        int minutos = c.get(Calendar.MINUTE);
//        int segundos = c.get(Calendar.SECOND);
//        
//        System.out.printf("Hoje e: %02d/%02d/%d | %02d:%02d:%02d", dia, (mes+1), ano, hora, minutos, segundos);
        
        GregorianCalendar data1 = new GregorianCalendar(2020, 0, 22, 17, 30, 32);
        
        System.out.println();
        imprimiData(data1);
        
      
         
       
	}
	
	private static void imprimiData(Calendar hoje) {
		int dia = hoje.get(Calendar.DATE);
        int mes = hoje.get(Calendar.MONTH);
        int ano = hoje.get(Calendar.YEAR);
        int hora = hoje.get(Calendar.HOUR_OF_DAY);
        int minutos = hoje.get(Calendar.MINUTE);
        int segundos = hoje.get(Calendar.SECOND);
        
        System.out.printf("Hoje e: %02d/%02d/%d | %02d:%02d:%02d",
        		dia, (mes+1), ano, hora, minutos, segundos);

	}

}
