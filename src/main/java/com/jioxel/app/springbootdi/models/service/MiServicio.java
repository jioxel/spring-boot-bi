package com.jioxel.app.springbootdi.models.service;

import org.springframework.stereotype.Service;

// @Component  
// @Service("miServicioSimple") // es lo mismo que Component solo que indica que es un service pero nada más

public class MiServicio implements IServicio {
     public MiServicio(){}


     @Override
     public String operacion(){
          return "ejecutando algun proceso Simplee";
     }

}
