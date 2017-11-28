package com.onlyforcoding;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Printer print = new Printer(50,false);
        System.out.println("initial pages = " + print.getPagesPrinted());
        int pagesPrinted = print.printPages(4);
        System.out.println("pages printed was = "+pagesPrinted+ " new total print count for printer = "+print.getPagesPrinted());
        pagesPrinted = print.printPages(2);
        System.out.println("pages printed was = "+pagesPrinted+ " new total print count for printer = "+print.getPagesPrinted());
    }
}
