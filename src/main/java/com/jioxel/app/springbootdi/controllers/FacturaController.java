package com.jioxel.app.springbootdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jioxel.app.springbootdi.models.domain.Factura;

@Controller
@RequestMapping("/factura")
public class FacturaController {
     @Autowired
     private Factura factura;
     @GetMapping("/ver")
     public String ver(Model model){
          model.addAttribute("factura", factura);
          model.addAttribute("title", "Facura");
          return "factura/ver";
     }
}
