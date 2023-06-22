package Domain;

public class Velero extends Barco {
	
	private String tipoBarco;
	private Double tarifa;
	

	public Velero( String matricula, Double eslora, Integer a�oFabricacion) {
		super( matricula, eslora, a�oFabricacion);
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
