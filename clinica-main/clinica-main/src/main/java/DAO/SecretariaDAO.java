/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;


import Entidades.Secretaria;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author davio
 */
public class SecretariaDAO extends GenericDAO {
    
   
    public Integer LoginSecretaria(Secretaria Secretaria) throws SQLException
            
    {   
        String query = "SELECT * FROM secretaria WHERE nome_secretaria = ? and senha = ? ";
         ResultSet rs = executeQuery(query,  Secretaria.getNome_secretaria(), Secretaria.getSenha());
         
          if(rs.next()){
            return Secretaria.getId();
                    
          }else{
        return null;
    }   
    }
     public Integer addSecretaria(Secretaria Secretaria) throws SQLException
    {
        String query = "INSERT INTO secretaria(nome_secretaria, cpf, endereco, sexo, senha) VALUES (?,?,?,?,?)";
        executeComand(query,  Secretaria.getNome_secretaria(), Secretaria.getCpf(), Secretaria.getEndereco(), Secretaria.getSexo(), Secretaria.getSenha());        
        return Secretaria.getId();
        
    
}
   
     
     
}
