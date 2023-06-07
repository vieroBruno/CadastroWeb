/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entidade.login;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Bruno Viero
 */
public class daoLogin extends conexao{
    public boolean cadastroLogin(login l){
        con();
        boolean rodou=false;
        String query="insert into usuario(nome,email,login,senha)values"
                + "('" + l.getNome() + "','" + l.getEmail() + "',"
                + "'" + l.getLogin() + "',md5('" + l.getSenha() + "'))";
        System.err.println(query);
        
        
        try {
            sta.execute(query);
            rodou=true;
        } catch (SQLException ex) {
            Logger.getLogger(daoLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        desconectar();
        return rodou;
    }
    public int validar(String login,String senha){
        int idLogin=0;
        con();
        String query="select id from usuario where "
                + " login = '" + login + "'"
                + " and senha=md5('" + senha + "')";
                
        try {
            rst=sta.executeQuery(query);
            while(rst.next()){
            idLogin= rst.getInt("id");
            }
        } catch (SQLException ex) {
            Logger.getLogger(daoLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        desconectar();
        
        return idLogin;
    }
    
    
}
