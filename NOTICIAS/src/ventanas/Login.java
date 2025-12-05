package ventanas;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class Login {

	private JFrame frame;
	private JTextField textUsuario;
	private JPasswordField fieldContraseña;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login ventanaLogin = new Login();
					ventanaLogin.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		
		JLabel lblTitulo = new JLabel("INICIO SESION");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTitulo.setBounds(148, 24, 200, 20);
		frame.getContentPane().add(lblTitulo);
		
		
		JLabel lblUser = new JLabel("Usuario");
		lblUser.setBounds(50, 80, 80, 14);
		lblUser.setFont(new Font("Tahoma", Font.BOLD, 16));
		frame.getContentPane().add(lblUser);
		
		textUsuario = new JTextField(""); 
		textUsuario.setBounds(50, 100, 91, 20);
		frame.getContentPane().add(textUsuario);
		
		
		JLabel lblPass = new JLabel("Contraseña");
		lblPass.setBounds(50, 126, 138, 36);
		lblPass.setFont(new Font("Tahoma", Font.BOLD, 16));
		frame.getContentPane().add(lblPass);
		
		
		fieldContraseña = new JPasswordField();
		fieldContraseña.setBounds(50,163,91,20);
		frame.getContentPane().add(fieldContraseña);
		
		
		JCheckBox chckbxVerPass = new JCheckBox("Ver Contraseña");
		chckbxVerPass.setBounds(142, 162, 132, 23);
		frame.getContentPane().add(chckbxVerPass);
		
				
		chckbxVerPass.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		
			
		
		
		
		
		
		//boton entrar(valido login)
		
	}
}