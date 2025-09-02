package uml;

public class Player {

	String nome = "Sarinha";
	int vida = 100;
	
		public void correr() {
			System.out.println(nome+" está correndo");
		}
		public void atacar() {
			System.out.println(nome+ " ataca");
		}
		public void levarDano(int dano) {
			vida -= dano;
			if (vida < 0) {
				vida = 0;
			}
			System.out.println(nome + " levou " + dano + " de dano. Vida atual: " + vida);
		}
}
