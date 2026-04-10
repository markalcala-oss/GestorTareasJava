package org.example.controladorTarea;

import org.example.tarea.Tarea;
import org.example.vistaTarea.VistaTarea;
import javax.swing.*;

public class ControladorTarea {
    private VistaTarea vista;

    public ControladorTarea(VistaTarea vista) {
        this.vista = vista;

        // Asignar eventos a los botones
        this.vista.btnAgregar.addActionListener(e -> agregarTarea());
        this.vista.btnCompletar.addActionListener(e -> completarTarea());
        this.vista.btnEliminar.addActionListener(e -> eliminarTarea());
    }

    private void agregarTarea() {
        String texto = vista.txtTarea.getText().trim();
        if (texto.isEmpty()) {
            JOptionPane.showMessageDialog(vista, "¡Error! La tarea no puede estar vacía.");
            return;
        }
        vista.modeloLista.addElement(new Tarea(texto));
        vista.txtTarea.setText(""); // Limpiar campo
        actualizarContador();
    }

    private void completarTarea() {
        int index = vista.listaTareas.getSelectedIndex();
        if (index != -1) {
            Tarea seleccionada = vista.modeloLista.getElementAt(index);
            seleccionada.setCompletada(true);
            vista.listaTareas.repaint(); // Refrescar visualmente la lista
            JOptionPane.showMessageDialog(vista, "Tarea marcada como completada ✔");
        } else {
            JOptionPane.showMessageDialog(vista, "Selecciona una tarea primero.");
        }
    }

    private void eliminarTarea() {
        int index = vista.listaTareas.getSelectedIndex();
        if (index != -1) {
            vista.modeloLista.remove(index);
            actualizarContador();
        } else {
            JOptionPane.showMessageDialog(vista, "Selecciona qué tarea eliminar.");
        }
    }

    private void actualizarContador() {
        vista.lblContador.setText("Total: " + vista.modeloLista.getSize());
    }
}