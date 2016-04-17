/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import lowonganpekerjaan.BerkasLamaran;
import lowonganpekerjaan.Lowongan;
import model.Aplikasi;
import lowonganpekerjaan.Perusahaan;

import viewMenu.MenuUtama;
import viewPerusahaan.guiPerusahaan;

/**
 *
 * @author Windows 7
 */
public class ControllerPerusahaan implements ActionListener{
    MenuUtama mu;
    guiPerusahaan prs;
    Aplikasi app = new Aplikasi();
 
    public ControllerPerusahaan(Aplikasi ap) {
        prs = new guiPerusahaan();
        prs.setVisible(true);
        prs.addListener(this);
        app = ap;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object x = e.getSource();
        
        if (x.equals(prs.getBtnDaftar())){
            String namap = prs.getTfNamaPrshn();
            String name = prs.getTfNamaCEO();
            String tgl = prs.getTfTgl();
            int idp = prs.getTfIdPrshn();
            
            Perusahaan p = new Perusahaan(name, name, tgl, idp);
            app.addPerusahaan(p);
            
            JOptionPane.showMessageDialog(prs, "Perusahaan Berhasil di Tambah");
        } 
        else if (x.equals(prs.getBtnTerima())){
            String b = "Diterima";
            app.setStatusBerkas(0, 0, 0, b);
            
            JOptionPane.showMessageDialog(prs, "Pelamar Diterima");
        }
        else if (x.equals(prs.getBtnHapus())){
            int cid = prs.getTfIdPrshn();
            app.deletePerusahaan(cid);
            
            JOptionPane.showMessageDialog(prs, "Perusahaan Telah di Hapus");
        }
        else if (x.equals(prs.getBtnTolak())){
            String tolak = "Ditolak";
            app.setStatusBerkas(0, 0, 0, tolak);
            
            JOptionPane.showMessageDialog(prs, "Pelamar Ditolak");
        }
        else if (x.equals(prs.getBtncari())){
            int tempC1 = prs.getTfcari();
            
        }
        else if (x.equals(prs.getBtncari2())){
            int tempC2 = prs.getTfcari2();
        }
        else if (x.equals(prs.getBtnBack())){
            mu.setVisible(true);
            prs.setVisible(false);
        }
        else if (x.equals(prs.getBtnBack2())){
            mu.setVisible(true);
            prs.setVisible(false);
        }
        else if (x.equals(prs.getBtnBack3())){
            mu.setVisible(true);
            prs.setVisible(false);
        }
    }
    
}
