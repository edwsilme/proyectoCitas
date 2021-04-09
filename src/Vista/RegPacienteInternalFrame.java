package Vista;

public class RegPacienteInternalFrame extends javax.swing.JInternalFrame {
    
    private Controlador.PacienteControl pacienteControlador;

    public RegPacienteInternalFrame() {
        
        initComponents();
        pacienteControlador = new Controlador.PacienteControl(this);
        RegistrarBtn.addActionListener(pacienteControlador);
        NuevoBtn.addActionListener(pacienteControlador);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        IdentificacionTxt = new javax.swing.JTextField();
        NombresTxt = new javax.swing.JTextField();
        ApellidosTxt = new javax.swing.JTextField();
        MasculinoOpt = new javax.swing.JRadioButton();
        FemeninoOpt = new javax.swing.JRadioButton();
        RegistrarBtn = new javax.swing.JButton();
        NuevoBtn = new javax.swing.JButton();
        FechaNacimientoDtc = new com.toedter.calendar.JDateChooser();

        setTitle("Registro de Pacientes");

        jLabel1.setText("Identificacion:");

        jLabel2.setText("Nombres:");

        jLabel3.setText("Apellidos:");

        jLabel4.setText("Fecha de Nacimiento:");

        jLabel5.setText("Sexo:");

        IdentificacionTxt.setName("IdentificacionTxt"); // NOI18N
        IdentificacionTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdentificacionTxtActionPerformed(evt);
            }
        });

        NombresTxt.setName("NombresTxt"); // NOI18N
        NombresTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombresTxtActionPerformed(evt);
            }
        });

        ApellidosTxt.setName("ApellidosTxt"); // NOI18N
        ApellidosTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApellidosTxtActionPerformed(evt);
            }
        });

        MasculinoOpt.setText("M");
        MasculinoOpt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MasculinoOptActionPerformed(evt);
            }
        });

        FemeninoOpt.setText("F");
        FemeninoOpt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FemeninoOptActionPerformed(evt);
            }
        });

        RegistrarBtn.setText("Registrar");
        RegistrarBtn.setName("RegistrarBtn"); // NOI18N

        NuevoBtn.setText("Nuevo");
        NuevoBtn.setName("NuevoBtn"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(MasculinoOpt)
                                .addGap(18, 18, 18)
                                .addComponent(FemeninoOpt)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(IdentificacionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NombresTxt)
                                    .addComponent(ApellidosTxt)
                                    .addComponent(FechaNacimientoDtc, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE))
                                .addGap(48, 48, 48))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(RegistrarBtn)
                .addGap(18, 18, 18)
                .addComponent(NuevoBtn)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(IdentificacionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(NombresTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ApellidosTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(FechaNacimientoDtc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(MasculinoOpt)
                    .addComponent(FemeninoOpt))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RegistrarBtn)
                    .addComponent(NuevoBtn))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FemeninoOptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FemeninoOptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FemeninoOptActionPerformed

    private void IdentificacionTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdentificacionTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdentificacionTxtActionPerformed

    private void NombresTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombresTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombresTxtActionPerformed

    private void ApellidosTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApellidosTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ApellidosTxtActionPerformed

    private void MasculinoOptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MasculinoOptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MasculinoOptActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField ApellidosTxt;
    public com.toedter.calendar.JDateChooser FechaNacimientoDtc;
    public javax.swing.JRadioButton FemeninoOpt;
    public javax.swing.JTextField IdentificacionTxt;
    public javax.swing.JRadioButton MasculinoOpt;
    public javax.swing.JTextField NombresTxt;
    public javax.swing.JButton NuevoBtn;
    public javax.swing.JButton RegistrarBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
