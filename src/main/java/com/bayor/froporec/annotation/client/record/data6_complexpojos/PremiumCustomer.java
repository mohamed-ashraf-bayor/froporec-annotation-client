package com.bayor.froporec.annotation.client.record.data6_complexpojos;

import org.froporec.annotations.Record;

@Record
public class PremiumCustomer extends Customer {

    private boolean premiumCustomer;

    public boolean isPremiumCustomer() {
        return premiumCustomer;
    }

    public void setPremiumCustomer(boolean premiumCustomer) {
        this.premiumCustomer = premiumCustomer;
    }
}
