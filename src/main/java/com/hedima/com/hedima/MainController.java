package com.hedima.com.hedima;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class MainController {
    @GetMapping("") //Metodo de String que va desde el back al from (al html correspondiente) es decir pasamos de n¡una URL al index de html
    public String muestraPaginaInicio() {return "inde";}

    //@GetMapping("/usuarios")
    // public String usuarios() {
    // return "usuarios";
    // }




}
