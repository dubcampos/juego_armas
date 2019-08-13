package juego;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fantasma f = new Fantasma();
		Coco c = new Coco();
		Jugador j = new Jugador("Duber");
		
		
		j.Disparar(c);
		j.Disparar(c);
		j.Disparar(c);
		
		j.AdquirirArma(new ArmaProtones());
		
		j.Disparar(f);
		j.Disparar(f);
		j.Disparar(f);
	}

}
