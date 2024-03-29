/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hms.ijse.layered.view;

/**
 *
 * @author Dileep Edirisinghe
 */
public class EditRooms extends javax.swing.JFrame {

    /**
     * Creates new form CustomerView
     */
    public EditRooms() {
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

        jLabel1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        stDetailsTable_Table = new javax.swing.JTable();
        homeBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        searcRoomID_txtF = new javax.swing.JTextField();
        clearBtn1 = new javax.swing.JButton();
        searchBtn = new javax.swing.JButton();
        searchRoomType_ComboBox = new javax.swing.JComboBox<>();
        jPanel11 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        pricePerNight_TxtF = new javax.swing.JTextField();
        capacity_TxtF = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        bedType_TxtF = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        roomDesc_TextArea = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        updateRoomTypesBtn = new javax.swing.JButton();
        roomType_ComboBox = new javax.swing.JComboBox<>();
        clearBtn2 = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Edit Rooms");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(576, 0, 260, 32);

        jPanel8.setLayout(null);

        jPanel7.setLayout(null);

        stDetailsTable_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(stDetailsTable_Table);

        jPanel7.add(jScrollPane2);
        jScrollPane2.setBounds(0, 10, 730, 440);

        homeBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        homeBtn.setText("Home");
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });
        jPanel7.add(homeBtn);
        homeBtn.setBounds(560, 480, 80, 30);

        logoutBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        logoutBtn.setText("Logout");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });
        jPanel7.add(logoutBtn);
        logoutBtn.setBounds(650, 480, 80, 30);

        deleteBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        jPanel7.add(deleteBtn);
        deleteBtn.setBounds(0, 480, 130, 30);

        jPanel8.add(jPanel7);
        jPanel7.setBounds(10, 100, 740, 520);

        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel9.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Room Type:");
        jPanel9.add(jLabel7);
        jLabel7.setBounds(20, 40, 120, 16);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setText("Room ID:");
        jPanel9.add(jLabel14);
        jLabel14.setBounds(20, 10, 100, 16);
        jPanel9.add(searcRoomID_txtF);
        searcRoomID_txtF.setBounds(120, 10, 110, 22);

        clearBtn1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        clearBtn1.setText("Clear");
        clearBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtn1ActionPerformed(evt);
            }
        });
        jPanel9.add(clearBtn1);
        clearBtn1.setBounds(650, 10, 72, 50);

        searchBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        jPanel9.add(searchBtn);
        searchBtn.setBounds(530, 10, 110, 50);

        searchRoomType_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel9.add(searchRoomType_ComboBox);
        searchRoomType_ComboBox.setBounds(120, 40, 250, 22);

        jPanel8.add(jPanel9);
        jPanel9.setBounds(10, 20, 730, 70);

        getContentPane().add(jPanel8);
        jPanel8.setBounds(610, 30, 760, 690);

        jPanel11.setLayout(null);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Room Details"));
        jPanel2.setLayout(null);

        pricePerNight_TxtF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pricePerNight_TxtFActionPerformed(evt);
            }
        });
        jPanel2.add(pricePerNight_TxtF);
        pricePerNight_TxtF.setBounds(150, 290, 260, 20);

        capacity_TxtF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                capacity_TxtFActionPerformed(evt);
            }
        });
        jPanel2.add(capacity_TxtF);
        capacity_TxtF.setBounds(150, 260, 260, 22);

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel23.setText("Capacity:");
        jPanel2.add(jLabel23);
        jLabel23.setBounds(20, 260, 130, 20);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Price Per-Night:");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(20, 290, 120, 20);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Bed Type:");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(20, 230, 130, 20);

        bedType_TxtF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bedType_TxtFActionPerformed(evt);
            }
        });
        jPanel2.add(bedType_TxtF);
        bedType_TxtF.setBounds(150, 230, 260, 22);

        roomDesc_TextArea.setColumns(20);
        roomDesc_TextArea.setRows(5);
        jScrollPane3.setViewportView(roomDesc_TextArea);

        jPanel2.add(jScrollPane3);
        jScrollPane3.setBounds(150, 60, 430, 160);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Room Type:");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(20, 30, 80, 20);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Room Description:");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(20, 60, 140, 20);

        updateRoomTypesBtn.setText("Update room types");
        updateRoomTypesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateRoomTypesBtnActionPerformed(evt);
            }
        });
        jPanel2.add(updateRoomTypesBtn);
        updateRoomTypesBtn.setBounds(449, 30, 131, 23);

        roomType_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(roomType_ComboBox);
        roomType_ComboBox.setBounds(150, 30, 290, 22);

        jPanel11.add(jPanel2);
        jPanel2.setBounds(0, 10, 590, 540);

        clearBtn2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        clearBtn2.setText("Clear");
        clearBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtn2ActionPerformed(evt);
            }
        });
        jPanel11.add(clearBtn2);
        clearBtn2.setBounds(460, 580, 130, 30);

        addBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        jPanel11.add(addBtn);
        addBtn.setBounds(0, 580, 130, 30);

        updateBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        jPanel11.add(updateBtn);
        updateBtn.setBounds(140, 580, 130, 30);

        getContentPane().add(jPanel11);
        jPanel11.setBounds(10, 30, 610, 620);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtn2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clearBtn2ActionPerformed

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        //new Home().setVisible(true);
    }//GEN-LAST:event_homeBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void pricePerNight_TxtFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pricePerNight_TxtFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pricePerNight_TxtFActionPerformed

    private void capacity_TxtFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_capacity_TxtFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_capacity_TxtFActionPerformed

    private void bedType_TxtFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bedType_TxtFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bedType_TxtFActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchBtnActionPerformed

    private void clearBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clearBtn1ActionPerformed

    private void updateRoomTypesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateRoomTypesBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateRoomTypesBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateBtnActionPerformed

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
            java.util.logging.Logger.getLogger(EditRooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditRooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditRooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditRooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditRooms().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JTextField bedType_TxtF;
    private javax.swing.JTextField capacity_TxtF;
    private javax.swing.JButton clearBtn1;
    private javax.swing.JButton clearBtn2;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton homeBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JTextField pricePerNight_TxtF;
    private javax.swing.JTextArea roomDesc_TextArea;
    private javax.swing.JComboBox<String> roomType_ComboBox;
    private javax.swing.JTextField searcRoomID_txtF;
    private javax.swing.JButton searchBtn;
    private javax.swing.JComboBox<String> searchRoomType_ComboBox;
    private javax.swing.JTable stDetailsTable_Table;
    private javax.swing.JButton updateBtn;
    private javax.swing.JButton updateRoomTypesBtn;
    // End of variables declaration//GEN-END:variables
}
