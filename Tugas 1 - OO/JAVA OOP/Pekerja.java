/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ANDI DWI SAPUTRO
 */

public class Pekerja extends Person {
    public String workAddress, companyName, companyForm, posititon, noNpwp;
    
    public Pekerja() {
        
    }
    
    public void identitasPekerja(){
        System.out.println("Company Name: "+this.companyName);
        System.out.println("Company Form: "+this.companyForm);
        System.out.println("Position: "+this.posititon);
        System.out.println("Work Address: "+this.workAddress);
        System.out.println("No.NPWP: "+this.noNpwp);
    }
}
