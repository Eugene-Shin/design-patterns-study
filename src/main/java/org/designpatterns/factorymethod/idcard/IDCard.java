package org.designpatterns.factorymethod.idcard;

import org.designpatterns.factorymethod.framework.Product;

public class IDCard extends Product {
    private String owner;
    private String serialNumber;

    IDCard(String owner, String serialNumber) {
        System.out.println(owner + "의 카드[" + serialNumber + "]를 만듭니다.");
        this.owner = owner;
        this.serialNumber = serialNumber;
    }


    @Override
    public void use() {
        System.out.println(this + "을 사용합니다.");
    }

    @Override
    public String toString() {
        return "[IDCard:" + owner + ", SerialNumber:" + serialNumber + "]";
    }
}
