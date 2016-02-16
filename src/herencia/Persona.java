/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *Almacena los datos de una persona en el IES @see www.iesfranciscodelosrios.es
 * @author David Mateo
 * @version 1.0
 * 
 */
public abstract class  Persona {
    private String nombre;
    private String apellidos;
    private String direccion;
    private int edad;

   /**
    * Contructor por defecto. 
    */
    public Persona() {
        this.nombre = null;
        this.apellidos = null;
        this.edad = 0;
        this.direccion = null;
    }

    /**
     * Crea un objeto persona con los datos pasados como parámetro
     * @param nombre El nombre de la persona a crear
     * @param apellidos
     * @param direccion
     * @param edad 
     */
    public Persona(String nombre, String apellidos, String direccion, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.edad = edad;
    }
    
/**
 *  Devuelve el nombre de una persona
 * @return nombre de la persona
 */
    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
/**
 * 
 * @param apellidos 
 */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     *  Cambia la edad de un apersona
     * @param edad Nueva edad
     * @throws IllegalArgumentException en caso de que la edad sea negativa o mayor que 120 
     */
    public void setEdad(int edad) throws IllegalArgumentException {
        if(edad <0|| edad >120) throw new IllegalArgumentException("Edad incorrecta");
        this.edad = edad;
    }
    
    @Override
    public String toString(){ //Devuelve los datos del objeto como cadena
        return "Nombre:"+getNombre()+" Apellidos:"+getApellidos()+" Direccion:"+getDireccion()+" Edad: "+getEdad();
    }
    
        
 
            
    /*
    public static void main(String [] args){
        
        Persona p = new Persona("Antonio", "Jumenez", "C/ ancha 3", 23);
        
        System.out.println(p);
    }
    */

    int horasEnCentro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
