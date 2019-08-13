package juego;

public class Enemigo {
	public int puntosdevida = 3;
	public boolean esta_muerto = false;
	
	void RecibirDanio(int i) {
		if(!esta_muerto) {
			puntosdevida -= i;
			if(puntosdevida<=0) {
				Morir();
			}else {
				System.out.println("Me diste: "+puntosdevida);
			}
			
		}else {
			System.out.println("YA ESTOY MUERTO");
		}
	}
	
	void RecibirDanio(int i, int tipo_danio) {
		RecibirDanio(i);
	}
	
	void Morir() {
		puntosdevida = 0;
		System.out.println("Ay me muero");
		esta_muerto = true;
	}
	                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
}
