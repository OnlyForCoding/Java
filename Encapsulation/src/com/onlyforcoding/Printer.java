package com.onlyforcoding;

/**
 * Created by jitendra on 28/11/17.
 */
public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount){
        if (tonerAmount < 0 && tonerAmount <= 100){
            if (this.tonerLevel + tonerAmount > 100){
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        } else {
            return -1;
        }
    }

    public int printPages(int pages){
        int pageToPrint = pages;
        if (this.duplex){
            pageToPrint /= 2;
            System.out.println("Printing duplex pages");
        }
        this.pagesPrinted += pageToPrint;
        return pageToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
