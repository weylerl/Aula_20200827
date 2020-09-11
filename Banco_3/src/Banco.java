import java.util.ArrayList;

public class Banco {
	
	private String nome;
	private ArrayList<Cliente> clientes;
	private ArrayList<Conta> contas;
	
	public Banco(String nome) {
		super();
		this.nome = nome;
		this.clientes = new ArrayList<Cliente>();
		this.contas = new ArrayList<Conta>();
	}
	
	public String getNome() {
		return nome;
	}
	
	public void cadastraCliente(Cliente c) {
		clientes.add(c);
	}

	public void excluiCliente(Cliente c) {
		clientes.remove(c);
	}

	public void listaClientes() {
		for (Cliente c: clientes) {
			System.out.println(c.toString());
		};
	}
	
	public void insereConta(Conta cta) {
		contas.add(cta);		
	}
	
	public void depositaConta(int num, double valor) {
		Conta cta = buscaConta(num);
		if (cta == null)
			System.out.println("Conta inexistente!!");
		else
			cta.deposita(valor);
	}
	
	public void debitaConta(int num, double valor) {
		Conta cta = buscaConta(num);
		if (cta == null)
			System.out.println("Conta inexistente!!");
		else
			cta.debita(valor);
	}

	public void transferirDinheiro(int numOrigem, int numDestino, Double valor){
		Conta ctaOrigem = buscaConta(numOrigem);
		Conta ctaDestino = buscaConta(numDestino);

		if(ctaOrigem.saldo < valor)
			System.out.println("Saldo insuficiente!!");
		else {
			ctaOrigem.debita(valor);
			ctaDestino.deposita(valor);
			System.out.println("Transferencia de " + valor + "\nOrigem: "+  ctaOrigem.getCliente() + " \nDestino: " + ctaDestino.getCliente());
		}
	}
	
	public Conta buscaConta(int num) {
		Conta c = contas
				.stream()
				.filter(conta -> conta.getNumero() == num)
				.findAny()
				.orElse(null);
		return c;
	}

}
