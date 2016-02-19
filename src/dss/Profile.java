/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dss;

/**
 *
 * @author sar16ansh_kg
 */
public class Profile extends javax.swing.JFrame {

    /**
     * Creates new form Profile
     */
    public Profile() {
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

        jp_profile_main = new javax.swing.JPanel();
        jp_profile_header = new javax.swing.JPanel();
        lp_logo = new javax.swing.JLabel();
        lp_title = new javax.swing.JLabel();
        bp_minimize = new javax.swing.JButton();
        bp_quit = new javax.swing.JButton();
        jp_profile_menu = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jpp_edit = new javax.swing.JPanel();
        lp_name = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lp_id = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jComboBox4 = new javax.swing.JComboBox();
        jComboBox5 = new javax.swing.JComboBox();
        bp_back = new javax.swing.JButton();
        ba_logout3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jp_profile_main.setBackground(new java.awt.Color(255, 255, 255));
        jp_profile_main.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 104, 232), 2, true));

        jp_profile_header.setBackground(new java.awt.Color(0, 104, 232));

        lp_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N

        lp_title.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        lp_title.setForeground(new java.awt.Color(255, 255, 255));
        lp_title.setText("Profile Settings");

        bp_minimize.setBackground(new java.awt.Color(255, 255, 255));
        bp_minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minimize.png"))); // NOI18N
        bp_minimize.setBorder(null);
        bp_minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        bp_quit.setBackground(new java.awt.Color(255, 255, 255));
        bp_quit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quit.png"))); // NOI18N
        bp_quit.setBorder(null);
        bp_quit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bp_quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_quitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp_profile_headerLayout = new javax.swing.GroupLayout(jp_profile_header);
        jp_profile_header.setLayout(jp_profile_headerLayout);
        jp_profile_headerLayout.setHorizontalGroup(
            jp_profile_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_profile_headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lp_title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lp_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(bp_minimize)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bp_quit, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jp_profile_headerLayout.setVerticalGroup(
            jp_profile_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lp_logo)
            .addGroup(jp_profile_headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lp_title, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(bp_minimize)
            .addComponent(bp_quit, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jp_profile_menu.setBackground(new java.awt.Color(255, 255, 255));
        jp_profile_menu.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Edit your Profile", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Agency FB", 1, 24), new java.awt.Color(0, 104, 232))); // NOI18N

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setForeground(new java.awt.Color(0, 104, 232));
        jButton1.setText("Save");

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setForeground(new java.awt.Color(0, 104, 232));
        jButton2.setText("Cancel");

        jpp_edit.setBackground(new java.awt.Color(255, 255, 255));
        jpp_edit.setAutoscrolls(true);

        lp_name.setForeground(new java.awt.Color(0, 104, 232));
        lp_name.setText("Name");

        jTextField3.setForeground(new java.awt.Color(0, 104, 232));

        jPasswordField1.setForeground(new java.awt.Color(0, 104, 232));

        jLabel4.setForeground(new java.awt.Color(0, 104, 232));
        jLabel4.setText("Years of experience");

        jTextField2.setForeground(new java.awt.Color(0, 104, 232));

        jLabel3.setForeground(new java.awt.Color(0, 104, 232));
        jLabel3.setText("Area of Expertise");

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setForeground(new java.awt.Color(0, 104, 232));
        jButton3.setText("Add another Course");
        jButton3.setBorder(null);

        jTextField1.setForeground(new java.awt.Color(0, 104, 232));

        jLabel5.setForeground(new java.awt.Color(0, 104, 232));
        jLabel5.setText("Courses Taken");

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setForeground(new java.awt.Color(0, 104, 232));
        jButton4.setText("Add another Area of Expertise");
        jButton4.setBorder(null);

        jLabel6.setForeground(new java.awt.Color(0, 104, 232));
        jLabel6.setText("Password");

        lp_id.setForeground(new java.awt.Color(0, 104, 232));
        lp_id.setText("ID");

        jLabel1.setForeground(new java.awt.Color(0, 104, 232));
        jLabel1.setText("Username");

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(255, 255, 255));

        jComboBox4.setForeground(new java.awt.Color(0, 104, 232));
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox5.setForeground(new java.awt.Color(0, 104, 232));
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jpp_editLayout = new javax.swing.GroupLayout(jpp_edit);
        jpp_edit.setLayout(jpp_editLayout);
        jpp_editLayout.setHorizontalGroup(
            jpp_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpp_editLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jpp_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpp_editLayout.createSequentialGroup()
                        .addGroup(jpp_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lp_id, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpp_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField4)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)))
                    .addComponent(jButton4)
                    .addGroup(jpp_editLayout.createSequentialGroup()
                        .addGroup(jpp_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lp_name, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jpp_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpp_editLayout.createSequentialGroup()
                                .addGroup(jpp_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jComboBox4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
                                .addGap(13, 13, 13)
                                .addGroup(jpp_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jpp_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(jComboBox5, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(22, 22, 22)
                                .addComponent(jButton3)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpp_editLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jPasswordField1, jTextField1, jTextField2, jTextField3, jTextField4});

        jpp_editLayout.setVerticalGroup(
            jpp_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpp_editLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jpp_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpp_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lp_id)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jpp_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lp_name)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpp_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(8, 8, 8)
                .addGroup(jpp_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpp_editLayout.createSequentialGroup()
                        .addGroup(jpp_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jpp_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jButton3)))
                    .addGroup(jpp_editLayout.createSequentialGroup()
                        .addGroup(jpp_editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(jButton4)))
                .addGap(2, 2, 2))
        );

        jpp_editLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton3, jButton4, jLabel1, jLabel3, jLabel4, jLabel5, jLabel6, lp_id, lp_name});

        javax.swing.GroupLayout jp_profile_menuLayout = new javax.swing.GroupLayout(jp_profile_menu);
        jp_profile_menu.setLayout(jp_profile_menuLayout);
        jp_profile_menuLayout.setHorizontalGroup(
            jp_profile_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_profile_menuLayout.createSequentialGroup()
                .addGap(398, 398, 398)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
            .addGroup(jp_profile_menuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpp_edit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jp_profile_menuLayout.setVerticalGroup(
            jp_profile_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_profile_menuLayout.createSequentialGroup()
                .addComponent(jpp_edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jp_profile_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        bp_back.setBackground(new java.awt.Color(255, 255, 255));
        bp_back.setForeground(new java.awt.Color(0, 104, 232));
        bp_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back.png"))); // NOI18N
        bp_back.setText("Back");
        bp_back.setBorder(null);
        bp_back.setBorderPainted(false);

        ba_logout3.setBackground(new java.awt.Color(255, 255, 255));
        ba_logout3.setForeground(new java.awt.Color(0, 104, 232));
        ba_logout3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logout.png"))); // NOI18N
        ba_logout3.setText("Logout");
        ba_logout3.setBorder(null);
        ba_logout3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jp_profile_mainLayout = new javax.swing.GroupLayout(jp_profile_main);
        jp_profile_main.setLayout(jp_profile_mainLayout);
        jp_profile_mainLayout.setHorizontalGroup(
            jp_profile_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_profile_header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jp_profile_mainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_profile_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_profile_mainLayout.createSequentialGroup()
                        .addComponent(bp_back)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ba_logout3))
                    .addComponent(jp_profile_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jp_profile_mainLayout.setVerticalGroup(
            jp_profile_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_profile_mainLayout.createSequentialGroup()
                .addComponent(jp_profile_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_profile_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ba_logout3)
                    .addComponent(bp_back))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_profile_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_profile_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_profile_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void b_quitActionPerformed(java.awt.event.ActionEvent evt) {                                         
        this.dispose();
    }
    
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
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Profile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ba_logout3;
    private javax.swing.JButton bp_back;
    private javax.swing.JButton bp_minimize;
    private javax.swing.JButton bp_quit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JPanel jp_profile_header;
    private javax.swing.JPanel jp_profile_main;
    private javax.swing.JPanel jp_profile_menu;
    private javax.swing.JPanel jpp_edit;
    private javax.swing.JLabel lp_id;
    private javax.swing.JLabel lp_logo;
    private javax.swing.JLabel lp_name;
    private javax.swing.JLabel lp_title;
    // End of variables declaration//GEN-END:variables
}
