/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Jonas Pereira
 */
public class Consultas {
    private int id_consulta;
    private String nome_paciente;
    private String nome_medico;
    private String data;
    private String hora;

    /**
     * @return the id_consulta
     */
    public int getId_consulta() {
        return id_consulta;
    }

    /**
     * @param id_consulta the id_consulta to set
     */
    public void setId_consulta(int id_consulta) {
        this.id_consulta = id_consulta;
    }

    /**
     * @return the nome_paciente
     */
    public String getNome_paciente() {
        return nome_paciente;
    }

    /**
     * @param nome_paciente the nome_paciente to set
     */
    public void setNome_paciente(String nome_paciente) {
        this.nome_paciente = nome_paciente;
    }

    /**
     * @return the nome_medico
     */
    public String getNome_medico() {
        return nome_medico;
    }

    /**
     * @param nome_medico the nome_medico to set
     */
    public void setNome_medico(String nome_medico) {
        this.nome_medico = nome_medico;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * @return the hora
     */
    public String getHora() {
        return hora;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(String hora) {
        this.hora = hora;
    }

}