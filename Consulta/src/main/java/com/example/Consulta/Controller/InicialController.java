package com.example.Consulta.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView; 

@RestController
public class InicialController {
  @RequestMapping("/inicial")
public ModelAndView rotainicial(){
ModelAndView mv = new ModelAndView("telainicial");
return mv;
}

@GetMapping("/cadastro")
public ModelAndView rotaconsultas(){
ModelAndView mv = new ModelAndView("cadastroconsulta");
return mv;
}

@GetMapping("/paciente")
public ModelAndView rotapaciente(){
ModelAndView mv= new ModelAndView("cadastropaciente");
return mv;
}
@GetMapping("/relatorios")
public ModelAndView rotaBase(){
ModelAndView mv= new ModelAndView("relatorioconsultas");
return mv;
}
}

