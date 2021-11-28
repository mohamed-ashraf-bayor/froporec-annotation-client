package com.bayor.froporec.annotation.client.data6_complexpojos;

import org.froporec.GenerateRecord;

@GenerateRecord
public class PremiumCustomer extends Customer {

    private boolean premiumCustomer;

    public boolean isPremiumCustomer() {
        return premiumCustomer;
    }

    public void setPremiumCustomer(boolean premiumCustomer) {
        this.premiumCustomer = premiumCustomer;
    }
}
