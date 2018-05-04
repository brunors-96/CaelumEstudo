package exerciciosOrientacaoObjeto;

// Pag 36 - Capitulo 4 https://www.caelum.com.br/download/caelum-java-objetos-fj11.pdf
public class Conta {
	String accountHolder;
	int accountNumber;
	String agency;
	double balance;
	String openingDate;

	/*
	 * Metodo para sacar valores de uma determina conta. Regras de negocio: - Valor
	 * informado deve ser maior que 0 - Valor informado não deve ultrapassar o saldo
	 * da conta
	 */
	boolean draw(double pValue) {

		/*
		 * Verifica se o valor informado pelo usuário é maior que 0
		 */
		if (pValue > 0) {
			/*
			 * Se o valor informado pelo usuário for maior que 0, verifica se o usuário tem
			 * saldo suficiente na conta
			 */
			if (pValue > this.balance) {
				/*
				 * Se o valor para saeque for maior do que o saldo em conta, retorna mensagem de falha. 
				 */
				System.out.println("Não foi possivel efetuar o saque, saldo insuficiente.");
				System.out.println(this.accountHolder + " Seu saldo atual: R$" + this.balance);
				return false;
			}
			/*
			 * caso tenha saldo retorna a mensagem de sucesso no saque.
			 */
			else {
				double newBalance = this.balance - pValue;
				this.balance = newBalance;
				System.out.println("Saque efetuado com sucesso.");
				System.out.println(this.accountHolder + " Seu saldo atual: R$" + this.balance);
				return true;
			}
		}
		/*
		 * termina o metodo e retorna a mensagem de erro se o valor informado pelo
		 * usuário for negativo.
		 */
		else {
			System.out.println("Valor informado inválido!");
			System.out.println("Tente novamente.");
			return false;
		}
	}

	/*
	 * Metodo para depositar valores em uma conta. Regras de negocio: - Valor
	 * informado não dever se menor que 0.
	 */
	boolean deposit(double pValue) {

		/*
		 * Verifica se o valor informado pelo usuário para deposita não é negativo.
		 */
		if (pValue > 0) {
			double newBalance = this.balance + pValue;
			this.balance = newBalance;
			System.out.println("Deposito efetuado com sucesso!");
			System.out.println(this.accountHolder + " Seu saldo atual: R$" + this.balance);
			return true;
		}

		/*
		 * termina o metodo e retorna a mensagem de erro se o valor informado pelo
		 * usuário for negativo
		 */
		else {
			System.out.println("Valor informado inválido!");
			System.out.println("Tente novamente.");
			return false;
		}
	}

	/*
	 * Metodo para calcular o rendimento mensal de uma conta. Regras de negocio: -
	 * Multiplica o valor do saldo atual de uma conta por 0.1 uma vez por mês -
	 * Saldo da conta deve ser diferente de 0 - Saldo da conta não deve estar
	 * negativo.
	 */
	double rent() {
		/*
		 * Verifica se o saldo é maior que zero
		 */
		if (this.balance > 0) {
			/*
			 * Se for maior que zero o saldo da conta será multiplicado por 0.1
			 */
			double newBalance = this.balance + this.balance * 0.1;
			this.balance = newBalance;
			System.out.println(this.accountHolder + " Seu saldo atual: R$");
			return this.balance;
		}
		return (Double) null;
	}
	
	/*
	 * Metodo para transferir dinheiro entre duas contas, recebe a conta de destino e o valor a ser transferido.
	 * Regras de negocio:
	 * - A conta de origem deve ter saldo dispon�vel em conta
	 * - Valor a ser transferido n�o pode ser negativo
	 * - Valor a ser transferido n�o pode ser igual a 0
	 */
	
	boolean trade(Conta pDestiny, double pValue)
	{
		boolean withdraw = this.draw(pValue);
		
		if (!withdraw)
		{
			return false;
		}
		
		pDestiny.deposit(pValue);		
		return true;
	}
	
	/*
	 * pagina 60 https://www.caelum.com.br/download/caelum-java-objetos-fj11.pdf
	 */
}
