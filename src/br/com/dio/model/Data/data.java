package br.com.dio.model.Data;

import java.beans.SimpleBeanInfo;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class data {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        double salario, novosalario;

        System.out.println("nome: ");
        nome = scan.next();
        System.out.println("salario: ");
        salario = scan.nextDouble();

        novosalario = salario * 1.1;

        System.out.println(nome+ " recebera R$" +novosalario);

        System.out.println("Boa Tarde!");

        Date data = new Date();
        SimpleDateFormat formatar = new SimpleDateFormat("d/M/y");
        String dataformatada = formatar.format(data);
        System.out.println(dataformatada);
        double a;
        double b;

        System.out.println("Digite o primeiro valor: ");
        a = scan.nextDouble();
        System.out.println("Digite o segundo valor: ");
        b = scan.nextDouble();

        double soma = somar(a, b);
        double sub = subtrair(a, b);
        double mul = multiplicar(a, b);
        double div = dividir(a, b);

        System.out.println("soma: " + (a + b));
        System.out.println("sub: " + (a - b));
        System.out.println("mul: " + (a * b));
        System.out.println("div: " + (a / b));

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



