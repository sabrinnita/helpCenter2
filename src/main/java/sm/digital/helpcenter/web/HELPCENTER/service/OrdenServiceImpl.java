package sm.digital.helpcenter.web.HELPCENTER.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import sm.digital.helpcenter.web.HELPCENTER.json.request.OrdenRequest;
import sm.digital.helpcenter.web.HELPCENTER.json.response.StatusResponse;

@Service
public class OrdenServiceImpl implements OrdenService{
	@Override
	public StatusResponse getStatusOrden(String idOrden) {
    	RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        OrdenRequest request = new OrdenRequest(idOrden);
        HttpEntity<OrdenRequest> req = new HttpEntity<OrdenRequest>(request, headers);
        String url = "http://localhost:8080" + "/obtenerInfoOrden/"+idOrden.trim();
        ResponseEntity<StatusResponse> resp = restTemplate.exchange(url, HttpMethod.GET, req, StatusResponse.class);
        return resp.getBody();
    	
    }

}
