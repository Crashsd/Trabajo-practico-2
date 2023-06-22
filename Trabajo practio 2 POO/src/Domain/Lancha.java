package Domain;

public class Lancha extends Barco {

	private String tipoBarco;
	private Double tarifa;

	public Lancha(String matricula, Double eslora, Integer añoFabricacion) {
		super(matricula, eslora, añoFabricacion);
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
