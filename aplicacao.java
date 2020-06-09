import java.time.LocalTime;
import java.util.Calendar;
import java.util.Scanner;

public class aplicacao {
	
	public static void main(String[] args) {
		
		palestrante palestrante1 = new palestrante ("ROBSON BRANDAO", "7199876226", 20.00);
		palestrante palestrante2 = new palestrante ("CARLOS", "7199876221", 50.00);
		responsavel responsavel = new responsavel ("SANDRA REGINA", "785466353", 35.00);
		palestras [] palestras = new palestras[2];
		palestras [0] = new palestras (" O DIA D", 10, palestrante1, LocalTime.now() );
		palestras [1] = new palestras (" O DIA EM QUE A TERRA PAROU", 120, palestrante2, LocalTime.now() );
		
		
		eventos eventos = new eventos ("MENTORIA DA ALMA", Calendar.getInstance(), Calendar.getInstance(), 35, responsavel, palestras);
		
		
		System.out.println(" evento:  " + eventos.getNomeDoevento() + "    Responsavel pelo Evento:  " + responsavel.getNomeResponsavel() +  "      Gasto total do Responsavel: " +  eventos.calcularValorGastoResponsavel() );
		System.out.println("PALESTRA DA NOITE:  "+ eventos.getPalestra() [0].getTitulo() +      " O palestrante da noite: "  + palestrante1.nomeDopalestrante  + "   VALOR DA PALESTRA:  "  + eventos.calcularValorGastoPalestra() );
        
		
		
    		
    		
	    
	    
	    
	    
	    
	   
		
		
		
		
		
		
            }
		
		
	}


