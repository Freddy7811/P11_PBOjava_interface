/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asia.p11_pbojava_interface_kendaraan;

/**
 *
 * @author A-1
 */
// Kelas Anak untuk Mobil Baru

class MobilBaru extends Mobil {

    private String garansi;

    public MobilBaru(String merek, String model, String garansi) {
        super(merek, model);
        this.garansi = garansi;
    }

    public String getGaransi() {
        return garansi;
    }

    public void info() {
        System.out.println("Mobil Baru: " + getMerek() + " " + getModel() + "(Garansi:" + garansi + ")");
    }
}
