package com.company.HomeWork9;

public class UsSterBuffer {
    public static void main(String[] args) {
        StringBuffer buff = new StringBuffer();
        System.out.println(buff.capacity());
        System.out.println(buff.length());
        buff.append("Эти данные очень длинные");
        System.out.println(buff.capacity());
        System.out.println(buff.length());
        buff.setLength(0);
        buff.trimToSize();
        System.out.println(buff.capacity());
        System.out.println(buff.length());

        String string3 = buff.toString();
        System.out.println(string3);
    }
}
