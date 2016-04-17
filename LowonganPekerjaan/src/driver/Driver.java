/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver;

import controller.ControllerMMenu;
import controller.ControllerPerusahaan;
import model.Aplikasi;

/**
 *
 * @author Windows 7
 */
public class Driver {
    public static void main(String[] args) {
        Aplikasi app = new Aplikasi();
        ControllerMMenu cm = new ControllerMMenu(app);
        
    }
}
