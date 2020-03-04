package DAO;

import java.util.List;

import model.Pilote;

public interface IPiloteDAO {
	public int creatPilote(Pilote pil);
	public List<Pilote> getPilotes();
}
