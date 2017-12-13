import javakarol.Roboter;
import javakarol.Welt;

public class Polizist extends Roboter implements Runnable {
	
	boolean verfolgeSchmuggler = false;

	public Polizist(int nr,Welt w) {	
		
		super(nr, 8, 'O', w);
		
	}

	@Override
	public void run() {
		
		while(true) {
			
			if(!this.IstWand()) {
				
				if(verfolgeSchmuggler == true || this.IstRoboterInSicht()) {
					
					this.verfolgeSchmuggler = true;
					this.VerzoegerungSetzen(30);
					this.MeldungAusgeben("Bin auf Schmugglerjagd!");
					for(int i = 0; i < 4; i++) {
						
						if(this.IstRoboterInSicht())
						{break;}
						else
						{this.LinksDrehen();}
						
					}
					
				}
				
				Schritt();
				
			} else {
				
				this.LinksDrehen();
				this.LinksDrehen();
				
			}
			
		}
		
	}
	
}