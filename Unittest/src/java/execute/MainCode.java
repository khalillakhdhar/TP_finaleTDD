package execute;

import classes.Admin;
import classes.Enfant;
import testing.Validation;

public class MainCode {
static Admin ad=new Admin("admin","formation orsys");
static Validation v=new Validation();
static Enfant en=new Enfant(1, "Testeteste", "p06", -1);
public static void main( String args[])
{
	String note="12a";
	
	if(veriflogin())
	{	System.out.println("bienvenu");
	try
	{
		v.isNumeric(note);
	}
	catch (Exception e) {
		// TODO: handle exception
		System.out.println("la note doit etre numerique!");
		
	}
	if(verif_enfant())
	{
		System.out.println("bien ajoute!");
	}
	else 
	{
		System.out.println("erreur d'ajout!");
	}
	}
	
	else
		System.out.print("non autorise!");
	

}
	public static boolean veriflogin()
	{
		if(v.validerLogin(ad.getLogin())&&(v.validerPassword(ad.getMdp())))
		
		{
			return true;
		}
		else 
			return false;
	}
	public static boolean verif_enfant()
	{
		boolean condition=true;
		if(!v.validerNom(en.getNom_complet()))
		{
			condition=false;
			System.out.println("le nom complet doit contenir au moins un espace");
			
		}
		if(!v.validerClasse(en.getClasse()))
		{
			condition=false;
			System.out.println("la classe doit etre de 4 caracteres");
			
		}
		if(!v.validerNote(en.getNotePrecedente()))
		{
			
			condition=false;
			System.out.println("la note doit etre superieur a 0!");
		}
		
		return condition;
	}
	
	
	}
	
	

