/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pbo1.pkg10118009.latihan54.koordinat;

/**
 *
 * @author LENOVO
 */
public class WarnaKoordinat extends Koordinat{
    
    public String namaWarna;

    public WarnaKoordinat(int x, int y,String namaWarna) {
        super(x, y);
        this.namaWarna=namaWarna;
    }

    public String getNamaWarna() {
        return namaWarna;
    }

    public void setNamaWarna(String namaWarna) {
        System.out.println("Warna Koordinat : "+namaWarna);
    }
    

}
