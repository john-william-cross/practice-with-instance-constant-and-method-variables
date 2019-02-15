package edu.dmacc.codedsm.variablepracticetype;

public class VariableTypePractice {

    final String num1 = "Welcome to";
    static String num2 = " the jungle, ";


    public static void main(String[] args) {

        String num3 = "we got fun and games.";

        VariableTypePractice foo = new VariableTypePractice();

        VariableTypePractice lyrics = new VariableTypePractice();

        String wholeLine = lyrics.num1 + num2 + num3;

        System.out.println(wholeLine);
    }
}

