package juego;

import java.util.ArrayList;
import java.util.List;

public class Jugador {
	String nombre;
	int puntos_de_vida;
	int dinero;
	List<Arma> armas;
	int arma_seleccionada;

	public Jugador(String nombre) {
		this.nombre = nombre;
		puntos_de_vida = 100;
		dinero = 0;
		armas = new ArrayList<Arma>();
		AdquirirArma(new Arma());
	}
	
	public void AdquirirArma (Arma a) {
		armas.add(a);
		arma_seleccionada = armas.size()-1;
	}
	
	public void CambiarArma(int a) { // nuestra arma comenzara en 1
		a = a-1;
		if(a< armas.size()) {
			arma_seleccionada = a;
			System.out.println("Cambio de Arma");
		}else {
			System.out.println("Usted no tiene esa arma");
		}
	}
	
	public void Disparar(Enemigo e) {
		armas.get(arma_seleccionada).Disparar(e);
	}
}
