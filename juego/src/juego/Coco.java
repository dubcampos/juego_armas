package juego;

public class Coco extends Enemigo {
	
	public Coco() {
		puntosdevida = 5;
	}
	
	void Morir() {
		super.Morir();
		System.out.println("Pero volveré");
	}

}
