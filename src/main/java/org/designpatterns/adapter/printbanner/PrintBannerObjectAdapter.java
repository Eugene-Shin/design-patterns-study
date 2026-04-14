package org.designpatterns.adapter.printbanner;

public class PrintBannerObjectAdapter extends AbstractPrint {
    private Banner banner;

    public PrintBannerObjectAdapter(String string) {
        this.banner = new Banner(string);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
