package Dominio;

public class Negocio {

	private Cliente cliente;
	private string idnegocio;
	private string nombreNegocio;
	private DAO_Negocio DAO_Obj;
	private string localizacion;
	private double ganancias;
	private integer plazas;
	private ArrayList<Peregrino> Peregrinos;

	public Cliente getCliente() {
		return this.cliente;
	}

	public string getIdNegocio() {
		// TODO - implement Negocio.getIdNegocio
		throw new UnsupportedOperationException();
	}

	public string getNombreNegocio() {
		return this.nombreNegocio;
	}

	public DAO_Negocio getDAO_Negocio() {
		// TODO - implement Negocio.getDAO_Negocio
		throw new UnsupportedOperationException();
	}

	public string getLocalizacion() {
		return this.localizacion;
	}

	public boolean ComprobarCliente() {
		// TODO - implement Negocio.ComprobarCliente
		throw new UnsupportedOperationException();
	}

	public void AñadirNegocio() {
		// TODO - implement Negocio.AñadirNegocio
		throw new UnsupportedOperationException();
	}

	public void EditarNegocio() {
		// TODO - implement Negocio.EditarNegocio
		throw new UnsupportedOperationException();
	}

	public void DarBajaNegocio() {
		// TODO - implement Negocio.DarBajaNegocio
		throw new UnsupportedOperationException();
	}

	public ArrayList<Peregrino> getPeregrinos() {
		// TODO - implement Negocio.getPeregrinos
		throw new UnsupportedOperationException();
	}

	public integer getPlazas() {
		return this.plazas;
	}

	public double getGanancias() {
		return this.ganancias;
	}

}