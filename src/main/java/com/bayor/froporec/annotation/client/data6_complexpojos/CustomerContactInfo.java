package com.bayor.froporec.annotation.client.data6_complexpojos;

import org.froporec.GenerateRecord;

@GenerateRecord
public class CustomerContactInfo extends Contact {

    private String idCardNumber;

    private boolean documentValid;

    public String getIdCardNumber() {
        return idCardNumber;
    }

    public void setIdCardNumber(String idCardNumber) {
        this.idCardNumber = idCardNumber;
    }

    public boolean isDocumentValid() {
        return documentValid;
    }

    public void setDocumentValid(boolean documentValid) {
        this.documentValid = documentValid;
    }
}
