/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.adam.view;

import com.adam.dao.PersediaanDao;
import com.adam.dao.SettingDao;
import com.adam.dao.impl.PersediaanDaoImpl;
import com.adam.dao.impl.SettingDaoImpl;
import com.adam.model.Persediaan;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author saddam
 */
public class FormAplikasi extends javax.swing.JFrame {
    InternalPenjualan intPjl;
    /**
     * Creates new form FormAplikasi
     */
    
    SettingDao sDao;
    Setting settingView;
    PersediaanDao pDao;
    Persediaan persediaan;
    com.adam.model.Setting setting;
    public FormAplikasi() {
        initComponents();
        
        
        sDao = new SettingDaoImpl();
        pDao = new PersediaanDaoImpl();
        persediaan = new Persediaan(1);
        setting = new com.adam.model.Setting(1);
        refresh();
        txtHrgDefault.setText("Rp. "+setting.getHrgStg());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        layerAplikasi = new javax.swing.JDesktopPane();
        jToolBar1 = new javax.swing.JToolBar();
        jLabel1 = new javax.swing.JLabel();
        txtPrsdGas = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtHrgDefault = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Penjualan Dan Pembelian Gas");

        javax.swing.GroupLayout layerAplikasiLayout = new javax.swing.GroupLayout(layerAplikasi);
        layerAplikasi.setLayout(layerAplikasiLayout);
        layerAplikasiLayout.setHorizontalGroup(
            layerAplikasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        layerAplikasiLayout.setVerticalGroup(
            layerAplikasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
        );

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        jLabel1.setText("Persediaan Gas : ");
        jToolBar1.add(jLabel1);

        txtPrsdGas.setEditable(false);
        jToolBar1.add(txtPrsdGas);

        jLabel2.setText("  Harga Satuan Gas : ");
        jToolBar1.add(jLabel2);

        txtHrgDefault.setEditable(false);
        jToolBar1.add(txtHrgDefault);

        jMenu1.setText("Menu");

        jMenuItem1.setText("Penjualan");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Pembelian");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Setting");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Exit");
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Help");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(layerAplikasi)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(layerAplikasi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        
        if(intPjl == null){
            intPjl = new InternalPenjualan(setting);
        }
        if(intPjl.isVisible()){
            JOptionPane.showMessageDialog(this, "Internal Penjualan telah aktif..");
        }else{
            layerAplikasi.add(intPjl);
            intPjl.setSetting(setting);
            
        intPjl.setVisible(true);
        try {
            intPjl.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(FormAplikasi.class.getName()).log(Level.SEVERE, null, ex);
        }
        }       
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        settingView = new Setting(this, true);
        settingView.setDao(sDao);
        settingView.setTxtHrg(String.valueOf(sDao.getSetting(setting).getHrgStg()));
        
        settingView.setVisible(true);
        settingView.setAlwaysOnTop(true);
        refresh();
        System.out.println("Setting harga : "+setting.getHrgStg());
    }//GEN-LAST:event_jMenuItem3ActionPerformed
    
    public void refresh(){
        setting = sDao.getSetting(new com.adam.model.Setting(1));
        persediaan = pDao.getPersediaan(new Persediaan(1));
        txtHrgDefault.setText("Rp. "+setting.getHrgStg());
        txtPrsdGas.setText(""+persediaan.getJmlPrsd()+" tabung");
    }
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JDesktopPane layerAplikasi;
    private javax.swing.JTextField txtHrgDefault;
    private javax.swing.JTextField txtPrsdGas;
    // End of variables declaration//GEN-END:variables
}
