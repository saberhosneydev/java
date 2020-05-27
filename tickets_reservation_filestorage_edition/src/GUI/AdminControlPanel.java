/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 * @author savag
 */
public class AdminControlPanel extends javax.swing.JFrame {

    private static String[] authUserStrings = null;
    private String[] authUser = null;

    /**
     * Creates new form AdminControlPanel
     */
    public AdminControlPanel() {
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

        jMenu1 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        greeting = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        busMenu = new javax.swing.JMenu();
        createBus = new javax.swing.JMenuItem();
        editBus = new javax.swing.JMenuItem();
        busList = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        createTicket = new javax.swing.JMenuItem();
        editTicket = new javax.swing.JMenuItem();
        ticketList = new javax.swing.JMenuItem();
        usersMenu = new javax.swing.JMenu();
        userList = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        createAdmin = new javax.swing.JMenuItem();
        accMenu = new javax.swing.JMenu();
        accountSettings = new javax.swing.JMenuItem();
        logOut = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenuItem6.setText("jMenuItem6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bus Ticket Reservation - Control Panel");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        greeting.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        greeting.setForeground(new java.awt.Color(153, 0, 0));
        greeting.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        greeting.setText("Welcome");

        busMenu.setText("Bus");

        createBus.setText("Create Bus");
        createBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBusActionPerformed(evt);
            }
        });
        busMenu.add(createBus);

        editBus.setText("Edit Bus");
        editBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBusActionPerformed(evt);
            }
        });
        busMenu.add(editBus);

        busList.setText("Bus List");
        busList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busListActionPerformed(evt);
            }
        });
        busMenu.add(busList);

        jMenuBar1.add(busMenu);

        jMenu2.setText("Tickets");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        createTicket.setText("Create Ticket");
        createTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createTicketActionPerformed(evt);
            }
        });
        jMenu2.add(createTicket);

        editTicket.setText("Edit Ticket");
        editTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editTicketActionPerformed(evt);
            }
        });
        jMenu2.add(editTicket);

        ticketList.setText("Ticket List");
        ticketList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ticketListActionPerformed(evt);
            }
        });
        jMenu2.add(ticketList);

        jMenuBar1.add(jMenu2);

        usersMenu.setText("Users");

        userList.setText("User List");
        userList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userListActionPerformed(evt);
            }
        });
        usersMenu.add(userList);

        jMenuBar1.add(usersMenu);

        jMenu4.setText("Admins");

        createAdmin.setText("Create Admin");
        createAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAdminActionPerformed(evt);
            }
        });
        jMenu4.add(createAdmin);

        jMenuBar1.add(jMenu4);

        accMenu.setText("Account");

        accountSettings.setText("Account Settings");
        accountSettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountSettingsActionPerformed(evt);
            }
        });
        accMenu.add(accountSettings);

        logOut.setText("Log Out");
        logOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutActionPerformed(evt);
            }
        });
        accMenu.add(logOut);

        jMenuBar1.add(accMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(greeting, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(greeting, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        authUser = authUserStrings;
        greeting.setText("Welcome, " + authUser[1]);

    }//GEN-LAST:event_formWindowOpened

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        AccountSettings.main(authUserStrings);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void createBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBusActionPerformed
        // TODO add your handling code here:
        CreateBus.main(new String[]{"false"});
    }//GEN-LAST:event_createBusActionPerformed

    private void editBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBusActionPerformed
        // TODO add your handling code here:
        CreateBus.main(new String[]{"true"});
    }//GEN-LAST:event_editBusActionPerformed

    private void busListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busListActionPerformed
        // TODO add your handling code here:
        BusList.main(null);
    }//GEN-LAST:event_busListActionPerformed

    private void createTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createTicketActionPerformed
        // TODO add your handling code here:
        CreateTicket.main(authUserStrings, "false");
    }//GEN-LAST:event_createTicketActionPerformed

    private void editTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editTicketActionPerformed
        CreateTicket.main(authUserStrings, "true");
    }//GEN-LAST:event_editTicketActionPerformed

    private void ticketListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ticketListActionPerformed
        TicketList.main(null);
    }//GEN-LAST:event_ticketListActionPerformed

    private void userListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userListActionPerformed
        // TODO add your handling code here:
        UserList.main(null);
    }//GEN-LAST:event_userListActionPerformed

    private void createAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAdminActionPerformed
        // TODO add your handling code here:
        Register.main(new String[]{"true"});
    }//GEN-LAST:event_createAdminActionPerformed

    private void accountSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountSettingsActionPerformed
        // TODO add your handling code here:
        AccountSettings.main(authUserStrings);
        dispose();
    }//GEN-LAST:event_accountSettingsActionPerformed

    private void logOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutActionPerformed
        // TODO add your handling code here:
        Login.main(null);
        dispose();
    }//GEN-LAST:event_logOutActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
        TicketList.main(null);
    }//GEN-LAST:event_jMenu2ActionPerformed


    public static void main(String args[]) {
        authUserStrings = args;
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
            java.util.logging.Logger.getLogger(AdminControlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminControlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminControlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminControlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminControlPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu accMenu;
    private javax.swing.JMenuItem accountSettings;
    private javax.swing.JMenuItem busList;
    private javax.swing.JMenu busMenu;
    private javax.swing.JMenuItem createAdmin;
    private javax.swing.JMenuItem createBus;
    private javax.swing.JMenuItem createTicket;
    private javax.swing.JMenuItem editBus;
    private javax.swing.JMenuItem editTicket;
    private javax.swing.JLabel greeting;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem logOut;
    private javax.swing.JMenuItem ticketList;
    private javax.swing.JMenuItem userList;
    private javax.swing.JMenu usersMenu;
    // End of variables declaration//GEN-END:variables
}
