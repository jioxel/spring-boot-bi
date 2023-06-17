package com.jioxel.app.springbootdi;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.jioxel.app.springbootdi.models.domain.ItemFactura;
import com.jioxel.app.springbootdi.models.domain.Producto;
import com.jioxel.app.springbootdi.models.service.IServicio;
import com.jioxel.app.springbootdi.models.service.MiServicio;
import com.jioxel.app.springbootdi.models.service.MiServicioComplejo;

@Configuration
public class AppConfig {
     
     @Bean("miServicioSimple")
     @Primary
     public IServicio registrarMiServicio(){
          return new MiServicio();
     }


     @Bean("miServicioComplejo")
     public IServicio registrarMiServicioComplejo(){
          return new MiServicioComplejo();
     }

     @Bean("itemsFactura")
     public List<ItemFactura> registrarItems(){
          Producto producto1 = new Producto();
          Producto producto2 = new Producto();
          producto1.setNombre("xBox");
          producto1.setPrecio(450);
          producto2.setNombre("play");
          producto2.setPrecio(600);
          ItemFactura linea1 = new ItemFactura(producto1,10);
          ItemFactura linea2 = new ItemFactura(producto2,20);

          return Arrays.asList(linea1,linea2);
     } 
}
