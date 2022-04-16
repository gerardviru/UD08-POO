package UD08;

public class Serie {

	/* Constantes */

	private final static int NUM_TEMPORADAS_DEF = 3;

	/* Atributos */

	private String titulo;

	private int numeroTemporadas;

	private boolean entregado;

	private String genero;

	private String creador;

	/* Constructores */

	public Serie() {
		this.titulo = "";
		this.numeroTemporadas = NUM_TEMPORADAS_DEF;
		this.genero = "";
		this.creador = "";
		this.entregado = false;
	}

	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.creador = creador;
	}

	public Serie(String titulo, int numeroTemporadas, String genero, String creador) {
		this.titulo = titulo;
		this.numeroTemporadas = numeroTemporadas;
		this.genero = genero;
		this.creador = creador;
	}
	
	/* Métodos Getters Setters */
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumeroTemporadas() {
		return numeroTemporadas;
	}

	public void setNumeroTemporadas(int numeroTemporadas) {
		this.numeroTemporadas = numeroTemporadas;
	}

	public boolean isEntregado() {
		return entregado;
	}

	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	public static int getNumTemporadasDef() {
		return NUM_TEMPORADAS_DEF;
	}

}
