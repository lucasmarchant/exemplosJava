package br.com.targettrust.exemplos.dia01;

import java.util.Scanner;

public class CalculadoraIMC {

    public static double pedirPeso() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o seu Peso: ");
        double numero = scanner.nextDouble();
        return numero;
    }

    public static double pedirAltura() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a sua Altura: ");
        double numero = scanner.nextDouble();
        return numero;
    }

    public static double calcular(double peso, double altura) {
        if (peso <= 0 || altura <= 0) {
            System.out.println("Peso e altura devem ser maiores que zero.");
            return 0;
        }
        double imc = peso / (altura * altura);
        return imc;
    }

    public static void main(String[] args) {
        double peso = pedirPeso(); // em kg
        double altura = pedirAltura(); // em metros


        double imc = calcular(peso, altura);
        System.out.println("Seu IMC é " + imc);

        //VEREMOS na proxima aula
       /* if (imc == 0) {
            System.out.println("peso ou idade invalidos.");
        } else if (imc < 18.5) {
            System.out.println("Você está abaixo do peso.");
        } else if (imc < 25) {
            System.out.println("Seu peso está normal.");
        } else if (imc < 30) {
            System.out.println("Você está acima do peso.");
        } else {
            System.out.println("Você está obeso.");
        }*/
    }


}