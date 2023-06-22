package Domain;

public abstract class Barco {

	private String tipoBarco;
	private String matricula;
	private Double eslora;
	private Integer a�oFabricacion;
	private Double tarifa;

	public Barco( String matricula, Double eslora, Integer a�oFabricacion) {

		
		this.matricula = matricula;
		this.eslora = eslora;
		this.a�oFabricacion = a�oFabricacion;
		
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

	public Integer getA�oFabricacion() {
		return a�oFabricacion;
	}

	public void setA�oFabricacion(Integer a�oFabricacion) {
		this.a�oFabricacion = a�oFabricacion;
	}
	
	public abstract Double getTarifa();
	
	public void setTarifa(Double tarifa) {
		this.tarifa	=tarifa;
	}

	@Override
	public String toString() {
		return "Barco [tipoBarco=" + tipoBarco + ", matricula=" + matricula + ", eslora=" + eslora + ", a�oFabricacion="
				+ a�oFabricacion + ", tarifa=" + tarifa + "]";
	}

	
	


}
