//package com.mycompany.app ;

public class App {
    public static void main(String[] args) {
        DisruptLecture lecture = new DisruptLecture() ;
        lecture.discrupt() ;

        TestArithmetic math = new TestArithmetic() ;
        System.out.println("5 + 4 = " + math.add(5, 4));

        GlyphTest glyphtest = new GlyphTest() ;
        glyphtest.testGlyph('A');

        Transmogrify transmorgrify = new Transmogrify() ;
        System.out.println(transmorgrify.transform("hello"));
    }
}
