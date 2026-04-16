package org.designpatterns.singleton;

import java.util.NoSuchElementException;

public class Triple {
    private String name;
    private static Triple alpha = new Triple("ALPHA");
    private static Triple beta = new Triple("BETA");
    private static Triple gamma = new Triple("GAMMA");

    private Triple(String name) {
        this.name = name;
    }

    public static Triple getInstance(String name) {
        return switch(name) {
            case "ALPHA" -> alpha;
            case "BETA" -> beta;
            case "GAMMA" -> gamma;
            default -> throw new NoSuchElementException("Unknown name: " + name);
        };
    }
}
