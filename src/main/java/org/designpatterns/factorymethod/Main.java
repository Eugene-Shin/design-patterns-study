package org.designpatterns.factorymethod;

import org.designpatterns.factorymethod.framework.Factory;
import org.designpatterns.factorymethod.framework.Product;
import org.designpatterns.factorymethod.idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("Yujin");
        Product card2 = factory.create("Cheonil");
        Product card3 = factory.create("Seunghyeon");
        card1.use();
        card2.use();
        card3.use();
    }
}
