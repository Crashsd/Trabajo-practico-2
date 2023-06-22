package Test;

import java.util.ArrayList;
import java.util.List;

import Domain.Alquiler;
import Domain.Amarre;
import Domain.Anfibio;
import Domain.Barco;
import Domain.Cliente;
import Domain.Lancha;
import Domain.MotoAgua;
import Domain.Puerto;
import Domain.Velero;
import Domain.Yate;

public class PuertoTest {

	public static void main(String[] args) {

		// Puerto y amarres
		Puerto puerto = new Puerto();

		Amarre amarre1 = new Amarre(1, 1);
		Amarre amarre2 = new Amarre(2, 2);
		Amarre amarre3 = new Amarre(3, 3);
		Amarre amarre4 = new Amarre(4, 4);
		Amarre amarre5 = new Amarre(5, 5);

		// Barcos
		Barco velero = new Velero("6-CT-2-00-21", 15.00, 2018);
		Barco yate = new Yate("7-vs-2-808-15", 20.00, 2021);
		Barco anfibio = new Anfibio("12 RN 28", 5.00, 2005);
		Barco lancha=new Lancha("4-CT-2-67-32",3.0,2022);
		Barco motoAgua=new MotoAgua("9-CT-5-27-47",0.0,2017);

		// Clientes

		Cliente cliente1 = new Cliente("Juan", "Quintero", 39754233);
		Cliente cliente2 = new Cliente("Matias", "Palazzo", 24745143);
		Cliente cliente3 = new Cliente("Lautaro", "Modric", 27345987);
		Cliente cliente4 = new Cliente("Sofia ", "Gomez", 41337621);
		Cliente cliente5 = new Cliente("Florencia", "Luppino", 28901023);

		// ALquileres

		Alquiler alquiler1 = new Alquiler(cliente1, velero, amarre1);
		Alquiler alquiler2 = new Alquiler(cliente2, yate, amarre2);
		Alquiler alquiler3 = new Alquiler(cliente3, anfibio, amarre3);
		Alquiler alquiler4 = new Alquiler(cliente4,lancha,amarre4);
		Alquiler alquiler5 = new Alquiler(cliente5,motoAgua,amarre5);

		// Agrego los amarres
		puerto.addAmarre(amarre1);
		puerto.addAmarre(amarre2);
		puerto.addAmarre(amarre3);
		puerto.addAmarre(amarre4);
		puerto.addAmarre(amarre5);

		// Inicio alquiler

		alquiler1.iniciarAlquiler();
		alquiler2.iniciarAlquiler();
		alquiler3.iniciarAlquiler();
		alquiler4.iniciarAlquiler();
		alquiler5.iniciarAlquiler();

		puerto.addAlquiler(alquiler1);
		puerto.addAlquiler(alquiler2);
		puerto.addAlquiler(alquiler3);
		puerto.addAlquiler(alquiler4);
		puerto.addAlquiler(alquiler5);

		// System.out.println(puerto.toString());
		puerto.listaAmarre();

		System.out.println("Cantidad de amarres : " + puerto.contarAmarres());
		System.out.println("Amarres DIsponibles : " + puerto.amarresDisponibles());

		System.out.println("amarres ocupados : " + puerto.amarresOcupados());

		System.out.println("-----------------------------------------------------------------------");

		System.out.println("Se han echo  " + puerto.alquileresRealizados() + " " + "alquileres");

		System.out.println("Tengo " + puerto.AlquileresEnCurso() + " " + "alquileres en curso");
		System.out.println("---------------------------Termino alquiler 2 y cobro  -------------------------------------");

		alquiler1.terminarAlquiler(5);

		System.out.println("Tengo " + puerto.AlquileresEnCurso() + " " + "alquileres en curso");
		

		

		System.out.println("---------------------------Termino alquiler 3 y cobro  -------------------------------------");

		alquiler3.terminarAlquiler(30);
		System.out.println("-------------------------------------------------------------------------------------------");
		puerto.listaAmarre();
		System.out.println("Alquileres en curso : " + puerto.AlquileresEnCurso());
		
		System.out.println("---------------------------Termino alquiler 5 y cobro  -------------------------------------");
		alquiler5.terminarAlquiler(3);
		System.out.println("-------------------------------------------------------------------------------------------");
		puerto.listaAmarre();
		System.out.println("-------------------------------------------------------------------------------------------");
		System.out.println("Cantidad de amarres : " + puerto.contarAmarres());
		System.out.println("Amarres DIsponibles : " + puerto.amarresDisponibles());

		System.out.println("amarres ocupados : " + puerto.amarresOcupados());
		System.out.println("-------------------------------------------------------------------------------------------");
		System.out.println("Alquileres en curso : "+puerto.AlquileresEnCurso());
		System.out.println("Alquileres realizados : "+puerto.alquileresRealizados());
	}
}
