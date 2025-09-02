package uml;

public class Jogo {

	public static void main(String[]args) {
		Player player1 = new Player();
		player1.correr();
		Arma pistola = new Arma();
		pistola.atirar(player1);
		pistola.atirar(player1);
	}
	
}
