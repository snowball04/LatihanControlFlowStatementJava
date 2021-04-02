
package sdm;

public class Karyawan {
    public int hitungGaji(int gajiSebelumPPH, double pajakPenghasilan, int PenghasilanTidakKenaPajak){
        int gajiSetelahPPH = PenghasilanTidakKenaPajak;
        if(gajiSebelumPPH >= PenghasilanTidakKenaPajak){
            
            gajiSetelahPPH = (int) (gajiSebelumPPH - (gajiSebelumPPH * pajakPenghasilan));
        }
        return gajiSetelahPPH;
    }
    
    public int hitungPPH(int gajiSebelumPPH, double pajakPenghasilan, int PenghasilanTidakKenaPajak){
        int nilaiPPHdibayarkan = 0; 
        if (gajiSebelumPPH >= PenghasilanTidakKenaPajak ){
            nilaiPPHdibayarkan = (int) (gajiSebelumPPH * pajakPenghasilan); 
        }
        
        return nilaiPPHdibayarkan;
    }
  
} 
