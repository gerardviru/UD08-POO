package UD08;

public class Electrodomestico {

	// Constantes

	protected final static double PRECIO_BASE_DEF = 100;

	protected final static String COLOR_DEF = "blanco";

	protected final static char CONSUMO_ENERGETICO_DEF = 'F';

	protected final static double PESO_DEF = 5;

	// Atributos

	protected double precioBase;

	protected String color;

	protected char consumoEnergetico;

	protected double peso;

	// Constructores

	public Electrodomestico() {
		this.precioBase = PRECIO_BASE_DEF;
		this.color = COLOR_DEF;
		this.consumoEnergetico = CONSUMO_ENERGETICO_DEF;
		this.peso = PESO_DEF;
	}
	
	public Electrodomestico(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.color = COLOR_DEF;
		this.consumoEnergetico = CONSUMO_ENERGETICO_DEF;
		this.peso = peso;
	}

	public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
		this.precioBase = precioBase;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
	}

	/* Métodos Getters Setters */
	
	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public void setConsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public static double getPrecioBaseDef() {
		return PRECIO_BASE_DEF;
	}

	public static String getColorDef() {
		return COLOR_DEF;
	}

	public static char getConsumoEnergeticoDef() {
		return CONSUMO_ENERGETICO_DEF;
	}

	public static double getPesoDef() {
		return PESO_DEF;
	}

	/*Método que comprobara los colores disponibles */
	
	private void coloresDisponibles(String color){
		   
        //Colores disponibles
        String colores[]={"blanco", "negro", "rojo", "azul", "gris"};
        boolean encontrado=false;
  
        for(int i=0;i<colores.length && !encontrado;i++){
              
            if(colores[i].equals(color)){
                encontrado=true;
            }
              
        }
          
        if(encontrado){
            this.color=color;
        }else{
            this.color=COLOR_DEF;
        }
          
          
    }
	
}
