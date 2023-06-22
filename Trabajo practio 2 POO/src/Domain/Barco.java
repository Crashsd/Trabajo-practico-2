package Domain;

public abstract class Barco {

	private String tipoBarco;
	private String matricula;
	private Double eslora;
	private Integer añoFabricacion;
	private Double tarifa;

	public Barco( String matricula, Double eslora, Integer añoFabricacion) {

		
		this.matricula = matricula;
		this.eslora = eslora;
		this.añoFabricacion = añoFabricacion;
		
	}

	public String getTipoBarco() {
		return tipoBarco;
	}

	public void setTipoBarco(String tipoBarco) {
		this.tipoBarco = tipoBarco;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getEslora() {
		return eslora;
	}

	public void setEslora(Double eslora) {
		this.eslora = eslora;
	}

	public Integer getAñoFabricacion() {
		return añoFabricacion;
	}

	public void setAñoFabricacion(Integer añoFabricacion) {
		this.añoFabricacion = añoFabricacion;
	}
	
	public abstract Double getTarifa();
	
	public void setTarifa(Double tarifa) {
		this.tarifa	=tarifa;
	}

	@Override
	public String toString() {
		return "Barco [tipoBarco=" + tipoBarco + ", matricula=" + matricula + ", eslora=" + eslora + ", añoFabricacion="
				+ añoFabricacion + ", tarifa=" + tarifa + "]";
	}

	
	


}
