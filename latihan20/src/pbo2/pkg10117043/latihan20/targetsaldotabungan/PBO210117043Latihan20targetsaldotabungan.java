/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117043.latihan20.targetsaldotabungan;

/**
 *NAMA                 : Yusrizal Falahan
 * Kelas                : PBO-2 
 * NIM                  : 10117043
 * Deskripsi Program    : Program ini berisi perintah untuk menghitung 
 *                        target saldo tabungan
 * @author Acer
 */
public class PBO210117043Latihan20targetsaldotabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int saldo,bulan;
        double bunga;
        
        saldo = 3500000;
        bulan = 0;
        
        while (saldo < 6000000){
            bulan = bulan + 1;
            saldo = (int)(saldo +(saldo*0.08));
            
            String mataUang = String.format("Rp.%,3d",saldo).replaceAll(",",".");
            System.out.printf("saldo di bulan ke-" + bulan + "%s%n",mataUang);
        }
        
    }
    
}
