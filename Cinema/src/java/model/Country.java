/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author int.thong.nk
 */
public class Country {
    private int code;
    private int countryName;

    public Country() {
    }

    public Country(int code, int countryName) {
        this.code = code;
        this.countryName = countryName;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getCountryName() {
        return countryName;
    }

    public void setCountryName(int countryName) {
        this.countryName = countryName;
    }

    @Override
    public String toString() {
        return "Country{" + "code=" + code + ", countryName=" + countryName + '}';
    }

    


    
}
