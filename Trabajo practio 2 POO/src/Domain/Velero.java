package Domain;

public class Velero extends Barco {
	
	private String tipoBarco;
	private Double tarifa;
	

	public Velero( String matricula, Double eslora, Integer añoFabricacion) {
		super( matricula, eslora, añoFabricacion);
		this.tarifa=100.0;
		this.tipoBarco="velero";
	}

	@Override
	public Double getTarifa() {

		return this.tarifa;
	}
	
	
	
	
	public String getTipoBarco() {
		return this.tipoBarco;
	}

}
