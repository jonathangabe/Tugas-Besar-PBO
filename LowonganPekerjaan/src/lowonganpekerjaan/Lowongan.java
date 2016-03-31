package lowonganpekerjaan;

import java.util.ArrayList;

public class Lowongan{
	private ArrayList<BerkasLamaran> berkasMasuk = new ArrayList<BerkasLamaran>();
	private ArrayList<BerkasLamaran> berkasDiterima = new ArrayList<BerkasLamaran>(); 
	private String jenisPekerjaan;
	private String requirement;
	private int nBerkasM=0;
	private int nBerkasD=0;
	private int idLowongan;
        //int maxMasuk=10;
        //int maxTerima=10;
	
	public Lowongan(int id, String jenisKerja, String req)
	{
		idLowongan=id;
		jenisPekerjaan=jenisKerja;
		requirement=req;
	}
	
	public void addBerkas(BerkasLamaran bl)
	{
		berkasMasuk.add(bl);
	}
	
	public BerkasLamaran getBerkasMidx(int idx)
	{
		return berkasMasuk.get(idx);
	}
	
	public BerkasLamaran getBerkasMid(int id)
	{
            BerkasLamaran bl = null;
            for (int i=0;i<berkasMasuk.size();i++){
                if (id==berkasMasuk.get(i).getIdLamaran()){
                    bl=berkasMasuk.get(i);
                }
            }
                return bl;
	}
	
	public void berkasDiterimaIdx(int id)
	{
            berkasDiterima.add(getBerkasMid(id));
            removeBerkasMasuk(id);
	}
	
	public int jmlBerkasM()
	{
                nBerkasM=this.berkasMasuk.size();
		return nBerkasM;
	}
	
	public int jmlBerkasD()
	{
		return nBerkasD;
	}
	
	public void removeBerkasMasuk(int id)
	{
            for (int i=0;i<berkasMasuk.size();i++){
                if (id==berkasMasuk.get(i).getIdLamaran()){
                    berkasMasuk.remove(i);
                }
            }
	}	
	
	public BerkasLamaran getBerkasDidx(int idx)
	{
		return berkasDiterima.get(idx);
	}
	
	public BerkasLamaran getBerkasDid(int id)
	{
            BerkasLamaran bl = null;
            for (int i=0;i<berkasDiterima.size();i++){
                if (id==berkasDiterima.get(i).getIdLamaran()){
                    bl=berkasDiterima.get(i);
                }
            }
                return bl;
	}
	
	public int getId()
	{
            return idLowongan;
        }
}
