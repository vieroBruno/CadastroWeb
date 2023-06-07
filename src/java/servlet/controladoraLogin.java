/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlet;

import dao.daoLogin;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Bruno Viero
 */
@WebServlet(name = "controladoraLogin", urlPatterns = {"/controladoraLogin"})
public class controladoraLogin extends HttpServlet {

   
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        daoLogin dL = new daoLogin();
        String acao=request.getParameter("botaoAcao");
        
        String login = request.getParameter("login");
        String senha = request.getParameter("senha");
        
        if(acao.equals("Logar")){
            int i = dL.validar(login,senha);
            if ( i > 0) {
               
                RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
                rd.forward(request, response);
            }else{
                RequestDispatcher rd = request.getRequestDispatcher("erro.jsp");
                rd.forward(request, response);
            }
        
        
        }
        if (acao.equals("Cadastrar-se")) {

            RequestDispatcher rd = request.getRequestDispatcher("cadastroLogin.jsp");
            rd.forward(request, response);
        }
    }

   

}
