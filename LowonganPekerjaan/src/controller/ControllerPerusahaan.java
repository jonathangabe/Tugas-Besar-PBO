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
import lowonganpekerjaan.Pelamar;
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
            
            Perusahaan p = new Perusahaan(namap, name, tgl, idp);
            app.addPerusahaan(p);
            prs.Reset();
            
            JOptionPane.showMessageDialog(prs, "Perusahaan Berhasil di Tambah");
        }
        
        else if (x.equals(prs.getBtnTerima())){
            String b = "Diterima";
            int tempT1 = prs.getTfIdPerusahaan();
            int tempT2 = prs.getTfIdLowongan();
            int tempT3 = prs.getTfIdBerkas();
            app.setStatusBerkas(tempT1, tempT2, tempT3, b);
            prs.Reset();
            
            JOptionPane.showMessageDialog(prs, "Pelamar Diterima");
        }
        
        else if (x.equals(prs.getBtnHapus())){
            int cid = prs.getTfIdPrshn();
            app.deletePerusahaan(cid);
            prs.Reset();
            
            JOptionPane.showMessageDialog(prs, "Perusahaan Telah di Hapus");
        }
        
        else if (x.equals(prs.getBtnTolak())){
            String tolak = "Ditolak";
            int tempT1 = prs.getTfIdPerusahaan();
            int tempT2 = prs.getTfIdLowongan();
            int tempT3 = prs.getTfIdBerkas();
            app.setStatusBerkas(tempT1, tempT2, tempT3, tolak);
            prs.Reset();
            
            JOptionPane.showMessageDialog(prs, "Pelamar Ditolak");
        }
        
        else if (x.equals(prs.getBtnCari3())){
            int tempC3 = prs.getTfCariIDPelamar();
            Pelamar pl;
            pl = app.getPelamar(tempC3);
            prs.setTxPelamar(pl.DataPelamar());
   
        }
        
        else if (x.equals(prs.getBtnCari1())){
            int tempC1 = prs.getTfCariIDPerusahaan();
            Perusahaan ps;
            ps = app.getDataPerusahaan(tempC1);
            prs.setTxPerusahaan(ps.DataPerusahaan());
        }
        
        else if (x.equals(prs.getBtnBack())){
            ControllerMMenu cm = new ControllerMMenu(app);
            prs.dispose();
        }
        
        else if (x.equals(prs.getBtnBack2())){
            ControllerMMenu cm = new ControllerMMenu(app);
            prs.dispose();
        }
        
        else if (x.equals(prs.getBtnBack3())){
            ControllerMMenu cm = new ControllerMMenu(app);
            prs.dispose();
        }
        
        else if (x.equals(prs.getBtnBack4())){
            ControllerMMenu cm = new ControllerMMenu(app);
            prs.dispose();
        }
        
        else if (x.equals(prs.getBtnBack5())){
            ControllerMMenu cm = new ControllerMMenu(app);
            prs.dispose();
        }
        
        else if (x.equals(prs.getBtnBack6())){
            ControllerMMenu cm = new ControllerMMenu(app);
            prs.dispose();
        }
        
        else if (x.equals(prs.getBtnCari2())){
            int tempC3 = prs.getTfIdLowongan();
            Lowongan l;
            l = app.getLowongan(tempC3);
            prs.setTxLowongan(l.DataLowongan());
            
        }
        
        else if (x.equals(prs.getBtnCariLowongan())){
            int tempCL = prs.getTfIdLowongan();
            Lowongan l;
            l = app.getLowongan(tempCL);
            prs.setTxLowongan(l.DataLowongan());
        }
        
        else if (x.equals(prs.getBtnCariPelamar())){
            int tempCPl = prs.getTfCariIDPelamar();
            Pelamar pl;
            pl = app.getPelamar(tempCPl);
            prs.setTxPelamar(pl.DataPelamar());
        }
        
        else if (x.equals(prs.getBtnCariPerusahaan())){
            int tempCP = prs.getTfCariIDPerusahaan();
            Perusahaan ps;
            ps = app.getDataPerusahaan(tempCP);
            prs.setTxPerusahaan(ps.DataPerusahaan());
        }
        
        else if (x.equals(prs.getBtnHapusLowongan())){
            int id = prs.getTfCariIDLowongan();
            Perusahaan p = null;
            p.removeLowongan(id);
            
            JOptionPane.showMessageDialog(prs, "Lowongan Telah di Hapus");
        }
        
        else if (x.equals(prs.getBtnTambahLowongan())){
            int idl = prs.getTfIDLowongan();
            String jns = prs.getTfJenis();
            String req = prs.getTfRequirement();
            
            Lowongan l = new Lowongan(jns, req, idl);
            app.addLowongan(l);
            prs.Reset();
            
            JOptionPane.showMessageDialog(prs, "Lowongan Telah Terdaftar");
        }        
    }
    
}
