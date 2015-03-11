/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import domen.Mesto;
import domen.PoslovniPartner;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author milos
 */
public class Sesija {
    
    private static Sesija INSTANCE;
    
    private List<PoslovniPartner> ppartneri;
    private List<Mesto> mesta;
    
    private Sesija() {
        mesta = new ArrayList<>();
        ppartneri = new ArrayList<>();
        inicijalizacijaMesta();
        sortirajMesta();
    }
    
    public static Sesija getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new Sesija();
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
    
    public boolean azurirajPPartnera(PoslovniPartner pp) {
        for(PoslovniPartner p : ppartneri) {
            if(p.equals(pp)) {
                ppartneri.remove(p);
                ppartneri.add(pp);
                return true;
            }
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
        dodajMesto(new Mesto(34300, "Arandjelovac"));
        dodajMesto(new Mesto(23000, "Zrenjanin"));
        dodajMesto(new Mesto(34000, "Kragujevac"));
    }
    
    private void sortirajMesta() {
        mesta.sort(new Comparator<Mesto>() {

            @Override
            public int compare(Mesto o1, Mesto o2) {
                return o1.getNaziv().compareTo(o2.getNaziv());
            }
        });
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
