package Project;

public class Arma {
	
	int dano = 15;
	
	public void infligirDano(Player alvo) {
		System.out.println("A arma deu "+ dano +" de dano");
		alvo.receberDano(dano);
	}

	
}
