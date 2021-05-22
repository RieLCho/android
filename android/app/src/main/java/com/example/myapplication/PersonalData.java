package com.example.myapplication;

public class PersonalData {
    private String CVS_NAME;
    private String PRODUCT_NAME;
    private String BARCODE;


    public String getCVS_NAME() {
        return CVS_NAME;
    }

    public String getPRODUCT_NAME() {
        return PRODUCT_NAME;
    }

    public String getBARCODE(){return BARCODE;}

    public void setCVS_NAME(String CVS_NAME) {
        this.CVS_NAME = CVS_NAME;
    }

    public void setPRODUCT_NAME(String PRODUCT_NAME) {
        this.PRODUCT_NAME = PRODUCT_NAME;
    }

    public void setBARCODE(String BARCODE) {
        this.BARCODE = BARCODE;
    }

}