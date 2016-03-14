/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lowonganpekerjaan;

/**
 *
 * @author user
 */
public class Perusahaan extends Orang{
	private Lowongan[] daftarLowongan;
	private String jenis;
	private int nLowongan=0;
	
	public Perusahaan(String jenis, int maxLowongan)
	{
		this.jenis=jenis;
		daftarLowongan = new Lowongan[maxLowongan];
	}
	
	public Perusahaan(String jenis)
	{
		this.jenis=jenis;
		daftarLowongan = new Lowongan[10];
	}
	
	public void createLowongan(Date deadline, String jeniskerja, String req)
	{
		if (nLowongan<daftarLowongan.length)
		{
			daftarLowongan[nLowongan]=new Lowongan(deadline,jeniskerja,req);
			nLowongan++;
		}
		else 
		{
			System.out.println("Lowongan sudah penuh!");
		}
	}
	
	public Lowongan getLowonganidx(int idx)
	{
		return daftarLowongan[idx];
	}
	
	public Lowongan getLowonganid(int id)
	{
		i=0;
		Lowongan l=null;
		do 
		{
			if (id==daftarLowongan[i].getId())
			{
				l=daftarLowongan[i];
				i=nLowongan;
				return l;
			}
			else
			{
				i++;
			}
		}
		while(i<nLowongan);
	}
	
	public void removeLowongan()
	{
		daftarLowongan[nLowongan]=null;
		nLowongan--;
	}	
	
/* public void ketLamaran(int indexLowongan,int idberkas)
	{
		daftarLowongan[indexLowongan]
	}
*/	
	public int jmlPelamarMasuk(int n)
	{
		return daftarLowongan[n].jmlBerkasM();
	}
	
	public int jmlPelamarDiterima(int n)
	{
		return daftarLowongan[n].jmlBerkasD();
	}
	
/*	public void lihatPelamar
	{
		System.out.println()
	} */
}
