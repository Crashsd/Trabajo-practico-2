package Domain;

public class Alquiler {

	private Cliente cliente;
	private Barco barco;
	private Amarre amarre;
	private Integer diaInicial;
	private Integer diaFinal;
	private Boolean estado;

	public Alquiler(Cliente cliente, Barco barco, Amarre amarre) {

		this.cliente = cliente;
		this.barco = barco;
		this.amarre = amarre;
		this.diaInicial = 0;
		this.diaFinal = null;
		this.estado=false;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Barco getBarco() {
		return barco;
	}

	public void setBarco(Barco barco) {
		this.barco = barco;
	}

	public Amarre getAmarre() {
		return amarre;
	}

	public void setAmarre(Amarre amarre) {
		this.amarre = amarre;
	}

	public Integer getDiaInicial() {
		return diaInicial;
	}

	public void setDiaInicial(Integer diaInicial) {
		this.diaInicial = diaInicial;
	}

	public Integer getDiaFinal() {
		return diaFinal;
	}

	public void setDiaFinal(Integer diaFinal) {
		this.diaFinal = diaFinal;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Alquiler [cliente=" + cliente + ", barco=" + barco + ", amarre=" + amarre + ", diaInicial=" + diaInicial
				+ ", diaFinal=" + diaFinal + "]";
	}

	

	public void iniciarAlquiler() {
		amarre.ocuparAmarre();
		setEstado(true);
	}

	public void terminarAlquiler(Integer diaFinal) {
		amarre.desocuparAmarre();
		setDiaFinal(diaFinal);
		setEstado(false);

		System.out.println("EL alquiler del amarre " + amarre.getId() + " finalizado " + " del cliente "
				+ getCliente().getNombre() + " " + getCliente().getApellido() +" con el tipo de barco :"+barco.getTipoBarco()+ " su monto total es de : " + obtenerTotal());
	}

	public Double obtenerTotal() {
		double total = 0.0;
		if (diaFinal != null) {
			total = diaFinal * this.barco.getTarifa();
		}
		return total;
	}

}
