/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.Aplikasi;
import lowonganpekerjaan.Perusahaan;

import viewMenu.MenuUtama;
import viewPerusahaan.guiPerusahaan;

/**
 *
 * @author Windows 7
 */
public class ControllerPerusahaan implements ActionListener{
    
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
            
        }
        else if (x.equals(prs.getBtnHapus())){
            
        }
        else if (x.equals(prs.getBtnTolak())){
            
        }
        else if (x.equals(prs.getBtncari1())){
            
        }
        else if (x.equals(prs.getBtnBack())){
            
        }
        else if (x.equals(prs.getBtnBack2())){
            
        }
        else if (x.equals(prs.getBtnBack3())){
            
        }
    }
    
}
