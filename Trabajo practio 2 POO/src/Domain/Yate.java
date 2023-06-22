package Domain;

public class Yate extends Barco {
	
	private String tipoBarco;
	private Double tarifa;

	public Yate(String matricula, Double eslora, Integer aņoFabricacion) {
		super(matricula, eslora, aņoFabricacion);
		
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
