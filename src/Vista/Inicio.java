/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author Vanessa Estefania Corredor Andrade
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
       setLocationRelativeTo(null);
       //jframe transparente
       setBackground(new Color(0, 255, 0, 0)); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField6 = new javax.swing.JTextField();
        panelPresentacion = new javax.swing.JPanel();
        btnPnSesion = new javax.swing.JButton();
        btnPnRegister = new javax.swing.JButton();
        textoinfo = new javax.swing.JLabel();
        Reloj = new javax.swing.JLabel();
        tlAgenda = new javax.swing.JLabel();
        lbfondorosa = new javax.swing.JLabel();
        Fondo = new javax.swing.JPanel();
        PnSlider = new diu.swe.habib.JPanelSlider.JPanelSlider();
        PnInisio = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BtnLogin = new javax.swing.JButton();
        input_inicio_email = new javax.swing.JTextField();
        input_inicio_password = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        PnRegistro = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        BtnRegistrarUsuario = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JPasswordField();
        txtComfirContraseña = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        Btnclosed = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jTextField6.setFont(new java.awt.Font("Corbel", 3, 14)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(240, 104, 104));
        jTextField6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(240, 104, 104)));
        jTextField6.setName("TxtUusuario"); // NOI18N
        jTextField6.setOpaque(false);
        jTextField6.setSelectionColor(new java.awt.Color(240, 104, 104));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelPresentacion.setBackground(new java.awt.Color(240, 104, 104));
        panelPresentacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPnSesion.setBackground(new java.awt.Color(237, 247, 152));
        btnPnSesion.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        btnPnSesion.setForeground(new java.awt.Color(240, 104, 104));
        btnPnSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/icons8-enter-40.png"))); // NOI18N
        btnPnSesion.setText("Iniciar sesion");
        btnPnSesion.setBorder(null);
        btnPnSesion.setBorderPainted(false);
        btnPnSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPnSesion.setFocusable(false);
        btnPnSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPnSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPnSesionMouseExited(evt);
            }
        });
        btnPnSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPnSesionActionPerformed(evt);
            }
        });
        panelPresentacion.add(btnPnSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 120, -1));

        btnPnRegister.setBackground(new java.awt.Color(128, 214, 255));
        btnPnRegister.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        btnPnRegister.setForeground(new java.awt.Color(240, 104, 104));
        btnPnRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/icons8-registration-40.png"))); // NOI18N
        btnPnRegister.setText("Registrate");
        btnPnRegister.setBorder(null);
        btnPnRegister.setBorderPainted(false);
        btnPnRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPnRegister.setFocusPainted(false);
        btnPnRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPnRegisterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPnRegisterMouseExited(evt);
            }
        });
        btnPnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPnRegisterActionPerformed(evt);
            }
        });
        panelPresentacion.add(btnPnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 120, -1));

        textoinfo.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        textoinfo.setForeground(new java.awt.Color(255, 255, 255));
        textoinfo.setText("¡Bienvenido a agenda !");
        panelPresentacion.add(textoinfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        Reloj.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Loading/reloj.png"))); // NOI18N
        panelPresentacion.add(Reloj, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        tlAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Loading/texto.png"))); // NOI18N
        panelPresentacion.add(tlAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        lbfondorosa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Loading/fondo.png"))); // NOI18N
        panelPresentacion.add(lbfondorosa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 302, 510));

        getContentPane().add(panelPresentacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 10, 300, 490));

        Fondo.setBackground(new java.awt.Color(255, 255, 255));
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PnSlider.setBorder(null);
        PnSlider.setName("PnSlider"); // NOI18N

        PnInisio.setBackground(new java.awt.Color(255, 255, 255));
        PnInisio.setForeground(new java.awt.Color(128, 214, 255));
        PnInisio.setName("PnInisio"); // NOI18N

        jLabel1.setFont(new java.awt.Font("Corbel", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 104, 104));
        jLabel1.setText("Iniciar Sesión");

        BtnLogin.setBackground(new java.awt.Color(240, 104, 104));
        BtnLogin.setFont(new java.awt.Font("Corbel", 3, 14)); // NOI18N
        BtnLogin.setForeground(new java.awt.Color(255, 255, 255));
        BtnLogin.setText("Iniciar sesión");
        BtnLogin.setBorder(null);
        BtnLogin.setBorderPainted(false);
        BtnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnLogin.setFocusPainted(false);
        BtnLogin.setRolloverEnabled(true);
        BtnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnLoginMouseExited(evt);
            }
        });
        BtnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLoginActionPerformed(evt);
            }
        });

        input_inicio_email.setForeground(new java.awt.Color(240, 104, 104));
        input_inicio_email.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(240, 104, 104)));
        input_inicio_email.setName("txtEmail"); // NOI18N

        input_inicio_password.setForeground(new java.awt.Color(240, 104, 104));
        input_inicio_password.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(240, 104, 104)));
        input_inicio_password.setName("txtContraseña"); // NOI18N

        jLabel2.setFont(new java.awt.Font("Corbel", 3, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 104, 104));
        jLabel2.setText("Email");

        jLabel3.setFont(new java.awt.Font("Corbel", 3, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 104, 104));
        jLabel3.setText("Contraseña");

        javax.swing.GroupLayout PnInisioLayout = new javax.swing.GroupLayout(PnInisio);
        PnInisio.setLayout(PnInisioLayout);
        PnInisioLayout.setHorizontalGroup(
            PnInisioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnInisioLayout.createSequentialGroup()
                .addGroup(PnInisioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnInisioLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(PnInisioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(input_inicio_password, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(input_inicio_email, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PnInisioLayout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(BtnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PnInisioLayout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jLabel1)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        PnInisioLayout.setVerticalGroup(
            PnInisioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnInisioLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(input_inicio_email, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(1, 1, 1)
                .addComponent(input_inicio_password, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(BtnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        PnSlider.add(PnInisio, "card2");

        PnRegistro.setBackground(new java.awt.Color(255, 255, 255));
        PnRegistro.setName("PnRegistro"); // NOI18N

        jLabel6.setFont(new java.awt.Font("Corbel", 3, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 104, 104));
        jLabel6.setText("Registrate");

        txtNombres.setForeground(new java.awt.Color(240, 104, 104));
        txtNombres.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(240, 104, 104)));
        txtNombres.setName("RtxtNombres"); // NOI18N

        jLabel7.setFont(new java.awt.Font("Corbel", 3, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 104, 104));
        jLabel7.setText("Nombres");

        BtnRegistrarUsuario.setBackground(new java.awt.Color(240, 104, 104));
        BtnRegistrarUsuario.setFont(new java.awt.Font("Corbel", 3, 14)); // NOI18N
        BtnRegistrarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        BtnRegistrarUsuario.setText("Registrate");
        BtnRegistrarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnRegistrarUsuarioMouseClicked(evt);
            }
        });
        BtnRegistrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegistrarUsuarioActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Corbel", 3, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 104, 104));
        jLabel8.setText("Apellidos");

        txtApellidos.setForeground(new java.awt.Color(240, 104, 104));
        txtApellidos.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(240, 104, 104)));
        txtApellidos.setName("RtxtApellidos"); // NOI18N

        jLabel9.setFont(new java.awt.Font("Corbel", 3, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(240, 104, 104));
        jLabel9.setText("Email");

        txtEmail.setForeground(new java.awt.Color(240, 104, 104));
        txtEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(240, 104, 104)));
        txtEmail.setName("RtxtEmail"); // NOI18N

        jLabel10.setFont(new java.awt.Font("Corbel", 3, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(240, 104, 104));
        jLabel10.setText("Contraseña");

        txtContraseña.setForeground(new java.awt.Color(240, 104, 104));
        txtContraseña.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(240, 104, 104)));
        txtContraseña.setName("RContraseña"); // NOI18N

        txtComfirContraseña.setForeground(new java.awt.Color(240, 104, 104));
        txtComfirContraseña.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(240, 104, 104)));
        txtComfirContraseña.setName("RtxtComContraeña"); // NOI18N

        jLabel11.setFont(new java.awt.Font("Corbel", 3, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(240, 104, 104));
        jLabel11.setText("Comfirmar contraseña");

        javax.swing.GroupLayout PnRegistroLayout = new javax.swing.GroupLayout(PnRegistro);
        PnRegistro.setLayout(PnRegistroLayout);
        PnRegistroLayout.setHorizontalGroup(
            PnRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnRegistroLayout.createSequentialGroup()
                .addGroup(PnRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnRegistroLayout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(jLabel6))
                    .addGroup(PnRegistroLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(PnRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PnRegistroLayout.createSequentialGroup()
                                .addGroup(PnRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                .addGroup(PnRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtComfirContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(64, 64, 64))
            .addGroup(PnRegistroLayout.createSequentialGroup()
                .addGap(227, 227, 227)
                .addComponent(BtnRegistrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PnRegistroLayout.setVerticalGroup(
            PnRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnRegistroLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PnRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PnRegistroLayout.createSequentialGroup()
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PnRegistroLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtComfirContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addComponent(BtnRegistrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        PnSlider.add(PnRegistro, "card3");

        Fondo.add(PnSlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 580, 390));
        PnSlider.getAccessibleContext().setAccessibleDescription("");

        Btnclosed.setBackground(new java.awt.Color(255, 255, 255));
        Btnclosed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/close.png"))); // NOI18N
        Btnclosed.setBorder(null);
        Btnclosed.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btnclosed.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/closed hover.png"))); // NOI18N
        Btnclosed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnclosedMouseClicked(evt);
            }
        });
        Btnclosed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnclosedActionPerformed(evt);
            }
        });
        Fondo.add(Btnclosed, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 20, 54, 40));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/icons8-minus-40 (1).png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/icons8-menos-40 (1).png"))); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        Fondo.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 20, -1, -1));

        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 1050, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPnRegisterActionPerformed
       
    }//GEN-LAST:event_btnPnRegisterActionPerformed

    private void btnPnSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPnSesionActionPerformed
    
    }//GEN-LAST:event_btnPnSesionActionPerformed

    private void BtnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnLoginActionPerformed

    private void BtnclosedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnclosedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnclosedActionPerformed

    private void BtnclosedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnclosedMouseClicked
      this.dispose();
    }//GEN-LAST:event_BtnclosedMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
      this.setState(JFrame.ICONIFIED); 
    }//GEN-LAST:event_jButton1MouseClicked

    private void BtnLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnLoginMouseEntered
       BtnLogin.setBackground(new Color (237,247,152));
              BtnLogin.setForeground(Color.BLACK);

    }//GEN-LAST:event_BtnLoginMouseEntered

    private void BtnLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnLoginMouseExited
        BtnLogin.setBackground(new Color (240,104,104));
                      BtnLogin.setForeground(Color.WHITE);

    }//GEN-LAST:event_BtnLoginMouseExited

    private void btnPnSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPnSesionMouseEntered
       btnPnSesion.setBackground(new Color (240,104,104));
                      btnPnSesion.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnPnSesionMouseEntered

    private void btnPnSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPnSesionMouseExited
         btnPnSesion.setBackground(new Color (237,247,152));
              btnPnSesion.setForeground(new Color (240,104,104));
    }//GEN-LAST:event_btnPnSesionMouseExited

    private void btnPnRegisterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPnRegisterMouseEntered
         btnPnRegister.setBackground(new Color (240,104,104));
                      btnPnRegister.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnPnRegisterMouseEntered

    private void btnPnRegisterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPnRegisterMouseExited
      btnPnRegister.setBackground(new Color (128,214,255));
              btnPnRegister.setForeground(new Color (240,104,104));
    }//GEN-LAST:event_btnPnRegisterMouseExited

    private void BtnRegistrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegistrarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnRegistrarUsuarioActionPerformed

    private void BtnRegistrarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnRegistrarUsuarioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnRegistrarUsuarioMouseClicked

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BtnLogin;
    public static javax.swing.JButton BtnRegistrarUsuario;
    private javax.swing.JButton Btnclosed;
    private javax.swing.JPanel Fondo;
    public javax.swing.JPanel PnInisio;
    public javax.swing.JPanel PnRegistro;
    public diu.swe.habib.JPanelSlider.JPanelSlider PnSlider;
    private javax.swing.JLabel Reloj;
    public javax.swing.JButton btnPnRegister;
    public javax.swing.JButton btnPnSesion;
    public javax.swing.JTextField input_inicio_email;
    public javax.swing.JTextField input_inicio_password;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel lbfondorosa;
    private javax.swing.JPanel panelPresentacion;
    private javax.swing.JLabel textoinfo;
    private javax.swing.JLabel tlAgenda;
    public javax.swing.JTextField txtApellidos;
    public javax.swing.JPasswordField txtComfirContraseña;
    public javax.swing.JPasswordField txtContraseña;
    public javax.swing.JTextField txtEmail;
    public javax.swing.JTextField txtNombres;
    // End of variables declaration//GEN-END:variables
}
