/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hms.ijse.layered.view;

/**
 *
 * @author Dileep Edirisinghe
 */
public class GenerateInvoice extends javax.swing.JFrame {

    /**
     * Creates new form GenerateInvoice
     */
    public GenerateInvoice() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel10 = new javax.swing.JPanel();
        savePDFBtn = new javax.swing.JButton();
        printBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        homeBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        invNo_txtF = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        custID_txtF = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        restCharges_txtF = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        bookingID_txtF = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        barCharges_txtF = new javax.swing.JTextField();
        roomCharge_txtF = new javax.swing.JTextField();
        serviceFee_txtF = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        micsCharges_txtF = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        totalAmount_txtF = new javax.swing.JTextField();
        paymentDate_txtF = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        PaymentStatus_ComboBox = new javax.swing.JComboBox<>();
        generateInvoiceBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(null);

        jPanel10.setLayout(null);

        savePDFBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        savePDFBtn.setText("Save as PDF");
        savePDFBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savePDFBtnActionPerformed(evt);
            }
        });
        jPanel10.add(savePDFBtn);
        savePDFBtn.setBounds(10, 620, 130, 30);

        printBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        printBtn.setText("Print");
        printBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printBtnActionPerformed(evt);
            }
        });
        jPanel10.add(printBtn);
        printBtn.setBounds(150, 620, 130, 30);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel10.add(jScrollPane1);
        jScrollPane1.setBounds(10, 20, 800, 570);

        homeBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        homeBtn.setText("Home");
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });
        jPanel10.add(homeBtn);
        homeBtn.setBounds(640, 620, 80, 30);

        logoutBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        logoutBtn.setText("Logout");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });
        jPanel10.add(logoutBtn);
        logoutBtn.setBounds(730, 620, 80, 30);

        getContentPane().add(jPanel10);
        jPanel10.setBounds(530, 30, 820, 690);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Customer Invoice");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(590, 0, 260, 32);

        jPanel11.setLayout(null);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Invoice Details"));
        jPanel2.setToolTipText("");
        jPanel2.setName(""); // NOI18N
        jPanel2.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Invoice No.:");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(20, 60, 110, 16);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Customer ID:");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(20, 140, 80, 16);

        invNo_txtF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invNo_txtFActionPerformed(evt);
            }
        });
        jPanel2.add(invNo_txtF);
        invNo_txtF.setBounds(140, 50, 180, 30);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Room Charge:");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(20, 180, 120, 16);

        custID_txtF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custID_txtFActionPerformed(evt);
            }
        });
        jPanel2.add(custID_txtF);
        custID_txtF.setBounds(140, 130, 180, 30);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Room Service fee:");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(20, 220, 110, 16);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("Restaurant Charges:");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(20, 260, 120, 16);

        restCharges_txtF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restCharges_txtFActionPerformed(evt);
            }
        });
        jPanel2.add(restCharges_txtF);
        restCharges_txtF.setBounds(140, 250, 180, 30);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setText("Booking ID:");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(20, 100, 110, 16);

        bookingID_txtF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookingID_txtFActionPerformed(evt);
            }
        });
        jPanel2.add(bookingID_txtF);
        bookingID_txtF.setBounds(140, 90, 180, 30);

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel19.setText("Bar Charges:");
        jPanel2.add(jLabel19);
        jLabel19.setBounds(20, 300, 80, 16);

        barCharges_txtF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barCharges_txtFActionPerformed(evt);
            }
        });
        jPanel2.add(barCharges_txtF);
        barCharges_txtF.setBounds(140, 290, 180, 30);

        roomCharge_txtF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomCharge_txtFActionPerformed(evt);
            }
        });
        jPanel2.add(roomCharge_txtF);
        roomCharge_txtF.setBounds(140, 170, 180, 30);

        serviceFee_txtF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serviceFee_txtFActionPerformed(evt);
            }
        });
        jPanel2.add(serviceFee_txtF);
        serviceFee_txtF.setBounds(140, 210, 180, 30);

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel20.setText("Misc Charges:");
        jPanel2.add(jLabel20);
        jLabel20.setBounds(20, 340, 80, 16);

        micsCharges_txtF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                micsCharges_txtFActionPerformed(evt);
            }
        });
        jPanel2.add(micsCharges_txtF);
        micsCharges_txtF.setBounds(140, 330, 180, 30);

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel21.setText("Payment Status:");
        jPanel2.add(jLabel21);
        jLabel21.setBounds(20, 420, 110, 16);

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel22.setText("Total Amount:");
        jPanel2.add(jLabel22);
        jLabel22.setBounds(20, 380, 110, 16);

        totalAmount_txtF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalAmount_txtFActionPerformed(evt);
            }
        });
        jPanel2.add(totalAmount_txtF);
        totalAmount_txtF.setBounds(140, 370, 180, 30);

        paymentDate_txtF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentDate_txtFActionPerformed(evt);
            }
        });
        jPanel2.add(paymentDate_txtF);
        paymentDate_txtF.setBounds(140, 450, 180, 30);

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel23.setText("Payment Date:");
        jPanel2.add(jLabel23);
        jLabel23.setBounds(20, 460, 110, 16);

        PaymentStatus_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "pending", "paid" }));
        jPanel2.add(PaymentStatus_ComboBox);
        PaymentStatus_ComboBox.setBounds(140, 412, 180, 30);

        jPanel11.add(jPanel2);
        jPanel2.setBounds(10, 10, 510, 580);

        generateInvoiceBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        generateInvoiceBtn.setText("Generate Invoice");
        generateInvoiceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateInvoiceBtnActionPerformed(evt);
            }
        });
        jPanel11.add(generateInvoiceBtn);
        generateInvoiceBtn.setBounds(10, 620, 140, 30);

        clearBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });
        jPanel11.add(clearBtn);
        clearBtn.setBounds(390, 620, 130, 30);

        getContentPane().add(jPanel11);
        jPanel11.setBounds(0, 30, 530, 690);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void savePDFBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savePDFBtnActionPerformed
        
        //db.DbControl.executeUpdate("INSERT INTO student (`index`,`full_name`,`Intitals`,`special_need`,`birthday`,`permenant_address`,`tempory_address`,`emergency_no`,`whatsapp_no`,`home_no`,`mobile_no`)" + "VALUES ('" + index + "','" + name + "','" + initials + "','" + specialNeeds + "','" + birthDay + "','" + permenantAddress + "', '" + temporaryAddress + "', " + emergencyNo + ", " + whatsAppNumber + ", " + homeNo + "," + mobileNo + ")");
    }//GEN-LAST:event_savePDFBtnActionPerformed

    private void printBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_printBtnActionPerformed

    private void invNo_txtFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invNo_txtFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_invNo_txtFActionPerformed

    private void custID_txtFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custID_txtFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_custID_txtFActionPerformed

    private void restCharges_txtFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restCharges_txtFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_restCharges_txtFActionPerformed

    private void bookingID_txtFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookingID_txtFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookingID_txtFActionPerformed

    private void barCharges_txtFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barCharges_txtFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_barCharges_txtFActionPerformed

    private void roomCharge_txtFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomCharge_txtFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roomCharge_txtFActionPerformed

    private void serviceFee_txtFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serviceFee_txtFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_serviceFee_txtFActionPerformed

    private void micsCharges_txtFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_micsCharges_txtFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_micsCharges_txtFActionPerformed

    private void generateInvoiceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateInvoiceBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_generateInvoiceBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clearBtnActionPerformed

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        //new Home().setVisible(true);
    }//GEN-LAST:event_homeBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void totalAmount_txtFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalAmount_txtFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalAmount_txtFActionPerformed

    private void paymentDate_txtFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentDate_txtFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paymentDate_txtFActionPerformed

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
            java.util.logging.Logger.getLogger(GenerateInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GenerateInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GenerateInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GenerateInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GenerateInvoice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> PaymentStatus_ComboBox;
    private javax.swing.JTextField barCharges_txtF;
    private javax.swing.JTextField bookingID_txtF;
    private javax.swing.JButton clearBtn;
    private javax.swing.JTextField custID_txtF;
    private javax.swing.JButton generateInvoiceBtn;
    private javax.swing.JButton homeBtn;
    private javax.swing.JTextField invNo_txtF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JTextField micsCharges_txtF;
    private javax.swing.JTextField paymentDate_txtF;
    private javax.swing.JButton printBtn;
    private javax.swing.JTextField restCharges_txtF;
    private javax.swing.JTextField roomCharge_txtF;
    private javax.swing.JButton savePDFBtn;
    private javax.swing.JTextField serviceFee_txtF;
    private javax.swing.JTextField totalAmount_txtF;
    // End of variables declaration//GEN-END:variables
}
