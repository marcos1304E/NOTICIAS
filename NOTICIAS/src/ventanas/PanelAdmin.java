package ventanas;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import modelo.Usuario;

public class PanelAdmin extends JPanel {

    private Usuario admin;

    public PanelAdmin(Usuario admin) {
        this.admin = admin;
        initialize();
    }

    private void initialize() {
        setLayout(null);
        setBounds(0, 0, 800, 500);
        
        JLabel textoRol = new JLabel("PANEL DE ADMINISTRADOR");
        textoRol.setForeground(Color.RED);
        textoRol.setFont(new Font("Tahoma", Font.BOLD, 14));
        textoRol.setBounds(50, 30, 300, 20);
        add(textoRol);
        
        JButton botonGestionUsuarios = new JButton("Gestión Usuarios");
        botonGestionUsuarios.setBounds(50, 80, 200, 40);
        add(botonGestionUsuarios);
        
        JButton botonTest = new JButton("Test Noticias / Email");
        botonTest.setBounds(50, 140, 200, 40);
        add(botonTest);
    }
}