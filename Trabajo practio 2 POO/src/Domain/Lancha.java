package Domain;

public class Lancha extends Barco {

	private String tipoBarco;
	private Double tarifa;

	public Lancha(String matricula, Double eslora, Integer aņoFabricacion) {
		super(matricula, eslora, aņoFabricacion);
		this.tarifa = 50.0;
		this.tipoBarco = "Lancha";
	}

	public Double getTarifa() {
		return this.tarifa;
	}

	public String getTipoBarco() {
		return this.tipoBarco;
	}

}
