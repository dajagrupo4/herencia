/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author David Mateo
 */
public class Profesor extends Persona {

    private String especialidad;
    private int reduccion;
    private int identificador;

    public Profesor(String nombre, String apellidos, String direccion, int edad, String especialidad, int reduccion, int identificador) {
        super(nombre, apellidos, direccion, edad);
        this.especialidad = especialidad;
        this.reduccion = reduccion;
        this.identificador = identificador;
    }

    public int getReduccion() {
        return reduccion;
    }

    public void setReduccion(int reduccion) {
        this.reduccion = reduccion;
    }
    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {

        return super.toString() + " Especialidad: " + getEspecialidad() + " Reduccion: " +getReduccion()+ "ID: "+getIdentificador()+ "\n";
    }

    @Override
    public int horasEnCentro() {
        return 25 - reduccion;
    }

}
