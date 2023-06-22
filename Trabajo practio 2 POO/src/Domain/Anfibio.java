package Domain;

public class Anfibio extends Barco implements TipoAnfibio {

	private Double tarifa;
	private String tipoBarco;
	private Integer velocidad;
	private Integer cantidadRuedas;

	public Anfibio(String matricula, Double eslora, Integer añoFabricacion) {
		super(matricula, eslora, añoFabricacion);
		this.tarifa = 165.0;
		this.tipoBarco = "Anfibio";
		this.velocidad = 100;
		this.cantidadRuedas = 4;
	}

	public Integer getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(Integer velocidad) {
		this.velocidad = velocidad;
	}

	public Integer getCantidadRuedas() {
		return cantidadRuedas;
	}

	public void setCantidadRuedas(Integer cantidadRuedas) {
		this.cantidadRuedas = cantidadRuedas;
	}

	public void setTarifa(Double tarifa) {
		this.tarifa = tarifa;
	}

	public Double getTarifa() {
		return this.tarifa;
	}

	@Override
	public Integer cantidadRuedas() {

		return this.cantidadRuedas;
	}

	public Integer velocidad() {

		return this.velocidad;
	}
	
	public String getTipoBarco() {
		return tipoBarco;
	}
		
	public void setTipoBarco (String tipoBarco ) {
		this.tipoBarco=tipoBarco;
	}

}
