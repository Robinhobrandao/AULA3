import java.util.Calendar;


public class eventos {
	
	String nomeDoevento;
	private Calendar dataInicio;
	private Calendar dataFim;
	private int cargaHoraria;
	private responsavel responsavel;
	private palestras palestra [];
	
	public eventos(String nomeDoevento, Calendar dataInicio, Calendar dataFim, int cargaHoraria, responsavel responsavel, palestras palestra[])
	{
		super ();
		this.nomeDoevento = nomeDoevento;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.palestra = palestra;
		this.responsavel = responsavel;
        this.cargaHoraria = cargaHoraria;
       
        
        
		
		
		
		
		
	}

	public String getNomeDoevento() {
		return nomeDoevento;
	}

	public void setNomeDoevento(String nomeDoevento) {
		this.nomeDoevento = nomeDoevento;
	}

	public Calendar getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Calendar dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Calendar getDataFim() {
		return dataFim;
	}

	public void setDataFim(Calendar dataFim) {
		this.dataFim = dataFim;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public responsavel getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(responsavel responsavel) {
		this.responsavel = responsavel;
	}

	public palestras[] getPalestra() {
		return palestra;
	}

	public void setPalestra(palestras[] palestra) {
		this.palestra = palestra;
	}
	
	
	public double calcularValorGastoResponsavel() {
		
		return cargaHoraria * responsavel.getValorHora();
		
	}
	
	
	
	
	public double calcularValorGastoPalestra() {
		
		double totalGastoPalestra = 0;
		
		
		for (int i =0; i < palestra.length; i++) {
			
			 totalGastoPalestra += this.palestra[i].calculavalorPalestra();			 
			
		}
		
		return totalGastoPalestra;		
		
	}
	
	
	
	

}
