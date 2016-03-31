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
        
        public void menuTujuh(int id)
        {
            for (int i=0;i<this.daftarPerusahaan.size();i++)
            {
                System.out.println("ID Perusahaan: "+daftarPerusahaan.get(i).getId());
                System.out.println("Nama Perusahaan: "+daftarPerusahaan.get(i).getNameP());
                System.out.println("Jumlah Lowongan: "+daftarPerusahaan.get(i).jumlahLowongan());
                System.out.println("CEO: "+daftarPerusahaan.get(i).getName());
            }
        }
        
        
        public void menuDelapan(int id)
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
                System.out.println("Status: "+daftarPelamar.get(i).getApproval());
                System.out.println("Edukasi: "+daftarPelamar.get(i).getBerkas().getedukasi());
                System.out.println("Pengalaman: "+daftarPelamar.get(i).getBerkas().getPengalaman());
                System.out.println("Alasan Mendaftar: "+daftarPelamar.get(i).getBerkas().getReason());
            }
        }
        
        public void menuSepuluh(int id)
        {
            System.out.println("ID Perusahaan: "+getPerusahaan(id).getId());
            System.out.println("Nama Perusahaan: "+getPerusahaan(id).getNameP());
            System.out.println("Jumlah Lowongan: "+getPerusahaan(id).jumlahLowongan());
            System.out.println("CEO: "+getPerusahaan(id).getName());
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
            System.out.println("Status: "+getPelamar(id).getApproval());
            System.out.println("Edukasi: "+getPelamar(id).getBerkas().getedukasi());
            System.out.println("Pengalaman: "+getPelamar(id).getBerkas().getPengalaman());
            System.out.println("Alasan Mendaftar: "+getPelamar(id).getBerkas().getReason());
        }
        
        public void menuTigaBelas()
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
