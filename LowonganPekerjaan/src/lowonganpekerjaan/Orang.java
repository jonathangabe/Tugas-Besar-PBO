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
public abstract class Orang
{
	private String Name;
	private String Tanggal;
	
	public Orang(String Name,String Tanggal)
	{
		setName(Name);
		setTanggal(Tanggal);
	}
	public String getName()
	{
		return Name;
	}
	public String getTanggal()
	{
		return Tanggal;
	}
	public void setName(String Name)
	{
		this.Name=Name;
	}
	public void setTanggal(String Tanggal)
	{
		this.Tanggal=Tanggal;
	}

}