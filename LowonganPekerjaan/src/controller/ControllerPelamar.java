/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Aplikasi;
import viewMenu.MenuUtama;
import viewPelamar.guiPelamar;
import viewPerusahaan.guiPerusahaan;

/**
 *
 * @author Windows 7
 */
public class ControllerPelamar implements ActionListener {
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
            
        } 
        else if (x.equals(plm.getBtncari())){
            
        }
        else if (x.equals(plm.getBtnBack())){
            
        }
        else if (x.equals(plm.getBtnBack2())){
            
        }
    }
       
}
