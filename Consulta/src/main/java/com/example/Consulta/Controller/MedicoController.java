package com.example.Consulta.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Consulta.Model.Medico;
;

public class MedicoController {
     @GetMapping("/cadastromedico")
    public String showForm(Medico model) {
        model.addAttribute("paciente", new Medico());  // Cria um novo objeto medico
        return "cadastrarmedico";  // Retorna a página Thymeleaf
    }

    @PostMapping("/salvarmedico")
    public String salvarMedico(@ModelAttribute Medico medico) {
       
        return "redirect:/paciente/cadastrado";  
}
}
