/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lowonganpekerjaan;

/**
 *
 * @author Windows 7
 */
public class Pelamar extends Orang{
	private berkasLamaran berkas;
	private String approval;

	public Pelamar (String nama, String tgl, String approval){
            this.nama = nama;
            this.tgl = tgl;
            setApproval(approval);
	}
        
	public void createBerkas (int i, String j, String k, String l){
            berkasLamaran berkas = new berkasLamaran(i,j,k,l);
	}

	public void cariLowongan (String cari1){
            if (cari1==nama){
                return ;
            }
	}

	public void cariLowongan (String cari2){
                
	}
        
	public void setApproval (String approval){
            this.approval = approval;		
	}

	public String getApproval(){
            return approval;
	}
}