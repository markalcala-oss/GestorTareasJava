package org.example.vistaTarea;

import org.example.tarea.Tarea;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class VistaTarea extends JFrame {
    public JTextField txtTarea = new JTextField(20);
    public JButton btnAgregar = new JButton("Agregar");
    public JButton btnEliminar = new JButton("Eliminar");
    public JButton btnCompletar = new JButton("Completar");
    public JList<Tarea> listaTareas = new JList<>();
    public DefaultListModel<Tarea> modeloLista = new DefaultListModel<>();
    public JLabel lblContador = new JLabel("Total: 0");

    public VistaTarea() {
        setTitle("✨ Gestor de Tareas ✨");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout(15, 15));

        // Un poquito de margen alrededor de la ventana
        ((JPanel)getContentPane()).setBorder(new EmptyBorder(10, 10, 10, 10));

        // --- ESTILO DE COLORES ---
        // Botón Agregar (Azul vibrante como la captura)
        btnAgregar.setBackground(new Color(70, 130, 180));
        btnAgregar.setForeground(Color.WHITE);
        btnAgregar.setFont(new Font("Segoe UI", Font.BOLD, 12));

        // Botón Completar (Verde éxito)
        btnCompletar.setBackground(new Color(40, 167, 69));
        btnCompletar.setForeground(Color.WHITE);

        // Botón Eliminar (Rojo peligro)
        btnEliminar.setBackground(new Color(220, 53, 69));
        btnEliminar.setForeground(Color.WHITE);

        // Personalizar la lista
        listaTareas.setFont(new Font("Segoe UI", Font.ITALIC, 14));
        listaTareas.setSelectionBackground(new Color(230, 230, 250)); // Moradito pastel al seleccionar

        // --- DISEÑO DE PANELES ---
        // Panel Superior
        JPanel pnlNorte = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        pnlNorte.add(new JLabel("📝 ¿Qué hay que hacer?:"));
        pnlNorte.add(txtTarea);
        pnlNorte.add(btnAgregar);

        // Centro
        listaTareas.setModel(modeloLista);
        JScrollPane scroll = new JScrollPane(listaTareas);
        scroll.setBorder(BorderFactory.createTitledBorder("Mis Tareas Pendientes"));

        // Panel Inferior
        JPanel pnlSur = new JPanel(new FlowLayout(FlowLayout.RIGHT, 10, 10));
        lblContador.setFont(new Font("Segoe UI", Font.BOLD, 13));
        pnlSur.add(lblContador);
        pnlSur.add(btnCompletar);
        pnlSur.add(btnEliminar);

        add(pnlNorte, BorderLayout.NORTH);
        add(scroll, BorderLayout.CENTER);
        add(pnlSur, BorderLayout.SOUTH);

        setSize(550, 450);
        setLocationRelativeTo(null);
    }
}