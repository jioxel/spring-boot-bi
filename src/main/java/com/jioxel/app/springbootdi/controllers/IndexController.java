package com.jioxel.app.springbootdi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.jioxel.app.springbootdi.service.MiServicio;

@Controller
public class IndexController {
     private MiServicio servicio= new MiServicio();
     @GetMapping({"","/","/index"})
     public String index(Model model){
          model.addAttribute("objeto", servicio.operacion());
          return "index";
     }
}
