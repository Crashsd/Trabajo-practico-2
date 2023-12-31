package Domain;

public abstract class Barco {

	private String tipoBarco;
	private String matricula;
	private Double eslora;
	private Integer aņoFabricacion;
	private Double tarifa;

	public Barco( String matricula, Double eslora, Integer aņoFabricacion) {

		
		this.matricula = matricula;
		this.eslora = eslora;
		this.aņoFabricacion = aņoFabricacion;
		
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

	public Integer getAņoFabricacion() {
		return aņoFabricacion;
	}

	public void setAņoFabricacion(Integer aņoFabricacion) {
		this.aņoFabricacion = aņoFabricacion;
	}
	
	public abstract Double getTarifa();
	
	public void setTarifa(Double tarifa) {
		this.tarifa	=tarifa;
	}

	@Override
	public String toString() {
		return "Barco [tipoBarco=" + tipoBarco + ", matricula=" + matricula + ", eslora=" + eslora + ", aņoFabricacion="
				+ aņoFabricacion + ", tarifa=" + tarifa + "]";
	}

	
	


}
