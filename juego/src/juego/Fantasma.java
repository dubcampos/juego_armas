package juego;

public class Fantasma extends Enemigo {
	
	void RecibirDanio(int i, int tipo_danio) {
		if(tipo_danio==0) {
			System.out.println("JA lo esquivé");
		}else {
			super.RecibirDanio(i);
		}
		
	}

}
