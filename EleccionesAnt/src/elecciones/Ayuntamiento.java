package elecciones;

public class Ayuntamiento extends EspacioPublico {

	private int id;
	private String poblacion;
	private String direccion;
	private String nombreAlcalde;
	

	public Ayuntamiento(){}

	public void setId(int id){
		this.id=id;
	}
	public int getId(){
		return id;
	}

	public void setPoblacion(String poblacion){
		this.poblacion=poblacion;
	}
	public String getPoblacion(){
		return poblacion;
	}

	public void setDireccion(String direccion){
		this.direccion=direccion;
	}
	public String getDireccion(){
		return direccion;
	}

	public void setNombreAlcalde(String nombreAlcalde){
		this.nombreAlcalde=nombreAlcalde;
	}

	public String getNombreAlcalde(){
		return nombreAlcalde;
	}
}
