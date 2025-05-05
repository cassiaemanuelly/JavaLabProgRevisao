package com.fiap.expressoesOperadores;

import java.util.Scanner;

public class ExpressoesOperadoresEx2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String nome;
        double salarioFixo, vendas, valorFinal, valorComissao;
        double comissao = 0.18;

        System.out.print("Nome do vendedor: ");
        nome = entrada.nextLine();

        System.out.print("Salário fixo: ");
        salarioFixo = entrada.nextDouble();

        System.out.print("Total de vendas (em dinheiro): ");
        vendas = entrada.nextDouble();

        //CÁLCULO DE COMISSÃO
        valorComissao = vendas * comissao;

        //CÁLCULO SALÁRIO FINAL
        valorFinal = salarioFixo + valorComissao;

        //RELATÓRIO FINAL
        System.out.println("-----RELATÓRIO FINAL-----");
        System.out.println("VENDEDOR: " + nome);
        System.out.printf("SALÁRIO FIXO: R$ %.2f \n", salarioFixo);
        System.out.printf("TOTAL DE VENDAS: R$ %.2f \n", vendas);
        System.out.printf("VALOR DA COMISSÃO: R$ %.2f \n", valorComissao);
        System.out.printf("VALOR FINAL (SALÁRIO + COMISSÃO): R$ %.2f", valorFinal);

    }
}
