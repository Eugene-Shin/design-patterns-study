package org.designpatterns.adapter.printbanner;

public class PrintBannerClassAdapter extends Banner implements Print {
    public PrintBannerClassAdapter(String string) {
        super(string);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
