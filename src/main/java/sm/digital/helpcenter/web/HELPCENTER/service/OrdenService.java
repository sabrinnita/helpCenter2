package sm.digital.helpcenter.web.HELPCENTER.service;

import sm.digital.helpcenter.web.HELPCENTER.json.response.StatusResponse;

public interface OrdenService {
	
	public StatusResponse getStatusOrden(String idOrden);
}
