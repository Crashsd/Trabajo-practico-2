package Domain;

import java.util.Objects;

public class Amarre {

	private Integer id;
	private Integer posicion;
	private Boolean estado;

	public Amarre(Integer id, Integer posicion) {
		super();
		this.id = id;
		this.posicion = posicion;
		this.estado=null;
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPosicion() {
		return posicion;
	}

	public void setPosicion(Integer posicion) {
		this.posicion = posicion;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
	


	@Override
	public String toString() {
		return "Amarre [id=" + id + ", posicion=" + posicion + ", libre=" + estado + "]";
	}
	
	
	
	
	
	public void ocuparAmarre() {
		setEstado(true);
	}
	public void desocuparAmarre() {
		setEstado(false);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Amarre other = (Amarre) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	

}
