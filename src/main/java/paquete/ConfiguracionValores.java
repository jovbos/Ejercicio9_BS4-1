package paquete;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("miconfiguracion.properties")
public class ConfiguracionValores {

    @Value("${valor1:No existe el valor 1}")
    private String valor1;

    @Value("${valor2:No existe el valor 2}")
    private String valor2;

    public String getVar1() {
        return valor1;
    }

    public void setVar1(String var1) {
        this.valor1 = var1;
    }

    public String getVar2() {
        return valor2;
    }

    public void setVar2(String var2) {
        this.valor2 = var2;
    }

    @Override
    public String toString() {
        return "PropiedadesVar{" +
                "var1='" + valor1 + '\'' +
                ", var2='" + valor2 + '\'' +
                '}';
    }
}
