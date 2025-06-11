/*  
a) Calcular a média de uma lista
b) Calcular a moda de uma lista
c) Calcular o mínimo de uma lista
d) Calcular o máximo de uma lista
e) Calcular o desvio padrão da lista
*/

package Senai_LLP_ArrayList_Estatistica;

import java.util.ArrayList;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        ArrayList<Double> listaNumeros = new ArrayList<>();

        while (true) {
            System.out.print("Digite um número (ou pressione ENTER para sair): ");
            String entrada = leia.nextLine();

            if (entrada.isEmpty()) {
                break;
            }
            double numero = Double.parseDouble(entrada);
            listaNumeros.add(numero);
            
        }

        if (listaNumeros.isEmpty()) {
            System.out.println("Nenhum número foi inserido.");
        } else {
            calcularMedia(listaNumeros);
            calcularModa(listaNumeros);
            encontrarMinimo(listaNumeros);
            encontrarMaximo(listaNumeros);
            calcularDesvioPadrao(listaNumeros);
        }

        leia.close();
    }

    // cálculo da média
    public static void calcularMedia(ArrayList<Double> lista) {
        double soma = 0;
        for (double numero : lista) {
            soma += numero;
        }
        double media = soma / lista.size();
        System.out.println("Média: " + media);
    }

    // cálculo da moda
    public static void calcularModa(ArrayList<Double> lista) {
        int maiorFrequencia = 0;
        double moda = lista.get(0);

        for (double valor : lista) {
            int frequenciaAtual = 0;
            for (double outroValor : lista) {
                if (valor == outroValor) {
                    frequenciaAtual++;
                }
            }

            if (frequenciaAtual > maiorFrequencia) {
                maiorFrequencia = frequenciaAtual;
                moda = valor;
            }
        }
        System.out.println("Moda: " + moda);
    }

    // encontrar o mínimo
    public static void encontrarMinimo(ArrayList<Double> lista) {
        double menor = lista.get(0);
        for (double numero : lista) {
            if (numero < menor) {
                menor = numero;
            }
        }
        System.out.println("Menor número: " + menor);
    }

    // encontrar o máximo
    public static void encontrarMaximo(ArrayList<Double> lista) {
        double maior = lista.get(0);
        for (double numero : lista) {
            if (numero > maior) {
                maior = numero;
            }
        }
        System.out.println("Maior número: " + maior);
    }

    // cálculo do desvio padrão
    public static void calcularDesvioPadrao(ArrayList<Double> lista) {
        double soma = 0;
        for (double numero : lista) {
            soma += numero;
        }
        double media = soma / lista.size();

        double somaQuadrados = 0;
        for (double numero : lista) {
            somaQuadrados += Math.pow(numero - media, 2);
        }

        double desvioPadrao = Math.sqrt(somaQuadrados / lista.size());
        System.out.println("Desvio Padrão: " + desvioPadrao);
    }
}
