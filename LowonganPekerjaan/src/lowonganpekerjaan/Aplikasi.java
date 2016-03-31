/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lowonganpekerjaan;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Aplikasi{
	private ArrayList<Perusahaan> daftarPerusahaan = new ArrayList<Perusahaan>();
	private ArrayList<Pelamar> daftarPelamar = new ArrayList<Pelamar>();
	Scanner in = new Scanner(System.in);
        int pil;
        
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
                    System.out.println("Perusahaan dengan ID "+daftarPerusahaan.get(i).getId()+" telah dihapus");
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
        
        public void menuSatu(Perusahaan p)
        {
            addPerusahaan(p);
        }
        
        public void menuDua(int id,Lowongan l)
        {
            getPerusahaan(id).createLowongan(l);
        }
        
        public void menuTiga(Pelamar pl)
        {
            addPelamar(pl);
        }
        
        public void menuEmpat(int id)
        {
            deletePerusahaan(id);
        }
        
        public void menuLima(int id,int idl)
        {
            getPerusahaan(id).removeLowongan(idl);
        }
        
        public void menuEnam(int id)
        {
            deletePelamar(id);
        }
        
        public void menuTujuh(int id)
        {
            System.out.println("ID Perusahaan: "+);
            System.out.println("Nama Perusahaan: "+);
            System.out.println("Jumlah Lowongan: "+);
        }
        
        public void menuDelapan(int id)
        {
            
        }
        
        public void mainMenu()
        {
            System.out.println("APLIKASI LOWONGAN PEKERJAAN");
            System.out.println("\tMenu : ");
            System.out.println("1. Add Perusahaan");
            System.out.println("2. Add Lowongan");
            System.out.println("3. Add Pelamar");
            System.out.println("4. Remove Perusahaan");
            System.out.println("5. Remove Lowongan");
            System.out.println("6. Remove Pelamar");
            System.out.println("7. View Perusahaan");
            System.out.println("8. View Lowongan");
            System.out.println("9. View Pelamar");
            System.out.println("10. Search Perusahaan");
            System.out.println("11. Search Lowongan");
            System.out.println("12. Search Pelamar");
            System.out.println("0. Exit");
            System.out.println("Pilihan : ");
            pil = in.nextInt();
            
            switch (pil) {
                case 1:
                    System.out.println("Input data Perusahaan");
                    System.out.print("ID Perusahaan : ");
                    int id = in.nextInt();
                    System.out.print("Nama Perusahaan : ");
                    String nm = in.nextLine();
                    System.out.print("Nama CEO : ");
                    String nmceo = in.nextLine();
                    System.out.print("Tanggal Dibuat : ");
                    String tgl = in.nextLine();
                    
                case 2:
                    System.out.println("Input data Lowongan");
                    System.out.print("ID Lowongan : ");
                    int idl = in.nextInt();
                    System.out.print("Jenis Lowongan : ");
                    String jns = in.nextLine();
                    System.out.print("Requirements : ");
                    String req = in.nextLine();
                    
                case 3:
                    System.out.println("Input data Pelamar");
                    System.out.print("ID Pelamar : ");
                    String idpe = in.nextLine();
                    System.out.print("Nama Pelamar : ");
                    String nmp = in.nextLine();
                    System.out.print("Tanggal : ");
                    String tglp = in.nextLine();
                    
                case 4:
                    Perusahaan tempPer;
                    System.out.println("ID Perusahaan yang akan dihapus = ");
                    int tempId = in.nextInt();
                    deletePerusahaan(tempId);
                    
                case 5:
                    Lowongan tempLo;
                    System.out.println("ID Lowongan yang akan dihapus = ");
                    int tempIdl = in.nextInt();
                    
                case 6:
                    System.out.println("ID Pelamar yang akan dihapus = ");
                    int tempIdpe = in.nextInt();
                    
                case 7:
                    System.out.println("\tDaftar Perusahaan");
                    
                    
                case 8:
                    System.out.println("");
                case 9:
                    System.out.println("");
                case 10:
                    System.out.println("");
                case 11:
                    System.out.println("");
                case 12:
                    System.out.println("");
        }
        }
}
