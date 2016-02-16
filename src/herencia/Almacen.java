/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import java.util.ArrayList;

/**
 *
 * @author javila
 */
public class Almacen {
    
    private ArrayList<Profesor> listaDeProfesores;
    private ArrayList<Alumno> ListaDeAlumnos;
    public Almacen(){
        listaDeProfesores = new ArrayList<Profesor>();
        ListaDeAlumnos = new ArrayList<Alumno>();
    }
    
    public void guardarAlumno(Alumno alum){
    ListaDeAlumnos.add(alum);
    }
    
    public void guardaProfesor(Profesor profe){
        listaDeProfesores.add(profe);
    }
    
      public void borrarProfesor(int id){
        listaDeProfesores.remove(id);    
    }
      
      public void borrarAlumno(int id){
        ListaDeAlumnos.remove(id);    
    }
    public Profesor obtenerProfesor(int i){
        return listaDeProfesores.get(i);    
    }
    public Alumno obtenerAlumno(int i){
        return ListaDeAlumnos.get(i);
    }
    
    public Profesor[] listarProfesores(){
        Profesor p[] = new Profesor[listaDeProfesores.size()];
        
        for(int i =0 ;i<listaDeProfesores.size();i++) {
            p[i]= listaDeProfesores.get(i);
        }
            return p;
    }
    
        public Alumno[] listarAlumnos(){
        Alumno a[] = new Alumno[ListaDeAlumnos.size()];
        
        for(int i =0 ;i<ListaDeAlumnos.size();i++) {
            a[i]= ListaDeAlumnos.get(i);
        }
            return a;
    }
         
}
