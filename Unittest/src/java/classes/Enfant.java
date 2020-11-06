package classes;

public class Enfant {
private int id;
private String nom_complet, classe;
private double notePrecedente;
public Enfant(int id, String nom_complet, String classe, double notePrecedente) {
	super();
	this.id = id;
	this.nom_complet = nom_complet;
	this.classe = classe;
	this.notePrecedente = notePrecedente;
}
public Enfant() {
	super();
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNom_complet() {
	return nom_complet;
}
public void setNom_complet(String nom_complet) {
	this.nom_complet = nom_complet;
}
public String getClasse() {
	return classe;
}
public void setClasse(String classe) {
	this.classe = classe;
}
public double getNotePrecedente() {
	return notePrecedente;
}
public void setNotePrecedente(double notePrecedente) {
	this.notePrecedente = notePrecedente;
}




}
