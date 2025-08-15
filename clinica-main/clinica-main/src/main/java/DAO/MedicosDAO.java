
package DAO;
 
import Entidades.Medicos;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

public class MedicosDAO  extends GenericDAO
{
 
    
 
 public Integer Loginmed(Medicos Medicos) throws SQLException {
         
        String query = "SELECT * FROM medicos WHERE nome_medico = ? AND senha_de_acesso = ?";
    ResultSet rs = executeQuery(query, Medicos.getNome_medico(), Medicos.getSenha_de_acesso());

    if (rs.next()) {
        return rs.getInt("id"); // pega o ID do banco
    } else {
        return null;
    }

    
    }
 
 
    
    
    public void getMedicos (int crm) throws SQLException
    {
        
        
        String query = "SELECT * FROM medicos where crm = ?";
        executeQuery(query, crm);
        //rs =  executeQuery("select * from medicos where crm like ?",medicos.getCrm()+"%");
    }
    
    public List<Medicos> getAllMedicos() throws SQLException 
    {
        List<Medicos> medicos = new LinkedList<>();
        
        ResultSet rs;
        rs = executeQuery("SELECT * FROM medicos ");
                
                while(rs.next())
                {
                medicos.add(populateMedico(rs));
                }
                rs.close();
        return medicos;
    }
    
    public List<Medicos> getAllMedicosPorNome(String nome) throws SQLException 
    {
        List<Medicos> medicos = new LinkedList<>();
        
        try ( //ResultSet rs = executeQuery("SELECT * FROM medicos WHERE nome_medico like ?", "%"+nome);
                ResultSet rs = executeQuery("SELECT * FROM medicos WHERE nome_medico like ?",nome+"%")) {
            while(rs.next())
            {
                medicos.add(populateMedico(rs));
            }
        }
        return medicos;
    }
    
    public List<Medicos> getAllMedicosPorCrm(String crm) throws SQLException 
    {
        List<Medicos> medicos = new LinkedList<>();
        
        try ( //ResultSet rs = executeQuery("SELECT * FROM medicos WHERE nome_medico like ?", "%"+nome);
                ResultSet rs = executeQuery("SELECT * FROM medicos WHERE crm like ?",crm+"%")) {
            while(rs.next())
            {
                medicos.add(populateMedico(rs));
            }
        }
        return medicos;
    }
    
    public Integer addMedicos(Medicos medicos ) throws SQLException
    {
        String query = "INSERT INTO medicos(crm, nome_medico, sexo,  rg, telefone,cpf, senha_de_acesso) VALUES (?,?,?,?,?,?,?)";
        executeComand(query, medicos.getCrm(), medicos.getNome_medico(),medicos.getSexo(), medicos.getRg(), medicos.getTelefone(),  medicos.getCpf(), medicos.getSenha_de_acesso());
        return medicos.getId();
        
    }
    
    public void updateMedicos(Medicos medicos) throws SQLException
    {
        String query = "UPDATE medicos SET crm = ?, nome_medico = ?, cpf = ?, rg = ?, telefone = ?, sexo = ?, endereco = ?, senha_de_acesso = ? WHERE id =?";
        executeComand(query, medicos.getCrm(), medicos.getNome_medico(), medicos.getCpf(), medicos.getRg(), medicos.getTelefone(), medicos.getSexo(),medicos.getSenha_de_acesso(),medicos.getEndereco(), medicos.getId());        
        
    }
    
    public void deleteMedicos(Medicos medicos) throws SQLException
    {
       
        String query = "DELETE FROM medicos WHERE crm = ? ";
        executeComand(query, medicos.getCrm());
    
    }

    private Medicos populateMedico(ResultSet rs) throws SQLException {
        Medicos retorno = new Medicos();
        
        retorno.setId(Integer.valueOf(rs.getString("id")));
        retorno.setNome_medico(rs.getString("nome_medico"));
        retorno.setCrm(rs.getString("crm"));
        retorno.setRg(rs.getString("rg"));
        retorno.setCpf(rs.getString("cpf"));
        retorno.setTelefone(rs.getString("telefone"));
        retorno.setSexo(rs.getString("sexo"));
        
        
        return retorno;
        
    }

    public List<Medicos> getAllMedicosPorCrm(Medicos medico) {
    List<Medicos> medicos = new LinkedList<>();
    
    try (ResultSet rs = executeQuery(
            "SELECT * FROM medicos WHERE crm LIKE ?",
            medico.getCrm() + "%")) {
        
        while (rs.next()) {
            medicos.add(populateMedico(rs)); // seu método que transforma ResultSet em Medicos
        }
        
    } catch (SQLException e) {
        e.printStackTrace();
    }
    
    return medicos;
}

    

    
}
