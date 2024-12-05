package com.example.Consulta.Model;

import java.time.LocalDate;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "consulta")
public class Consulta extends Paciente {
    
    @Column(name = "id", nullable = false)
    private long id;

    @ManyToOne
    @JoinColumn(name = "medico_id", nullable = false)
    private Medico medico;

    @Column(name = "data_consulta", nullable = false)
    private LocalDate dataConsulta;

    @Column(name = "hora_consulta", nullable = false, length = 5)
    private String horaConsulta;

    @Column(name = "descricao", length = 255)
    private String descricao;

    // Construtor padrão
    public Consulta() {}

    // Construtor com todos os atributos
    public Consulta(LocalDate dataConsulta, String descricao, String horaConsulta, Medico medico, 
                    String cpf, LocalDate data, LocalDate dataNascimento, String nome, String telefone) {
        super(cpf, data, dataNascimento, nome, telefone); // Chama o construtor da classe Paciente
        this.dataConsulta = dataConsulta;
        this.descricao = descricao;
        this.horaConsulta = horaConsulta;
        this.medico = medico;
    }

    // Getters e Setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public LocalDate getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(LocalDate dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public String getHoraConsulta() {
        return horaConsulta;
    }

    public void setHoraConsulta(String horaConsulta) {
        this.horaConsulta = horaConsulta;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
