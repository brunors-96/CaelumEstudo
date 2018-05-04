package exerciciosOrientacaoObjeto;

public class TesteBancoPOO {

	/*
	 * Essa classe principal testa as funções criadas na classe
	 * Conta.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Instanciando os objetos c1 e c2
		 */
		Conta c1 = new Conta();
		Conta c2 = new Conta();
		
		/*
		 * Defindo o valor dos atributos para cada conta(objeto):
		 * accountHolder
		 * accountNumber
		 * agency
		 * balance
		 * openingDate
		 */
		
		c1.accountHolder="Bruno";
		c1.accountNumber=1;
		c1.agency="ce1";
		c1.balance=1000.00;
		c1.openingDate="27 de Abril de 2018";
		
		c2.accountHolder="Janaina";
		c2.accountNumber=2;
		c2.agency="ce1";
		c2.balance=1000.00;
		c2.openingDate="27 de Abril de 2018";
		
		/*
		 * Testes para validar o funcionamento do metodo draw, responsável por sacar valores das contas.
		 * Para validar os testes, seguiu-se o seguinte fluxo, levando em conta que ambas as contas tem R$1000,00 em conta: 
		 * 1- Sacar um valor igual a 0
		 * 2- Sacar um valor negativo
		 * 3- Sacar um valor maior que R$1000,00
		 * 4- Sacar um valor maior que 0 e menor que R$1000,00
		 * 5- Sacar um valor maior que o saldo após ter feito um saque.
		 * 6- Sacar um valor igual ao saldo
		 */
		
		System.out.println("Sacando R$0,00 da conta Bruno");
		c1.draw(0.0);
		System.out.println("Sacando R$-1,00 da conta Bruno");
		c1.draw(-1.0);
		System.out.println("Sacando R$1000,01 da conta Janaina");
		c2.draw(1000.01);
		System.out.println("Sacando R$500,00 da conta Janaina");
		c2.draw(500);
		System.out.println("Sacando R$501,00 da conta Janaina");
		c2.draw(501);
		System.out.println("Sacando R$1000,00 da conta Bruno");
		c1.draw(1000.00);
		
		/*
		 * Testes para validar o funcionamento do metodo deposit, reponsável por depositar valores nas contas.
		 * Para validar os testes, seguiu-se o seguinte fluxo:
		 * 1- Depositar um valor igual a 0
		 * 2- Depositar um valor negativo.
		 * 3- Depositar um valor positivo
		 */
		
		System.out.println("Depositando R$0,00 na conta Bruno");
		c1.deposit(0);
		System.out.println("Depositando R$-1,00 na conta Janaina");
		c2.deposit(-1);
		System.out.println("Depositando R$1000,00 na conta Bruno");
		c1.deposit(1000);
		System.out.println("Depositando R$1000,00 na conta Janaina");
		c2.deposit(1000);
		
		/*
		 * Testes para validar o funcionamento do metodo rent, responsável por calcular o rendimento de uma conta.
		 * Para validar os testes, seguiu-se o seguinte fluxo:
		 * 1- Chamada do metodo com saldos em R$1000,00
		 * 2- Zerar as contas e chamar o metodo
		 */
		
		System.out.println("Rendimento de 10% em cima de R$1.000,00 na conta Bruno");
		c1.rent();
		System.out.println("Rendimento de 10% em cima de R$1.500,00 na conta Janaina");
		c2.rent();
		System.out.println("Sacando R$1100,00 da conta Bruno");
		c1.draw(1100);
		System.out.println("Sacando R$1650,00 da conta Janaina");
		c2.draw(1650);
		System.out.println("Rendimento de 10% em cima de R$0,00 nas contas Bruno e Janaina");
		c1.rent();
		c2.rent();
		
	}

}
