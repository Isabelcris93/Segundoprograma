package br.com.dio.Calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a;
        double b;

        System.out.println("Digite o primeiro valor: ");
        a = scan.nextDouble();
        System.out.println("Digite o segundo valor: ");
        b = scan.nextDouble();

        double soma = somar(a, b);
        double sub = subtrair(a,b);
        double mul = multiplicar(a,b);
        double div = dividir(a,b);

        System.out.println("soma: " + (a+b));
        System.out.println("sub: " + (a-b));
        System.out.println("mul: " + (a*b));
        System.out.println("div: " + (a/b));

    }

    private static double somar(double a, double b) {
        return a+b;
    }
    private static double subtrair(double a, double b) {
        return a-b;
    }
    private static double multiplicar(double a, double b) {
        return a*b;
    }
    private static double dividir(double a, double b) {
        return a/b;
    }

    }

