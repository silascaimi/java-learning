package datas;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.MonthDay;
import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class ApiJavaTime {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		String dataNascimento = "20/11/1987 20:00";
		String patternOfDateTime = "dd/MM/yyyy HH:mm";
		
		// Criacao de dois objetos LocalDateTime
		// O primeiro convertendo de uma String obedecendo um padrao em String
		// O segundo capturando o DateTime atual
		LocalDateTime t1 = LocalDateTime.parse(dataNascimento, DateTimeFormatter.ofPattern(patternOfDateTime));
		LocalDateTime t2 = LocalDateTime.now();
		
		// Operações com LocalDate
		LocalDate dia = LocalDate.now();
		LocalDate dia2 = dia.plusDays(5);
		LocalDate dia3 = dia.minus(1, ChronoUnit.WEEKS);
		
		// Operacaoes com LocalTime
		LocalTime l = LocalTime.now();
		LocalTime l2 = l.plusHours(2).plusMinutes(30);
		LocalTime l3 = l.minus(100, ChronoUnit.HOURS);
		
		// DURATION
		// Criando um objeto Duration para determinar horas e dias entre os objetos LocalDateTime
		Duration d = Duration.between(t1, t2);
		System.out.println(d.toHours());
		System.out.println(d.toDays());
		
		// Operacoes com Duration
		Duration d1 = Duration.ofMinutes(15);
		LocalTime t = LocalTime.now().minus(d1);
		
		long segundos = d1.getSeconds(); // Capturando o total de segundos de um Duration
		
		// PERIOD
		// Criando um objeto Period para determinar a quantidade de meses entre os objetos LocalDate obtidos através de objetos LocalDateTime
		Period p1 = Period.between(t1.toLocalDate(), t2.toLocalDate());
		System.out.println(p1.toTotalMonths());
		
		// Operacoes com Period
		Period p = Period.of(0,1,7);
		LocalDate dia4 = LocalDate.now().plus(p);
		
		int days = p.getDays(); // Capturando total de dias de um Period
		
		//YearMonth e MonthDay
		MonthDay vencimentoCartao = MonthDay.of(11, 2023);
		YearMonth aniversario = YearMonth.of(20, Month.NOVEMBER);
		
		// CHRONOUNIT		
		// Captura quantidade de semanas e anos com a classe ChronoUnit
		System.out.println(ChronoUnit.WEEKS.between(t1, t2));
		System.out.println(ChronoUnit.YEARS.between(t1, t2));
		
	}

}
