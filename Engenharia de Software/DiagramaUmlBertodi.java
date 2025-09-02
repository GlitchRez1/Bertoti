package Project;

public class DiagramaUmlBertodi {
	public static void main(String[]args) {
		Player player = new Player();
		player.correr();
		player.atacar();
		Arma espada = new Arma();
		espada.infligirDano(player);	
	
		}

	
}
