/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Panel;

import DAO.RoleDAO;
import DAO.VisualDAO;
import java.awt.event.ItemEvent;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author adoni
 */
public class MantRole extends javax.swing.JPanel {
    
    RoleDAO roledao = new RoleDAO();
    VisualDAO vdao = new VisualDAO();
    
    public MantRole() {
        initComponents();
        actualizar();
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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtrole = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtarearole = new javax.swing.JTextArea();
        btnaddprivileges = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        cbxtipo = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        cbxprivi = new javax.swing.JComboBox<>();
        btnaddrole = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jcbrole = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblPrivilegeRole = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("ROLES");

        jLabel7.setText("Nombre del rol :");

        txtrole.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtroleKeyTyped(evt);
            }
        });

        txtarearole.setColumns(20);
        txtarearole.setRows(5);
        jScrollPane1.setViewportView(txtarearole);

        btnaddprivileges.setText("Agregar privilegio");
        btnaddprivileges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddprivilegesActionPerformed(evt);
            }
        });

        jLabel8.setText("Tipo :");

        cbxtipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "[SELECCIONAR]", "CLUSTER", "DATABASE", "DATABASE LINK", "DIMENSION", "INDEX", "PROCEDURE", "PROFILE", "ROLE", "ROLLBACK SEGMENT", "SEQUENCE", "SESSION", "SYNONYM", "TABLE", "TABLESPACE", "TRIGGER", "USER", "VIEW" }));
        cbxtipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxtipoItemStateChanged(evt);
            }
        });

        jLabel9.setText("Privilegios :");

        cbxprivi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxpriviActionPerformed(evt);
            }
        });

        btnaddrole.setText("Crear rol");
        btnaddrole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddroleActionPerformed(evt);
            }
        });

        jLabel10.setText("Usted está otorgando privilegios a :");

        jButton1.setText("Revocar privilegio");

        jcbrole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbrole.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbroleItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(jcbrole, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtrole, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnaddrole))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnaddprivileges)
                                    .addComponent(jButton1)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(cbxprivi, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addComponent(cbxtipo, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 42, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtrole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnaddrole))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jcbrole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxtipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cbxprivi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(btnaddprivileges)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("CREAR", jPanel4);

        tblPrivilegeRole.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "PRIVILEGIOS DE SISTEMA DEL ROL"
            }
        ));
        jScrollPane3.setViewportView(tblPrivilegeRole);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addComponent(jTabbedPane1))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jcbroleItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbroleItemStateChanged
        // TODO add your handling code here:
        String role = (String) jcbrole.getSelectedItem();
        this.tblPrivilegeRole.setModel(vdao.Obt_dateRole("PRIVILEGE", "ROLE_SYS_PRIVS", "ROLE='"+role+"'"));
    }//GEN-LAST:event_jcbroleItemStateChanged

    private void btnaddroleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddroleActionPerformed
        // TODO add your handling code here:
        String role=txtrole.getText();
        if(roledao.AddRole(role)){
            actualizar();
            jcbrole.setSelectedItem(role);
            txtarearole.append(role+" created \n");
        }
    }//GEN-LAST:event_btnaddroleActionPerformed

    private void cbxpriviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxpriviActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxpriviActionPerformed

    private void cbxtipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxtipoItemStateChanged
        //TODO add your handling code here:
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            if (this.cbxtipo.getSelectedIndex()>=0) {
                this.cbxprivi.setModel(new DefaultComboBoxModel(vdao.getPrivilegio(this.cbxtipo.getSelectedItem().toString())));
            }
        }
    }//GEN-LAST:event_cbxtipoItemStateChanged

    private void btnaddprivilegesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddprivilegesActionPerformed
        // TODO add your handling code here:
        String rolegranted= (String) jcbrole.getSelectedItem();
        if(roledao.AddPrivilegeToRole(rolegranted, (String)cbxprivi.getSelectedItem())){
            this.tblPrivilegeRole.setModel(vdao.Obt_dateRole("PRIVILEGE", "ROLE_SYS_PRIVS", "ROLE='"+rolegranted+"'"));
            txtarearole.append((String)cbxprivi.getSelectedItem()+" granted \n");
        }
    }//GEN-LAST:event_btnaddprivilegesActionPerformed

    private void txtroleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtroleKeyTyped
        // TODO add your handling code here:
        Character c = evt.getKeyChar();
        if(Character.isLetter(c)) {
            evt.setKeyChar(Character.toUpperCase(c));
        }
    }//GEN-LAST:event_txtroleKeyTyped


    private void actualizar(){
        this.jcbrole.setModel(vdao.Obt_date2("ROLE", "DBA_ROLES"));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaddprivileges;
    private javax.swing.JButton btnaddrole;
    private javax.swing.JComboBox<String> cbxprivi;
    private javax.swing.JComboBox<String> cbxtipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JComboBox<String> jcbrole;
    private javax.swing.JTable tblPrivilegeRole;
    private javax.swing.JTextArea txtarearole;
    private javax.swing.JTextField txtrole;
    // End of variables declaration//GEN-END:variables
}
