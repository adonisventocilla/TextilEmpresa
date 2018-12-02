/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Panel;

import java.awt.event.ItemEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import Bean.ConexionBean;
import DAO.ShowQueriesDAO;
import DAO.UsuarioDAO;

/**
 *
 * @author adoni
 */
public class MantUser extends javax.swing.JPanel {

//    ConexionBean conex = new ConexionBean();
//    UsuarioDAO usuDAO = new UsuarioDAO();
//    ShowQueriesDAO showDAO = new ShowQueriesDAO();
    
    public MantUser() {
        initComponents();
//        
//        this.jcbuser.setModel(usuDAO.Obt_date("USERNAME"));
//        this.jcbuser2.setModel(usuDAO.Obt_date("USERNAME"));
//        this.jcbuser3.setModel(usuDAO.Obt_date("USERNAME"));
//        this.jcbtablespace.setModel(usuDAO.Obt_date("DEFAULT_TABLESPACE"));
//        this.jcbtablespace2.setModel(usuDAO.Obt_date("DEFAULT_TABLESPACE"));
//        this.jcbtemporary.setModel(usuDAO.Obt_date("TEMPORARY_TABLESPACE"));        
//        this.jcbtemporary2.setModel(usuDAO.Obt_date("TEMPORARY_TABLESPACE"));        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        QuotaValueSelected = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelModificar = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jcbuser2 = new javax.swing.JComboBox<>();
        newpass1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jcbtablespace2 = new javax.swing.JComboBox<>();
        jcbtemporary2 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        newquota1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jPanelPrivilegios = new javax.swing.JPanel();
        jcbuser3 = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jcbtipo = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jcbprivi = new javax.swing.JComboBox<>();
        btnanadirprivi = new javax.swing.JButton();
        btneliminarprivi = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableprivi = new javax.swing.JTable();
        btnactualizarprivi = new javax.swing.JButton();
        jPanelCrear = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtuser = new javax.swing.JTextField();
        txtpassword = new javax.swing.JTextField();
        txtquota = new javax.swing.JTextField();
        cbxtemptablespace = new javax.swing.JComboBox<>();
        cbxtablespace = new javax.swing.JComboBox<>();
        tbladduser = new javax.swing.JScrollPane();
        txtareauser = new javax.swing.JTextArea();
        btnadd = new javax.swing.JButton();
        rdbK = new javax.swing.JRadioButton();
        rdbM = new javax.swing.JRadioButton();
        title = new javax.swing.JLabel();

        jLabel7.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel7.setText("Usuario :");

        jcbuser2.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jcbuser2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        newpass1.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel8.setText("Contraseña :");

        jLabel9.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel9.setText("Tablespace :");

        jcbtablespace2.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jcbtablespace2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jcbtemporary2.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jcbtemporary2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel10.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel10.setText("Temporary Tablespace :");

        jLabel11.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel11.setText("Quota Temporary Tablespace :");

        newquota1.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N

        jLabel16.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel16.setText("A continuación seleccione el usuario a modificar");

        javax.swing.GroupLayout jPanelModificarLayout = new javax.swing.GroupLayout(jPanelModificar);
        jPanelModificar.setLayout(jPanelModificarLayout);
        jPanelModificarLayout.setHorizontalGroup(
            jPanelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelModificarLayout.createSequentialGroup()
                .addGroup(jPanelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelModificarLayout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addGroup(jPanelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelModificarLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jcbuser2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(newpass1)
                            .addComponent(newquota1)
                            .addComponent(jcbtablespace2, 0, 200, Short.MAX_VALUE)
                            .addComponent(jcbtemporary2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanelModificarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel16)))
                .addContainerGap(211, Short.MAX_VALUE))
        );
        jPanelModificarLayout.setVerticalGroup(
            jPanelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelModificarLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addGroup(jPanelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jcbuser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84)
                .addGroup(jPanelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(newpass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jcbtablespace2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jcbtemporary2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newquota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addContainerGap(156, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("MODIFICAR", jPanelModificar);

        jcbuser3.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jcbuser3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbuser3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbuser3ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel12.setText("Seleccionar usuario :");

        jLabel13.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel13.setText("A continuación se podrá agregar privilegios al usuario seleccionado");

        jcbtipo.setFont(new java.awt.Font("sansserif", 0, 13)); // NOI18N
        jcbtipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "[SELECCIONAR]", "CLUSTER", "DATABASE", "DATABASE LINK", "DIMENSION", "INDEX", "PROCEDURE", "PROFILE", "ROLE", "ROLLBACK SEGMENT", "SEQUENCE", "SESSION", "SYNONYM", "TABLE", "TABLESPACE", "TRIGGER", "USER", "VIEW" }));
        jcbtipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbtipoItemStateChanged(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel14.setText("Tipo :");

        jLabel15.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel15.setText("Privilegio :");

        jcbprivi.setFont(new java.awt.Font("sansserif", 0, 13)); // NOI18N
        jcbprivi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "[SELECCIONAR]" }));
        jcbprivi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbpriviActionPerformed(evt);
            }
        });

        btnanadirprivi.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        btnanadirprivi.setText("AÑADIR PRIVILEGIO");
        btnanadirprivi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnanadirpriviActionPerformed(evt);
            }
        });

        btneliminarprivi.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        btneliminarprivi.setText("ELIMINAR PRIVILEGIO");
        btneliminarprivi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarpriviActionPerformed(evt);
            }
        });

        jtableprivi.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jtableprivi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "PRIVILEGIOS DEL SISTEMA"
            }
        ));
        jScrollPane1.setViewportView(jtableprivi);

        btnactualizarprivi.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnactualizarprivi.setText("ACTUALIZAR PRIVILEGIOS DE USUARIO");

        javax.swing.GroupLayout jPanelPrivilegiosLayout = new javax.swing.GroupLayout(jPanelPrivilegios);
        jPanelPrivilegios.setLayout(jPanelPrivilegiosLayout);
        jPanelPrivilegiosLayout.setHorizontalGroup(
            jPanelPrivilegiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrivilegiosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelPrivilegiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addGroup(jPanelPrivilegiosLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanelPrivilegiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(btnanadirprivi))
                        .addGroup(jPanelPrivilegiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelPrivilegiosLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanelPrivilegiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jcbtipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jcbprivi, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanelPrivilegiosLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(btneliminarprivi))))
                    .addGroup(jPanelPrivilegiosLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(jcbuser3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
            .addGroup(jPanelPrivilegiosLayout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(btnactualizarprivi)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelPrivilegiosLayout.setVerticalGroup(
            jPanelPrivilegiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrivilegiosLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanelPrivilegiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPrivilegiosLayout.createSequentialGroup()
                        .addGroup(jPanelPrivilegiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jcbuser3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelPrivilegiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcbtipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelPrivilegiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcbprivi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addGap(35, 35, 35)
                        .addGroup(jPanelPrivilegiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnanadirprivi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btneliminarprivi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(btnactualizarprivi)
                .addGap(39, 39, 39))
        );

        jTabbedPane1.addTab("PRIVILEGIOS", jPanelPrivilegios);

        jLabel17.setText("Usuario :");

        jLabel2.setText("Contraseña :");

        jLabel3.setText("Tablespace :");

        jLabel4.setText("Temporary Tablespace :");

        jLabel5.setText("Quota :");

        txtquota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtquotaActionPerformed(evt);
            }
        });

        cbxtemptablespace.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbxtablespace.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtareauser.setColumns(20);
        txtareauser.setRows(5);
        tbladduser.setViewportView(txtareauser);

        btnadd.setText("Agregar Usuario");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        QuotaValueSelected.add(rdbK);
        rdbK.setText("K");

        rdbM.setText("M");
        rdbM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbMActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCrearLayout = new javax.swing.GroupLayout(jPanelCrear);
        jPanelCrear.setLayout(jPanelCrearLayout);
        jPanelCrearLayout.setHorizontalGroup(
            jPanelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCrearLayout.createSequentialGroup()
                .addGroup(jPanelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCrearLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tbladduser))
                    .addGroup(jPanelCrearLayout.createSequentialGroup()
                        .addGroup(jPanelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelCrearLayout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addComponent(btnadd))
                            .addGroup(jPanelCrearLayout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(jPanelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(100, 100, 100)
                                .addGroup(jPanelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtuser)
                                                .addComponent(txtpassword, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
                                            .addComponent(cbxtablespace, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(cbxtemptablespace, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelCrearLayout.createSequentialGroup()
                                        .addComponent(txtquota, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rdbM)
                                            .addComponent(rdbK))))))
                        .addGap(0, 441, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelCrearLayout.setVerticalGroup(
            jPanelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCrearLayout.createSequentialGroup()
                .addGroup(jPanelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelCrearLayout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addGroup(jPanelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtquota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCrearLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cbxtablespace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cbxtemptablespace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rdbK)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdbM)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(tbladduser, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnadd)
                .addContainerGap(128, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("CREAR", jPanelCrear);

        title.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        title.setText("USUARIOS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(title)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btneliminarpriviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarpriviActionPerformed
        // TODO add your handling code here:
        //        String usergrant=(String)jcbusers.getSelectedItem();
        //        if(userdao.RevokeProvolegeTo(usergrant, (String)jcbprivi.getSelectedItem())){
            //            JOptionPane.showMessageDialog(null,"Rol "+(String)jcbprivi.getSelectedItem()+
                //                " ha sido revocado a "+usergrant);
            //        }
    }//GEN-LAST:event_btneliminarpriviActionPerformed

    private void btnanadirpriviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnanadirpriviActionPerformed
        // TODO add your handling code here:
        //        String usergrant=(String)jcbusers.getSelectedItem();
        //        if(userdao.AddPrivilegeToUser(usergrant, (String)jcbprivi.getSelectedItem())){
            //            JOptionPane.showMessageDialog(null,"Rol "+(String)jcbprivi.getSelectedItem()+
                //                " ha sido otorgado a "+usergrant);
            //        }
    }//GEN-LAST:event_btnanadirpriviActionPerformed

    private void jcbpriviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbpriviActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbpriviActionPerformed

    private void jcbtipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbtipoItemStateChanged
//        if (evt.getStateChange() == ItemEvent.SELECTED) {
//            if (this.jcbtipo.getSelectedIndex()>=0) {
//                this.jcbprivi.setModel(new DefaultComboBoxModel(showDAO.getPrivilegio(this.jcbtipo.getSelectedItem().toString())));
//            }
//        }
    }//GEN-LAST:event_jcbtipoItemStateChanged

    private void jcbuser3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbuser3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbuser3ActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        // TODO add your handling code here:
//        String user = txtuser.getText();
//        String pass = txtpassword.getText();
//        String table = (String) cbxtablespace.getSelectedItem();
//        String temp= (String) cbxtemptablespace.getSelectedItem();
//        String qouta= txtquota.getText();
//        userdao.AddUser(user, pass, table, temp, qouta);
    }//GEN-LAST:event_btnaddActionPerformed

    private void txtquotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtquotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtquotaActionPerformed

    private void rdbMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbMActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup QuotaValueSelected;
    private javax.swing.JButton btnactualizarprivi;
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnanadirprivi;
    private javax.swing.JButton btneliminarprivi;
    private javax.swing.JComboBox<String> cbxtablespace;
    private javax.swing.JComboBox<String> cbxtemptablespace;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanelCrear;
    private javax.swing.JPanel jPanelModificar;
    private javax.swing.JPanel jPanelPrivilegios;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JComboBox<String> jcbprivi;
    private javax.swing.JComboBox<String> jcbtablespace2;
    private javax.swing.JComboBox<String> jcbtemporary2;
    private javax.swing.JComboBox<String> jcbtipo;
    private javax.swing.JComboBox<String> jcbuser2;
    private javax.swing.JComboBox<String> jcbuser3;
    private javax.swing.JTable jtableprivi;
    private javax.swing.JTextField newpass1;
    private javax.swing.JTextField newquota1;
    private javax.swing.JRadioButton rdbK;
    private javax.swing.JRadioButton rdbM;
    private javax.swing.JScrollPane tbladduser;
    private javax.swing.JLabel title;
    private javax.swing.JTextArea txtareauser;
    private javax.swing.JTextField txtpassword;
    private javax.swing.JTextField txtquota;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
