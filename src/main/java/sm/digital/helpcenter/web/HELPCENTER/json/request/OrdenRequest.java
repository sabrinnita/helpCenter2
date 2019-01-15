package sm.digital.helpcenter.web.HELPCENTER.json.request;

public class OrdenRequest {
	private String idOrden;
	
	public OrdenRequest() {}
	
	public OrdenRequest(String idOrden) {
        this.idOrden = idOrden;
    }

	public String getIdOrden() {
		return idOrden;
	}

	public void setIdOrden(String idOrden) {
		this.idOrden = idOrden;
	}
	
	
	
}
