/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lowonganpekerjaan;
import java.util.ArrayList;
/**
 *
 * @author user
 */
public class Aplikasi{
	private ArrayList<Perusahaan> daftarPerusahaan = new ArrayList<Perusahaan>();
	private ArrayList<Pelamar> daftarPelamar = new ArrayList<Pelamar>();
	
	public void addPerusahaan(Perusahaan p)
	{
		daftarPerusahaan.add(p);
	}
	
	public void addPelamar(Pelamar pl)
	{
		daftarPelamar.add(pl);
	}
	
	public Perusahaan getPerusahaan(int id)
	{
		Perusahaan p = null;
            for (int i=0;i<daftarPerusahaan.size();i++){
                if (id==daftarPerusahaan.get(i).getId()){
                    p=daftarPerusahaan.get(i);
                }
            }
                return p;
	}
	
	public Pelamar getPelamar(int id)
	{
		Pelamar pl = null;
            for (int i=0;i<daftarPelamar.size();i++){
                if (id==daftarPelamar.get(i).getId()){
                    pl=daftarPelamar.get(i);
                }
            }
                return pl;
	}
	
	public void deletePerusahaan(int id)
	{
        for (int i=0;i<daftarPerusahaan.size();i++){
                if (id==daftarPerusahaan.get(i).getId()){
                    daftarPerusahaan.remove(i);
                }
            }    
	}	
	
	public void deletePelamar(int id)
	{
		for (int i=0;i<daftarPelamar.size();i++){
                if (id==daftarPelamar.get(i).getId()){
                    daftarPelamar.remove(i);
                }
            }
	}
}
