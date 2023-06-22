package Domain;

public class MotoAgua extends Barco {

	private String tipoBarco;
	private Double tarifa;

	public MotoAgua(String matricula, Double eslora, Integer aņoFabricacion) {
		super(matricula, eslora, aņoFabricacion);
		this.tarifa = 25.0;
		this.tipoBarco = "Moto acuatica";
	}

	public Double getTarifa() {
		return this.tarifa;

	}

	public String getTipoBarco() {
		return this.tipoBarco;
	}
}
