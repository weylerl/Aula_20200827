import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Principal {

	public static void main(String[] args) throws ParseException {
		
		Banco banco = new Banco("Popular");
		
		Cliente cli1 = new Cliente("Pedro Alves", "42145687691", new SimpleDateFormat("dd/MM/yyyy").parse("03/03/1978"), 12345.00);
		Cliente cli2 = new Cliente("Maria dos Santos", "12345678944", new SimpleDateFormat("dd/MM/yyyy").parse("13/08/1968"));
		Cliente cli3 = new Cliente("Rita da Silva", "71373678949", new SimpleDateFormat("dd/MM/yyyy").parse("27/06/1980"));

		Conta cta1 = new Conta(1,cli1);
		Conta cta2 = new ContaEspecial(2, cli2, 300.00);
		System.out.println(cta2.toString());
		
		banco.insereConta(cta1);
		banco.insereConta(cta2);
		
		banco.cadastraCliente(cli1);
		banco.cadastraCliente(cli2);
		banco.cadastraCliente(cli3);
		
		banco.listaClientes();
		
		//banco.depositaConta(1, 200.00);	
		cta1.deposita(300.00);
		System.out.println(banco.buscaConta(1).toString());
		System.out.println(banco.buscaConta(2).toString());
		
	
	}

}
