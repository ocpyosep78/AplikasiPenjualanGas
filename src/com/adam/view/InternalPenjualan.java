/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.adam.view;

import com.adam.dao.PenjualanDao;
import com.adam.dao.impl.PenjualanDaoImpl;
import com.adam.model.Penjualan;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Date;
import java.text.DateFormat;
import  com.adam.model.Setting;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.DateFormatter;

/**
 *
 * @author saddam
 */
public class InternalPenjualan extends javax.swing.JInternalFrame {
    
    DefaultTableModel model;
    PenjualanDao dao;
    Penjualan p;
    Setting setting;
    FormAplikasi formUtama;
    Frame frame;
    DialogPenjualan dialog;
    DialogUpdatePenjualan dialogUp;
    
    public void setSetting(Setting setting) {
        this.setting = setting;
    }

    public void setFormUtama(FormAplikasi formUtama) {
        this.formUtama = formUtama;
    }

    public FormAplikasi getFormUtama() {
        return formUtama;
    }

    
    
    
    
    /**
     * Creates new form InternalPenjualan
     */
    public InternalPenjualan(Setting setting) {
        initComponents();
        this.setting = setting;
        dao =  new PenjualanDaoImpl();
        p = new Penjualan();
        
        frame = new Frame();
        frame.setLocationRelativeTo(null);
        frame.setSize(300, 300);
        frame.pack();
        dialog = new DialogPenjualan(frame, closable);
        dialogUp = new DialogUpdatePenjualan(frame, closable);
        
        formUtama = getFormUtama();
        refresh();
        
        tblPenjualan.setCellSelectionEnabled(true);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPenjualan = new javax.swing.JTable();
        btnTambah = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        jDialog1.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Transaksi Penjualan");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/com/adam/img/penjualan20.png"))); // NOI18N

        tblPenjualan.setModel(new javax.swing.table.DefaultTableModel(
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
        tblPenjualan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPenjualanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPenjualan);

        btnTambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/adam/img/1386468450_Create.png"))); // NOI18N
        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/adam/img/1386468703_edit-notes.png"))); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.setEnabled(false);
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/adam/img/1386468852_trash.png"))); // NOI18N
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/adam/img/Refresh-15.png"))); // NOI18N
        jButton5.setToolTipText("Refresh");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 183, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnTambah)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEdit)
                    .addComponent(btnHapus)
                    .addComponent(btnTambah))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        refresh();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void tblPenjualanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPenjualanMouseClicked
        btnEdit.setEnabled(true);
        
        int pilih = tblPenjualan.getSelectedRow();
        
        int id = Integer.parseInt(tblPenjualan.getValueAt(pilih, 0).toString());
        p = getObjectFromTable(id);
        
        System.out.println("Id Penjualan : "+p.getIdTrskPjl());
        
    }//GEN-LAST:event_tblPenjualanMouseClicked

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        dialogUp.setIntPjl(this);
        dialogUp.setData();
        dialogUp.setLocationRelativeTo(null);
        dialogUp.setVisible(true);
        
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
        formUtama.refresh();
        refresh();

    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        
        if(p.getIdTrskPjl()==null){
            JOptionPane.showMessageDialog(rootPane, "Pilih Data Yang akan dihapus...", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            int f = JOptionPane.showConfirmDialog(rootPane, "Apakah anda akan menghapus transaksi dengan id : "+p.getIdTrskPjl()+" ?","Konfirmasi Penghapusan",JOptionPane.OK_CANCEL_OPTION );
            if(f == 0){
                dao.delete(p.getIdTrskPjl());
            JOptionPane.showMessageDialog(rootPane, "Data dengan id "+p.getIdTrskPjl()+" berhasil dihapus", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            }
            
        }
        kosongkanData();
        refresh();
    }//GEN-LAST:event_btnHapusActionPerformed
    
    public Penjualan ambilDataUpdate(){
        Penjualan p2 = new Penjualan();
        p2.setIdTrskPjl(p.getIdTrskPjl());
        p2.setHrgSatuan(p.getHrgSatuan());
        p2.setQtyPjl(p.getQtyPjl());
        p2.setSubTotal(p.getSubTotal());
        p2.setTglTrskPjl(p.getTglTrskPjl());
        
        return p2;
    }
    
    public void refresh(){
        String[] nama = {"ID Penjualan", "Tanggal", "Qty", "Harga Satuan", "Jumlah"};
        model = new DefaultTableModel(null, nama);
        dao.addData(model);
        tblPenjualan.setModel(model);
    }
    
    
    Penjualan getObjectFromTable(int id){
        Penjualan p1 = dao.getPenjualan(id);
        return p1;
    }
    
    
    public void initTable(){
        
    }
    public void kosongkanData(){
       p.setIdTrskPjl(null);
    }
    private void btnDialogBatalActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
    }  
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton jButton5;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPenjualan;
    // End of variables declaration//GEN-END:variables

    
}
