/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Jonas Pereira
 */
public class Medicos {
    private Integer id;
    private int crm;
    private String nome_medico;
    private String rg;
    private String cpf;
    private String telefone;
    private String sexo;
    private String endereco;
    private String senha_de_acesso;
    
    public Medicos() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }

    public String getNome_medico() {
        return nome_medico;
    }

    public void setNome_medico(String nome_medico) {
        this.nome_medico = nome_medico;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
        @Override
    public String toString() {
        return nome_medico;
    }

    /**
     * @return the senha_de_acesso
     */
    public String getSenha_de_acesso() {
        return senha_de_acesso;
    }

    /**
     * @param senha_de_acesso the senha_de_acesso to set
     */
    public void setSenha_de_acesso(String senha_de_acesso) {
        this.senha_de_acesso = senha_de_acesso;
    }
<<<<<<< HEAD

    

}
=======
    
}
>>>>>>> parent of fad44b5 (cadastromedicoos)
