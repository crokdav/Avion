package Servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.IPiloteDAO;
import DAO.IVolDAO;
import DAO.PiloteDAO;
import DAO.VolDAO;
import model.Pilote;
import model.Vol;

/**
 * Servlet implementation class AjoutVolServlet
 */
@WebServlet("/ajoutvol")
public class AjoutVolServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjoutVolServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Pilote> liste = new ArrayList<Pilote>();
		IPiloteDAO dao = new PiloteDAO();
		liste=dao.getPilotes();
		
		request.setAttribute("listep",liste);
		this.getServletContext().getRequestDispatcher("/WEB-INF/vues/vol.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Vol vol= new Vol();
		Date date=null;
		try {
			date = new SimpleDateFormat("yyyy-MM-DD").parse(request.getParameter("date"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		vol.setDate(date);
		Pilote p=new Pilote();
		p.setIdPilote(Integer.parseInt(request.getParameter("idPilote")));
		vol.setPilote(p);
		IVolDAO daov= new VolDAO();
		daov.creatVol(vol);
		this.getServletContext().getRequestDispatcher("/WEB-INF/vues/").forward(request, response);
		
	}

}
