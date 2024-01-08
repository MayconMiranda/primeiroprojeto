package org.example;

public class Condicional {
    public static void main(String[] args) {

        int anoDeLancamento = 1990;
        boolean incluidoNoPlano = false;
        double nota = 8.1;
        String tipoPlano = "normal";

        if (anoDeLancamento >= 2022){
            System.out.println("Lançametos os clientes estão curtindo.");
        }else {
            System.out.println("filme retro que vale a pena assistir");
        }

        if (incluidoNoPlano == true || tipoPlano.equals("plus")){
            System.out.println("é filme liberado");
        }else {
            System.out.println("deve pagar a locação!");
        }
    }
}
