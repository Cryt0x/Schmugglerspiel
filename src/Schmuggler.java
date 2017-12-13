import javakarol.Roboter;
import javakarol.Welt;

public class Schmuggler extends Roboter implements Runnable {
	
	int zaehler;
	
	public Schmuggler(int nr, Welt w) {
		
		super(2 * nr, 1, 'S', w);
		this.VerzoegerungSetzen(30);
		
	}

	@Override
	public void run() {
		
		while(true) {
			
			int wuerfel = (int) (Math.random() * 6);
			switch (wuerfel) {
			
			case 1: this.LinksDrehen();
				break;
				
			case 2: this.RechtsDrehen();
				break;
				
			default: if(!this.IstWand()) {
				
				this.Schritt();
				
			} else {
				
				this.LinksDrehen();
				this.LinksDrehen();
				
			}
				break;
			
			}
			
		}
		
	}

}
