package sm.digital.helpcenter.web.HELPCENTER.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import sm.digital.helpcenter.web.HELPCENTER.json.response.StatusResponse;
import sm.digital.helpcenter.web.HELPCENTER.service.OrdenService;

@Controller
public class OrdenController {
	
	 @Autowired
	 OrdenService ordenService;
	 
	 @Autowired
	 private ObjectMapper objectMapper;
	 
	 @PostMapping("/statusOrden")
     @ResponseBody
     public String statusOrden(@RequestParam("idOrden") String idOrden) {
        StatusResponse status = ordenService.getStatusOrden(idOrden);
        String response = null;
        try {
            response = objectMapper.writeValueAsString(status);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return response;
     }

}
