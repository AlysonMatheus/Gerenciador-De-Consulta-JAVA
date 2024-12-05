package com.example.Consulta.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Consulta.Model.Consulta;


@Controller
public class ConsultaController {

    @GetMapping("/consulta/cadastrar")
    public String showForm(Model model) {
        model.addAttribute("consulta", new Consulta());  // Cria um novo objeto consulta
        return "cadastroConsulta";  // Retorna a página Thymeleaf
    }

    @PostMapping("/consulta/cadastrar")
    public String cadastrarConsulta(@ModelAttribute Consulta consulta) {
        
        return "redirect:/consulta/confirmacao";  
    }
}
