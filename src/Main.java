import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("*****Bienvenido*****");
        System.out.println(" --- Ingreso de datos de los estudiantes --- ");
        String e1, e2, e3, e4;//estudiantes
        double n1, n2, n3, n4;//notas
        String m1, m2, m3, m4;//materias
        Scanner datos=new Scanner(System.in);
        System.out.println("Estudiante 1");
        System.out.print("Nombre:");
        e1=datos.next();
        System.out.print("Materia:");
        m1=datos.next();
        System.out.print("Nota:");
        n1=datos.nextDouble();
        System.out.println("Estudiante 2");
        System.out.print("Nombre:");
        e2=datos.next();
        System.out.print("Materia:");
        m2=datos.next();
        System.out.print("Nota:");
        n2=datos.nextDouble();
        System.out.println("Estudiante 3");
        System.out.print("Nombre:");
        e3=datos.next();
        System.out.print("Materia:");
        m3=datos.next();
        System.out.print("Nota:");
        n3=datos.nextDouble();
        System.out.println("Estudiante 4");
        System.out.print("Nombre:");
        e4=datos.next();
        System.out.print("Materia:");
        m4=datos.next();
        System.out.print("Nota:");
        n4=datos.nextDouble();
        Sistema estudiante1=new Sistema(e1, m1, n1);
        Sistema estudiante2=new Sistema(e2, m2, n2);
        Sistema estudiante3=new Sistema(e3, m3, n3);
        Sistema estudiante4=new Sistema(e4, m4, n4);
        estudiante1.mostrarDatos();
        estudiante2.mostrarDatos();
        estudiante3.mostrarDatos();
        estudiante4.mostrarDatos();
        double promedio=(estudiante1.getNota()+estudiante2.getNota()+estudiante3.getNota()+estudiante4.getNota())/4;
        System.out.print("El promedio del curso es: "+ promedio);
    }
}