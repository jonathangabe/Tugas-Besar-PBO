package lowonganpekerjaan;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hasobi
 */
public class BerkasLamaran
{
	private String Pengalaman;
	private int idLamaran;
	private String edukasi;
	private String reason;
	
	public BerkasLamaran(int idLamaran,String edukasi,String Pengalaman,String reason)
	{
		setIdLamaran(idLamaran);
		setEdukasi(edukasi);
		setPengalaman(Pengalaman);
		setReason(reason);
	
	}
	public int getIdLamaran()
	{
		return idLamaran;
	}
	public void setIdLamaran(int idLamaran)
	{
		this.idLamaran=idLamaran;
	}
	public String getedukasi()
	{
		return edukasi;
	}
	public void setEdukasi(String edukasi)
	{
		this.edukasi=edukasi;
	}
	public String getPengalaman()
	{
		return Pengalaman;
	}
	public void setPengalaman(String Pengalaman)
	{
		this.Pengalaman=Pengalaman;
	}
	public String getReason()
	{
		return reason;
	}
	public void setReason(String reason)
	{
		this.reason=reason;
	}



}