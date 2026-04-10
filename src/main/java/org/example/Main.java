package org.example;

import com.formdev.flatlaf.FlatIntelliJLaf; // El estilo "Light" moderno
import org.example.controladorTarea.ControladorTarea;
import org.example.vistaTarea.VistaTarea;
import javax.swing.UIManager;

public class Main {
    public static void main(String[] args) {
        try {
            // Esto hace que los botones se vean redondeados y lindos
            UIManager.setLookAndFeel(new FlatIntelliJLaf());
        } catch (Exception e) {
            // Si falla FlatLaf, usamos el del sistema
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception ignored) {}
        }

        javax.swing.SwingUtilities.invokeLater(() -> {
            VistaTarea vista = new VistaTarea();
            new ControladorTarea(vista); // Pasamos la vista al controlador
            vista.setVisible(true);
        });
    }
}