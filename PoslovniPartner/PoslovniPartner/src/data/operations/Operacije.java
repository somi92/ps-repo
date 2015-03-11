/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.operations;

import data.Sesija;
import domen.PoslovniPartner;

/**
 *
 * @author milos
 */
public class Operacije {
    
    public boolean sacuvajPoslovnogPartnera(PoslovniPartner pp) {
        return Sesija.getInstance().dodajPPartnera(pp);
    }
    
    public boolean azurirajPoslovnogPartnera(PoslovniPartner pp) {
        return Sesija.getInstance().azurirajPPartnera(pp);
    }
}
