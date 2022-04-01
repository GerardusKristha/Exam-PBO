package utspboa_215314004;

/**
 *
 * @author G.Kristha
 * Program by : Gerardus Kristha_215314004
 */
public class RT {
    static final int MAX_KELUARGA = 100;
    private int nomorRT;
    private int RW;
    private String alamat;
    private Keluarga ketuaRT;
    private int jumlahKeluarga;
    private Keluarga [] dataKeluarga;

    public RT() {
        this(00,00,"");
    }

    public RT(int nomorRT, int RW, String alamat) {
        this.nomorRT = nomorRT;
        this.RW = RW;
        this.alamat = alamat;
    }

    public int getNomorRT() {
        return nomorRT;
    }

    public void setNomorRT(int nomorRT) {
        this.nomorRT = nomorRT;
    }

    public int getRW() {
        return RW;
    }

    public void setRW(int RW) {
        this.RW = RW;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public Keluarga getKetuaRT() {
        return ketuaRT;
    }

    public void setKetuaRT(Keluarga ketuaRT) {
        this.ketuaRT = ketuaRT;
    }

    public int getJumlahKeluarga() {
        return jumlahKeluarga;
    }

    public Keluarga[] getDataKeluarga() {
        return dataKeluarga;
    }

    public void setDataKeluarga(Keluarga[] dataKeluarga, int jumlahKeluarga) {
        this.dataKeluarga = dataKeluarga;
        this.jumlahKeluarga =jumlahKeluarga;
    }
    
    public String toString(){
        String print="\n------------------------------\n"
                +"\t Data Warga \t"+"\n- RT : "+nomorRT+ " -";
        for(int i=0;i<jumlahKeluarga;i++){
            print+="\nKeluarga "+ (i+1)
                    +dataKeluarga[i].toString()+"\n";
        }
        print+="";
        return print;
    }
}
