package Domain;

import java.util.ArrayList;
import java.util.List;

public class Puerto {

	private List<Amarre> amarres;
	private List<Alquiler> alquileres;

	public Puerto() {
		amarres = new ArrayList<>();
		alquileres = new ArrayList<>();
	}

	public List<Amarre> getAmarres() {
		return amarres;
	}

	public void setAmarres(List<Amarre> amarres) {
		this.amarres = amarres;
	}

	public List<Alquiler> getAlquileres() {
		return alquileres;
	}

	public void setAlquileres(List<Alquiler> alquileres) {
		this.alquileres = alquileres;
	}

	@Override
	public String toString() {
		return "Puerto [amarres=" + amarres + ", alquileres=" + alquileres + "]";
	}

	// metodos

	public void addAmarre(Amarre amarre) {
		amarres.add(amarre);
	}

	public void addAlquiler(Alquiler alquiler) {
		alquileres.add(alquiler);
	}

	public Integer contarAmarres() {
		Integer contador = 0;

		for (Amarre amarres : amarres) {
			contador += 1;

		}
		return contador;
	}

	public Integer amarresDisponibles() {
		Integer contad = 0;
		for (Amarre amarres : amarres) {
			if (amarres.getEstado() != true) {
				contad += 1;
			}
		}
		return contad;
	}

	public Integer amarresOcupados() {
		Integer contador = 0;
		for (Amarre amarres : amarres) {
			if (amarres.getEstado()) {
				contador += 1;
			}
		}

		return contador;
	}

	public void listaAmarre() {
		for (Amarre amarres : amarres) {
			if (amarres.getEstado()) {
				System.out.println("El amarre " + amarres.getPosicion() + " no esta disponible");
			} else {
				System.out.println("el amarre " + amarres.getPosicion() + " esta disponible");
			}
		}
	}

	public Integer alquileresRealizados() {
		Integer contador = 0;
		for (Alquiler alquileres : alquileres) {
			contador += 1;
		}
		return contador;
	}

	public Integer AlquileresEnCurso() {
		Integer contador = 0;

		for (Alquiler alquileres : alquileres) {
			if (alquileres.getEstado() == true) {
				contador += 1;
			}
		}
		return contador;
	}
}
