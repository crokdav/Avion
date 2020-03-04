package DAO;

import java.util.List;


import model.Vol;

public interface IVolDAO {
	public int creatVol(Vol vo);
	public List<Vol> getVols();
}
