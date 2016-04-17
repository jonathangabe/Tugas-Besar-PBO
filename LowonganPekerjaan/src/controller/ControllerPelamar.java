/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import lowonganpekerjaan.BerkasLamaran;
import lowonganpekerjaan.Pelamar;
import model.Aplikasi;
import viewMenu.MenuUtama;
import viewPelamar.guiPelamar;
import viewPerusahaan.guiPerusahaan;

/**
 *
 * @author Windows 7
 */
public class ControllerPelamar implements ActionListener {
    MenuUtama mu;
    guiPelamar plm;
    Aplikasi app = new Aplikasi();

    ControllerPelamar(Aplikasi apps) {
        plm = new guiPelamar();
        plm.setVisible(true);
        plm.addListener(this);
        app = apps;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object x = e.getSource();
        
        if (x.equals(plm.getBtnDaftar())){
            int pid = plm.getTfIdPelamar();
            String pnama = plm.getTfNamaPel();
            String ptgl = plm.getTfTgl();
            int lid = plm.getTfIdLamaran();
            String pend = plm.getTfPendidikan();
            String pkrj = plm.getTfPekerjaan();
            
            Pelamar p = new Pelamar(pnama, ptgl, pid);
            BerkasLamaran bl = new BerkasLamaran(lid, pkrj, pend, "");
            
            app.addPelamar(p);
            
            JOptionPane.showMessageDialog(plm, "Pelamar Berhasil Mendaftar");
        } 
        else if (x.equals(plm.getBtncari())){
            int tempC = plm.getTxcari();
            
            app.menuSepuluh(tempC);
        }
        else if (x.equals(plm.getBtnBack())){
            mu.setVisible(true);
            plm.setVisible(false);
        }
        else if (x.equals(plm.getBtnBack2())){
            mu.setVisible(true);
            plm.setVisible(false);
        }
    }
       
}
