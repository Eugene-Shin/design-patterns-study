package org.designpatterns.adapter;

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
    }
}
