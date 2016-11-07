package connecteursRPC;

import configuration.connecteur.*;

public class ConnecteurRPC extends Connecteur{
	

	public ConnecteurRPC(){
		
		ToClientRPC toClientRPC = new ToClientRPC();
		FromClientRPC fromClientRPC = new FromClientRPC();
		ToServeurRPC toServeurRPC = new ToServeurRPC();
		FromServeurRPC fromServeurRPC = new FromServeurRPC();
		
		GlueServeurRPC glueServeur = new GlueServeurRPC();
		GlueClientRPC glueClient = new GlueClientRPC();
		
		this.roles.add(fromClientRPC);
		this.roles.add(toClientRPC);
		
		this.roles.add(fromServeurRPC);
		this.roles.add(toServeurRPC);
		
		glueServeur.setFrom(fromServeurRPC);
		glueServeur.setTo(toServeurRPC);
		glueClient.setFrom(fromClientRPC);
		glueClient.setTo(toClientRPC);
		
		this.glues.add(glueServeur);
		this.glues.add(glueClient);
	}

}
