import java.awt.EventQueue;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JComboBox;

import java.awt.BorderLayout;


import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;

import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.Choice;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;


public class Formulario {

	
	public Dados country;
	public Dados state;
	public Dados city;
	public Dados CEP;
	public Dados addres2;
	public Dados addres1;
	public Dados phone;
	public Dados CPF;
	public Dados email;
	public Dados nascimento;
	public Dados firstname;
	public Dados lastname;
	private JFrame frame;
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JTextField txtDataDeNascimento;
	private JTextField txtEmail;
	private JTextField txtCpf;
	private JTextField txtPhone;
	private JTextField txtAddres;
	private JTextField txtAddres_1;
	private JTextField txtCep;
	private JTextField txtCity;
	private JTextField txtState;
	private JTextField txtCountry;
	private JButton btnEnviar;
	private JTextField tf_firstname;
	private JTextField tf_lastname;
	private JLabel lblLastName;
	private JTextField tf_nascimento;
	private JTextField tf_email;
	private JLabel lblEmail;
	private JTextField tf_CPF;
	private JLabel lblCpf;
	private JLabel lblPhone;
	private JTextField tf_phone;
	private JLabel lblAddres;
	private JTextField tf_Addres1;
	private JLabel lblAddres_1;
	private JTextField tf_Addres2;
	private JLabel lblCep;
	private JTextField tf_CEP;
	private JLabel lblCity;
	private JTextField tf_city;
	private JLabel lblState;
	private JTextField tf_state;
	private JLabel lblCountry;
	private JTextField tf_country;
	private JComboBox comboBox;
	private JLabel lblDataDeNascimento;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario window = new Formulario();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Formulario() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 937);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		tf_firstname = new JTextField();
		tf_firstname.setBounds(12, 139, 200, 28);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(tf_firstname);
		tf_firstname.setColumns(10);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setBounds(12, 119, 83, 16);
		frame.getContentPane().add(lblFirstName);
		
		tf_lastname = new JTextField();
		tf_lastname.setBounds(12, 195, 200, 28);
		tf_lastname.setColumns(10);
		frame.getContentPane().add(tf_lastname);
		
		lblLastName = new JLabel("Last Name");
		lblLastName.setBounds(12, 175, 83, 16);
		frame.getContentPane().add(lblLastName);
		
		tf_nascimento = new JTextField();
		tf_nascimento.setBounds(12, 249, 200, 28);
		tf_nascimento.setColumns(10);
		frame.getContentPane().add(tf_nascimento);
		
		tf_email = new JTextField();
		tf_email.setBounds(12, 303, 200, 28);
		tf_email.setColumns(10);
		frame.getContentPane().add(tf_email);
		
		lblEmail = new JLabel("Email");
		lblEmail.setBounds(12, 283, 83, 16);
		frame.getContentPane().add(lblEmail);
		
		tf_CPF = new JTextField();
		tf_CPF.setBounds(12, 357, 200, 28);
		tf_CPF.setColumns(10);
		frame.getContentPane().add(tf_CPF);
		
		lblCpf = new JLabel("CPF");
		lblCpf.setBounds(12, 337, 83, 16);
		frame.getContentPane().add(lblCpf);
		
		lblPhone = new JLabel("Phone");
		lblPhone.setBounds(12, 391, 83, 16);
		frame.getContentPane().add(lblPhone);
		
		tf_phone = new JTextField();
		tf_phone.setBounds(12, 411, 200, 28);
		tf_phone.setColumns(10);
		frame.getContentPane().add(tf_phone);
		
		lblAddres = new JLabel("Addres 1");
		lblAddres.setBounds(12, 445, 83, 16);
		frame.getContentPane().add(lblAddres);
		
		tf_Addres1 = new JTextField();
		tf_Addres1.setBounds(12, 465, 200, 28);
		tf_Addres1.setColumns(10);
		frame.getContentPane().add(tf_Addres1);
		
		lblAddres_1 = new JLabel("Addres 2");
		lblAddres_1.setBounds(12, 499, 83, 16);
		frame.getContentPane().add(lblAddres_1);
		
		tf_Addres2 = new JTextField();
		tf_Addres2.setBounds(12, 519, 200, 28);
		tf_Addres2.setColumns(10);
		frame.getContentPane().add(tf_Addres2);
		
		lblCep = new JLabel("CEP");
		lblCep.setBounds(12, 553, 83, 16);
		frame.getContentPane().add(lblCep);
		
		tf_CEP = new JTextField();
		tf_CEP.setBounds(12, 573, 200, 28);
		tf_CEP.setColumns(10);
		frame.getContentPane().add(tf_CEP);
		
		lblCity = new JLabel("City");
		lblCity.setBounds(12, 607, 83, 16);
		frame.getContentPane().add(lblCity);
		
		tf_city = new JTextField();
		tf_city.setBounds(12, 627, 200, 28);
		tf_city.setColumns(10);
		frame.getContentPane().add(tf_city);
		
		lblState = new JLabel("State");
		lblState.setBounds(12, 661, 83, 16);
		frame.getContentPane().add(lblState);
		
		tf_state = new JTextField();
		tf_state.setBounds(12, 681, 200, 28);
		tf_state.setColumns(10);
		frame.getContentPane().add(tf_state);
		
		lblCountry = new JLabel("Country");
		lblCountry.setBounds(12, 715, 83, 16);
		frame.getContentPane().add(lblCountry);
		
		tf_country = new JTextField();
		tf_country.setBounds(12, 735, 200, 28);
		tf_country.setColumns(10);
		frame.getContentPane().add(tf_country);
		
		JLabel lblTitle = new JLabel("Title");
		lblTitle.setBounds(12, 58, 83, 16);
		frame.getContentPane().add(lblTitle);
		
		JButton btnNewButton = new JButton("Enviar");
		btnNewButton.setBounds(128, 801, 191, 52);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//contentPane.setVisible(false);
				Print printForm = new Print();
				printForm.titleLabel.setText((String) comboBox.getSelectedItem());
				printForm.firstNameLabel.setText(tf_firstname.getText());
				printForm.lastNameLabel.setText(tf_lastname.getText());
				printForm.nascimentoLabel.setText(tf_nascimento.getText());
				printForm.emailLabel.setText(tf_email.getText());
				printForm.cpfLabel.setText(tf_CPF.getText());
				printForm.phoneLabel.setText(tf_phone.getText());
				printForm.addres1Label.setText(tf_Addres1.getText());
				printForm.addres2Label.setText(tf_Addres2.getText());
				printForm.cepLabel.setText(tf_CEP.getText());
				printForm.cityLabel.setText(tf_city.getText());
				printForm.stateLabel.setText(tf_state.getText());
				printForm.countryLabel.setText(tf_country.getText());
					
				//printForm.contentPane.setVisible(true);				
				printForm.show();	
				
			}
		});
		frame.getContentPane().add(btnNewButton);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Mr.", "Mrs.", "Miss.", "Ms.", "Dr.", "Other"}));
		comboBox.setToolTipText("");
		comboBox.setBounds(12, 84, 83, 22);
		frame.getContentPane().add(comboBox);
		
		lblDataDeNascimento = new JLabel("Data de nascimento DD/MM/AAAA");
		lblDataDeNascimento.setBounds(12, 225, 200, 16);
		frame.getContentPane().add(lblDataDeNascimento);
		
	
	}
		
	}
    

