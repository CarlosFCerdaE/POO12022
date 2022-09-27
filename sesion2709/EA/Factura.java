package diagramaclases;


/**
 * @author labc205
 * @version 1.0
 * @created 27-sep.-2022 09:32:34
 */
public class Factura {

	private DateTime fechaFact;
	private int idFact;
	public Carrito m_Carrito;

	public Factura(){

	}

	public void finalize() throws Throwable {

	}
	public double calcularIva(){
		return 0;
	}

	public double calcularMonto(){
		return 0;
	}
}//end Factura