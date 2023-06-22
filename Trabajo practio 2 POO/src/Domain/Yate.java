package Domain;

public class Yate extends Barco {
	
	private String tipoBarco;
	private Double tarifa;

	public Yate(String matricula, Double eslora, Integer añoFabricacion) {
		super(matricula, eslora, añoFabricacion);
		
		this.tarifa=200.0;
		this.tipoBarco="Yate";
	}


	public Double getTarifa() {
		return this.tarifa;
	}
	
	public String getTipoBarco() {
		return this.tipoBarco;
	}
	
	
	
}	
