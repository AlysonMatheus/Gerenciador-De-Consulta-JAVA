package com.example.Consulta.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Consulta.Model.Consulta;


public class RelatorioController {
    public String showForm(Model model) {
        model.addAttribute("paciente", new Consulta());  // Cria um novo objeto paciente
        return "cadastroPaciente";  // Retorna a página Thymeleaf
    }

    @PostMapping("/relatorios")
    public String relatorios(@ModelAttribute Consulta consulta) {
       
        return "relatorios/consulta";  
}
}
