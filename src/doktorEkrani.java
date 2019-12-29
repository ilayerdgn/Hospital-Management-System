
import java.util.ArrayList;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class doktorEkrani extends javax.swing.JFrame {

    DefaultTableModel model;
    Islemler islemler = new Islemler();
     
    public doktorEkrani() {
        initComponents();
        
        model = (DefaultTableModel) hTablosu.getModel();
        
        hastaGoruntule();
    }

    public void hastaGoruntule(){
        
        model.setRowCount(0);
        ArrayList<Hastalar> hastalar1 = new ArrayList<Hastalar>();
        
        hastalar1 = islemler.hastalarıGetir();
        
        if(hastalar1 != null){
            
            for(Hastalar hasta : hastalar1){
                
                Object[] eklenecek = { hasta.getId(), hasta.getTc(), hasta.getAd(),hasta.getSoyad(),hasta.getTarih(),hasta.getSaat() };
                
                model.addRow(eklenecek);
            }
        
    }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        hTablosu = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dTc_alan = new javax.swing.JTextField();
        dIsim_alan = new javax.swing.JTextField();
        dSoyisim_alan = new javax.swing.JTextField();
        dTarih_alan = new javax.swing.JTextField();
        dId_alan = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        dSaat_alan = new javax.swing.JTextField();
        dGuncellebuton = new javax.swing.JButton();
        dSilbuton = new javax.swing.JButton();
        dArama = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hTablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "TC", "İSİM", "SOYİSİM", "TARİH", "SAAT"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        hTablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hTablosuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(hTablosu);
        if (hTablosu.getColumnModel().getColumnCount() > 0) {
            hTablosu.getColumnModel().getColumn(0).setResizable(false);
            hTablosu.getColumnModel().getColumn(1).setResizable(false);
            hTablosu.getColumnModel().getColumn(2).setResizable(false);
            hTablosu.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 760, 220));

        jLabel1.setText("ID :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 11, -1, -1));

        jLabel2.setText("T.C. Kimlik NO :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 34, -1, -1));

        jLabel3.setText("İsim :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 60, -1, -1));

        jLabel4.setText("Soyisim :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 86, -1, -1));

        jLabel5.setText("Tarih :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 112, -1, -1));
        getContentPane().add(dTc_alan, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 31, 134, -1));
        getContentPane().add(dIsim_alan, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 57, 134, -1));
        getContentPane().add(dSoyisim_alan, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 83, 134, -1));
        getContentPane().add(dTarih_alan, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 109, 134, -1));

        dId_alan.setText("ID");
        getContentPane().add(dId_alan, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 11, 108, -1));

        jLabel7.setText("Saat :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 138, -1, -1));
        getContentPane().add(dSaat_alan, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 135, 134, -1));

        dGuncellebuton.setText("Güncelle");
        dGuncellebuton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dGuncellebutonActionPerformed(evt);
            }
        });
        getContentPane().add(dGuncellebuton, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 161, 90, 30));

        dSilbuton.setText("Sil");
        dSilbuton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dSilbutonActionPerformed(evt);
            }
        });
        getContentPane().add(dSilbuton, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 161, 70, 30));

        dArama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dAramaKeyReleased(evt);
            }
        });
        getContentPane().add(dArama, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, 196, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("ARAMAK İSTEDİĞİNİZ KELİMEYİ GİRİNİZ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 210, 230, -1));

        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-170, 270, 620, 490));

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Hp\\Desktop\\hbys.png")); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -40, 770, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dGuncellebutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dGuncellebutonActionPerformed
        int secilensira = hTablosu.getSelectedRow();
        int id = (int) model.getValueAt(secilensira, 0);
        String tc = dTc_alan.getText();
        String ad = dIsim_alan.getText();
        String soyad = dSoyisim_alan.getText();
        String tarih = dTarih_alan.getText();
        String saat = dSaat_alan.getText();
        
        islemler.hastaGuncelle(id, tc, ad, soyad, tarih, saat);
        
       hastaGoruntule();
        
    }//GEN-LAST:event_dGuncellebutonActionPerformed

    private void dSilbutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dSilbutonActionPerformed
        
        int secilensira = hTablosu.getSelectedRow();
        int id = (int) model.getValueAt(secilensira, 0);
        
        System.out.println(id);
        islemler.hastaSilme(id);
        
        hastaGoruntule();
        
    }//GEN-LAST:event_dSilbutonActionPerformed

    private void hTablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hTablosuMouseClicked
        
        int secilensira = hTablosu.getSelectedRow();
        dId_alan.setText(model.getValueAt(secilensira, 0).toString());
        dTc_alan.setText(model.getValueAt(secilensira, 1).toString());
        dIsim_alan.setText(model.getValueAt(secilensira, 2).toString());
        dSoyisim_alan.setText(model.getValueAt(secilensira, 3).toString());
        dTarih_alan.setText(model.getValueAt(secilensira, 4).toString());
        dSaat_alan.setText(model.getValueAt(secilensira, 5).toString());
        
    }//GEN-LAST:event_hTablosuMouseClicked

    private void dAramaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dAramaKeyReleased
        
        String aranacak = dArama.getText();
        
        aramaYap(aranacak);
        
    }//GEN-LAST:event_dAramaKeyReleased

    public void aramaYap(String aranacak){
        TableRowSorter<DefaultTableModel> ara = new TableRowSorter<DefaultTableModel>(model);
        hTablosu.setRowSorter(ara);
        ara.setRowFilter(RowFilter.regexFilter(aranacak));
        
    }
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
            java.util.logging.Logger.getLogger(doktorEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(doktorEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(doktorEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(doktorEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new doktorEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dArama;
    private javax.swing.JButton dGuncellebuton;
    private javax.swing.JLabel dId_alan;
    private javax.swing.JTextField dIsim_alan;
    private javax.swing.JTextField dSaat_alan;
    private javax.swing.JButton dSilbuton;
    private javax.swing.JTextField dSoyisim_alan;
    private javax.swing.JTextField dTarih_alan;
    private javax.swing.JTextField dTc_alan;
    private javax.swing.JTable hTablosu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
