package sm.digital.helpcenter.web.HELPCENTER.service;

import sm.digital.helpcenter.web.HELPCENTER.entity.Respuesta;

import java.util.List;

public interface ConsultaService {

    public List<Respuesta> consultar(String texto);

}
