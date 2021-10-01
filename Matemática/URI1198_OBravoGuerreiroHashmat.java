package urijudge.desafios.matematica;
/**
 * Hashmat é um guerreiro cujo seu grupo de soldados se move
 * de um local a outro para lutar contra os seus oponentes.
 * Antes da luta ele apenas calcula uma coisa.
 * A diferença entre a quantidade de soldados que possui e a quantidade de soldados oponentes.
 * A partir desta diferença ele decide se vai ou não lutar. Às vezes Hashmat tem mais soldados
 * do que o seu oponente, mas na maioria das vezes não.
 *
 * Entrada
 * A entrada contém dois números inteiros em cada linha.
 * Estes dois números denotam respectivamente a quantidade de soldados do exército de Hashmat
 * e do seu oponente.  Nenhum número de entrada é maior do que  232.
 * A entrada termina com fim de arquivo (EOF).
 *
 * Saída
 * Para cada linha de entrada imprima a diferença entre o número de soldados de Hashmat
 * e do seu oponente. Cada saída deve ser impressa em uma linha separada.
 */

import java.util.Scanner;

public class URI1198_OBravoGuerreiroHashmat {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            long a = sc.nextLong();
            long b = sc.nextLong();
            long diferenca = Math.abs(b - a);

            System.out.println(diferenca);
        }
        sc.close();
    }
}
