/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import domen.Mesto;
import domen.PoslovniPartner;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author milos
 */
public class DatabaseBroker {
    
    private static DatabaseBroker INSTANCE;
    
    private List<PoslovniPartner> ppartneri;
    private List<Mesto> mesta;
    
    private DatabaseBroker() {
        mesta = new ArrayList<>();
        ppartneri = new ArrayList<>();
        inicijalizacijaMesta();
    }
    
    public static DatabaseBroker getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new DatabaseBroker();
        }
        return INSTANCE;
    }
    
    public boolean dodajPPartnera(PoslovniPartner pp) {
        if(!ppartneri.contains(pp)) {
            ppartneri.add(pp);
            return true;
        }
        return false;
    }
    
    public List<PoslovniPartner> vratiSvePPartnere() {
        return ppartneri;
    }
    
    public void obrisiPPartnera(PoslovniPartner pp) {
        ppartneri.remove(pp);
    }
    
    public boolean dodajMesto(Mesto m) {
        if(!mesta.contains(m)) {
            mesta.add(m);
            return true;
        }
        return false;
    }
    
    public Mesto vratiMesto(long ptt) {
        for(Mesto m : mesta) {
            if(m.getPtt() == ptt) {
                return m;
            }
        }
        return null;
    }
    
    public List<Mesto> vratiSvaMesta() {
        return mesta;
    }
    
    public void obrisiMesto(Mesto m) {
        mesta.remove(m);
    }
    
    private void inicijalizacijaMesta() {
        dodajMesto(new Mesto(11000, "Beograd"));
        dodajMesto(new Mesto(21000, "Novi Sad"));
        dodajMesto(new Mesto(18000, "Nis"));
    }
    
    public void prikaziMesta() {
        System.out.println("====================================================");
        for(Mesto m : mesta) {
            System.out.println(m);
        }
        System.out.println("====================================================");
    }
    
    public void prikaziPPartnere() {
        System.out.println("====================================================");
       for(PoslovniPartner pp : ppartneri) {
           System.out.println("----------------------------------------------------");
           System.out.println(pp);
       }
       System.out.println("====================================================");
    }
}
