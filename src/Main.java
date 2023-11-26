import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*****Bienvenido*****");
        Sistema[] estudiantes = new Sistema[4];
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println("Ingrese los datos del estudiante " + (i + 1));
            System.out.print("Nombre: ");
            String nombre = scanner.next();
            System.out.print("Materia: ");
            String materia = scanner.next();
            System.out.print("Nota: ");
            double nota = scanner.nextDouble();

            estudiantes[i] = new Sistema(nombre, materia, nota);
        }
        //Calcular promedio y Verificar si paso
        for (Sistema estudiante : estudiantes) {
            estudiante.mostrarDatos();
            System.out.println("Promedio: " + estudiante.getNota());

            if (estudiante.getNota() > 7) {
                System.out.println("El estudiante ha pasado.");
            } else {
                System.out.println("El estudiante no ha pasado.");
            }

            System.out.println();
        }

    }
}