package utspboa_215314004;

/**
 *
 * @author G.Kristha
 * Program by : Gerardus Kristha_215314004
 */
public class Keluarga {
    static final int MAX_ANAK = 6;
    static final int MAX_ANGLAIN = 2;
    private String kepalaKeluarga;
    private String ibu;
    private int jumlahAnak;
    private DataAnak[] anak;
    private int jumlahAnggotalain;
    private DataAnggotaLain[] anggotaLain;

    public Keluarga(){
        this(" ","");
    }

    public Keluarga(String kepalaKeluarga,String ibu) {
        this.kepalaKeluarga = kepalaKeluarga;
        this.ibu = ibu;
    }
    
    public String getKepalaKeluarga() {
        return kepalaKeluarga;
    }

    public void setKepalaKeluarga(String kepalaKeluarga) {
        this.kepalaKeluarga = kepalaKeluarga;
    }

    public String getIbu() {
        return ibu;
    }

    public void setIbu(String ibu) {
        this.ibu = ibu;
    }

    public int getJumlahAnak() {
        return jumlahAnak;
    }

    public DataAnak[] getAnak() {
        return anak;
    }

    public void setAnak(DataAnak[] anak, int jumlahAnak) {
        this.anak = anak;
        this.jumlahAnak = jumlahAnak;
    }

    public int getJumlahAnggotalain() {
        return jumlahAnggotalain;
    }

    public DataAnggotaLain[] getAnggotaLain() {
        return anggotaLain;
    }

    public void setAnggotaLain(DataAnggotaLain[] anggotaLain, int jumlahAnggotaLain) {
        this.anggotaLain = anggotaLain;
        this.jumlahAnak = jumlahAnggotaLain;
    }
    
    public String toString() {
        String printKeluarga=" - Nama Keluarga \t: "+ kepalaKeluarga +
                "\n - Kepala Keluarga \t: "+kepalaKeluarga+
                "\n";
        for(int i=0;i<jumlahAnak;i++){
            printKeluarga+="\n Anak "+ (i+1)
                    +anak[i].toString()+"\n";
        }
        for(int i=0;i<jumlahAnggotalain;i++){
            printKeluarga+="\n Anggota Lain "+ (i+1)
                    +anggotaLain[i].toString()+"\n";
        }
        printKeluarga+="";
        return printKeluarga;
    }
}
