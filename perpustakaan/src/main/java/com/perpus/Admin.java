package com.perpus;
/**
 * @author Bagus
 */
public class Admin {
    String nama;
    int ID;
    
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public int getID(){
        return ID;
    }
    public void setID(int ID){
        this.ID = ID;
    }
    
    Admin(String nama, int ID){
        this.nama = nama;
        this.ID = ID;
    }
    
}
