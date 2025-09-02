package Project;

public class Player {
	
	String nome = "Sarinha";
	int vida = 100;
	
	public void correr() {
		System.out.println(nome +" está correndo");
	}
	public void atacar() {
		System.out.println(nome +" um ataque");
	}
	
	public void receberDano(int dano) {
		vida-=dano;
		System.out.println("Essa é sua vida = "+ vida );
	}
	
}
