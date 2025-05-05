package com.fiap.expressoesOperadores;

import java.util.Scanner;

public class ExpressoesOperadoresEx1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double deposito, taxaJuros, rendimento, valorFinal;

        System.out.print("Digite o valor do depósito: ");
        deposito = entrada.nextDouble();

        System.out.print("Digite a taxa de juros (em %): ");
        taxaJuros = entrada.nextDouble();

        //CÁLCULO DE RENDIMENTO
        rendimento = (deposito * taxaJuros) / 100;
        System.out.printf("Valor do rendimento: %.2f\n", rendimento);

        //CÁLCULO DE VALOR FINAL COM RENDIMENTO
        valorFinal = deposito + rendimento;
        System.out.printf("Valor final com o rendimento: %.2f", valorFinal);

        entrada.close();
    }
}
