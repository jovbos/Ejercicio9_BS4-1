package paquete;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("perfil2")
public class Perfil2 implements Perfiles{

    String perfil = "perfil2";

    public String getPerfil() {
        return perfil;
    }

    public void miFuncion() {

        System.out.println("Esta activo el " + perfil);
    }

}
