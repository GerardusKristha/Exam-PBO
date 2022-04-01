package utspboa_215314004;

/**
 *
 * @author G.Kristha
 * Program by : Gerardus Kristha_215314004
 */
import java.util.Scanner;
public class RT_Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        RT rt1 = new RT(05,25,"Berbah");
        System.out.print("Masukkan jumlah Keluarga : ");
        int jumlahKeluarga = input.nextInt();
        Keluarga [] dataKeluarga = new Keluarga[RT.MAX_KELUARGA];
        rt1.setDataKeluarga(dataKeluarga, jumlahKeluarga);
        
        for(int i=0; i<jumlahKeluarga; i++){
            System.out.println("\nData Warga"+(i+1));
            System.out.print(" Kepala Keluarga : ");
            String kk = input.next();
            System.out.print(" Ibu : ");
            String ibu = input.next();
            dataKeluarga[i]= new Keluarga(kk,ibu);
            
            System.out.print("Jumlah Anak : ");
            int jumlahAnak = input.nextInt();
            if(jumlahAnak>Keluarga.MAX_ANAK|| jumlahAnak<0){
                jumlahAnak=Keluarga.MAX_ANAK;
            }
            DataAnak [] dataAnak = new DataAnak[Keluarga.MAX_ANAK];
            for(int j=0; j<jumlahAnak; j++){
                System.out.print(" Anak "+(j+1)+" : ");
                String nama = input.next();
                System.out.print(" Umur : ");
                int umur = input.nextInt();
                dataAnak [i] = new DataAnak(nama,umur);
            }
            dataKeluarga[i].setAnak(dataAnak, jumlahAnak);
            System.out.print("Jumlah Anggota Lain : ");
            int jumlahAL= input.nextInt();
            if(jumlahAL<=0){
                jumlahAL = 0;
            }
            DataAnggotaLain [] dataAL = new DataAnggotaLain[Keluarga.MAX_ANGLAIN];
            for(int k=0; k<jumlahAL; k++){
                System.out.print(" Anggota lain "+(k+1)+" : ");
                String nama = input.next();
                System.out.print(" Umur : ");
                int umur = input.nextInt();
                dataAL [k] = new DataAnggotaLain(nama,umur);
            }
            dataKeluarga[i].setAnggotaLain(dataAL, jumlahAnak);
            
        }
        System.out.println("\n------------------------------\n");
        System.out.println();
        for(int i=0; i<jumlahKeluarga;i++){
            System.out.println("\nWarga " + (i+1));
            System.out.println(dataKeluarga[i].toString());
        }
    }

}
