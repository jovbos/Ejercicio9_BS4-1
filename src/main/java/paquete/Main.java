package paquete;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import javax.naming.ldap.ControlFactory;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

	@Autowired
	ConfiguracionValores configuracionValores;

	@PostConstruct
	public void mostrarValores () {
		String var1 = configuracionValores.getVar1();
		String var2 = configuracionValores.getVar2();
		System.out.println("El valor 1 es: " + var1 + "\nEl valor 2 es: " + var2);
	}

}
