/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Entidades.Paciente;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class PacienteDAO extends GenericDAO{
    
    
    public List<Paciente> getAllPaciente() throws SQLException 
    {
        List<Paciente> paciente = new LinkedList<>();
        
        try (ResultSet rs = executeQuery("SELECT * FROM paciente ")) {
            while(rs.next())
            {
                
            }
        }
        return paciente;
    }
    
   public List<Paciente> getAllPacientePorNome(Paciente nome) throws SQLException {
    List<Paciente> pacientes = new LinkedList<>();

    try (ResultSet rs = executeQuery("SELECT * FROM paciente WHERE nome LIKE ?", nome.getNome() + "%")) {
        while (rs.next()) {
            Paciente pac = new Paciente();
            pac.setId(rs.getInt("id"));
            pac.setNome(rs.getString("nome"));
            pac.setEndereco(rs.getString("endereco"));
            pac.setCpf(rs.getString("cpf"));
            pac.setRg(rs.getString("rg"));
            pac.setSexo(rs.getString("sexo"));
            pac.setConvenio(rs.getString("convenio"));
            pac.setTelefone(rs.getString("telefone"));

            pacientes.add(pac); // ← ESSENCIAL
        }
    }

    return pacientes;

    }
    
    public List<Paciente> getAllPacientesPorCpf(Paciente cpf) throws SQLException 
    {
        List<Paciente> paciente = new LinkedList<>();
        
        try ( //ResultSet rs = executeQuery("SELECT * FROM medicos WHERE nome_medico like ?", "%"+nome);
                ResultSet rs = executeQuery("SELECT * FROM paciente WHERE cpf like ?",cpf.getCpf()+"%")) {
            while(rs.next())
            {
            Paciente pac2 = new Paciente();
            pac2.setId(rs.getInt("id"));
            pac2.setNome(rs.getString("nome"));
            pac2.setEndereco(rs.getString("endereco"));
            pac2.setCpf(rs.getString("cpf"));
            pac2.setRg(rs.getString("rg"));
            pac2.setSexo(rs.getString("sexo"));
            pac2.setConvenio(rs.getString("convenio"));
            pac2.setTelefone(rs.getString("telefone"));

            paciente.add(pac2); 
        }
    }    
            
        
        return paciente;
    }
    
    public Integer addPaciente(Paciente paciente) throws SQLException
    {
        String query = "INSERT INTO paciente(nome, telefone, cpf, rg, endereco, sexo, convenio) VALUES (?,?,?,?,?,?,?)";
        executeComand(query,  paciente.getNome(), paciente.getTelefone(), paciente.getCpf(), paciente.getRg(), paciente.getEndereco(), paciente.getSexo(), paciente.getConvenio());        
        return paciente.getId();
        
    }
    
    public void editarPaciente(Paciente paciente) throws SQLException
    {
        String query = "UPDATE paciente SET nome = ?, telefone = ?, cpf = ?, rg = ?, endereco = ?, sexo = ?, convenio = ? WHERE id =?";
        executeComand(query,  paciente.getNome(), paciente.getTelefone(), paciente.getCpf(), paciente.getRg(), paciente.getEndereco(), paciente.getSexo(), paciente.getConvenio(), paciente.getId());        
        
    }
    
    public void excluirPaciente(Paciente paciente) throws SQLException{
        String query = "DELETE FROM paciente WHERE nome = ? OR cpf = ? ";
        executeComand(query, paciente.getNome(), paciente.getCpf());
        
        
    }
    
        
    }
    

        

