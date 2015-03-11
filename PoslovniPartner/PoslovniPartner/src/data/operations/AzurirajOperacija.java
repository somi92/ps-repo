/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.operations;

import domen.PoslovniPartner;

/**
 *
 * @author milos
 */
public class AzurirajOperacija implements PoslovniPartnerOperacija {

    private Operacije operacije;
    
    public AzurirajOperacija(Operacije operacije) {
        this.operacije = operacije;
    }
    
    @Override
    public boolean izvrsiOperaciju(Object o) {
        PoslovniPartner pp = (PoslovniPartner) o;
        return operacije.azurirajPoslovnogPartnera(pp);
    }

    @Override
    public String vratiImeOperacije() {
        return "Izmeni";
    }
    
}
