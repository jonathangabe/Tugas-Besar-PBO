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
public class Lowongan {
    public class Lowongan{
	private BerkasLamaran[] berkasMasuk;
	private BerkasLamaran[] berkasDiterima; 
	private String jenisPekerjaan;
	private String requirement;
	private int nBerkasM=0;
	private int nBerkasD=0;
	private int idLowongan;
	
	public Lowongan(int id, String jenisKerja, String req, int maxMasuk, int maxTerima)
	{
		idLowongan=id;
		jenisPekerjaan=jenisKerja;
		requirement=req;
		berkasMasuk=new BerkasLamaran[maxMasuk];
		berkasDiterima=new BerkasLamaran[maxTerima];
	}
	
	public Lowongan(int id, String jenisKerja, String req)
	{
		idLowongan=id;
		jenisPekerjaan=jenisKerja;
		requirement=req;
		berkasMasuk=new BerkasLamaran[10];
		berkasDiterima=new BerkasLamaran[10];
	}
	
	public void addBerkas(BerkasLamaran bl)
	{
		if (nBerkasM<berkasMasuk.length)
		{
			berkasMasuk[nBerkasM]=bl;
			nBerkasM++;
		}
		else 
		{
			System.out.println("Batas berkas masuk sudah penuh!");
		}
	}
	
	public BerkasLamaran getBerkasMidx(int idx)
	{
		return berkasMasuk[idx];
	}
	
	public BerkasLamaran getBerkasMid(int id)
	{
		i=0;
		BerkasLamaran bl=null;
		do 
		{
			if (id==berkasMasuk[i].getId())
			{
				bl=berkasMasuk[i];
				i=nBerkasM;
				return bl;
			}
			else
			{
				i++;
			}
		}
		while(i<nBerkasM);
	}
	
	public void berkasDiterimaIdx(int n)
	{
		if (nBerkasD<berkasDiterima.length)
		{
			berkasDiterima[nBerkasD]=berkasMasuk[n];
			nBerkasD++;
		}
		else 
		{
			System.out.println("Batas berkas diterima sudah penuh!");
		}
	}
	
	public int jmlBerkasM
	{
		return nBerkasM;
	}
	
	public int jmlBerkasD
	{
		return nBerkasD;
	}
	
	public void removeBerkasMasuk()
	{
		berkasMasuk[nBerkasM]=null;
		nBerkasM--;
	}	
	
	public int getBerkasDidx(int idx)
	{
		return berkasDiterima[idx];
	}
	
	public BerkasLamaran getBerkasDid(int id)
	{
		i=0;
		BerkasLamaran bl=null;
		do 
		{
			if (id==berkasDiterima[i].getId())
			{
				bl=berkasDiterima[i];
				i=nBerkasD;
				return bl;
			}
			else
			{
				i++;
			}
		}
		while(i<nBerkasD);
	}
	
	public int getId()
	{
		return idLowongan;
        }
}
