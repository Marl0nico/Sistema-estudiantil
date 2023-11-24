public class Sistema {
    public String nombre;
    public String materia;
    public float nota;

    public Sistema(String nombre, String materia, float nota) {
        this.nombre = nombre;
        this.materia = materia;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }
    public void mostrarDatos(){
        System.out.println("Nombre:"+getNombre()+"  Materia:"+getMateria()+"    Nota:"+getNota());
    }
}
