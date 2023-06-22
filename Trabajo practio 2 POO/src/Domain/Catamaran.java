package Domain;

public class Catamaran extends Barco {

	private String tipoBarco;
	private Double tarifa;

	public Catamaran(String matricula, Double eslora, Integer añoFabricacion) {
		super(matricula, eslora, añoFabricacion);
		this.tarifa = 150.0;
		this.tipoBarco = "Catamaran";

	}

	public String getTipoBarco() {
		return this.tipoBarco;

	}

	public Double getTarifa() {
		return this.tarifa;
	}

}
