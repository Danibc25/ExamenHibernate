package festivales;

public class Grupo {
	private int idGrupo;
	private String nombre;
	private String estilo;
	private int miembros;

	public Grupo() {
	}

	public Grupo(int idGrupo, String nombre, String estilo, int miembros) {
		this.idGrupo= idGrupo;
		this.nombre = nombre;
		this.estilo = estilo;
		this.miembros = miembros;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	public int getMiembros() {
		return miembros;
	}

	public void setMiembros(int miembros) {
		this.miembros = miembros;
	}

	public int getIdGrupo() {
		return idGrupo;
	}

	public void setIdGrupo(int idGrupo) {
		this.idGrupo = idGrupo;
	}
	

}
