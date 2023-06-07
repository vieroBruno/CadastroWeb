<%-- 
    Document   : login
    Created on : 15 de mai. de 2023, 13:57:45
    Author     : Bruno Viero
--%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>TelaLogin</title>
    </head>
    <body>
        <nav>
            <ul class="container">
                <li><a href="">Home</a></li>
                <li><a href="">Soobre Nós</a></li>
                <li><a href="login.jsp">Login</a></li>
            </ul>
        </nav>
        
        <form name="inserirLogin" id="inserir" method="post" action="controladoraLogin">
            <label>Login:</label>
            <input name="login" id="idLogin" type="text"></input><br><br>
            <label>Senha:</label>
            <input name="senha" id="idSenha" type="password"></input><br><br>
            
            <input type="submit" name="botaoAcao" value="Logar" onclick="validar()"></input>
            <input type="submit" name="botaoAcao" value="Cadastrar-se" ></input>
        </form>
        <script>
            funcion validar(){
                var login=document.getElementById('idLogin');
                var senha=document.getElementById('idSenha');
                if(login.value==""){
                    alert("Login em branco!")
                    event.preventDefault();
                } if(senha.value==""){
                    alert("Senha em branco!");
                    event.preventDefault();
                     }
                
            }
        </script>
    </body>
</html>
