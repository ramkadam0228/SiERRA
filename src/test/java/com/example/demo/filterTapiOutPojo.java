package com.example.demo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class filterTapiOutPojo {
    private Integer BU;
    private String INTRENALE_TRADE_REFERENCE;
    private Integer PARTY_1_CODE;
    private String PARTY_1_CODE_TYPE;

    private Integer PARTY_2_CODE;
    private String PARTY_2_CODE_TYPE;
    private String PRODUCT_ID_VALUE_1;
    private String PRODUCT_ID_VALUE_2;
    private Integer NOTIONAL;
    private String NOTIONAL_CURRENCY;
    private String VALUE_DATE;
    private String MATURITY_DATE;
    private String EARLY_TERMINATION_DATE;
    private Float PRICE;
    private String PRICE_CURRENCY;

   public filterTapiOutPojo(){

   }


    public filterTapiOutPojo(Integer NOTIONAL, Integer BU, String INTRENALE_TRADE_REFERENCE, Integer PARTY_1_CODE, String PARTY_1_CODE_TYPE, Integer PARTY_2_CODE, String PARTY_2_CODE_TYPE, String PRODUCT_ID_VALUE_1, String PRODUCT_ID_VALUE_2, String NOTIONAL_CURRENCY, String VALUE_DATE, String MATURITY_DATE, String EARLY_TERMINATION_DATE, Float PRICE, String PRICE_CURRENCY) {
        this.NOTIONAL = NOTIONAL;
        this.BU = BU;
        this.INTRENALE_TRADE_REFERENCE = INTRENALE_TRADE_REFERENCE;
        this.PARTY_1_CODE = PARTY_1_CODE;
        this.PARTY_1_CODE_TYPE = PARTY_1_CODE_TYPE;
        this.PARTY_2_CODE = PARTY_2_CODE;
        this.PARTY_2_CODE_TYPE = PARTY_2_CODE_TYPE;
        this.PRODUCT_ID_VALUE_1 = PRODUCT_ID_VALUE_1;
        this.PRODUCT_ID_VALUE_2 = PRODUCT_ID_VALUE_2;
        this.NOTIONAL_CURRENCY = NOTIONAL_CURRENCY;
        this.VALUE_DATE = VALUE_DATE;
        this.MATURITY_DATE = MATURITY_DATE;
        this.EARLY_TERMINATION_DATE = EARLY_TERMINATION_DATE;
        this.PRICE = PRICE;
        this.PRICE_CURRENCY = PRICE_CURRENCY;
    }

    public filterTapiOutPojo(String BU, String PRODUCT_ID_VALUE_1) {
        this.BU = Integer.valueOf(BU);
        this.PRODUCT_ID_VALUE_1 = PRODUCT_ID_VALUE_1;
   }

    @Override
    public String toString() {
        return "TapiOutPojo{" +
                "BU=" + BU +
                ", INTRENALE_TRADE_REFERENCE='" + INTRENALE_TRADE_REFERENCE + '\'' +
                ", PARTY_1_CODE=" + PARTY_1_CODE +
                ", PARTY_1_CODE_TYPE='" + PARTY_1_CODE_TYPE + '\'' +
                ", PARTY_2_CODE=" + PARTY_2_CODE +
                ", PARTY_2_CODE_TYPE='" + PARTY_2_CODE_TYPE + '\'' +
                ", PRODUCT_ID_VALUE_1='" + PRODUCT_ID_VALUE_1 + '\'' +
                ", PRODUCT_ID_VALUE_2='" + PRODUCT_ID_VALUE_2 + '\'' +
                ", NOTIONAL=" + NOTIONAL +
                ", NOTIONAL_CURRENCY='" + NOTIONAL_CURRENCY + '\'' +
                ", VALUE_DATE='" + VALUE_DATE + '\'' +
                ", MATURITY_DATE='" + MATURITY_DATE + '\'' +
                ", EARLY_TERMINATION_DATE='" + EARLY_TERMINATION_DATE + '\'' +
                ", PRICE=" + PRICE +
                ", PRICE_CURRENCY='" + PRICE_CURRENCY + '\'' +
                '}';
    }

    public Integer getBU() {
        return BU;
    }

    public void setBU(Integer BU) {
        this.BU = BU;
    }

    public String getINTRENALE_TRADE_REFERENCE() {
        return INTRENALE_TRADE_REFERENCE;
    }

    public void setINTRENALE_TRADE_REFERENCE(String INTRENALE_TRADE_REFERENCE) {
        this.INTRENALE_TRADE_REFERENCE = INTRENALE_TRADE_REFERENCE;
    }

    public Integer getPARTY_1_CODE() {
        return PARTY_1_CODE;
    }

    public void setPARTY_1_CODE(Integer PARTY_1_CODE) {
        this.PARTY_1_CODE = PARTY_1_CODE;
    }

    public String getPARTY_1_CODE_TYPE() {
        return PARTY_1_CODE_TYPE;
    }

    public void setPARTY_1_CODE_TYPE(String PARTY_1_CODE_TYPE) {
        this.PARTY_1_CODE_TYPE = PARTY_1_CODE_TYPE;
    }

    public Integer getPARTY_2_CODE() {
        return PARTY_2_CODE;
    }

    public void setPARTY_2_CODE(Integer PARTY_2_CODE) {
        this.PARTY_2_CODE = PARTY_2_CODE;
    }

    public String getPARTY_2_CODE_TYPE() {
        return PARTY_2_CODE_TYPE;
    }

    public void setPARTY_2_CODE_TYPE(String PARTY_2_CODE_TYPE) {
        this.PARTY_2_CODE_TYPE = PARTY_2_CODE_TYPE;
    }

    public String getPRODUCT_ID_VALUE_1() {
        return PRODUCT_ID_VALUE_1;
    }

    public void setPRODUCT_ID_VALUE_1(String PRODUCT_ID_VALUE_1) {
        this.PRODUCT_ID_VALUE_1 = PRODUCT_ID_VALUE_1;
    }

    public String getPRODUCT_ID_VALUE_2() {
        return PRODUCT_ID_VALUE_2;
    }

    public void setPRODUCT_ID_VALUE_2(String PRODUCT_ID_VALUE_2) {
        this.PRODUCT_ID_VALUE_2 = PRODUCT_ID_VALUE_2;
    }

    public Integer getNOTIONAL() {
        return NOTIONAL;
    }

    public void setNOTIONAL(Integer NOTIONAL) {
        this.NOTIONAL = NOTIONAL;
    }

    public String getNOTIONAL_CURRENCY() {
        return NOTIONAL_CURRENCY;
    }

    public void setNOTIONAL_CURRENCY(String NOTIONAL_CURRENCY) {
        this.NOTIONAL_CURRENCY = NOTIONAL_CURRENCY;
    }

    public String getVALUE_DATE() {
        return VALUE_DATE;
    }

    public void setVALUE_DATE(String VALUE_DATE) {
        this.VALUE_DATE = VALUE_DATE;
    }

    public String getMATURITY_DATE() {
        return MATURITY_DATE;
    }

    public void setMATURITY_DATE(String MATURITY_DATE) {
        this.MATURITY_DATE = MATURITY_DATE;
    }

    public String getEARLY_TERMINATION_DATE() {
        return EARLY_TERMINATION_DATE;
    }

    public void setEARLY_TERMINATION_DATE(String EARLY_TERMINATION_DATE) {
        this.EARLY_TERMINATION_DATE = EARLY_TERMINATION_DATE;
    }

    public Float getPRICE() {
        return PRICE;
    }

    public void setPRICE(Float PRICE) {
        this.PRICE = PRICE;
    }

    public String getPRICE_CURRENCY() {
        return PRICE_CURRENCY;
    }

    public void setPRICE_CURRENCY(String PRICE_CURRENCY) {
        this.PRICE_CURRENCY = PRICE_CURRENCY;
    }


}
