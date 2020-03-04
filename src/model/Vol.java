package model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
public class Vol {
@Id
@GeneratedValue
	private int id;
@Temporal(TemporalType.DATE)
	private Date date;
	@JoinColumn(name = "idPilote")
	@ManyToOne
	private Pilote pilote;
	
	
	public Vol( Date date, Pilote pilote) {
		super();
		this.date = date;
		this.pilote=pilote;
	}
	public Vol() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Pilote getPilote() {
		return pilote;
	}
	public void setPilote(Pilote pilote) {
		this.pilote = pilote;
	}



	}


