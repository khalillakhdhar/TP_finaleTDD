package classes;

public class Admin {
private String login,mdp;

public Admin(String login, String mdp) {
	super();
	this.login = login;
	this.mdp = mdp;
}

public String getLogin() {
	return login;
}

public void setLogin(String login) {
	this.login = login;
}

public String getMdp() {
	return mdp;
}

public void setMdp(String mdp) {
	this.mdp = mdp;
}

public Admin() {
	super();
}

}
