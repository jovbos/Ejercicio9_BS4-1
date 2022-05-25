package paquete;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("perfil1")
public class Perfil1 implements Perfiles{

    String perfil = "perfil1";

    public String getPerfil() {
        return perfil;
    }

    public void miFuncion() {

        System.out.println("Esta activo el " + perfil);
    }
}
