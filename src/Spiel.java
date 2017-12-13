import javakarol.*;

public class Spiel {
	
	Welt w;
	Polizist p;
	Schmuggler s;
	
	public Spiel()
	{
		
		w = new Welt("src/Grenzwelt.kdw");
		p = new Polizist(1,w);
		s = new Schmuggler(1,w);
		
		Thread polizei = new Thread(p);
		Thread schmuggler = new Thread(s);
		polizei.start();
		schmuggler.start();
		
	}

	public static void main(String[] args) {
		
		new Spiel();

	}

}
