package juego;

public class Chaman extends Enemigo {
	void RecibirDanio(int i, int tipo_danio) {
		if(tipo_danio==1) {
			System.out.println("no me diste, soy m�gico!!!");
		}else {
			super.RecibirDanio(i);
		}
		
	}

}
