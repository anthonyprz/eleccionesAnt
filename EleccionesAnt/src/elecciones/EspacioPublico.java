package elecciones;

public abstract class EspacioPublico {
	private int id;
	private String nombre;
	private String tipo;
	private String direccion;
	private String poblacion;
	private int metros;
	

	public EspacioPublico(){}

	
	public void setId(int id){
		this.id=id;
	}
	public int getId(){
		return id;
	}

	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	public String getNombre(){
		return nombre;
	}

	public void setTipo(String tipo){
		this.tipo=tipo;
	}
	public String getTipo(){
		return tipo;
	}

	public void setDireccion(String direccion){
		this.direccion=direccion;
	}
	public String getDireccion(){
		return direccion;
	}

	public void setPoblacion(String poblacion){
		this.poblacion=poblacion;
	}
	public String getPoblacion(){
		return poblacion;
	}

	public void setMetros(int metros){
		this.metros=metros;
	}
	public int getMetros(){
		return metros;
	}
}
