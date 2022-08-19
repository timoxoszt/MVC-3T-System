package com.likelion.MVC3T.repository;

public class UserRepository {
    private String Id;
    private String Ten;
    private String Tuoi;
    private String Sothich;

    public UserRepository() {

    }

    public UserRepository(String Id, String Ten, String Tuoi, String Sothich) {
        this.Id = Id;
        this.Ten = Ten;
        this.Tuoi = Tuoi;
        this.Sothich = Sothich;
    }

    public String getId() {
        return Id;
    }
    public String getTen() {
        return Ten;
    }

    public String getTuoi() {
        return Tuoi;
    }

    public String getSothich() {
        return Tuoi;
    }
}
