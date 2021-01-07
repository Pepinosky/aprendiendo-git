package intro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Persona {
	private String nombre, nombre2, apellido;
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader entrada = new BufferedReader(isr);
	
	public Persona() throws IOException {		
		String nombre= entrada.readLine();
		String apellido= entrada.readLine();
		this.nombre = nombre;
		this.apellido = apellido;
	}



}
