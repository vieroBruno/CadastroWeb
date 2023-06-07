/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlet;

import dao.daoLogin;
import entidade.login;
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
@WebServlet(name = "controladoraCadastroLogin", urlPatterns = {"/controladoraCadastroLogin"})
public class controladoraCadastroLogin extends HttpServlet {

   
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        daoLogin dL = new daoLogin();
        login lo = new login();
        
        String acao=request.getParameter("botaoAcao");
        
        lo.setNome(request.getParameter("nome"));
        lo.setEmail(request.getParameter("email"));
        lo.setLogin(request.getParameter("login"));
        lo.setSenha(request.getParameter("senha"));
        
        if(acao.equals("Enviar")){
            if(dL.cadastroLogin(lo)){
                RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
                rd.forward(request, response);
            }else{
                RequestDispatcher rd = request.getRequestDispatcher("erro.jsp");
                rd.forward(request, response);
            }
            
        }
       
    }

  

}
