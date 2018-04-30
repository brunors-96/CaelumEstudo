package exercicios;

public class VariaveisETiposPrimitivos {

	public static void main(String[] args) {
		/* 1- Na empresa onde trabalhamos, há tabelas com o quanto foi gasto em cada mês. 
		 * Para fechar o balanço do primeiro trimestre, precisamos somar o gasto total. 
		 * Sabendo que, em Janeiro, foram gastos 15000 reais, em Fevereiro, 23000 reais e em Março, 17000 reais, 
		 * faça um programa que calcule e imprima o gasto total no trimestre. Siga esses passos:
		 * - Crie  uma  classe  chamada BalancoTrimestral com  um  bloco  main,  como  nos  exemplos anteriores;
		 * - Dentro do  main (o miolo do programa), declare uma variável inteira chamada gastosJaneiro e inicialize-a com 15000;
		 * - Crie  também  as  variáveis gastosFevereiro e gastosMarco,  inicializando-as  com  23000  e 17000, respectivamente, utilize uma linha para cada declaração;
		 * - Crie uma variável chamada gastosTrimestre e inicialize-a com a soma das outras 3 variáveis;
		 * - Imprima a variável gastosTrimestre
		 */
		
		int gastosJaneiro = 15000;
		int gastosFevereiro = 23000;
		int gastosMarco = 17000;
		int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
		
		System.out.println("Gastos trimestre: " + gastosTrimestre);
		
		/*
		 * 2.  Adicione  código  (sem  alterar  as  linhas  que  já  existem)  na  classe  anterior  para  imprimir  a  média
		 * mensal  de  gasto,  criando  uma  variável mediaMensal junto  com  uma  mensagem.  
		 * Para  isso, concatene a String com o valor, usando "Valor da média mensal = " + mediaMensal.
		 * pagina 24
		 */
		
		int mediaMensal = gastosTrimestre / 3;
		System.out.println("Média mensal: R$" + mediaMensal);
		
	}

}
