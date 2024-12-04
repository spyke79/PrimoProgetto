package grafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class insUtenti extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtCognome;
	private JTextField txtEta;
	
	//Creo ogg Gestione DB
	private GestioneDB db = new GestioneDB();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					insUtenti frame = new insUtenti();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public insUtenti() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setBounds(6, 56, 102, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Creazione Nuovo Utente");
		lblNewLabel_1.setForeground(new Color(255, 38, 0));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		lblNewLabel_1.setBounds(6, 6, 438, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblCognome = new JLabel("Cognome");
		lblCognome.setBounds(6, 84, 102, 16);
		contentPane.add(lblCognome);
		
		JLabel lblEt = new JLabel("Età");
		lblEt.setBounds(6, 112, 102, 16);
		contentPane.add(lblEt);
		
		txtNome = new JTextField();
		txtNome.setBounds(120, 51, 204, 26);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtCognome = new JTextField();
		txtCognome.setColumns(10);
		txtCognome.setBounds(120, 79, 204, 26);
		contentPane.add(txtCognome);
		
		txtEta = new JTextField();
		txtEta.setColumns(10);
		txtEta.setBounds(120, 107, 204, 26);
		contentPane.add(txtEta);
		
		JLabel ris = new JLabel("");
		ris.setHorizontalAlignment(SwingConstants.CENTER);
		ris.setBounds(6, 184, 438, 16);
		contentPane.add(ris);
		
		//BTN INSERISCI
		JButton btnNewButton = new JButton("Inserisci Utente");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ris.setText(db.insUtente(txtNome.getText(),txtCognome.getText(),txtEta.getText()));
				txtNome.setText("");
				txtCognome.setText("");
				txtEta.setText("");
			}
		});
		btnNewButton.setBounds(130, 145, 174, 29);
		contentPane.add(btnNewButton);
	}
}
