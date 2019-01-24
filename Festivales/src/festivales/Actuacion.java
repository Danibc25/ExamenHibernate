package festivales;

public class Actuacion {
	private int idAct;
	private int hora;
	private String escenatio;

	public Actuacion() {
	}

	public Actuacion(int idAct, int hora, String escenatio) {
		this.idAct=idAct;
		this.hora = hora;
		this.escenatio = escenatio;
	}

	public int getIdAct() {
		return idAct;
	}

	public void setIdAct(int idAct) {
		this.idAct = idAct;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public String getEscenatio() {
		return escenatio;
	}

	public void setEscenatio(String escenatio) {
		this.escenatio = escenatio;
	}

}
