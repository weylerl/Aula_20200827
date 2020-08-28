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
	
	public Conta buscaConta(int num) {
		Conta c = null;
		for (Conta cta: contas)
		    if (cta.getNumero() == num) {
		    	c =  cta;
		    	break;
		    }
		return c;
	}
	
}
