package com.jioxel.app.springbootdi.models.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

// @Service("miServicioComplejo")
// @Primary 
public class MiServicioComplejo implements IServicio {
     public MiServicioComplejo(){}

     @Override
     public String operacion() {
          return "ejecutando algun proceso Complejo";
     }

}
