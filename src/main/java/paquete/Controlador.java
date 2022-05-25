package paquete;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador {

    @Autowired
    ConfiguracionParam configuracionParam;

    @Autowired
    ConfiguracionValores configuracionValores;

    @Autowired
    Perfiles perfiles;

    @GetMapping("/parametros")
    public ConfiguracionParam outputParametros(){
        return configuracionParam;
    }

    @GetMapping("/miconfiguracion")
    public ConfiguracionValores outputValores() {
        return configuracionValores;
    }

    @GetMapping("/perfil")
    public String mostrarPerfil() {
        perfiles.miFuncion();
        String perfilActual = perfiles.getPerfil();
        return "Esta activo el " + perfilActual;
    }
}
