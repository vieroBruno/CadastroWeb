<%-- 
    Document   : cadastroLogin
    Created on : 15 de mai. de 2023, 15:13:29
    Author     : Bruno Viero
--%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CadastroLogin</title>
    </head>
    <body>
        <nav>
            <ul class="container">
                <li><a href="">Home</a></li>
                <li><a href="">Sobre Nós</a></li>
                <li><a href="login.jsp">Login</a></li>
            </ul>
        </nav>
        <form name="inserirUsuario" id="inserir" method="post" action="controladoraCadastroLogin">
            <label>Nome:</label>
            <input name="nome" id="idName" type="text"></input><br><br>
            <label>Email:</label>
            <input name="email" id="idEmail" type="email"></input><br><br>
            <label>Login:</label>
            <input name="login" id="idLogin" type="text"></input><br><br>
            <label>Senha:</label>
            <input name="senha" id="idSenha" type="password"></input><br><br>
            
            
            <input type="submit" name="botaoAcao" value="Enviar" onclick="validar()"></input>
        </form>
        <script>
             funcion validar(){
                var login=document.getElementById('idLogin');
                var senha=document.getElementById('idSenha');
                var nome=document.getElementById('idNome');
                var email=document.getElementById('idEmail');
                if(login.value==""){
                    alert("Login em branco!")
                    event.preventDefault();
                }
                if(senha.value==""){
                    alert("Senha em branco!");
                    event.preventDefault();
                }
                if(email.value==""){
                    alert("Email em branco!");
                    event.preventDefault();
                }
                if(nome.value==""){
                    alert("Nome em branco!");
                    event.preventDefault();
                }
                
            }
        </script>
    </body>
</html>
