import java.util.ArrayList;

public interface Repositorio {

	public ArrayList<Object> load();  // carrega

	public void save(ArrayList<Object> objetos);  // salva

}