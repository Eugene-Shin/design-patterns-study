package org.designpatterns.factorymethod.idcard;

import org.designpatterns.factorymethod.framework.Factory;
import org.designpatterns.factorymethod.framework.Product;

import java.util.ArrayList;
import java.util.List;

public class IDCardFactory extends Factory {

    @Override
    protected Product createProduct(String owner, String serialNumber) {
        return new IDCard(owner, serialNumber);
    }

    @Override
    protected void registerProduct(Product product) {
        //DB나 웹서비스에 등록하는 로직
        database.add(product);
        System.out.println(product + "을 등록했습니다.");
    }
}
