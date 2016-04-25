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
import lowonganpekerjaan.Lowongan;
import lowonganpekerjaan.Pelamar;
import lowonganpekerjaan.Perusahaan;
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
    Perusahaan p;
    Lowongan l;

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
            
            BerkasLamaran bl = new BerkasLamaran(lid, pkrj, pend, "");   
            Pelamar p = new Pelamar(pnama, ptgl, pid,bl);         
            app.addPelamar(p);
            plm.Reset();
            
            JOptionPane.showMessageDialog(plm, "Pelamar Berhasil Mendaftar");
        }        
        
        else if (x.equals(plm.getBtnBack())){
            ControllerMMenu cm = new ControllerMMenu(app);
            plm.dispose();
        }
        
        else if (x.equals(plm.getBtnBack2())){
            ControllerMMenu cm = new ControllerMMenu(app);
            plm.dispose();
        }
        
        else if (x.equals(plm.getBtnBack3())){
            ControllerMMenu cm = new ControllerMMenu(app);
            plm.dispose();
        }
        else if (x.equals(plm.getBtnBack4())){
            ControllerMMenu cm = new ControllerMMenu(app);
            plm.dispose();
        }
        
        else if (x.equals(plm.getBtnInfo())){
            int idp = plm.getTfCariLamaran();
            plm.setTxInfoPelamar(app.getPelamar(idp).getBerkas().getStatus());
        }
        
        else if (x.equals(plm.getBtnLihatLowongan())){
            for (int i=0;i<app.jumlahPerusahaan();i++)    
            {
                for (int j=0;j<app.getPerusahaanIdx(i).jumlahLowongan();j++) 
                {
                    plm.setTxLowongan(app.getPerusahaanIdx(i).getLowonganidx(j).DataLowongan());
                }
            }
        }
        else if (x.equals(plm.getBtnLihatPerusahaan())){
            for (int i=0;i<app.jumlahPerusahaan();i++)    
            {
              plm.setTxPerusahaan(app.getPerusahaanIdx(i).DataPerusahaan());
            }
        }
    }
       
}
