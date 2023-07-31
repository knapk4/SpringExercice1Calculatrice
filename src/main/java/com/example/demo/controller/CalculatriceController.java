package com.example.demo.controller;

import com.example.demo.model.Calculatrice;
import com.example.demo.service.CalculatriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController // force l'utilisation des norme API REST
@RequestMapping("/calculatrice") // permet de désigner la route principal du controller
public class CalculatriceController {

    // injection de dépendance de mon service
    private final CalculatriceService calculatriceService;


    public CalculatriceController(CalculatriceService calculatriceService) {
        this.calculatriceService = calculatriceService;
    }

    @PostMapping("/addition")// sous route de typ POST
    public int addition(@RequestParam int a,@RequestParam int b){
        return calculatriceService.addition(a,b);
    }

    @PostMapping("/soustraction")
    public int soustraction(@RequestParam int a,@RequestParam int b){
        return calculatriceService.soustraction(a,b);
    }

    @PostMapping("/multiplication")
    public int multiplication(@RequestParam int a,@RequestParam int b){
        return calculatriceService.multiplication(a,b);
    }

    @PostMapping("/division?a=7&b=5")
    public int division(@RequestParam int a,@RequestParam int b){
        return calculatriceService.division(a,b);
    }

    @PostMapping("/modulo/{a}/{b}")
    public int modulo(@PathVariable int a,@PathVariable int b){
        return calculatriceService.modulo(a,b);
    }

    @PostMapping("/calcul")
    public int calcul(@RequestBody Calculatrice calculatrice) {
        return calculatriceService.calcul(calculatrice);
    }

}
