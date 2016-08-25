package com.example.marzian.myapplication;

/**
 * Created by marzian on 25.08.2016.
 */
public class Berichte {
    private int _id;
    private String _berichtdatum;


    public Berichte (String productname){
        this._berichtdatum = productname;
    }

    public void set_id(int _id){
        this._id = _id;
    }

    public void set_berichtdatum(String _berichtdatum){
        this._berichtdatum =_berichtdatum;
    }

    public int get_id(){
        return _id;
    }

    public String get_berichtdatum(){
        return _berichtdatum;
    }

}