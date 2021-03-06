/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adam.view;

import com.adam.dao.PenjualanDao;
import com.adam.dao.PersediaanDao;
import com.adam.dao.SettingDao;
import com.adam.dao.impl.PenjualanDaoImpl;
import com.adam.dao.impl.PersediaanDaoImpl;
import com.adam.dao.impl.SettingDaoImpl;
import com.adam.model.Penjualan;
import com.adam.model.Persediaan;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import com.adam.model.Setting;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author saddam
 */
public class DialogPenjualan extends javax.swing.JDialog {

    private PenjualanDao dao;
    DefaultTableModel model;
    PersediaanDao pDao;
    Setting s;
    Penjualan p;
    Persediaan prs;
    SettingDao sDao;
    float satuan;
    
    public void setLblJumlah(JLabel lblJumlah) {
        this.lblJumlah = lblJumlah;
    }

    public void setTxtSatuan(JTextField txtSatuan) {
        this.txtSatuan = txtSatuan;
    }

    public void setP(Penjualan p) {
        this.p = p;
    }

    public void setS(Setting s) {
        this.s = s;
    }

    public Persediaan getPrs() {
        return prs;
    }

    public void setPrs(Persediaan prs) {
        this.prs = prs;
    }

    /**
     * Creates new form DialogPenjualan
     */
    public DialogPenjualan(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        sDao = new SettingDaoImpl();
        dao = new PenjualanDaoImpl();
        p = new Penjualan();
        satuan = sDao.getSetting(new Setting(1)).getHrgStg();

        txtSatuan.setText("Rp. " + satuan+",-");
        pDao = new PersediaanDaoImpl();
        prs = pDao.getPersediaan(new Persediaan(1));
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtSatuan = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lblRp = new javax.swing.JLabel();
        lblJumlah = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtDate = new datechooser.beans.DateChooserCombo();
        cboBanyak = new javax.swing.JComboBox();
        btnExit = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Tambah/Edit Penjualan");
        setAlwaysOnTop(true);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Detail Penjualan"));
        jPanel1.setToolTipText("");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Tanggal :");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Banyak :");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Satuan :");

        txtSatuan.setEditable(false);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Jumlah :");

        lblRp.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        lblRp.setText("Rp.");

        lblJumlah.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        lblJumlah.setText("0");

        jLabel6.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel6.setText(",-");

        cboBanyak.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        cboBanyak.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboBanyakMouseClicked(evt);
            }
        });
        cboBanyak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboBanyakActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSatuan, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblRp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblJumlah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6))
                    .addComponent(txtDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboBanyak, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cboBanyak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSatuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblRp)
                    .addComponent(lblJumlah)
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnTambah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambah)
                    .addComponent(btnExit))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        
        int banyak = Integer.parseInt(cboBanyak.getSelectedItem().toString());
        System.out.println(banyak);
        System.out.println(prs.getJmlPrsd());
        System.out.print((prs.getJmlPrsd()-banyak) >= 0);
        if ((prs.getJmlPrsd()-banyak) >= 0) {
            Date tgl = txtDate.getSelectedDate().getTime();

            
            float jml = Float.valueOf(lblJumlah.getText());

            p.setTglTrskPjl(tgl);
            p.setHrgSatuan(satuan);
            p.setQtyPjl(banyak);
            p.setSubTotal(jml);
            prs.setJmlPrsd(prs.getJmlPrsd() - banyak);
            pDao.edit(prs);
            dao.tambah(p);
            cboBanyak.setSelectedIndex(0);
            lblJumlah.setText("0");
            JOptionPane.showMessageDialog(rootPane, "Transaksi berhasil disimpan..!", "Sukses!", JOptionPane.INFORMATION_MESSAGE);
            dispose();
            
        } else {
            JOptionPane.showMessageDialog(rootPane, "Barang Tidak Cukup untuk pengeluaran !", "Error", JOptionPane.ERROR_MESSAGE);
            
        }


    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed

        lblJumlah.setText("0");
        cboBanyak.setSelectedIndex(0);
        dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void cboBanyakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboBanyakActionPerformed

        int banyak = Integer.parseInt(cboBanyak.getSelectedItem().toString());
        
        float jml = getJumlah(banyak, satuan);
        lblJumlah.setText("" + jml);

    }//GEN-LAST:event_cboBanyakActionPerformed

    private void cboBanyakMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboBanyakMouseClicked

    }//GEN-LAST:event_cboBanyakMouseClicked

    public float getJumlah(int qty, float harga) {
        float jml = qty * harga;
        return jml;
    }
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnTambah;
    private javax.swing.JComboBox cboBanyak;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblJumlah;
    private javax.swing.JLabel lblRp;
    private datechooser.beans.DateChooserCombo txtDate;
    private javax.swing.JTextField txtSatuan;
    // End of variables declaration//GEN-END:variables
}
