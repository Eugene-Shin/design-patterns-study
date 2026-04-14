package org.designpatterns.factorymethod.idcard;

import org.designpatterns.factorymethod.framework.Factory;
import org.designpatterns.factorymethod.framework.Product;

public class IDCardFactory extends Factory {

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        //DB나 웹서비스에 등록하는 로직
        System.out.println(product + "을 등록했습니다.");
    }
}
