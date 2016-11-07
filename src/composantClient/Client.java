package composantClient;

import configuration.composant.*;

public class Client extends Composant{
	
	public Client(){
		PFClient pfclient = new PFClient();
		PRClient prclient = new PRClient();
		
		this.ports.add(pfclient);
		this.ports.add(prclient);
	}

}
