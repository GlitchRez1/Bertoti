package uml;

public class Arma {

	int dano = 15;
	String tipoDeArma = "Arma de fogo";
	int tamanhoDoPente = 6;
	
	public void atirar(Player alvo) {
		System.out.println("Atirando com " + tipoDeArma);
        alvo.levarDano(dano);
	}
}
