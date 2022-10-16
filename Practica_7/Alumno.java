package Practica_7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Alumno {



    private int numeroMatricula;
    private String nombre;
    private List<Integer> notas;

    public Alumno(){
        this.notas = new ArrayList<>(8);

    }

    public void insertarNota(int nota) throws ExceptionAlumno{
        if(nota > 10){
            throw new ExceptionAlumno("Nota no valida");

        }
        notas.add(nota);
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) throws ExceptionAlumno {
        Scanner in = new Scanner(System.in);
        if(numeroMatricula<1 || numeroMatricula>10000){
            
            throw new ExceptionAlumno("Matricula no valida");
            
        }
        this.numeroMatricula = numeroMatricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws ExceptionAlumno {
        
        if(!verificaNombre(nombre)){
            throw new ExceptionAlumno("El nombre introducido no es valido");
        }
        this.nombre = nombre;
    }

    public boolean verificaNombre(String nombre){
        for (int i = 0; i <nombre.length(); i++) {
            if(Character.isDigit(nombre.charAt(i))){
                return false;
            }
        }
        return true;

    }

    public List<Integer> getNotas() {
        return notas;
    }


    @Override
    public String toString() {
        return "Alumno [numeroMatricula=" + numeroMatricula + ", nombre=" + nombre + ", notas=" + notas + "]";
    }

    
    


}
