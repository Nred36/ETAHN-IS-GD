/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package culminatingcannon;
import javax.swing.JTextField;

/**
 *
 * @author Joshua
 */
class Menu extends javax.swing.JFrame {

    JTextField[] varFields;//stores the JTextFields where the user enters their known variables
    MenuHelper tools = new MenuHelper();
    boolean genGraph = false;//Used to draw an animation using the VisualAnimatio class
    
    public Menu() {
        initComponents();
        solveButton.setEnabled(false);
        varFields = new JTextField[4];
        varFields[0] = varField1; 
        varFields[1] = varField2;
        varFields[2] = varField3;
        varFields[3] = varField4;
    
        tools.disableJTextFields(varFields,4);//all JTextFields within the array are setEnabled(false).
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        solveButton = new javax.swing.JButton();
        varField1 = new javax.swing.JTextField();
        solutionsBox = new javax.swing.JComboBox();
        varField2 = new javax.swing.JTextField();
        varField3 = new javax.swing.JTextField();
        xVarSelect = new javax.swing.JComboBox();
        answerOut = new javax.swing.JTextField();
        varField4 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        solveButton.setText("Solve");
        solveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solveButtonActionPerformed(evt);
            }
        });

        solutionsBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] {}));
        solutionsBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solutionsBoxActionPerformed(evt);
            }
        });

        xVarSelect.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "v1", "v1x", "v1y", "v2", "v2y", "dx", "dy","t","a","theta1", "theta2","Animation"}));
        xVarSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xVarSelectActionPerformed(evt);
            }
        });

        answerOut.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(solveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(varField3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(varField2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(varField1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(varField4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 104, Short.MAX_VALUE)
                        .addComponent(xVarSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(solutionsBox, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(answerOut, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(varField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(solutionsBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(xVarSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(varField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addComponent(varField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(varField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(answerOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(solveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void solveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solveButtonActionPerformed
        double[] varVals = new double[11];
        double[] anim = new double[4];
        String xVar = tools.getSelectedJComboBoxItem(xVarSelect);
        String formula = tools.getSelectedJComboBoxItem(solutionsBox);
       
         switch(xVar)
        {
            case "v1":
                varVals = tools.v1GetValues(varVals, varFields,formula);      
                break;     
            case "v1x":
                varVals = tools.v1xGetValues(varVals, varFields, formula);
                break;
            case "v1y":
                 varVals = tools.v1yGetValues(varVals, varFields, formula);
                break;
            case "v2":
                varVals = tools.v2GetValues(varVals, varFields, formula);
                break; 
            case "v2y":
                varVals = tools.v2yGetValues(varVals, varFields, formula);
                break;               
            case "dx":
                varVals = tools.dxGetValues(varVals, varFields, formula);
                break;
            case "dy":
                varVals = tools.dyGetValues(varVals, varFields, formula);
                break;
            case "t":
                varVals = tools.tGetValues(varVals, varFields, formula);
                break;
            case "a":
                varVals = tools.aGetValues(varVals, varFields, formula);
                break;
            case "theta1":
                varVals = tools.theta1GetValues(varVals, varFields, formula);
                break;   
            case "theta2":
                varVals = tools.theta2GetValues(varVals, varFields, formula);
                break;
            case "Animation":
                genGraph = true;
                anim = tools.animationGetValues(varVals,varFields);
                break;
        } 
         
         if(genGraph){
           VisualAnimatio visAnim = new VisualAnimatio(anim[0],anim[1],anim[2],anim[3]);
           VisualAnimatio.mainmMethodForVisual();//Can only be run once due to the class' limitations.
             genGraph = false;
         }
         else{
         decisionMaker dm = new decisionMaker(xVar,tools.format(formula),varVals);
         double ans = dm.decisionStatements();
         ans = ((int)(ans*100))/100.0;
         answerOut.setText(Double.toString(ans));
         }
         printArray(varVals);            
    }//GEN-LAST:event_solveButtonActionPerformed

    /**
     * solutionsBoxActionPerformed is triggered when the JComboBox solutionsBox 
     * is clicked. Depending on the unknown variable chosen from the
     * JComboBox 'xVarSelect', the JTextFields in JTextField[] fields will have
     * appropriate text assigned to them.
     * @param evt 
     */
    private void solutionsBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solutionsBoxActionPerformed

        String var = tools.getSelectedJComboBoxItem(xVarSelect);
        String item = tools.getSelectedJComboBoxItem(solutionsBox);    
        /*
        the below switch enables the appropriate text fields based on the
        variable requirements of a given formula
        */
        switch(var)
        {
            case "v1":
                tools.v1SetVars(varFields, item);
                break;
            
            case "v1x":
                tools.v1xSetVars(varFields, item);
                break;
            
            case "v1y":
                tools.v1ySetVars(varFields, item);
                break;
            case "v2":
                tools.v2SetVars(varFields, item);
                break;
                
            case "v2y":
                tools.v2ySetVars(varFields, item);
                break;
                 
            case "dx":
                tools.dxSetVars(varFields, item);
                break;
                
            case "dy":
                tools.dySetVars(varFields, item);
                break;
                 
            case "t":
                tools.tSetVars(varFields, item);
                break;
                
            case "a":
                tools.aSetVars(varFields, item);
                break;
                 
            case "theta1":
                tools.theta1SetVars(varFields, item);
                break;
                
            case "theta2":
                tools.theta2SetVars(varFields, item);
                break;
                
            case "Animation":
                tools.animationSetVars(varFields);
                break;
                
        }      
    }//GEN-LAST:event_solutionsBoxActionPerformed

    /**
     * xVarSelectActionPerformed will display formulas in the JComboBox 
     * solutionsBox, depending on the unknown variable chosen from the JComboBox
     *'xVarSelect'. The method is triggered when an ActionEvent occurs on
     * xVarSelect.
     * @param evt 
     */
    private void xVarSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xVarSelectActionPerformed
        Object o = xVarSelect.getModel().getSelectedItem(); 
        tools.getSolution(solutionsBox, o.toString());
        solutionsBox.setEnabled(true);
        solveButton.setEnabled(true);
    }//GEN-LAST:event_xVarSelectActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField answerOut;
    private javax.swing.JComboBox solutionsBox;
    private javax.swing.JButton solveButton;
    private javax.swing.JTextField varField1;
    private javax.swing.JTextField varField2;
    private javax.swing.JTextField varField3;
    private javax.swing.JTextField varField4;
    private javax.swing.JComboBox xVarSelect;
    // End of variables declaration//GEN-END:variables
 
    /**
     * Prints out each value of a double array on a new line.
     * The method is intended for debugging purposes only.
     * @param d 
     */
    public void printArray(double[] d){
       for(int i = 0; i < d.length; i++){
           System.out.println(d[i] + " ");
       }
        System.out.println("\n");
    }
}



