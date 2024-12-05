package com.example.Consulta.Controller;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Consulta.Model.Consulta;
import com.example.Consulta.servicos.ConsultaServico;


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
       @GetMapping("/relatorioConsultas")
    public String mostrarRelatorio(Model model) {
        // Obter a lista de consultas do banco de dados
        List<Consulta> consultas = ConsultaServico.buscarTodasConsultas();
        model.addAttribute("consultas", consultas);  // Atributo para Thymeleaf
        return "relatorioConsultas";  // Nome do template
    }

    @GetMapping("/editarConsulta/{id}")
    public String editarConsulta(@PathVariable Long id, Model model) {
        // Lógica para editar a consulta
        Consulta consulta;
        consulta = ConsultaServico.buscarConsultaPorId(id);
        model.addAttribute("consulta", consulta);
        return "editarConsulta";  // Página para editar
    }

    @GetMapping("/removerConsulta/{id}")
    public String removerConsulta(@PathVariable Long id) {
        // Lógica para remover a consulta
        ConsultaServico.removerConsulta(id);
        return "redirect:/relatorioConsultas";  // Redireciona para a lista
    }
}
