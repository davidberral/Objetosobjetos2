package gestion;

public class Persona {
	
	// estado del objeto
	String nombre;
	private String apellidos;
	private int edad;
	private String sexo; // Hombre o Mujer //
	private double peso;
	private double altura;
	
	public Persona() {
		edad=0;
		nombre="no inicializado";
		
	}
	// Voy a construir otro constructor con el mismo nombre que el anterior pero con 
	// distinto método tiene otras variables o atributos : esto se llama "sobrecarga" 
	
	/**
	 * Constructo de la clase que crea una persona dad su nombre y apellidos
	 * @param n String nombre de la persona
	 * @param a String apellidos de la persona
	 */
	
	public Persona(String n, String a) {
		nombre=n;
		apellidos=a;
				
	}


	public Persona(String nombre, String apellidos, int edad, String sexo, double peso, double altura) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}
	
	public Persona (Persona p) {
		this.nombre=p.nombre;
		this.apellidos=p.apellidos;
		this.edad=p.edad;
		this.peso=p.peso;
		this.sexo=p.sexo;
		this.altura=p.altura;
				
	}
	
	public void mostrar() {
		System.out.println("Nombre: "+nombre);
		System.out.println("Apellidos: "+apellidos);
		System.out.println("Edad: "+ this.edad);
		System.out.println("Altura: "+ this.altura);
		System.out.println("Peso: "+this.peso);
		
	}
	
	public int getEdad() {
		return this.edad;
		
	}
	
	/** Método de la clase que establece la edad de la persona
	 * si la edad es negativa la edad no se actualiza.
	 * @param edad int con el valor nuevo de edad
	 */

	public void setEdad(int edad) {
		if (edad>=0) {
			this.edad=edad;
		}
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
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
	
	public boolean esMayorDeEdad() {
		if (this.edad<=18) {
			return true;
			
		}
		return false;
		//return edad>=18;
	}
	
	public double calculaIMC() {
		return peso/Math.pow(altura/100,2);
	}
	
	public String estadoPeso() {
		if (this.calculaIMC() <20) {
			return "Peso Bajo";
		} else if(this.calculaIMC()<=20 && this.calculaIMC()<=25 ) {
			return "Peso ideal";
		} else {
			return "Sobrepeso";
		}
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", sexo=" + sexo
				+ ", peso=" + peso + ", altura=" + altura + "]";
	}		
	
	/**public String estadoPeso() {
		if (this.calculaIMC() <20) {
			return "Peso Bajo";
		} else if(this.calculaIMC()<=20 && this.calculaIMC()<=25 ) {
			return "Peso ideal";
		} else {
			return "Sobrepeso";*/
	
	
	}



