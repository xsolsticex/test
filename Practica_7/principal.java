package Practica_7;

public class principal {

    //Crear clase alumno (numero de matricula,nombre,lista de notas)
    //constructores y metodo para añadir notas de manera individual
    // Crear clase notas con una lista de 100 alumnos

    //metodo introducir notas: pedir numero de matricula de cada alumno
    // pedir nombre y notas (introducir notas hasta meter un negativo)

    //mostrar la media de notas del alumno y pedir datos del siguiente
    // seran datos para instanciar a alumno

    //seguir introduciendo alumnos hasta que el numero de matricula sea 0 
    // o llegue al limite
    
    public static void main(String[] args) {


        for (int i = 0; i < args.length; i++) {
            Notas notas = new Notas();
            Alumno al = notas.altaAlumno();
            
        }
        
           
            
            
            

        
        
    }
}
