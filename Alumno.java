import java.util.ArrayList;

public class Alumno {
    String nombre;
    ArrayList<Integer> numerosAPracticar;

    public Alumno(String nombre, ArrayList<Integer> numerosAPracticar) {
        this.nombre = nombre;
        this.numerosAPracticar = numerosAPracticar;
    }

    public static ArrayList<Alumno> crearAlumnosDePrueba(){
        ArrayList<Alumno> alumnos = new ArrayList<Alumno>();

        ArrayList<Integer> numerosPedro= new ArrayList<Integer>();
        numerosPedro.add(7);
        numerosPedro.add(8);
        numerosPedro.add(9);
        alumnos.add(new Alumno("Pedro", numerosPedro));

        ArrayList<Integer> numerosMarina= new ArrayList<Integer>();
        numerosMarina.add(2);
        numerosMarina.add(5);
        numerosMarina.add(6);
        alumnos.add(new Alumno("Marina", numerosMarina));

        ArrayList<Integer> numerosCarlota= new ArrayList<Integer>();
        numerosCarlota.add(3);
        numerosCarlota.add(6);
        alumnos.add(new Alumno("Carlota", numerosCarlota));

        ArrayList<Integer> numerosFrancisco= new ArrayList<Integer>();
        numerosFrancisco.add(7);
        alumnos.add(new Alumno("Francisco", numerosFrancisco));

        return alumnos;
    }
    public String getNombre() {
        return nombre;
    }

    public ArrayList<Integer> getNumerosAPracticar() {
        return numerosAPracticar;
    }
}
