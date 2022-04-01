package utspboa_215314004;

/**
 *
 * @author G.Kristha
 * Program by : Gerardus Kristha_215314004
 */
public class DataAnggotaLain {
    private String nama;
    private int umur;

    public DataAnggotaLain(){
        this(" ", 0);
    }
    public DataAnggotaLain(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        if(umur<0){
            this.umur = 0;
        }else{
            this.umur = umur;
        }
    }
    public String toString() {
        return "Nama " + nama + ", umur :" + umur;
    }
    
}
