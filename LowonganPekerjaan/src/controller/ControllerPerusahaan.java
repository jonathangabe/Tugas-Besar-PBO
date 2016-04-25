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
            String idp = prs.getTfIdPrshn();
            if("".equals(namap)){
                JOptionPane.showMessageDialog(prs, "Nama Perusahaan Kosong");
                prs.Reset();
            }
            else if("".equals(name))
            {
                JOptionPane.showMessageDialog(prs, "Nama CEO Kosong");
                prs.Reset();
            }
            else if("".equals(tgl))
            {
                JOptionPane.showMessageDialog(prs, "Tanggal Masih Kosong");
                prs.Reset();
            }
            else if("".equals(idp))
            {
                JOptionPane.showMessageDialog(prs, "ID Perusahaan Kosong");
                prs.Reset();
            }
            else{
                int x2 = Integer.parseInt(idp);
                Perusahaan p = new Perusahaan(namap, name, tgl, x2);
                app.addPerusahaan(p);
                prs.Reset();
            
                JOptionPane.showMessageDialog(prs, "Perusahaan Berhasil di Tambah");
            }
        }
        else if (x.equals(prs.getBtnTerima())){
            int idP = Integer.parseInt(prs.getTfCariIDPelamar1());
            int idL = app.getPelamar(idP).getBerkas().getIdLamaran();
            for (int i=0;i<app.jumlahPerusahaan();i++)    
            {
                for (int j=0;j<app.getPerusahaanIdx(i).jumlahLowongan();j++)  
                    if (idL==app.getPerusahaanIdx(i).getLowonganidx(j).getBerkasMid(idL).getIdLamaran())
                    {
                        app.getPerusahaan(i).getLowonganidx(j).berkasDiterimaId(idL);
                        app.getPerusahaan(i).getLowonganidx(j).removeBerkasMasuk(idL);
                    }
            }
            app.getPelamar(idP).getBerkas().setStatus("Diterima");
            prs.Reset();
            
            JOptionPane.showMessageDialog(prs, "Pelamar Diterima");
        }
        
        else if (x.equals(prs.getBtnHapus())){
            int cid = prs.getTfCariIDPerusahaan();
            app.deletePerusahaan(cid);
            prs.Reset();
            
            JOptionPane.showMessageDialog(prs, "Perusahaan terhapus");
        }
        
        else if (x.equals(prs.getBtnTolak())){
            int idP = Integer.parseInt(prs.getTfCariIDPelamar1());
            int idL = app.getPelamar(idP).getBerkas().getIdLamaran();
            for (int i=0;i<app.jumlahPerusahaan();i++)    
            {
                for (int j=0;j<app.getPerusahaanIdx(i).jumlahLowongan();j++)  
                    if (idL==app.getPerusahaanIdx(i).getLowonganidx(j).getBerkasMid(idL).getIdLamaran())
                    {
                        app.getPerusahaan(i).getLowonganidx(j).removeBerkasMasuk(idL);
                    }
            }
            app.getPelamar(idP).getBerkas().setStatus("Ditolak");
            prs.Reset();
            
            JOptionPane.showMessageDialog(prs, "Pelamar Ditolak");
        }
        
        else if (x.equals(prs.getBtnCari3())){
            int tempC3 = prs.getTfCariIDPelamar();
            Pelamar pl;
            pl = app.getPelamar(tempC3);
            prs.setTxPelamar(pl.DataPelamar());
   
        }
        
        else if (x.equals(prs.getBtnCari4()))
        {
            int tempC4 = Integer.parseInt(prs.getTfCariIDPelamar1());
            Pelamar pl;
            pl = app.getPelamar(tempC4);
            prs.setTxPelamar2(pl.DataPelamar());
        }
        
        else if (x.equals(prs.getBtnCari1())){
            int tempC1 = prs.getTfCariIDPerusahaan();
            Perusahaan ps;
            ps = app.getPerusahaan(tempC1);
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
            int tempC3 = prs.getTfCariIDLowongan();
            for (int i=0;i<app.jumlahPerusahaan();i++)    
            {
                for (int j=0;j<app.getPerusahaanIdx(i).jumlahLowongan();j++)  
                    if (tempC3==app.getPerusahaanIdx(i).getLowonganidx(j).getId())
                    {
                        prs.setTxLowongan(app.getPerusahaanIdx(i).getLowonganidx(j).DataLowongan());
                    }
            }
         }
                
        else if (x.equals(prs.getBtnTambahLowongan())){
            int idp = prs.getTfIdPrshn1();
            int idl = prs.getTfIDLowongan();
            String jns = prs.getTfJenisLowongan();
            String req = prs.getTfRequirement();
            Lowongan l = new Lowongan(jns, req, idl); 
            app.getPerusahaan(idp).createLowongan(l);
            prs.Reset();
            
            JOptionPane.showMessageDialog(prs, "Lowongan Telah Terdaftar");
        }        
        
        else if (x.equals(prs.getBtnHapusLowongan())){
            int cid = prs.getTfCariIDLowongan();
            for (int i=0;i<app.jumlahPerusahaan();i++)
            {
                for (int j=0;j<app.getPerusahaanIdx(i).jumlahLowongan();j++)  
                {    if (cid==app.getPerusahaanIdx(i).getLowonganidx(j).getId())
                    {
                    app.getPerusahaanIdx(i).removeLowongan(cid);
                    }
                }
            }
            prs.Reset();

            JOptionPane.showMessageDialog(prs, "Lowongan terhapus");
        }
    }
    
}
