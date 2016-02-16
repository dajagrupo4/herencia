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
public class Asignatura implements Matriculable{
    
    private int numHoras;
    private String nombre;

    public Asignatura(int numHoras, String nombre) {
        this.numHoras = numHoras;
        this.nombre = nombre;
    }
    
    public int numeroHoras(){
        return numHoras;
    }
    
    public String getNombre(){
        return nombre;
    }
    
}
