package exerciciosOrientacaoObjeto;

public class TesteBancoPOO {

	/*
	 * Essa classe principal testa as funções criadas na classe
	 * Conta.
	 * pagina 55 https://www.caelum.com.br/download/caelum-java-objetos-fj11.pdf
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
		
		c1.draw(0.0);
		c1.draw(-1.0);
		c2.draw(1000.01);
		c2.draw(500);
		c2.draw(501);
		c1.draw(1000.00);
		
		/*
		 * Testes para validar o funcionamento do metodo deposit, reponsável por depositar valores nas contas.
		 * Para validar os testes, seguiu-se o seguinte fluxo:
		 * 1- Depositar um valor igual a 0
		 * 2- Depositar um valor negativo.
		 * 3- Depositar um valor positivo
		 */
		
		c1.deposit(0);
		c2.deposit(-1);
		c1.deposit(1000);
		c2.deposit(1000);
		
		/*
		 * Testes para validar o funcionamento do metodo rent, responsável por calcular o rendimento de uma conta.
		 * Para validar os testes, seguiu-se o seguinte fluxo:
		 * 1- Chamada do metodo com saldos em R$1000,00
		 * 2- Zerar as contas e chamar o metodo
		 */
		c1.rent();
		c2.rent();
		c1.draw(1000);
		c2.draw(1000);
		c1.rent();
		c2.rent();
		
	}

}