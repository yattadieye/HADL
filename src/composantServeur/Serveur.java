package composantServeur;

import configuration.composant.*;

public class Serveur extends Composant{
	

	
	public Serveur(){
		PFServeur pfserveur = new PFServeur();
		PRServeur prserveur = new PRServeur();
		
		this.ports.add(pfserveur);
		this.ports.add(prserveur);
		
	}
	
	
}
