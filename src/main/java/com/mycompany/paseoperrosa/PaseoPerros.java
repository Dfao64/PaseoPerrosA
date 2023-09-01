package com.mycompany.paseoperrosa;
import javax.swing.JOptionPane;
public class PaseoPerros extends javax.swing.JFrame {
    public PaseoPerros() {
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

        perro = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        numHora = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 153));

        perro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        perro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perroActionPerformed(evt);
            }
        });

        jLabel1.setText("Seleccione el número de perros que desea pasear (Max 5)");

        numHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numHoraActionPerformed(evt);
            }
        });

        jLabel2.setText("Ingrese el número de horas de paseo");

        jButton1.setText("Siguiente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel3.setText("Bienvenido, por favor ingrese los siguientes datos para continuar con el registro.");

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Desktop\\Tarea Java\\perro1.jpg")); // NOI18N
        jLabel4.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(123, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(117, 117, 117)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(perro, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(numHora, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel3)
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(perro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(numHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jButton1))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(95, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void perroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perroActionPerformed
        
    }//GEN-LAST:event_perroActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        double numPerro, horasP,tipo,costoG = 0,costoM = 0,costoP = 0,costoD,costoT1,costoT2;
        numPerro = Integer.parseInt((String) perro.getSelectedItem());
        horasP = Integer.parseInt(numHora.getText());
        if (numPerro>1) {
            //horasP = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número de horas que va a pasear a su(s) perro(s)"));
            for (int i = 0; i < numPerro; i++) {
                tipo = Integer.parseInt(JOptionPane.showInputDialog(this,"Ingresa el tipo de perro del perro (1 = grande, 2 = mediano, 3 = pequeño)"));
                if (tipo == 1) {
                    costoG = horasP * 10000+costoG;
                } else if(tipo == 2){
                    costoM = horasP *5000+costoM;
                } else if(tipo == 3){
                    costoP = horasP * 3000+costoP;
                }
            }
            costoD = (costoG+costoM+costoP)*0.10;
            costoT1 =(costoG+costoM+costoP)-costoD;
            JOptionPane.showMessageDialog(this, "El costo total es de :"+costoT1);
        } 
        else if(numPerro<=1){
            //horasP = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número de horas que va a pasear a su(s) perro(s)"));
            tipo = Integer.parseInt(JOptionPane.showInputDialog(this, "Ingresa el tipo de perro del perro (1 = grande, 2 = mediano, 3 = pequeño)"));
            if (tipo == 1) {
                costoG = horasP * 10000+costoG;
                } else if(tipo == 2){
                costoM = horasP *5000+costoM;
                } else if(tipo == 3){
                costoP = horasP * 3000+costoP;
                }
            costoT2 = costoG+costoM+costoP;
            JOptionPane.showMessageDialog(this, "Total a pagar :"+costoT2);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void numHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numHoraActionPerformed

    }//GEN-LAST:event_numHoraActionPerformed

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
            java.util.logging.Logger.getLogger(PaseoPerros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaseoPerros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaseoPerros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaseoPerros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaseoPerros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField numHora;
    private javax.swing.JComboBox<String> perro;
    // End of variables declaration//GEN-END:variables
}
