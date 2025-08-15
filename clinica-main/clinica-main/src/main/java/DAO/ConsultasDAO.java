/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

    import Entidades.Consultas;
    import java.sql.ResultSet;
    import java.sql.SQLException;
    import java.util.LinkedList;
    import java.util.List;
    
    
    public class ConsultasDAO extends GenericDAO {
        
        
        public List<Consultas> getAllConsultas(Consultas crm) throws SQLException 
        {
            List<Consultas> consultas = new LinkedList<>();
            
            try (ResultSet rs = executeQuery("SELECT * FROM consultas ")) {
                while(rs.next())
                {
                    consultas.add(BUSCARConsultas(rs));
                }
            }
            return consultas;
        }
        
            private Consultas BUSCARConsultas(ResultSet rs) throws SQLException {
            Consultas retorno = new Consultas();
            
           
            
            retorno.setNome_paciente(rs.getString("nome_paciente"));
            retorno.setNome_medico(rs.getString("nome_medico"));
            retorno.setData(rs.getString("data"));
            retorno.setHora(rs.getString("hora"));
           
            
            
            return retorno;
            
        }
        
        
        public Integer addConsultas(Consultas consultas) throws SQLException
        {
            String query = "INSERT INTO consultas(nome_medico, nome_paciente, data, hora) VALUES (?,?,?,?)";
            executeComand(query, consultas.getNome_medico(), consultas.getNome_paciente(), consultas.getData(), consultas.getHora());        
            return consultas.getId_consulta();
            
        }
        
        public void updateConsultas(Consultas consultas) throws SQLException
        {
            String query = "UPDATE consultas SET desc WHERE id =?";
           // executeComand(query, consultas.getIdDoctor(), consultas.getIdPaciente(), consultas.getData(), consultas.getHora(), consultas.getIdConsulta());         
            
        }
        
        public void deleteConsultas(Consultas consultas) throws SQLException
        {
            String query = "DELETE FROM consultas WHERE id = ? ";
            //executeComand(query, consultas.getIdConsulta());
        
        }
        
        
    }

