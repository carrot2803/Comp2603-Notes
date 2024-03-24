public class PaymentPortal extends javax.swing.JFrame {

	/**
	 * Creates new form PaymentPortal
	 */
	private PaymentSystem paymentSystem;

	public PaymentPortal() {
		initComponents();
		billPanel.setVisible(false);
		setSize(386, 350);
	}

	public PaymentPortal(PaymentSystem paymentSystem) {
		this();
		this.paymentSystem = paymentSystem;
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	// edited by carrot
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		mainLabel = new javax.swing.JLabel();
		logonPanel = new javax.swing.JPanel();
		userNameField = new javax.swing.JTextField();
		usernameLabel = new javax.swing.JLabel();
		passwordLabel = new javax.swing.JLabel();
		passwordField = new javax.swing.JTextField();
		registerButton = new javax.swing.JButton();
		logonButton = new javax.swing.JButton();
		clearButton = new javax.swing.JButton();
		logonPanelLabel = new javax.swing.JLabel();
		billPanel = new javax.swing.JPanel();
		jScrollPane1 = new javax.swing.JScrollPane();
		billJList = new javax.swing.JList<>();
		billLabel = new javax.swing.JLabel();
		sortByAmountButton = new javax.swing.JButton();
		logoutButton = new javax.swing.JButton();
		sortByPaidButton = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		mainLabel.setText("Lenny's Payment Portal");
		logonPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
		userNameField.setColumns(10);
		usernameLabel.setText("User Name");
		passwordLabel.setText("Password");
		passwordField.setColumns(10);

		registerButton.setText("Register");
		registerButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				registerButtonActionPerformed(evt);
			}
		});

		logonButton.setText("Logon");
		logonButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				logonButtonActionPerformed(evt);
			}
		});

		clearButton.setText("Clear");
		clearButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				clearButtonActionPerformed(evt);
			}
		});

		logonPanelLabel.setText("Welcome");

		javax.swing.GroupLayout logonPanelLayout = new javax.swing.GroupLayout(logonPanel);
		logonPanel.setLayout(logonPanelLayout);
		logonPanelLayout.setHorizontalGroup(
				logonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(logonPanelLayout.createSequentialGroup()
								.addGroup(logonPanelLayout
										.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(logonPanelLayout
												.createSequentialGroup()
												.addGap(25, 25, 25)
												.addComponent(registerButton)
												.addPreferredGap(
														javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(logonButton)
												.addPreferredGap(
														javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(clearButton))
										.addGroup(logonPanelLayout
												.createSequentialGroup()
												.addGap(39, 39, 39)
												.addGroup(logonPanelLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(logonPanelLayout
																.createSequentialGroup()
																.addComponent(usernameLabel)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																.addComponent(userNameField,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(logonPanelLayout
																.createSequentialGroup()
																.addComponent(passwordLabel)
																.addGap(18, 18, 18)
																.addComponent(passwordField,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
														.addComponent(logonPanelLabel,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																241,
																javax.swing.GroupLayout.PREFERRED_SIZE))))
								.addContainerGap(29, Short.MAX_VALUE)));
		logonPanelLayout.setVerticalGroup(
				logonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(logonPanelLayout.createSequentialGroup()
								.addContainerGap()
								.addComponent(logonPanelLabel)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED,
										31,
										Short.MAX_VALUE)
								.addGroup(
										logonPanelLayout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(usernameLabel)
												.addComponent(userNameField,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(
										logonPanelLayout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(passwordLabel)
												.addComponent(passwordField,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(18, 18, 18)
								.addGroup(
										logonPanelLayout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(registerButton)
												.addComponent(logonButton)
												.addComponent(clearButton))
								.addGap(18, 18, 18)));

		billPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

		billJList.setModel(new javax.swing.AbstractListModel<String>() {
			String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };

			public int getSize() {
				return strings.length;
			}

			public String getElementAt(int i) {
				return strings[i];
			}
		});
		jScrollPane1.setViewportView(billJList);

		billLabel.setText("List of Bills");

		sortByAmountButton.setText("Sort Bills by Amount");
		sortByAmountButton.setActionCommand("Sort by Amount");
		sortByAmountButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				sortByAmountButtonActionPerformed(evt);
			}
		});

		logoutButton.setText("Log Off");
		logoutButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				logoutButtonActionPerformed(evt);
			}
		});

		sortByPaidButton.setText("Sort Bills by Paid");
		sortByPaidButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				sortByPaidButtonActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout billPanelLayout = new javax.swing.GroupLayout(billPanel);
		billPanel.setLayout(billPanelLayout);
		billPanelLayout.setHorizontalGroup(
				billPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(billPanelLayout.createSequentialGroup()
								.addGroup(billPanelLayout.createParallelGroup(
										javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(billPanelLayout
												.createSequentialGroup()
												.addGap(33, 33, 33)
												.addGroup(billPanelLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(billLabel)
														.addComponent(jScrollPane1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																262,
																javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addGroup(billPanelLayout
												.createSequentialGroup()
												.addGap(24, 24, 24)
												.addGroup(billPanelLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(billPanelLayout
																.createSequentialGroup()
																.addComponent(sortByPaidButton,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		169,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addGap(18, 18, 18)
																.addComponent(logoutButton))
														.addComponent(sortByAmountButton))))
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)));
		billPanelLayout.setVerticalGroup(
				billPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(billPanelLayout.createSequentialGroup()
								.addGap(9, 9, 9)
								.addComponent(billLabel)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(jScrollPane1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										109,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18)
								.addComponent(sortByAmountButton)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(billPanelLayout.createParallelGroup(
										javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(logoutButton)
										.addComponent(sortByPaidButton))
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup()
								.addGroup(layout.createParallelGroup(
										javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(layout.createSequentialGroup()
												.addGap(122, 122, 122)
												.addComponent(mainLabel))
										.addGroup(layout.createSequentialGroup()
												.addGap(35, 35, 35)
												.addGroup(layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addComponent(billPanel,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(logonPanel,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))))
								.addContainerGap(27, Short.MAX_VALUE)));
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup()
								.addGap(17, 17, 17)
								.addComponent(mainLabel)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(logonPanel,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(billPanel,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(12, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_registerButtonActionPerformed
		String username = userNameField.getText();
		String password = passwordField.getText();
		String response = "";
		if (username.isEmpty() || password.isEmpty()) {
			response = "Please enter username and password";
		} else {
			boolean registered = paymentSystem.registerRenter(username, password);
			response = registered ? "New Renter Registered" : "User already exists";
		}
		logonPanelLabel.setText(response);
	}// GEN-LAST:event_registerButtonActionPerformed

	private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_clearButtonActionPerformed
		resetLogonPanel();

	}// GEN-LAST:event_clearButtonActionPerformed

	private void resetLogonPanel() {
		userNameField.setText("");
		passwordField.setText("");
		logonPanelLabel.setText("Welcome");
	}

	private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_logoutButtonActionPerformed
		resetLogonPanel();
		billPanel.setVisible(false);
		logonPanel.setVisible(true);
	}// GEN-LAST:event_logoutButtonActionPerformed

	private void logonButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_logonButtonActionPerformed
		String username = userNameField.getText();
		String password = passwordField.getText();
		boolean loggedIn = paymentSystem.validateRenter(username, password);
		if (loggedIn == false) {
			logonPanelLabel.setText("Invalid Username/Password");
		} else {
			logonPanel.setVisible(false);
			setUpBillPanel();
		}
	}// GEN-LAST:event_logonButtonActionPerformed

	private void sortByAmountButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_sortByAmountButtonActionPerformed
		String username = userNameField.getText();
		String password = passwordField.getText();
		String[] bills = paymentSystem.getSortedRenterBillsByAmount(username, password);
		if (bills != null)
			billJList.setListData(bills);
		else
			billJList.setListData(new String[] { "No bills found" });
	}// GEN-LAST:event_sortByAmountButtonActionPerformed

	private void sortByPaidButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_sortByPaidButtonActionPerformed
		String username = userNameField.getText();
		String password = passwordField.getText();
		String[] bills = paymentSystem.getSortedRenterBillsByPaid(username, password);
		if (bills != null)
			billJList.setListData(bills);
		else
			billJList.setListData(new String[] { "No bills found" });
	}// GEN-LAST:event_sortByPaidButtonActionPerformed

	private void setUpBillPanel() {
		String username = userNameField.getText();
		String password = passwordField.getText();
		String[] bills = paymentSystem.getRenterBills(username, password);
		if (bills != null)
			billJList.setListData(bills);
		else
			billJList.setListData(new String[] { "No bills found" });
		billPanel.setVisible(true);
	}

	/**
	 * @param args the command line arguments
	 */
	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JList<String> billJList;
	private javax.swing.JLabel billLabel;
	private javax.swing.JPanel billPanel;
	private javax.swing.JButton clearButton;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JButton logonButton;
	private javax.swing.JPanel logonPanel;
	private javax.swing.JLabel logonPanelLabel;
	private javax.swing.JButton logoutButton;
	private javax.swing.JLabel mainLabel;
	private javax.swing.JTextField passwordField;
	private javax.swing.JLabel passwordLabel;
	private javax.swing.JButton registerButton;
	private javax.swing.JButton sortByAmountButton;
	private javax.swing.JButton sortByPaidButton;
	private javax.swing.JTextField userNameField;
	private javax.swing.JLabel usernameLabel;
	// End of variables declaration//GEN-END:variables
}