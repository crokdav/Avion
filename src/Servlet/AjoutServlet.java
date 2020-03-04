package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.IPiloteDAO;
import DAO.PiloteDAO;


import model.Pilote;


/**
 * Servlet implementation class AjoutServlet
 */
@WebServlet("/ajoutpilote")
public class AjoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjoutServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/vues/pilotes.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Pilote pil= new Pilote();
		pil.setNom(request.getParameter("name"));
		pil.setPrenom(request.getParameter("prenom"));
		pil.setTel(request.getParameter("tele"));
		IPiloteDAO dao = new PiloteDAO();
		
		dao.creatPilote(pil);
		
		this.getServletContext().getRequestDispatcher("/listepilote").forward(request, response);
	}

}
