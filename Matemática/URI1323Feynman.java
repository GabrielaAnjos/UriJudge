﻿package urijudge.desafios.matematica;
/**
 * Richard Phillips Feynman era um físico americano muito famoso e ganhador do Prêmio Nobel de Física.
 * Ele trabalhava em física teórica e também foi pioneiro no campo da computação quântica.
 * Ele visitou a América do Sul por dez meses, dando palestras e aproveitando a vida nos trópicos.
 * Ele também é conhecido pelos livros "Surely You’re Joking, Mr. Feynman!"
 * e "What Do You Care What Other People Think?", que inclui algumas de suas aventuras abaixo do equador.
 *
 * Sua paixão da vida inteira era resolver e criar quebra-cabeças, trancas e códigos.
 * Recentemente, um fazendeiro idoso da América do Sul, que hospedou o jovem físico em 1949,
 * achou alguns papéis e notas que acredita-se terem pertencido a Feynman. Entre anotações sobre mesóns
 * e eletromagnetismo, havia um guardanapo onde ele escreveu um simples desafio:
 * "quantos quadrados diferentes existem em um quadriculado de N x N quadrados?".
 *
 * No mesmo guardanapo havia um desenho, que está reproduzido abaixo, mostrando que para N = 2, a resposta é 5.
 *
 * Entrada
 * A entrada contém diversos casos de teste. Cada caso de teste é composto de uma única linha,
 * contendo apenas um inteiro N, representando o número de quadrados em cada lado do quadriculado (1 ≤ N ≤ 100).
 *
 * O final da entrada é indicado por uma linha contendo apenas um zero.
 *
 * Saída
 * Para cada caso de teste na entrada, seu programa deve imprimir uma única linha,
 * contendo o número de diferentes quadrados para a entrada correspondente.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int N;
        int resposta = 0;

        while (true){
            N = input.nextInt();

            if (N == 0){
                break;
            } else {
                resposta = (N * (N + 1) * (2 * N + 1)) / 6;
            }

            System.out.println(resposta);
        }

        input.close();
    }
}
