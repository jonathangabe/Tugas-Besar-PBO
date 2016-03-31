package lowonganpekerjaan;

public class Pelamar extends Orang{
	private BerkasLamaran berkas;
	private String approval;

	public Pelamar(String name, String tanggal, String approval){
            super(name, tanggal);
            setApproval(approval);
	}
        
	public void createBerkas(int i, String j, String k, String l){
            BerkasLamaran berkas = new BerkasLamaran(i,j,k,l);
	}

	public void setApproval(String approval){
            this.approval = approval;		
	}

	public String getApproval(){
            return approval;
	}
}