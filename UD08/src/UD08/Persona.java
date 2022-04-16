package UD08;

public class Persona {

	private final static char SEXO_DEF = 'H';

	// Atributos

	private String nombre;

	private int edad;

	private String DNI;

	private char sexo;

	private double peso;

	private double altura;

	/* Contructores */

	public Persona() {
		this.nombre = "";
		this.edad = 0;
		this.DNI = "";
		this.sexo = SEXO_DEF;
		this.peso = 0.0;
		this.altura = 0.0;
	}

	public Persona(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.DNI = "";
		this.sexo = SEXO_DEF;
		this.peso = 0.0;
		this.altura = 0.0;
	}

	public Persona(String nombre, int edad, String dNI, char sexo, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.DNI = dNI;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}

	/* Métodos Getters Setters */
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public static char getSexoDef() {
		return SEXO_DEF;
	}
}
