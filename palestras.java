import java.time.LocalTime;

public class palestras  {
	
	String titulo;
	int cargaHoraria;
	private LocalTime horarioInicio;
	private palestrante palestrante;
	 
	
	
	
	public palestras(String titulo, int cargaHoraria, palestrante palestrante1, LocalTime horarioInicio) {
		
		super();
		this.titulo = titulo;
		this.cargaHoraria = cargaHoraria;
		this.palestrante = palestrante;
		this.horarioInicio = horarioInicio;
		
		
	
		
		
		
		
	}




	public String getTitulo() {
		return titulo;
	}




	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}




	public int getCargaHoraria() {
		return cargaHoraria;
	}




	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}




	




	public LocalTime getHorarioInicio() {
		return horarioInicio;
	}




	public void setHorarioInicio(LocalTime horarioInicio) {
		this.horarioInicio = horarioInicio;
	}




	public palestrante getPalestrante() {
		return palestrante;
	}




	public void setPalestrante(palestrante palestrante) {
		this.palestrante = palestrante;
	}

	
	
	public double calculavalorPalestra() {
		
		return getCargaHoraria()* getPalestrante().getValorHora();
		
	}
	
	
	
	
	
	

}
