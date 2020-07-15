/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel; 
/**
 *
 * @author Rahmat Nur Hidayat_180101167_SI18A1_FIKOM_UDB
 */
public class fpenyewa extends javax.swing.JFrame {
private Connection con;
private Statement st;
private ResultSet RsPenyewa;
private String sql="";

private String id, nama, alamat, hp, ktp;
    /**
     * Creates new form fpenyewa
     */
    public fpenyewa() {
        initComponents();
        KoneksiRental();
        TampilData(sql);
    }
    private void KoneksiRental(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rentalmobil","root","");
            System.out.println("Koneksi Berhasil");
            //JOptionPane.showMessageDialog(null, "DATA PENYEWA");
        } catch (Exception e) {
            System.out.println("Koneksi Gagal \n"+e);
        }
    }
    
        private void TampilData (String sql){
        DefaultTableModel datalist = new DefaultTableModel();
        datalist.addColumn("No");
        datalist.addColumn("ID Penyewa");
        datalist.addColumn("Nama Penyewa");
        datalist.addColumn("Alamat");
        datalist.addColumn("No Hp");
        datalist.addColumn("No KTP");
        try {
            int i = 1;
            st=con.createStatement();
            RsPenyewa=st.executeQuery("select * from tb_penyewa");
            while (RsPenyewa.next())
                datalist.addRow(new Object[]{
                    (""+i++),
                    RsPenyewa.getString(1), RsPenyewa.getString(2),
                    RsPenyewa.getString(3), RsPenyewa.getString(4),
                    RsPenyewa.getString(5)
                });
           tbpenyewa.setModel(datalist);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal Tampil \n"+e.getMessage());
        }
    }
        
        private void bersih(){
        edid.setText("");
        ednama.setText("");
        edalamat.setText("");
        edhp.setText("");
        edktp.setText("");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        edid = new javax.swing.JTextField();
        ednama = new javax.swing.JTextField();
        edalamat = new javax.swing.JTextField();
        edhp = new javax.swing.JTextField();
        edktp = new javax.swing.JTextField();
        btsimpan = new javax.swing.JButton();
        btedit = new javax.swing.JButton();
        btbatal = new javax.swing.JButton();
        bthapus = new javax.swing.JButton();
        btkeluar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbpenyewa = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 255, 204));

        jLabel1.setFont(new java.awt.Font("Eurostar Black Extended", 0, 36)); // NOI18N
        jLabel1.setText("DATA PENYEWA");

        jLabel2.setText("ID Penyewa");

        jLabel3.setText("Nama Penyewa");

        jLabel4.setText("Alamat");

        jLabel5.setText("No Hp");

        jLabel6.setText("No KTP");

        edid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edidActionPerformed(evt);
            }
        });
        edid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                edidKeyPressed(evt);
            }
        });

        edktp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edktpActionPerformed(evt);
            }
        });

        btsimpan.setText("SIMPAN");
        btsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsimpanActionPerformed(evt);
            }
        });

        btedit.setText("EDIT");
        btedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bteditActionPerformed(evt);
            }
        });

        btbatal.setText("BATAL");
        btbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbatalActionPerformed(evt);
            }
        });

        bthapus.setText("HAPUS");
        bthapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthapusActionPerformed(evt);
            }
        });

        btkeluar.setText("KELUAR");
        btkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btkeluarActionPerformed(evt);
            }
        });

        tbpenyewa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbpenyewa);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(edid)
                            .addComponent(ednama)
                            .addComponent(edalamat)
                            .addComponent(edhp)
                            .addComponent(edktp, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btsimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btedit, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btbatal, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bthapus, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btkeluar))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(edid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bthapus)
                    .addComponent(btkeluar)
                    .addComponent(btsimpan)
                    .addComponent(btedit)
                    .addComponent(btbatal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ednama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(edalamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edhp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edktp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void edidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edidActionPerformed

    private void edktpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edktpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edktpActionPerformed

    private void btsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsimpanActionPerformed
        // TODO add your handling code here:
        if (edid.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Data Masih Kosong !");
        }
        else{
        id=String.valueOf(edid.getText());
        nama=String.valueOf(ednama.getText());
        alamat=String.valueOf(edalamat.getText());
        hp=String.valueOf(edhp.getText());
        ktp=String.valueOf(edktp.getText());
        try{
            sql="INSERT INTO tb_penyewa(id_penyewa, nama_penyewa, "
                    + "alamat, no_hp, no_ktp " 
                    + ")VALUE "
                    + "('"+ id +"','"+ nama +"','"+ alamat +"','"+ hp +"',"
                    + "'"+ ktp +"')";
            st=con.createStatement();
            st.execute(sql);
            bersih();
            TampilData(sql);
            JOptionPane.showMessageDialog(null, "Data Tersimpan !");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Tydak Tersimpan !"+e.getMessage());
        }
        }
    }//GEN-LAST:event_btsimpanActionPerformed

    private void btbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbatalActionPerformed
        // TODO add your handling code here:
        bersih();
    }//GEN-LAST:event_btbatalActionPerformed

    private void bthapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthapusActionPerformed
        // TODO add your handling code here:
        if (edid.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Cari Data Yang Ingin Dihapus !");
        }
        else {
        id=String.valueOf(edid.getText());
        try {
            sql="DELETE FROM tb_penyewa where id_penyewa='"+ id +"'";
            st=con.createStatement();
            st.execute(sql);
            bersih();
            TampilData(sql);
            JOptionPane.showMessageDialog(null, "Data Terhapus !");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Data Tydak Terhapus ! \n"+e.getMessage());
        }
        }
    }//GEN-LAST:event_bthapusActionPerformed

    private void edidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edidKeyPressed
        // TODO add your handling code here:
        id=edid.getText();
        int tekanenter=evt.getKeyCode();
        if (tekanenter==10){
            try {
                sql="select * from tb_penyewa where id_penyewa='"+ id +"'";
                st=con.createStatement();
                RsPenyewa=st.executeQuery(sql);
                while (RsPenyewa.next()){
                    ednama.setText(RsPenyewa.getString("nama_penyewa"));
                    edalamat.setText(RsPenyewa.getString(3));
                    edhp.setText(RsPenyewa.getString(4));
                    edktp.setText(RsPenyewa.getString(5));
                   JOptionPane.showMessageDialog(null, "Data Ditemukan !");
                   ednama.requestFocus();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Data Tydak Ditemukan !"+e.getMessage());
            }
        }
    }//GEN-LAST:event_edidKeyPressed

    private void bteditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bteditActionPerformed
        // TODO add your handling code here:
        if (edid.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Cari Data Yang Ingin Diedit !");
        }
        else{
        id=String.valueOf(edid.getText());
        nama=String.valueOf(ednama.getText());
        alamat=String.valueOf(edalamat.getText());
        hp=String.valueOf(edhp.getText());
        ktp=String.valueOf(edktp.getText());
        try{
            sql="UPDATE tb_penyewa set nama_penyewa='"+nama+"',alamat='"+alamat+"',no_hp='"+hp+"',no_ktp='"+ktp+"' where id_penyewa='"+id+"'";
            st=con.createStatement();
            st.execute(sql);
            bersih();
            TampilData(sql);
            JOptionPane.showMessageDialog(null, "Data Terupdate !");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Tydak Terupdate !"+e.getMessage());
        }
        }
    }//GEN-LAST:event_bteditActionPerformed

    private void btkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btkeluarActionPerformed
        // TODO add your handling code here:
        fmenu m=new fmenu();
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_btkeluarActionPerformed

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
            java.util.logging.Logger.getLogger(fpenyewa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fpenyewa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fpenyewa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fpenyewa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fpenyewa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbatal;
    private javax.swing.JButton btedit;
    private javax.swing.JButton bthapus;
    private javax.swing.JButton btkeluar;
    private javax.swing.JButton btsimpan;
    private javax.swing.JTextField edalamat;
    private javax.swing.JTextField edhp;
    private javax.swing.JTextField edid;
    private javax.swing.JTextField edktp;
    private javax.swing.JTextField ednama;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbpenyewa;
    // End of variables declaration//GEN-END:variables
}
