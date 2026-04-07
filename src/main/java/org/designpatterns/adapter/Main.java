package org.designpatterns.adapter;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        //Class Adapter
        Print p1 = new PrintBannerClassAdapter("Hello");
        p1.printWeak();
        p1.printStrong();

        //Object Adapter
        AbstractPrint p2 = new PrintBannerObjectAdapter("Hello");
        p2.printWeak();
        p2.printStrong();

        //FileIO-Properties Adapter
        FileIO f = new FileProperties();
        try {
            f.readFromFile("src/main/java/org/designpatterns/adapter/file.txt");
            f.setValue("width", "1024");
            f.setValue("height", "512");
            f.setValue("depth", "32");
            f.writeToFile("src/main/java/org/designpatterns/adapter/newfile.txt");
            System.out.println("newfile.txt is created.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
