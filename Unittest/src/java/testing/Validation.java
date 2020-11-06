package testing;

public class Validation {
public boolean validerNom(String nom)
{
return 	nom.contains(" ");

}
public boolean validerClasse(String classe)
{
return 	classe.length()==4;
}

public void isNumeric(String note)
{
	Double.parseDouble(note);
	

}
public boolean validerNote(double note)
{
return 	note>0;

}
public boolean validerLogin(String login)
{
	return login.equals("admin");
}


public boolean validerPassword(String mdp)
{
return mdp.contains("orsys");	

}
}
