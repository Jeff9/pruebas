package tutorialGUI;
import java.awt.FlowLayout;
import java.awt.event.*;

import javax.swing.*;

public class VentanaPrincipal extends JFrame implements ActionListener {
	
	private JButton jbtn_boton;
	private JTextField jtxt_texto;
	private JLabel jlbl_label;
	
	public VentanaPrincipal(){
		super("Mi Primer GUI");
		
		this.definirVentana();
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		
		this.setSize(400,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public void definirVentana(){
		this.setLayout(new FlowLayout());
		jbtn_boton = new JButton("Enviar");
		jtxt_texto = new JTextField(20);
		jlbl_label = new JLabel("Comando");
		
		this.add(jtxt_texto);
		this.add(jbtn_boton);
		this.add(jlbl_label);
		
		jbtn_boton.addActionListener(this);
	}


	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==jbtn_boton){
			jlbl_label.setText(jtxt_texto.getText());
		}
		
	}

}
