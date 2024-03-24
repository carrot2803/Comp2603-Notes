import java.util.ArrayList;

public class GreenhouseGUI extends javax.swing.JFrame {
    private Nursery nursery;

    public GreenhouseGUI() {
        initComponents();
    }

    public GreenhouseGUI(Nursery nursery) {
        initComponents();
        this.nursery = nursery;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        plantNameLabel = new javax.swing.JLabel();
        plantNameField = new javax.swing.JTextField();
        priceLabel = new javax.swing.JLabel();
        priceField = new javax.swing.JTextField();
        quantityLabel = new javax.swing.JLabel();
        quantityField = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        findButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        displayArea = new javax.swing.JTextArea();
        displayLabel = new javax.swing.JLabel();
        mainPanelLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        statusArea = new javax.swing.JTextArea();
        clearButton = new javax.swing.JButton();
        sortByNameButton = new javax.swing.JButton();
        sortByPriceButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        plantNameLabel.setText("Plant Name");

        priceLabel.setText("Price");

        quantityLabel.setText("Quantity in Stock");

        addButton.setText("Add Plant");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        findButton.setText("Find Plant");
        findButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findButtonActionPerformed(evt);
            }
        });

        updateButton.setText("Update Plant");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete Plant");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        displayArea.setColumns(20);
        displayArea.setRows(5);
        jScrollPane1.setViewportView(displayArea);

        displayLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        displayLabel.setText("Display Green House Details");

        mainPanelLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        mainPanelLabel.setText("Green House Plant Details");

        statusArea.setColumns(5);
        statusArea.setRows(3);
        jScrollPane2.setViewportView(statusArea);

        clearButton.setText("Clear ");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
                mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                mainPanelLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 445,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(23, 23, 23))
                        .addGroup(mainPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                                .addGroup(mainPanelLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jSeparator1)
                                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                                                .addGroup(mainPanelLayout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(mainPanelLayout
                                                                                .createSequentialGroup()
                                                                                .addGroup(mainPanelLayout
                                                                                        .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addGroup(mainPanelLayout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(23, 23, 23)
                                                                                                .addGroup(
                                                                                                        mainPanelLayout
                                                                                                                .createParallelGroup(
                                                                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(
                                                                                                                        plantNameLabel)
                                                                                                                .addComponent(
                                                                                                                        priceLabel))
                                                                                                .addGap(56, 56, 56))
                                                                                        .addGroup(
                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                mainPanelLayout
                                                                                                        .createSequentialGroup()
                                                                                                        .addComponent(
                                                                                                                quantityLabel)
                                                                                                        .addGap(18, 18,
                                                                                                                18)))
                                                                                .addGroup(mainPanelLayout
                                                                                        .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(plantNameField,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                152,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addGroup(mainPanelLayout
                                                                                                .createParallelGroup(
                                                                                                        javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                        false)
                                                                                                .addComponent(
                                                                                                        quantityField,
                                                                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                        149,
                                                                                                        Short.MAX_VALUE)
                                                                                                .addComponent(
                                                                                                        priceField,
                                                                                                        javax.swing.GroupLayout.Alignment.LEADING))))
                                                                        .addGroup(mainPanelLayout
                                                                                .createSequentialGroup()
                                                                                .addGap(12, 12, 12)
                                                                                .addComponent(addButton)
                                                                                .addPreferredGap(
                                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(findButton)
                                                                                .addPreferredGap(
                                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(updateButton)
                                                                                .addPreferredGap(
                                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(deleteButton)))
                                                                .addGap(0, 0, Short.MAX_VALUE)))
                                                .addGap(1, 1, 1))
                                        .addComponent(jScrollPane1))
                                .addContainerGap())
                        .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                                .addGap(131, 131, 131)
                                                .addComponent(displayLabel))
                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                                .addGap(140, 140, 140)
                                                .addComponent(mainPanelLabel))
                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                                .addGap(191, 191, 191)
                                                .addComponent(clearButton)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        mainPanelLayout.setVerticalGroup(
                mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mainPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(mainPanelLabel)
                                .addGap(27, 27, 27)
                                .addGroup(
                                        mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(plantNameLabel)
                                                .addComponent(plantNameField, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11,
                                        Short.MAX_VALUE)
                                .addGroup(
                                        mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(priceLabel)
                                                .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(
                                        mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(quantityLabel)
                                                .addComponent(quantityField, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(
                                        mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(findButton)
                                                .addComponent(updateButton)
                                                .addComponent(deleteButton)
                                                .addComponent(addButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(clearButton)
                                .addGap(1, 1, 1)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(displayLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap()));

        sortByNameButton.setText("Display by Name");
        sortByNameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortByNameButtonActionPerformed(evt);
            }
        });

        sortByPriceButton.setText("Display by Price");
        sortByPriceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortByPriceButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(sortByNameButton)
                                .addGap(18, 18, 18)
                                .addComponent(sortByPriceButton)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(sortByNameButton)
                                        .addComponent(sortByPriceButton))
                                .addContainerGap()));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {
        String plantName = plantNameField.getText();
        String price = priceField.getText();
        String quantity = quantityField.getText();
        String message = nursery.addPlant(plantName, price, quantity);
        statusArea.setText(message);
    }

    private String formatPlantDetails(ArrayList<String> plantDetails) {
        StringBuilder formattedDetails = new StringBuilder();
        for (String detail : plantDetails)
            formattedDetails.append(detail).append("\n");
        return formattedDetails.toString();
    }

    private void findButtonActionPerformed(java.awt.event.ActionEvent evt) {
        String plantName = plantNameField.getText();
        Plant foundPlant = nursery.getPlantObject(plantName);

        if (foundPlant == null) {
            statusArea.setText("No " + plantName + " plant found");
            return;
        }
        ArrayList<String> plantDetails = foundPlant.getPlantDetails();
        displayArea.setText(formatPlantDetails(plantDetails));
        statusArea.setText("Plant details are shown");
    }

private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//
GEN-FIRST:event_updateButtonActionPerformed
}// GEN-LAST:event_updateButtonActionPerformed

private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//
GEN-FIRST:event_deleteButtonActionPerformed
}// GEN-LAST:event_deleteButtonActionPerformed

    private void sortByNameButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_sortByNameButtonActionPerformed
        displayArea.setText(nursery.getPlantsByName());
    }

    private void sortByPriceButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_sortByPriceButtonActionPerformed
                                                                                   // TODO add your handling code here:
    }// GEN-LAST:event_sortByPriceButtonActionPerformed

private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//
GEN-FIRST:event_clearButtonActionPerformed
// TODO add your handling code here:
}// GEN-LAST:event_clearButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextArea displayArea;
    private javax.swing.JLabel displayLabel;
    private javax.swing.JButton findButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel mainPanelLabel;
    private javax.swing.JTextField plantNameField;
    private javax.swing.JLabel plantNameLabel;
    private javax.swing.JTextField priceField;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JTextField quantityField;
    private javax.swing.JLabel quantityLabel;
    private javax.swing.JButton sortByNameButton;
    private javax.swing.JButton sortByPriceButton;
    private javax.swing.JTextArea statusArea;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
