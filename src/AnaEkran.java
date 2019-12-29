
public class AnaEkran extends javax.swing.JFrame {

    Islemler islemler = new Islemler();
    
    public AnaEkran() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        hTC = new javax.swing.JTextField();
        hAd = new javax.swing.JTextField();
        hSoyad = new javax.swing.JTextField();
        hTarih = new javax.swing.JTextField();
        hSaat = new javax.swing.JTextField();
        rHata = new javax.swing.JLabel();
        rButon = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        dTc = new javax.swing.JTextField();
        dButon = new javax.swing.JButton();
        dHata = new javax.swing.JLabel();
        dSifre = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("T.C Kimlik NO :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 24, 78, -1));

        jLabel2.setText("İsim :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 62, 34, -1));

        jLabel3.setText("Soyisim :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 103, 51, -1));

        jLabel4.setText("Tarih :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 141, 40, -1));

        jLabel5.setText("Saat :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 179, 40, -1));
        jPanel1.add(hTC, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 21, 132, -1));
        jPanel1.add(hAd, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 59, 132, -1));
        jPanel1.add(hSoyad, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 132, 20));
        jPanel1.add(hTarih, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 132, 20));
        jPanel1.add(hSaat, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 176, 131, -1));

        rHata.setForeground(new java.awt.Color(255, 0, 51));
        jPanel1.add(rHata, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, 147, 19));

        rButon.setText("Randevu Al");
        rButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rButonActionPerformed(evt);
            }
        });
        jPanel1.add(rButon, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 132, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Hp\\Documents\\NetBeansProjects\\Hastane1\\steteskop.png")); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 620, 280));

        jTabbedPane1.addTab("      HASTA      ", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setText("T.C. Kimlik NO :");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 48, 94, -1));

        jLabel8.setText("Şifre :");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 90, -1, -1));

        dTc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dTcActionPerformed(evt);
            }
        });
        jPanel2.add(dTc, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 45, 157, -1));

        dButon.setText("GİRİŞ");
        dButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dButonActionPerformed(evt);
            }
        });
        jPanel2.add(dButon, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 138, -1, -1));

        dHata.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(dHata, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 199, 19));
        jPanel2.add(dSifre, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 87, 157, -1));
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 310, 290));

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\Hp\\Desktop\\slide-trtek-web-hbys-ozel.png")); // NOI18N
        jLabel11.setText("jLabel11");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, -10, 620, 300));

        jTabbedPane1.addTab("      DOKTOR      ", jPanel2);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel6.setText("Hastane Bilgi Sistemi");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(149, 149, 149))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dButonActionPerformed

        String tc = dTc.getText();
        String sifre = new String(dSifre.getPassword());

        boolean dGirisDurumu = islemler.doktorGirisi(tc , sifre);

        if(dGirisDurumu){

            dHata.setText("");

            doktorEkrani doktorekran = new doktorEkrani();
            doktorekran.setVisible(true);
            setVisible(false);
        }
        else{
            dHata.setText("LÜTFEN BİLGİLERİNİZİ KONTROL EDİNİZ");
        }
    }//GEN-LAST:event_dButonActionPerformed

    private void dTcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dTcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dTcActionPerformed

    private void rButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rButonActionPerformed
        String tc = hTC.getText();
        String ad = hAd.getText();
        String soyad = hSoyad.getText();
        String tarih = hTarih.getText();
        String saat = hSaat.getText();

        islemler.randevuAl(tc , ad , soyad, tarih ,saat);

        rHata.setText("Randevu Alındı");

        hTC.setText(""); hAd.setText(""); hSoyad.setText(""); hTarih.setText(""); hSaat.setText("");

    }//GEN-LAST:event_rButonActionPerformed

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
            java.util.logging.Logger.getLogger(AnaEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnaEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnaEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnaEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnaEkran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dButon;
    private javax.swing.JLabel dHata;
    private javax.swing.JPasswordField dSifre;
    private javax.swing.JTextField dTc;
    private javax.swing.JTextField hAd;
    private javax.swing.JTextField hSaat;
    private javax.swing.JTextField hSoyad;
    private javax.swing.JTextField hTC;
    private javax.swing.JTextField hTarih;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton rButon;
    private javax.swing.JLabel rHata;
    // End of variables declaration//GEN-END:variables
}
