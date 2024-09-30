
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Hasil extends javax.swing.JFrame {

    /**
     * Creates new form pendaftaran
     */
    public Hasil() {
        initComponents();
    }
    
    public Hasil(String nama, String Nim, String TemLahir, String TangLahir, String Jenkel, String alamat, String NoHp, String Fakultas, String prodi){
        initComponents();
        
        textNama.setText(nama);
        textNIM.setText(Nim);
        textTempatLahir.setText(TemLahir);
        textTanggalLahir.setText(TangLahir);
        textJenisKelamin.setText(Jenkel);
        textAlamat.setText(alamat);
        textNoHP.setText(NoHp);
        textFakultas.setText(Fakultas);
        textProdi.setText(prodi);
        
        textNama.setEditable(false);
        textNIM.setEditable(false);
        textTempatLahir.setEditable(false);
        textTanggalLahir.setEditable(false);
        textJenisKelamin.setEditable(false);
        textAlamat.setEditable(false);
        textNoHP.setEditable(false);
        textFakultas.setEditable(false);
        textProdi.setEditable(false);
    };
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGJenisKelamin = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        labelJudul = new javax.swing.JLabel();
        labelSubjudul1 = new javax.swing.JLabel();
        labelNama = new javax.swing.JLabel();
        labelNIM = new javax.swing.JLabel();
        labelTempatLahir = new javax.swing.JLabel();
        labelTanggalLahir = new javax.swing.JLabel();
        labelAlamat = new javax.swing.JLabel();
        labelNoHP = new javax.swing.JLabel();
        labelFakultas = new javax.swing.JLabel();
        labelProdi = new javax.swing.JLabel();
        labelJenisKelamin = new javax.swing.JLabel();
        textNama = new javax.swing.JTextField();
        textNIM = new javax.swing.JTextField();
        textTempatLahir = new javax.swing.JTextField();
        textTanggalLahir = new javax.swing.JTextField();
        textAlamat = new javax.swing.JTextField();
        textNoHP = new javax.swing.JTextField();
        textProdi = new javax.swing.JTextField();
        Keluar = new javax.swing.JButton();
        textJenisKelamin = new javax.swing.JTextField();
        textFakultas = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel2.setBackground(new java.awt.Color(255, 0, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelJudul.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        labelJudul.setForeground(new java.awt.Color(255, 255, 255));
        labelJudul.setText("PENDAFTARAN UKM SENI RUPA");

        labelSubjudul1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        labelSubjudul1.setForeground(new java.awt.Color(255, 255, 255));
        labelSubjudul1.setText("UNIVERSITAS TRUNOJOYO MADURA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(labelJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSubjudul1))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(labelJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelSubjudul1)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        labelNama.setForeground(new java.awt.Color(255, 255, 255));
        labelNama.setText("Nama :");

        labelNIM.setForeground(new java.awt.Color(255, 255, 255));
        labelNIM.setText("NIM :");

        labelTempatLahir.setForeground(new java.awt.Color(255, 255, 255));
        labelTempatLahir.setText("Tempat Lahir :");

        labelTanggalLahir.setForeground(new java.awt.Color(255, 255, 255));
        labelTanggalLahir.setText("Tanggal Lahir :");

        labelAlamat.setForeground(new java.awt.Color(255, 255, 255));
        labelAlamat.setText("Alamat :");

        labelNoHP.setForeground(new java.awt.Color(255, 255, 255));
        labelNoHP.setText("No HP :");

        labelFakultas.setForeground(new java.awt.Color(255, 255, 255));
        labelFakultas.setText("Fakultas :");

        labelProdi.setForeground(new java.awt.Color(255, 255, 255));
        labelProdi.setText("Prodi :");

        labelJenisKelamin.setForeground(new java.awt.Color(255, 255, 255));
        labelJenisKelamin.setText("Jenis Kelamin :");

        textNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNamaActionPerformed(evt);
            }
        });

        textNIM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNIMActionPerformed(evt);
            }
        });

        textTempatLahir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textTempatLahirActionPerformed(evt);
            }
        });

        textTanggalLahir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textTanggalLahirActionPerformed(evt);
            }
        });

        textAlamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textAlamatActionPerformed(evt);
            }
        });

        textNoHP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNoHPActionPerformed(evt);
            }
        });

        textProdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textProdiActionPerformed(evt);
            }
        });

        Keluar.setText("Keluar");
        Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeluarActionPerformed(evt);
            }
        });

        textJenisKelamin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textJenisKelaminActionPerformed(evt);
            }
        });

        textFakultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFakultasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Keluar)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNama)
                            .addComponent(labelNIM)
                            .addComponent(labelTempatLahir)
                            .addComponent(labelTanggalLahir)
                            .addComponent(labelJenisKelamin)
                            .addComponent(labelNoHP)
                            .addComponent(labelAlamat)
                            .addComponent(labelFakultas)
                            .addComponent(labelProdi))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textNIM)
                            .addComponent(textTempatLahir)
                            .addComponent(textTanggalLahir)
                            .addComponent(textAlamat)
                            .addComponent(textNoHP)
                            .addComponent(textProdi)
                            .addComponent(textNama, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(textJenisKelamin)
                            .addComponent(textFakultas))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNama)
                    .addComponent(textNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNIM)
                    .addComponent(textNIM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTempatLahir)
                    .addComponent(textTempatLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textTanggalLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTanggalLahir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelJenisKelamin)
                    .addComponent(textJenisKelamin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelAlamat)
                    .addComponent(textAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNoHP)
                    .addComponent(textNoHP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelFakultas)
                    .addComponent(textFakultas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelProdi)
                    .addComponent(textProdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Keluar)
                .addGap(65, 65, 65))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    
    
    private void textNIMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNIMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNIMActionPerformed

    private void textTanggalLahirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTanggalLahirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textTanggalLahirActionPerformed

    private void textAlamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textAlamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textAlamatActionPerformed

    private void textNoHPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNoHPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNoHPActionPerformed

    private void textProdiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textProdiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textProdiActionPerformed

    private void textNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNamaActionPerformed

    private void textTempatLahirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTempatLahirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textTempatLahirActionPerformed

    private void textJenisKelaminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textJenisKelaminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textJenisKelaminActionPerformed

    private void textFakultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFakultasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFakultasActionPerformed

    private void KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeluarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_KeluarActionPerformed

    
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
            java.util.logging.Logger.getLogger(pendaftaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pendaftaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pendaftaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pendaftaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pendaftaran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Keluar;
    private javax.swing.ButtonGroup btnGJenisKelamin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelAlamat;
    private javax.swing.JLabel labelFakultas;
    private javax.swing.JLabel labelJenisKelamin;
    private javax.swing.JLabel labelJudul;
    private javax.swing.JLabel labelNIM;
    private javax.swing.JLabel labelNama;
    private javax.swing.JLabel labelNoHP;
    private javax.swing.JLabel labelProdi;
    private javax.swing.JLabel labelSubjudul1;
    private javax.swing.JLabel labelTanggalLahir;
    private javax.swing.JLabel labelTempatLahir;
    private javax.swing.JTextField textAlamat;
    private javax.swing.JTextField textFakultas;
    private javax.swing.JTextField textJenisKelamin;
    private javax.swing.JTextField textNIM;
    private javax.swing.JTextField textNama;
    private javax.swing.JTextField textNoHP;
    private javax.swing.JTextField textProdi;
    private javax.swing.JTextField textTanggalLahir;
    private javax.swing.JTextField textTempatLahir;
    // End of variables declaration//GEN-END:variables
}