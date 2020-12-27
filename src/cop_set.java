import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import javax.swing.AbstractButton;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JCheckBox;

public class cop_set extends JDialog {
    static boolean chang=Aplication.size;
    static JLabel tex;
	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			cop_set dialog = new cop_set();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public cop_set() {
		setBackground(SystemColor.window);
		setForeground(SystemColor.window);
		setIconImage(Toolkit.getDefaultToolkit().getImage(cop_set.class.getResource("/sync/icons/filter-tool-black-shape.png")));
		setBounds(100, 100, 713, 523);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(SystemColor.desktop);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		
		JButton btnNewButton = new JButton("Date du fichier");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(SystemColor.window);
		btnNewButton.setBounds(57, 311, 174, 38);
		btnNewButton.setToolTipText("reconna\u00EEtre les fichiers identiques \u00E0 l'aide leur date");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AbstractButton size = null;
				AbstractButton date = null;
				if(!chang){
					size.setEnabled(true);
					date.setEnabled(false);
					tex.setText("Reconnaître les fichiers identiques à l'aide de leur taille.");
				}
				else{
					size.setEnabled(false);
					date.setEnabled(true);
					tex.setText("Reconnaître les fichiers identiques à l'aide de leur date.");
	
				}
				chang=!chang;
			}
		});
		
		JLabel lblChoisirUneVariante = new JLabel("Choisir une variante :");
		lblChoisirUneVariante.setForeground(Color.BLACK);
		lblChoisirUneVariante.setBackground(Color.WHITE);
		lblChoisirUneVariante.setBounds(202, 16, 367, 40);
		lblChoisirUneVariante.setFont(new Font("Sitka Display", Font.BOLD, 23));
		
		final JLabel date = new JLabel("");
		date.setBounds(26, 49, 296, 241);
		date.setIcon(new ImageIcon("C:\\Users\\AMEL\\Desktop\\abc(1).jfif"));
		date.setEnabled(!chang);
		
		final JLabel size = new JLabel("");
		size.setBounds(361, 56, 296, 222);
		size.setIcon(new ImageIcon("C:\\Users\\AMEL\\Desktop\\71C9sxUJXML._AC_SX425_.jpg"));
		btnNewButton.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.ITALIC, 15));
		
		JButton btnTailleDuFichier = new JButton("Taille du fichier");
		btnTailleDuFichier.setBackground(SystemColor.window);
		btnTailleDuFichier.setBounds(435, 313, 174, 34);
		btnTailleDuFichier.setToolTipText("reconna\u00EEtre les fichiers identiques \u00E0 l'aide leur taille");
		btnTailleDuFichier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!chang){
					size.setEnabled(true);
					date.setEnabled(false);
					tex.setText("Reconnaître les fichiers identiques à l'aide de leur taille.");
				}
				else{
					size.setEnabled(false);
					date.setEnabled(true);
					tex.setText("Reconnaître les fichiers identiques à l'aide de leur date.");
				}
				chang=!chang;
			}
		});
		btnTailleDuFichier.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.ITALIC, 15));
		
	   tex = new JLabel("Reconna\u00EEtre les fichiers identiques \u00E0 l'aide de leur taille et de leur date.");
	   tex.setBackground(Color.WHITE);
	   tex.setForeground(Color.BLACK);
	   tex.setBounds(26, 360, 631, 40);
	   tex.setFont(new Font("Sitka Display", Font.BOLD, 17));
	   contentPanel.setLayout(null);
	   contentPanel.add(lblChoisirUneVariante);
	   contentPanel.add(date);
	   contentPanel.add(size);
	   contentPanel.add(btnNewButton);
	   contentPanel.add(btnTailleDuFichier);
	   contentPanel.add(tex);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(SystemColor.window);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setFont(new Font("Snap ITC", Font.PLAIN, 12));
				okButton.setForeground(SystemColor.window);
				okButton.setBackground(SystemColor.desktop);
				okButton.setToolTipText("Confirmation");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Aplication.size=size.isEnabled();
					
						dispose();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setForeground(SystemColor.window);
				cancelButton.setBackground(SystemColor.desktop);
				cancelButton.setFont(new Font("Snap ITC", Font.PLAIN, 12));
				cancelButton.setToolTipText("Annulation");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				buttonPane.add(cancelButton);
			}
		}
	}
}
