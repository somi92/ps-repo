package domen;

import java.util.Date;
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student1
 */
public class PoslovniPartner {
    
    private String PIB;
    private String matBroj;
    private String ZR;
    private String naziv;
    private Date datumOsnivanja;
    private Mesto mesto;
    private String ulicaIBroj;

    public PoslovniPartner() {
        datumOsnivanja = new Date();
        mesto = new Mesto();
    }

    
    /**
     * @return the PIB
     */
    public String getPIB() {
        return PIB;
    }

    /**
     * @param PIB the PIB to set
     */
    public void setPIB(String PIB) {
        this.PIB = PIB;
    }

    /**
     * @return the matBroj
     */
    public String getMatBroj() {
        return matBroj;
    }

    /**
     * @param matBroj the matBroj to set
     */
    public void setMatBroj(String matBroj) {
        this.matBroj = matBroj;
    }

    /**
     * @return the ZR
     */
    public String getZR() {
        return ZR;
    }

    /**
     * @param ZR the ZR to set
     */
    public void setZR(String ZR) {
        this.ZR = ZR;
    }

    /**
     * @return the naziv
     */
    public String getNaziv() {
        return naziv;
    }

    /**
     * @param naziv the naziv to set
     */
    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    /**
     * @return the datumOsnivanja
     */
    public Date getDatumOsnivanja() {
        return datumOsnivanja;
    }

    /**
     * @param datumOsnivanja the datumOsnivanja to set
     */
    public void setDatumOsnivanja(Date datumOsnivanja) {
        this.datumOsnivanja = datumOsnivanja;
    }

    /**
     * @return the mesto
     */
    public Mesto getMesto() {
        return mesto;
    }

    /**
     * @param mesto the mesto to set
     */
    public void setMesto(Mesto mesto) {
        this.mesto = mesto;
    }

    /**
     * @return the ulicaIBroj
     */
    public String getUlicaIBroj() {
        return ulicaIBroj;
    }

    /**
     * @param ulicaIBroj the ulicaIBroj to set
     */
    public void setUlicaIBroj(String ulicaIBroj) {
        this.ulicaIBroj = ulicaIBroj;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.matBroj);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PoslovniPartner other = (PoslovniPartner) obj;
        if (!Objects.equals(this.matBroj, other.matBroj)) {
            return false;
        }
        return true;
    }
    
    

    @Override
    public String toString() {
        return "PoslovniPartner{" + "PIB=" + PIB + ", \nmatBroj=" + matBroj + ", "
                + "\nZR=" + ZR + ", \nnaziv=" + naziv + ", \ndatumOsnivanja=" 
                + datumOsnivanja + ", \nmesto=" + mesto + ", \nulicaIBroj=" + ulicaIBroj + '}';
    }
    
}
