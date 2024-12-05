package com.example.Consulta.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Consulta.Model.Paciente;

public class PacienteController {
      @GetMapping("/cadastroPaciente")
    public String showForm(Model model) {
        model.addAttribute("paciente", new Paciente());  // Cria um novo objeto paciente
        return "cadastroPaciente";  // Retorna a página Thymeleaf
    }

    @PostMapping("/salvarPaciente")
    public String salvarPaciente(@ModelAttribute Paciente paciente) {
       
        return "redirect:/paciente/cadastrado";  
    }
}
