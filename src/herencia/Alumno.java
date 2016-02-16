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
public class Alumno extends Persona {

    private String curso;
    private int identificador1;

    public Alumno(String nombre, String apellidos, String direccion, int edad, String curso, int identificador1) {

        super(nombre, apellidos, direccion, edad);//lama al constructor de la superclase
        this.curso = curso;
        this.identificador1= identificador1;

        //setNombre(nombre);
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    public int getIdentificador1() {
        return identificador1;
    }

    public void setIdentificador1(int identificador1) {
        this.identificador1 = identificador1;
    }
    
    @Override
    public String toString() {
        return super.toString() + " Curso:" + getCurso() + " ID: "+getIdentificador1()+ "\n";
    }

    @Override
    public int horasEnCentro() {
        return 30;
    }

}
