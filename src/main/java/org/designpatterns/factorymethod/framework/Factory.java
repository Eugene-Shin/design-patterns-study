package org.designpatterns.factorymethod.framework;

import java.util.ArrayList;
import java.util.List;

public abstract class Factory {
    protected List<Product> database = new ArrayList<>();

    public final Product create(String owner, String serialNumber) {
        Product p = createProduct(owner, serialNumber);
        registerProduct(p);
        return p;
    }

    protected abstract Product createProduct(String owner, String serialNumber);
    protected abstract void registerProduct(Product product);
}
