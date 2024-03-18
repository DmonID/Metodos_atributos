public class Estudiante {
    private String nombre;
    private double[] calificaciones;

    public Estudiante(String nombre, double[] calificaciones) {
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }

    public double calcularPromedio() {
        double suma = 0;
        for (double calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma / calificaciones.length;
    }

    public char obtenerCalificacionFinal(double promedio) {
        if (promedio <= 50) return 'F';
        else if (promedio <= 60) return 'E';
        else if (promedio <= 70) return 'D';
        else if (promedio <= 80) return 'C';
        else if (promedio <= 90) return 'B';
        else return 'A';
    }

    public void imprimirResultados() {
        char calificacionFinal = obtenerCalificacionFinal(calcularPromedio());
        System.out.println("Nombre del estudiante: " + nombre);
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Calificación " + (i + 1) + ": " + calificaciones[i]);
        }
        System.out.println("Promedio: " + calcularPromedio());
        System.out.println("Calificación: " + calificacionFinal);
    }
}

public class Main {
    public static void main(String[] args) {
        double[] calificaciones = {70, 80, 90, 100, 85};
        Estudiante estudiante = new Estudiante("Fernando Gorostieta", calificaciones);
        estudiante.imprimirResultados();
    }
}
