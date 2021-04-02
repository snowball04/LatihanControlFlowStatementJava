
package main;

import pembayaran.Pembayaran;
import sdm.Karyawan;
import biling.Customer;
import expertsystem.Expert;
import alarmsystem.Alarm;


public class Aplikasi {
    public static void main(String[] args) {
//        //Latihan 6 - if then statement
//        Alarm alarm = new Alarm();
//         
//        boolean statusAlarmWarning;
//        
//        //test case 1
//        statusAlarmWarning =alarm.isAlarmStatusWarning(55.5, true, true);
//        System.out.println(statusAlarmWarning);
//         
//        //test case 2
//        statusAlarmWarning =alarm.isAlarmStatusWarning(60, true, true);
//        System.out.println(statusAlarmWarning);
//         
//        //test case 3
//        statusAlarmWarning =alarm.isAlarmStatusWarning(40, true, true);
//        System.out.println(statusAlarmWarning);
//         
//        //test case 4
//        statusAlarmWarning =alarm.isAlarmStatusWarning(55.5, false, true);
//        System.out.println(statusAlarmWarning);
//         
//        //test case 5
//        statusAlarmWarning =alarm.isAlarmStatusWarning(60, false, true);
//        System.out.println(statusAlarmWarning);
//         
//        //test case 6
//        statusAlarmWarning =alarm.isAlarmStatusWarning(40, false, true);
//        System.out.println(statusAlarmWarning);
//         
//        //test case 7
//        statusAlarmWarning =alarm.isAlarmStatusWarning(55.5, false, false);
//        System.out.println(statusAlarmWarning);
//         
//        //test case 8
//        statusAlarmWarning =alarm.isAlarmStatusWarning(60, false, false);
//        System.out.println(statusAlarmWarning);
//         
//        //test case 9
//        statusAlarmWarning =alarm.isAlarmStatusWarning(40, false, false);
//        System.out.println(statusAlarmWarning);
//        
//        
//        //Latihan 5 - if-then statement
//        Expert expert = new Expert();
//        
//        boolean jenisTumpahan;
//        
//         //test case 1
//        jenisTumpahan = expert.isAceticAcid(true, 5, true);
//        System.out.println(jenisTumpahan);
//        
//        //test case 2
//        jenisTumpahan = expert.isAceticAcid(true, 6, true);
//        System.out.println(jenisTumpahan);
//        
//        //test case 3
//        jenisTumpahan = expert.isAceticAcid(true, 7, true);
//        System.out.println(jenisTumpahan);
//        
//         //test case 4
//        jenisTumpahan = expert.isAceticAcid(true, 5, false);
//        System.out.println(jenisTumpahan);
//        
//        //test case 5
//        jenisTumpahan = expert.isAceticAcid(true, 6, false);
//        System.out.println(jenisTumpahan);
//        
//        //test case 6
//        jenisTumpahan = expert.isAceticAcid(true, 7, false);
//        System.out.println(jenisTumpahan);
//        
//        //test case 7
//        jenisTumpahan = expert.isAceticAcid(false, 5, true);
//        System.out.println(jenisTumpahan);
//        
//        //test case 8
//        jenisTumpahan = expert.isAceticAcid(false, 6, true);
//        System.out.println(jenisTumpahan);
//        
//        //test case 9
//        jenisTumpahan = expert.isAceticAcid(false, 7, true);
//        System.out.println(jenisTumpahan);
                
   
//        // Latihan 4 - if-then statement
//        Customer customer = new Customer();
//          
//        int nilaiTagihanPembayaranSetelahDenda;
//          
//        //testcase 1
//        nilaiTagihanPembayaranSetelahDenda = customer.hitungPembayaranTagihan(400_000, 0.01, 1, 4);
//        System.out.println(nilaiTagihanPembayaranSetelahDenda);
//          
//        //testcase 2
//        nilaiTagihanPembayaranSetelahDenda = customer.hitungPembayaranTagihan(300_000, 0.01, 1, 3);
//        System.out.println(nilaiTagihanPembayaranSetelahDenda);
//        
//        
//        //Latihan 3 - if-then statement
//        Karyawan karyawan = new Karyawan();  
//                
//        int nilaiPPHdibayarkan;
//           
//        //testcase 1
//        nilaiPPHdibayarkan = karyawan.hitungPPH(6_000_000, 0.1, 6_000_000);
//        System.out.println(nilaiPPHdibayarkan);
//          
//        //testcase 2
//        nilaiPPHdibayarkan = karyawan.hitungPPH(4_000_000, 0.1, 3_000_000);
//        System.out.println(nilaiPPHdibayarkan);
//          
//        //testcase 3
//        nilaiPPHdibayarkan = karyawan.hitungPPH(500_000, 0.1, 1_000_000);
//        System.out.println(nilaiPPHdibayarkan);
          
          
//        //Latihan 2 - if then statement
//        Karyawan karyawan = new Karyawan();
//
//        int gajiSetelahPPH;
//
//        //testcase 1
//        gajiSetelahPPH = karyawan.hitungGaji(6_000_000, 0.1, 6_000_000);
//        System.out.println(gajiSetelahPPH);
//        
//        //testcase 2
//        gajiSetelahPPH = karyawan.hitungGaji(4_000_000, 0.1, 3_000_000);
//        System.out.println(gajiSetelahPPH);
//        
//        //testcase 3
//        gajiSetelahPPH = karyawan.hitungGaji(500_000, 0.1, 1_000_000);
//        System.out.println(gajiSetelahPPH);


//        //Latihan 1 - if-then statement
//        Pembayaran pembayaran = new Pembayaran();
//                  
//        int nilaiYangHarusDibayar;
//        
//        //testcase 1
//        nilaiYangHarusDibayar = pembayaran.hitungPembayaran(6_000_000, 0.05);
//        System.out.println(nilaiYangHarusDibayar);
//        
//        //testcase 2
//        nilaiYangHarusDibayar = pembayaran.hitungPembayaran(4_000_000, 0.05);
//        System.out.println(nilaiYangHarusDibayar);
//        
//        //testcase 3
//        nilaiYangHarusDibayar = pembayaran.hitungPembayaran(5_000_000, 0.05);
//        System.out.println(nilaiYangHarusDibayar);


    
       
    }
    
}
