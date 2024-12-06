
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;

	/*
	 * Code adapted from a lesson on S-Logix on how to create a Login Form using Swing
	 * It has been copied somewhat from the sample code presented, then adapted so that
	 * it works with our simple specifications of allowing differentiation between a 
	 * user view and admin view. 
	 * Subtle tells show which view has been activated, with proper capitalization for user view, and none for admin view
	 */

	@SuppressWarnings("serial")
	public class login extends javax.swing.JFrame {
	
	private javax.swing.JButton jButton1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JPasswordField jPasswordField1;
	private javax.swing.JTextField jTextField1;	
		
	public login() {
	initComponents();
	}

	// //GEN-BEGIN:initComponents
	private void initComponents() {
	jLabel1 = new javax.swing.JLabel();
	jLabel2 = new javax.swing.JLabel();
	jLabel3 = new javax.swing.JLabel();
	jButton1 = new javax.swing.JButton();
	jTextField1 = new javax.swing.JTextField();
	jPasswordField1 = new javax.swing.JPasswordField();

	setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

	jLabel1.setText("Login Form");
	jLabel2.setText("UserName :");
	jLabel3.setText("Password :");

	jButton1.setText("Login");
	jButton1.addActionListener(new java.awt.event.ActionListener() {
	public void actionPerformed(java.awt.event.ActionEvent evt) {
	jButton1ActionPerformed(evt);
	}
	});

	javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	getContentPane().setLayout(layout);
	layout.setHorizontalGroup(
	layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	.addGroup(layout.createSequentialGroup()
	.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	.addGroup(layout.createSequentialGroup()
	.addGap(166, 166, 166)
	.addComponent(jLabel1))
	.addGroup(layout.createSequentialGroup()
	.addGap(38, 38, 38)
	.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	.addComponent(jLabel3)
	.addComponent(jLabel2))
	.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	.addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
	.addComponent(jPasswordField1)))
	.addGroup(layout.createSequentialGroup()
	.addGap(171, 171, 171)
	.addComponent(jButton1)))
	));
	layout.setVerticalGroup(
	layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	.addGroup(layout.createSequentialGroup()
	.addGap(29, 29, 29)
	.addComponent(jLabel1)
	.addGap(31, 31, 31)
	.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	.addComponent(jLabel2)
	.addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	.addGap(50, 50, 50)
	.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	.addComponent(jLabel3)
	.addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	.addGap(30, 30, 30)
	.addComponent(jButton1)
	.addContainerGap(39, Short.MAX_VALUE))
	);
	pack();
	}
	// //GEN-END:initComponents

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
	String userName = jTextField1.getText();
	String password = new String(jPasswordField1.getPassword());

	if (userName.equals("admin") && password.equals("1234")) {
	JOptionPane.showMessageDialog(this, "login successfuly");
	} else if (userName.equals("user") && password.equals("1234"))
		// Opens the program in admin/worker mode
	{
	JOptionPane.showMessageDialog(this, "Login Successfuly. Welcome");
		// Opens the program in user mode 
	} else {
	JOptionPane.showMessageDialog(this, "Invalid Credentials");
	}
	jTextField1.setText("");
	jPasswordField1.setText("");
	this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
	}

	public static void main(String args[]) {
	java.awt.EventQueue.invokeLater(() -> {
	new login().setVisible(true);
	});
	}
}
