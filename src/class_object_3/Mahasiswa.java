/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package class_object_3;

/**
 *
 * @author BOBI YUSCANDRA
 */
public class Mahasiswa {
   int placeholder;
   private String nim, prodi;
   private int spp, angkatan, semester, bayar_spp_semester;

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public void setSpp(int spp) {
        this.spp = spp;
    }

    public void setAngkatan(int angkatan) {
        this.angkatan = angkatan;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public void setBayar_spp_semester(int bayar_spp_semester) {
        this.bayar_spp_semester = bayar_spp_semester;
    }

    public String getNim() {
        return nim;
    }

    public String getProdi() {
        return prodi;
    }


    public int getAngkatan() {
        return angkatan;
    }

    public int getSemester() {
        return semester;
    }
    
    public int getSpp() {
        if (getAngkatan() >  17) {
        placeholder = 15000000;
        }
        else {
        placeholder = 12000000;
        }
        return placeholder * getSemester();
    }
    
    public int getBayar_spp_semester() {
        bayar_spp_semester = getSpp();
        return bayar_spp_semester;
    }
   
}
