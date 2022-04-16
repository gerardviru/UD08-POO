package UD08;

public class Password {

	private final static int LONG_DEF = 8;

	/* Atributos */

	private int longitud;

	private String contra;

	/* Constructores */

	public Password() {
		this.longitud = LONG_DEF;
		this.contra = "";
	}

	public Password(int longitud, String contraseña) {
		this.longitud = LONG_DEF;
		this.contra = generaPassword();
	}
	
	/* Métodos Getters Setters */

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContra() {
		return contra;
	}

	public void setContra(String contra) {
		this.contra = contra;
	}

	public static int getLongDef() {
		return LONG_DEF;
	}

	/* Método que genera una contraseña recorriendo los 8 digitos que marca la constante Longitud
	 * A través de los caracteres char creamos los aleatorios para definir la contraseña */
	
	public String generaPassword() {
		String password = "";
		for (int i = 0; i < longitud; i++) {
			/*
			 * Generamos un numero aleatorio, segun este elige si añadir una minuscula,
			 * mayuscula o numero
			 */
			int eleccion = ((int) Math.floor(Math.random() * 3 + 1));

			if (eleccion == 1) {
				char minusculas = (char) ((int) Math.floor(Math.random() * (123 - 97) + 97));
				password += minusculas;
			} else {
				if (eleccion == 2) {
					char mayusculas = (char) ((int) Math.floor(Math.random() * (91 - 65) + 65));
					password += mayusculas;
				} else {
					char numeros = (char) ((int) Math.floor(Math.random() * (58 - 48) + 48));
					password += numeros;
				}
			}
		}
		return password;
	}
}
