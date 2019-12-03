package com.Qst;

import java.util.Arrays;

class Address {
    private String country;
    private String province;
    private String city;
    private String street;
    private String zipCode;

    public Address() {}
    public Address(String country,String province,String city,String street,String zipCode) {
        this.country = country;
        this.province = province;
        this.city = city;
        this.street = street;
        this.zipCode = zipCode;
    }
    public String getInfo() {
        return "国家：" + this.country + "，省份：" + this.province + "，城市：" + this.city + "，街道：" + this.street + "，邮编："
                + this.zipCode;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    public void setProvince(String province) {
        this.province = province;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    public String getCountry() {
        return this.country;
    }
    public String getProvince() {
        return  this.province;
    }
    public String getCity() {
        return  this.city;
    }
    public String getStreet() {
        return this.street;
    }
    public String getZipCode() {
        return  this.zipCode;
    }

}
public class JavaDemo1 {
    public static void main(String[] args) {
        System.out.println(new Address("中华人民共和国","北京","北京","天安门街道",
                "10001").getInfo());
    }
}
