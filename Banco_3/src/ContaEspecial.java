
public class ContaEspecial extends Conta {

	private double limite;

	public ContaEspecial(int numero, Cliente cliente, double limite) {
		super(numero, cliente);
		this.limite = limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public String toString() {
		return "ContaEspecial [limite=" + limite + ", toString()=" + super.toString() + "]";
	}
	
}
