/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Bean.UsuarioBean;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ANDRES
 */
public class AddUserRoleDAO extends Conexiones.ConexionBD {
    UsuarioBean bean=new UsuarioBean();
    String consultaSQL = null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    CallableStatement clst=null;
    String usersave=bean.getUsusave();
    String passwordsave=bean.getPasssave();
    Connection cn= getConexion(usersave, passwordsave);
    public boolean AddUser(String user,String password, String table,String temp, String quota){
        try{
            consultaSQL="CREATE USER "+user+" IDENTIFIED BY "+password
                    + " DEFAULT TABLESPACE "+table
                    + " TEMPORARY TABLESPACE "+temp
                    + " QUOTA "+quota+" ON "+table;
            System.out.println("Consulta : "+consultaSQL);
            clst=cn.prepareCall(consultaSQL);
            clst.execute(consultaSQL);
            clst.close();
            getConexion(usersave, passwordsave).close();
            return true;
        }catch(SQLException ex){
            System.out.println("Ocurrió un error en AddUser : "+ex);
            return false;
        }finally{
            
        }
    }
    public boolean AddRole(String role){
        try{
            consultaSQL="CREATE ROLE "+role;
            System.out.println("Consulta : "+consultaSQL);
            clst=cn.prepareCall(consultaSQL);
            clst.execute();
            clst.close();
            getConexion(usersave, passwordsave);
            return true;
        }catch(SQLException ex){
            System.out.println("Ocurrió un error en AddRole : "+ex);
            return false;
        }
    }
    public boolean AddPrivilegeToRole(String role, String privilege){
        try{
            consultaSQL="GRANT "+privilege+" TO "+role;
            System.out.println("Consulta : "+consultaSQL);
            clst=cn.prepareCall(consultaSQL);
            clst.execute();
            clst.close();
            getConexion(usersave, passwordsave).close();
            return true;
        }catch(SQLException ex){
            System.out.println("Ocurrió un error en AddPrivilegeToRole : "+ex);
            return false;    
        }
        
    }
}
