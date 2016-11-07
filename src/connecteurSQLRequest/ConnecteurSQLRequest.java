package connecteurSQLRequest;

import ComposantDatabase.GlueCM;
import ComposantDatabase.GlueDatabase;
import configuration.connecteur.Connecteur;
import connecteursRPC.GlueClientRPC;
import connecteursRPC.GlueServeurRPC;

public class ConnecteurSQLRequest extends Connecteur {
	
	ToDatabaseSQLRequest toDatabase = new ToDatabaseSQLRequest();
	FromDatabaseSQLRequest fromDatabase = new FromDatabaseSQLRequest();
	ToCMSQLRequest toConnectionManager = new ToCMSQLRequest();
	FromCMSQLRequest fromConnectionManager = new FromCMSQLRequest();
	
	GlueCM glueCM = new GlueCM();
	GlueDatabase glueDatabase = new GlueDatabase();

}

