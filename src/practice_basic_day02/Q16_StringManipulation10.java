package practice_basic_day02;

public class Q16_StringManipulation10 {

    // soru: "   Java ogrenmek123 Cok guzel@      " Stringini "Java ogrenmek cok guzel" seklinde yazdirin.

    public static void main(String[] args) {

String str="Java ogrenmek123 Cok guzel@";
str=str.replaceAll("\\d","").replace("@","").replace("C","c");

        System.out.println(str);



    }
}
