/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import lowonganpekerjaan.Aplikasi;
import view.MenuPerusahaan;
import view.MenuUtama;
import view.RemovePerusahaan;
import view.TambahPerusahaan;
import view.ViewPerusahaan;

/**
 *
 * @author Windows 7
 */
public class controller implements ActionListener{

    TambahPerusahaan addP;
    RemovePerusahaan delP;
    ViewPerusahaan viewP;
    MenuUtama mu;
    MenuPerusahaan mp;
    
    Aplikasi app = new Aplikasi();
    
    public controller() {
        addP = new TambahPerusahaan();        
        delP = new RemovePerusahaan();      
        viewP = new ViewPerusahaan();      
        mu = new MenuUtama();        
        mp = new MenuPerusahaan();    
        
        addP.addListener(this);
        delP.addListener(this);
        viewP.addListener(this);
        mu.addListener(this);
        mp.addListener(this);
        
        mu.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object x = e.getSource();
        
        //Menu Utama
        if(x.equals(mu.getbtnPrshn())){
            mp.setVisible(true);
            mu.setVisible(false);
        }
        if (x.equals(mu.getbtnPelamar())){
                            
        }
        if (x.equals(mp.getBtnTambahPerusahaan())){
            addP.setVisible(true);
            mp.setVisible(false);
        }
        if (x.equals(mp.getBtnTambahLowongan())){
            
        }
        if (x.equals(mp.getBtnHapusPerusahaan())){
            delP.setVisible(true);
            mp.setVisible(false);
        }
        if (x.equals(mp.getBtnHapusLowongan())){
            
        }
        if (x.equals(mp.getBtnLihatPerusahaan())){
            viewP.setVisible(true);
            mp.setVisible(false);
        }
        if (x.equals(mp.getBtnLihatLowongan())){
            
        }
        if (x.equals(mp.getBtnBack())){
            mp.setVisible(false);
            mu.setVisible(true);
        }
        if (x.equals(addP.getbtnBack())){
            mp.setVisible(true);
            addP.setVisible(false);
        }
        if (x.equals(delP.getBtnKembali())){
            mp.setVisible(true);
            delP.setVisible(false);
        }
        if (x.equals(viewP.getBtnKembali())){
            mp.setVisible(true);
            viewP.setVisible(false);
        }
        if (x.equals(addP.getbtnDaftar())){
            
        }
    }
    
}
