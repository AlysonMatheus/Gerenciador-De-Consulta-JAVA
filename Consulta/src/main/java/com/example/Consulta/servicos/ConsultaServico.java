package com.example.Consulta.servicos;


import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

import com.example.Consulta.Model.Consulta;

public class ConsultaServico {

    // Supondo que você tenha um repositório ou uma fonte de dados para consultar
    private static List<Consulta> consultas = new ArrayList<>();

    // Método para buscar uma consulta por ID
    public static Consulta buscarConsultaPorId(Long id) {
        // Busca a consulta pelo ID (comparando com o ID da consulta e não com o CPF)
        Optional<Consulta> consulta = consultas.stream()
                .filter(c -> c.getId() == id)  // Usando == para comparação de tipos primitivos
                .findFirst();
        return consulta.orElse(null);  // Retorna a consulta ou null se não encontrada
    }


    // Método para remover uma consulta
    public static void removerConsulta(Long id) {
        
        consultas.removeIf(c -> c.getId() == id);  // Usando == para comparação de tipos primitivos
    }


   
    public static List<Consulta> buscarTodasConsultas() {
        return consultas;  // Retorna todas as consultas (deve retornar do banco, por exemplo)
    }

   
    public static void adicionarConsulta(Consulta consulta) {
        consultas.add(consulta);  // Adiciona uma nova consulta à lista (simula um insert no banco)
    }
}
