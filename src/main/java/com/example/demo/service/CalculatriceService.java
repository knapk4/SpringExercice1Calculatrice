package com.example.demo.service;

import com.example.demo.model.Calculatrice;
import org.springframework.stereotype.Service;

@Service
public class CalculatriceService {

    public int calcul(Calculatrice calculatrice){
        int resultat = 0;
        switch(calculatrice.getOperation()){
            case "+":
                resultat = addition(calculatrice.getNombre1(), calculatrice.getNombre2());
                break;

            case "-":
                resultat = soustraction(calculatrice.getNombre1(),calculatrice.getNombre2());
                break;
            case "*":
                resultat = multiplication(calculatrice.getNombre1(),calculatrice.getNombre2());
                break;
            case "/":
                resultat = division(calculatrice.getNombre1(),calculatrice.getNombre2());
                break;
            case "%":
                resultat = modulo(calculatrice.getNombre1(),calculatrice.getNombre2());
                break;
        }
        return resultat;
    }

    // fonction pour calculer une addition , prend en parametre deux entier a et b
    public int addition(int a, int b) {
        return a + b;
    }

    public int soustraction(int a, int b) {
        return a - b;
    }

    public int multiplication(int a, int b) {
        return a * b;
    }

    public int division(int a, int b) {
        return a / b;
    }

    public int modulo(int a, int b) {
        return a % b;
    }
}
