package Practica_7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Notas {

    private List<Alumno> alumnos;

    public Notas() {
        this.alumnos = new ArrayList<>(100);

    }

    public Alumno altaAlumno() {
        int numeroMatricula;
        Alumno al = null;
        Scanner in = new Scanner(System.in);
        boolean continua = true;

        try {

            do {

                try {
                    System.out.println("Numero matricula: ");
                    numeroMatricula = Integer.parseInt(in.next());
                    continua = false;
                    if (numeroMatricula != 0 && alumnos.size() < 100) {
                        al = new Alumno();
                        al.setNumeroMatricula(numeroMatricula);
                        System.out.println("Nombre: ");
                        String nombre = in.next();

                        al.setNombre(nombre);
                    }

                } catch (ExceptionAlumno e) {
                    continua = true;
                    System.out.println(e.getLocalizedMessage());

                } catch (NumberFormatException e) {
                    continua = true;
                    System.out.println("Valor introducido no valido");

                }
            } while (continua);

            do {
                System.out.println("Nota: ");
                int nota = Integer.parseInt(in.next());
                if (nota >= 0 && nota <= 10) {
                    al.insertarNota(nota);
                } else {
                    continua = true;
                }
            } while (!continua);
            
        } catch (ExceptionAlumno e) {
            continua = true;
            System.out.println(e.getMessage());

        }
        return al;

    }
}
