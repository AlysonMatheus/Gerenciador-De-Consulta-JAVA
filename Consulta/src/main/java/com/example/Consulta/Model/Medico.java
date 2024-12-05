package com.example.Consulta.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "medico")
public class Medico {

    @Id
    @Column(name = "crm", nullable = false, unique = true)
    private int crm;  // Chave primária (CRM)

    @Column(name = "nome", nullable = false, length = 100)
    private String nome;

    @Column(name = "especialidade", nullable = false, length = 50)
    private String especialidade;

    @Column(name = "email", nullable = false, unique = true, length = 100)
    private String email;

    @Column(name = "telefone", length = 15)
    private String telefone;

    // Construtor padrão (obrigatório para JPA)
    public Medico() {
    }

    // Construtor com parâmetros
    public Medico(int crm, String email, String especialidade, String nome, String telefone) {
        this.crm = crm;
        this.email = email;
        this.especialidade = especialidade;
        this.nome = nome;
        this.telefone = telefone;
    }

    // Getters e setters
    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void addAttribute(String string, Medico medico) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addAttribute'");
    }
}
