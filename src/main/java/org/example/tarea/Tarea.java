package org.example.tarea;

public class Tarea {
    private String nombre;
    private boolean completada;

    public Tarea(String nombre) {
        this.nombre = nombre;
        this.completada = false;
    }

    public String getNombre() { return nombre; }
    public boolean isCompletada() { return completada; }
    public void setCompletada(boolean completada) { this.completada = completada; }

    @Override
    public String toString() {
        // Esto es lo que se verá en la lista
        return (completada ? "[✔] " : "[ ] ") + nombre;
    }
}