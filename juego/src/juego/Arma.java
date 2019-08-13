package juego;

public class Arma {
	public int municiones = 10;
	public int danio =2;
	public int tipo_danio = 0; //0 = danio físico; 1 = daño magico
	String sonido_disparo = "Pum";
	
	public void Disparar() {
		System.out.println(sonido_disparo);
		municiones--;
	}
	
	public void Disparar(Enemigo e) {
		System.out.println(sonido_disparo);
		municiones--;
		e.RecibirDanio(danio, tipo_danio);
	}

}
