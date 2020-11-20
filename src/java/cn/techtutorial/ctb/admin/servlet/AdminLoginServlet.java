
package cn.techtutorial.ctb.admin.servlet;

import cn.techtutorial.ctb.admin.dao.AdminDao;
import cn.techtutorial.ctb.admin.model.Admin;
import cn.techtutorila.ctb.connection.ConnectionDB;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class AdminLoginServlet extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            
            AdminDao ado = new AdminDao(ConnectionDB.getCon());
            Admin admin = ado.logAdmin(email, password);
            if(admin!=null){
                HttpSession session = request.getSession();
                session.setAttribute("loggedAdmin", admin); 
                response.sendRedirect("adminpanel.jsp");
            }else{
                out.println("unknown credential");
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

}
