/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.ArrayList;
import java.util.Scanner;
import lowonganpekerjaan.BerkasLamaran;
import lowonganpekerjaan.Lowongan;
import lowonganpekerjaan.Pelamar;
import lowonganpekerjaan.Perusahaan;
/**
 *
 * @author user
 */
public class Aplikasi{
	private ArrayList<Perusahaan> daftarPerusahaan = new ArrayList<Perusahaan>();
	private ArrayList<Pelamar> daftarPelamar = new ArrayList<Pelamar>();
	private int nPerusahaan=0;
        private int nPelamar=0;
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
            /*for (int i=0;i<daftarPerusahaan.size();i++){
                if (id==daftarPerusahaan.get(i).getId()){
                    p=daftarPerusahaan.get(i);
                }
            }*/
            for(Perusahaan x : daftarPerusahaan){
                if(x.getId()==id){
                    p = x;
                }
            }
            return p;
	}
        
        public Perusahaan getPerusahaanIdx(int idx)
	{
            return daftarPerusahaan.get(idx);
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
        
        public int jumlahPerusahaan()
        {
            nPerusahaan=this.daftarPerusahaan.size();
            return nPerusahaan;
        }
        
        public int jumlahPelamar()
        {
            nPelamar=this.daftarPelamar.size();
            return nPelamar;
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
        
        public void menuTujuh()
        {
            for (int i=0;i<this.daftarPerusahaan.size();i++)
            {
                System.out.println("ID Perusahaan: "+daftarPerusahaan.get(i).getId());
                System.out.println("Nama Perusahaan: "+daftarPerusahaan.get(i).getNameP());
                System.out.println("Jumlah Lowongan: "+daftarPerusahaan.get(i).jumlahLowongan());
                System.out.println("CEO: "+daftarPerusahaan.get(i).getName());
            }
        }
        
        
        public void menuDelapan()
        {
            for (int i=0;i<jumlahPerusahaan();i++)
            {
                for (int j=0;j<daftarPerusahaan.get(i).jumlahLowongan();j++)
                {
                    System.out.println("ID Lowongan: "+daftarPerusahaan.get(i).getLowonganidx(j).getId());
                    System.out.println("Nama Lowongan: "+daftarPerusahaan.get(i).getLowonganidx(j).getJenis());
                    System.out.println("Requirement: "+daftarPerusahaan.get(i).getLowonganidx(j).getReq());
                    
                }
            }
        }
        
        public void menuSembilan()
        {
            for (int i=0;i<this.daftarPelamar.size();i++)
            {
                System.out.println("ID Pelamar: "+daftarPelamar.get(i).getId());
                System.out.println("Nama Pelamar: "+daftarPelamar.get(i).getName());
                //System.out.println("Status: "+daftarPelamar.get(i).getApproval());             
            }
        }
        
        public void menuSepuluh(int id)
        {
            System.out.println("ID Perusahaan: "+getPerusahaan(id).getId());
            System.out.println("Nama Perusahaan: "+getPerusahaan(id).getNameP());
            System.out.println("Nama CEO: "+getPerusahaan(id).getName());
            System.out.println("Jumlah Lowongan: "+getPerusahaan(id).jumlahLowongan());
            
        }
        
        public void menuSebelas(int id)
        {
            for (int i=0;i<jumlahPerusahaan();i++)
            {
                System.out.println("ID Lowongan: "+daftarPerusahaan.get(i).getLowonganid(id).getId());  
                System.out.println("Nama Lowongan: "+daftarPerusahaan.get(i).getLowonganid(id).getJenis());
                System.out.println("Requirement: "+daftarPerusahaan.get(i).getLowonganid(id).getReq());
            }
        }
        
        public void menuDuabelas(int id)
        {
            System.out.println("ID Pelamar: "+getPelamar(id).getId());
            System.out.println("Nama Pelamar: "+getPelamar(id).getName());
            //System.out.println("Status: "+getPelamar(id).getApproval());
            System.out.println("Edukasi: "+getPelamar(id).getBerkas().getEdukasi());
            System.out.println("Pengalaman: "+getPelamar(id).getBerkas().getPengalaman());
        }
        
        public void menuTigaBelas()
        {
            
        }
        
        public Perusahaan getDataPerusahaan(int id){
            for (Perusahaan per: daftarPerusahaan){
                if (per.getId() == id){
                    return per;
                }
            }
            return null;
        }
        
        public void mainMenu()
        {
            int id;
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
                    id = in.nextInt();
                    System.out.print("Nama Perusahaan : ");
                    String nm = in.nextLine();
                    System.out.print("Nama CEO : ");
                    String nmceo = in.nextLine();
                    System.out.print("Tanggal Dibuat : ");
                    String tgl = in.nextLine();
                    Perusahaan tempP = new Perusahaan(nm,nmceo,tgl,id);
                    menuSatu(tempP);
                    
                case 2:
                    System.out.println("Input data Lowongan");
                    System.out.print("ID Perusahaan : ");
                    id = in.nextInt();
                    System.out.print("ID Lowongan : ");
                    int tempIdl = in.nextInt();
                    System.out.print("Jenis Lowongan : ");
                    String jns = in.nextLine();
                    System.out.print("Requirements : ");
                    String req = in.nextLine();
                    Lowongan tempL = new Lowongan(jns, req, id);
                    menuDua(id, tempL);
                    
                case 3:
                    System.out.println("Input data Pelamar");
                    System.out.print("ID Pelamar : ");
                    id = in.nextInt();
                    System.out.print("Nama Pelamar : ");
                    String nmp = in.nextLine();
                    System.out.print("Tanggal : ");
                    String tglp = in.nextLine();
                    //Pelamar tempPel = new Pelamar(nmp,tglp,id);
                    //menuTiga(tempPel);
                    
                case 4:
                    Perusahaan tempPer;
                    System.out.println("ID Perusahaan yang akan dihapus = ");
                    int tempId = in.nextInt();
                    deletePerusahaan(tempId);
                    
                case 5:
                    Lowongan tempLo;
                    System.out.print("ID Perusahaan : ");
                    id = in.nextInt();
                    System.out.println("ID Lowongan yang akan dihapus = ");
                    tempIdl = in.nextInt();
                    menuLima(id, tempIdl);
                                        
                case 6:
                    System.out.println("ID Pelamar yang akan dihapus = ");
                    int tempIdpe = in.nextInt();
                    deletePelamar(tempIdpe);
                    
                case 7:
                    System.out.println("\tDaftar Perusahaan");
                    menuTujuh();                    
                    
                case 8:
                    System.out.println("\tDaftar Lowongan");
                    menuDelapan();
                    
                case 9:
                    System.out.println("\tDaftar Pelamar");                    
                    menuSembilan();
                    
                case 10:
                    System.out.print("ID Perusahaan yang akan dicari = ");
                    id = in.nextInt();
                    menuSepuluh(id);
                    
                case 11:
                    System.out.print("ID Lowongan yang akan dicari = ");
                    id = in.nextInt();
                    menuSebelas(id);
                    
                case 12:
                    System.out.print("ID Pelamar yang akan dicari = ");
                    id = in.nextInt();
                    menuDuabelas(id);                    
            }
        }
}
