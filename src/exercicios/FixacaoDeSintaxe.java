package exercicios;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class FixacaoDeSintaxe {

	public static void main(String[] args) {
		/*
		 * 1. Imprima todos os números de 150 a 300 2. Imprima a soma de 1 até 1000. 3.
		 * Imprima todos os múltiplos de 3, entre 1 e 100. 4. Imprima os fatoriais de 1
		 * a 10. 5. No código do exercício anterior, aumente a quantidade de números que
		 * terão os fatoriais impressos, até 20, 30, 40. Em um determinado momento, além
		 * desse cálculo demorar, vai começar a mostrar respostas completamente erradas.
		 * Por quê?
		 * 
		 * 6. (opcional) Imprima os primeiros números da série de Fibonacci até passar
		 * de 100. A série de Fibonacci é a seguinte: 0, 1, 1, 2, 3, 5, 8, 13, 21,
		 * etc... Para calculá-la, o primeiro elemento vale 0, o segundo vale 1, daí por
		 * diante, o n-ésimo elemento vale o (n-1)-ésimo elemento somado ao
		 * (n-2)-enésimo elemento (ex: 8 = 5 + 3).
		 * 
		 * 7. (opcional) Escreva um programa que, dada uma variável x com algum valor
		 * inteiro, temos um novo x de acordo com a seguinte regra: se x é par, x = x /
		 * 2 se x é impar, x = 3 * x + 1 imprime x O programa deve parar quando x tiver
		 * o valor final de 1. Por exemplo, para x = 13, a saída será: 40 -> 20 -> 10 ->
		 * 5 -> 16 -> 8 -> 4 -> 2 -> 1
		 * 
		 * 8. (opcional) Imprima a seguinte tabela, usando fors encadeados: 1 2 4 3 6 9
		 * 4 8 12 16 n n*2 n*3 .... n*n
		 * 
		 * DESAFIOS: FIBONACCI 1. Faça o exercício da série de Fibonacci usando apenas
		 * duas variáveis.
		 */

		System.out.println("====================================");
		System.out.println("==============Exercicio 1===========");
		System.out.println("==Imprimir os números de 150 a 300==");
		for (int i = 150; i <= 300; i++) {
			System.out.println(i);
		}
		System.out.println("====================================");
		System.out.println("");
		System.out.println("====================================");
		System.out.println("==============Exercicio 2===========");
		System.out.println("===Imprimir a soma de 01 até 1000===");
		for (int i = 1; i <= 1000; i = i + i) {
			System.out.println(i);
		}
		System.out.println("====================================");
		System.out.println("");
		System.out.println("====================================");
		System.out.println("==============Exercicio 3===========");
		System.out.println("===Múltiplos de 03, de 01 até 100===");
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("====================================");
		System.out.println("");
		System.out.println("====================================");
		System.out.println("==============Exercicio 4===========");
		System.out.println("========Fatorias de 1 até 10========");
		System.out.println("Fatorial de 1 até 10:");
		int fatorial = 1;
		for (int i = 1; i <= 10; i++) {
			fatorial = fatorial * i;
			System.out.println(fatorial);
		}
		System.out.println("====================================");
		System.out.println("");
		System.out.println("====================================");
		System.out.println("==============Exercicio 5===========");
		System.out.println("========Fatorias de 1 até 20========");
		int fatorial2 = 1;
		System.out.println("Fatorial de 1 até 20:");
		for (int i = 1; i <= 20; i++) {
			fatorial2 = fatorial2 * i;
			System.out.println(fatorial2);
		}
		System.out.println("====================================");
		System.out.println("========Fatorias de 1 até 30========");
		int fatorial3 = 1;
		System.out.println("Fatorial de 1 até 30:");
		for (int i = 1; i <= 30; i++) {
			fatorial3 = fatorial3 * i;
			System.out.println(fatorial3);
		}
		System.out.println("====================================");
		System.out.println("========Fatorias de 1 até 40========");
		long fatorial4 = 1;
		System.out.println("Fatorial de 1 até 40:");
		for (int i = 1; i <= 40; i++) {
			fatorial4 = fatorial4 * i;
			System.out.println(fatorial4);
		}
		System.out.println("====================================");
		System.out.println("");
		System.out.println("====================================");
		System.out.println("==============Exercicio 6===========");
		System.out.println("=Sequência de Fibonnaci, de 1 a 100=");
		int fib = 0;
		int fib2 = 1;
		for (int i = 0; fib <= 100; i++) {
			System.out.println(fib);
			fib2 = fib + fib2 + (fib = fib2) - fib2;
		}
		System.out.println("====================================");
		System.out.println("");
		System.out.println("========================================");
		System.out.println("================Exercicio 7=============");
		System.out.println("===Informar valor X, que irá imprimir===");
		System.out.println("=valor Y de acordo com a seguinte regra=");
		System.out.println("========Se X é par então Y = X/2========");
		System.out.println("====Se X é impar então Y = 3 * x + 1====");
		System.out.println("==========Para quando Y vale 1==========");
		int x = 20;
		
		int verifica = x % 2;
		
		if (verifica != 0) {
			x = 3 * x + 1;
		}
		while (x >= 1) {
			System.out.println(x);
			x = x / 2;
		}
		
		// Pagina 35
	}

}
