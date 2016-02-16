/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author David Mateo
 */
public class InterfazUsuario extends Almacen {

    private static Almacen almacen;

    public static void main(String[] args) {

        almacen = new Almacen();
        Scanner sc = new Scanner(System.in);
        int opcion, edad, reduccion, identificador = 1, id, identificador1 = 1;
        String nombre, apellidos, direccion, especialidad, opcion1, curso;
        do {
            muestraMenu();
            do {
                System.out.println("Introduce una opcion");
                opcion = sc.nextInt();

            } while (opcion != 1 && opcion != 2 && opcion != 3 && opcion != 4 && opcion != 5 && opcion != 6 && opcion != 7);

            switch (opcion) {
                case 1:
                    do {
                        sc.nextLine(); //escaner para limpiar el buffer
                        //Alta de nuevo profesor
                        //Leer los datos del profesor por teclado
                        System.out.println("Introduce el nombre del profesor");
                        nombre = sc.nextLine();

                        System.out.println("Introduce los apellidos del profesor");
                        apellidos = sc.nextLine();

                        System.out.println("Introduce la direccion del profesor");
                        direccion = sc.nextLine();

                        System.out.println("Introduce la especialidad del profesor");
                        especialidad = sc.nextLine();

                        System.out.println("Introduce la edad del profesor");
                        edad = sc.nextInt();

                        System.out.println("Introduce la reduccion del profesor");
                        reduccion = sc.nextInt();
                        /*
                System.out.println("Nombre: " + nombre + " Apellido: " + apellidos + " Direccion: " + direccion + " Especialidad: " + especialidad + " Edad: " + edad + " Reduccion: " + reduccion); //sout para comprobar los valores
                         */
                        //Crearte el nuevo objeto profesor
                        Profesor p = new Profesor(nombre, apellidos, direccion, edad, especialidad, reduccion, identificador);

                        //Guardar el objeto en el almacen
                        almacen.guardaProfesor(p);

                        //Contador de profesores
                        System.out.println("¿Quieres introducir otro profesor? (Responde con si o no)");
                        opcion1 = sc.next();
                        identificador++;
                    } while (opcion1.compareTo("si") == 0);
                    break;
                case 2:
                    //Cargamos el arraylist
                    System.out.println(Arrays.toString(almacen.listarProfesores()));

                    break;
                case 3:
                    System.out.println(Arrays.toString(almacen.listarProfesores()));
                    System.out.println("Elige la id del profesor que quieras borrar");
                    id = sc.nextInt();
                    sc.nextLine();
                    almacen.borrarProfesor(id - 1);
                    System.out.println("El profesor ha sido eliminado correctamente");
                    break;
                case 4:
                    do {
                        //Introduccion de un nuevo alumno
                        sc.nextLine();

                        System.out.println("Introduce el nombre del alumno: ");
                        nombre = sc.nextLine();

                        System.out.println("Introduce los apellidos del alumno: ");
                        apellidos = sc.nextLine();

                        System.out.println("Introduce la direccion del alumno: ");
                        direccion = sc.nextLine();

                        System.out.println("Introduce la especialidad del alumno: ");
                        especialidad = sc.nextLine();

                        System.out.println("Introduce el curso del alumno: ");
                        curso = sc.nextLine();

                        System.out.println("Introduce la edad del alumno: ");
                        edad = sc.nextInt();

                        Alumno a = new Alumno(nombre, apellidos, direccion, edad, curso, identificador1);
                        almacen.guardarAlumno(a);

                        System.out.println("¿Quieres introducir otro alumno? (Responde con si o no)");
                        opcion1 = sc.next();
                        identificador1++;

                    } while (opcion1.compareTo("si") == 0);
                    break;
                case 5:
                    //Cargamos el arraylist
                    System.out.println(Arrays.toString(almacen.listarAlumnos()));
                    break;

                case 6:
                    System.out.println(Arrays.toString(almacen.listarAlumnos()));
                    System.out.println("Elige la id del alumno que quieras borrar");
                    id = sc.nextInt();
                    almacen.borrarAlumno(id - 1);
                    System.out.println("El alumno ha sido eliminado correctamente");
                    break;
            }

        } while (opcion != 7);
    }

    public static void muestraMenu() {
        System.out.println("1-Nuevo profesor");
        System.out.println("2-Listar profesor/es");
        System.out.println("3-Eliminar profesor");
        System.out.println("4-Nuevo alumno");
        System.out.println("5-Listar alumno/s");
        System.out.println("6-Eliminar alumno");
        System.out.println("7-Salir");
    }
}
