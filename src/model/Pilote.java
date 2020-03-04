package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Pilote {
@Id
@GeneratedValue
private int idPilote;
private String nom;
private String prenom;
private String tel;


public Pilote( String nom, String prenom, String tel) {
	super();
	this.nom = nom;
	this.prenom = prenom;
	this.tel = tel;
}
public Pilote() {
	super();
	// TODO Auto-generated constructor stub
}
public int getIdPilote() {
	return idPilote;
}
public void setIdPilote(int idPilote) {
	this.idPilote = idPilote;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public String getTel() {
	return tel;
}
public void setTel(String tel) {
	this.tel = tel;
}
	



}
