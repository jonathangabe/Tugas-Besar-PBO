package lowonganpekerjaan;

public class Pelamar extends Orang{
	private BerkasLamaran berkas;
        private int idPelamar;
	private String approval;

	public Pelamar(String name, String tanggal, String approval, int id){
            super(name, tanggal);
            setApproval(approval);
            idPelamar=id;
	}
        
	public void createBerkas(BerkasLamaran bl){
            berkas = bl;
	}

	public void setApproval(String approval){
            this.approval = approval;		
	}

	public String getApproval(){
            return approval;
	}
        
        public int getId()
        {
            return idPelamar;
        }
}