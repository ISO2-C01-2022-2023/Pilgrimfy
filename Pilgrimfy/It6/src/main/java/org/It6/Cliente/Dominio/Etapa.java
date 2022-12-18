package Diagrama_Diseño_It6;

public class Etapa {

	private int idEtapa;
	private String nombre;
	private Date fechaInicio;
	private Date fechaFinal;
	private double longitud;
	private DAO_Etapa Dao_Obj;

	public int getIdEtapa() {
		return this.idEtapa;
	}

	public String getNombre() {
		return this.nombre;
	}

	public Date getFechaInicio() {
		return this.fechaInicio;
	}

	public Date getFechaFinal() {
		return this.fechaFinal;
	}

	public double getLongitud() {
		return this.longitud;
	}

	public void buscarEtapa() {
		// TODO - implement Etapa.buscarEtapa
		throw new UnsupportedOperationException();
	}

}