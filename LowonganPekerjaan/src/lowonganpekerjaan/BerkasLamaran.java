package lowonganpekerjaan;

public class BerkasLamaran
{
	private String Pengalaman;
	private int idLamaran;
	private String edukasi;
        private String status;
	
	public BerkasLamaran(int idLamaran,String edukasi,String Pengalaman,String status)
	{
		setIdLamaran(idLamaran);
		setEdukasi(edukasi);
		setPengalaman(Pengalaman);
                setStatus(status);
	}
        
	public int getIdLamaran()
	{
		return idLamaran;
	}
        
	public void setIdLamaran(int idLamaran)
	{
		this.idLamaran=idLamaran;
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

        public void setStatus(String status) {
            this.status = status;
        }

        public String getEdukasi() {
            return edukasi;
        }

        public String getStatus() {
            return status;
        }       

}