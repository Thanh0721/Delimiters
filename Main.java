import java.util.ArrayList;

public class Main {
    public static void main(String[] args) 
    {
        // Test case 1 from part
        String[] tokens1 = {"(", "x + y", ")", " * 5"};
        Delimiters d1 = new Delimiters("(", ")");
        System.out.println("Test 1: " + d1.getDelimitersList(tokens1));

        // Test case 2 from part
        String[] tokens2 = {"<q>", "yy", "</q>", "zz", "</q>"};
        Delimiters d2 = new Delimiters("<q>", "</q>");
        System.out.println("Test 2: " + d2.getDelimitersList(tokens2));

        // Test cases for isBalanced
        String open = "<sup>";
        String close = "</sup>";
        Delimiters d = new Delimiters(open, close);

        // Balanced case
        ArrayList<String> balanced = new ArrayList<String>();
        String[] balancedDelims = {open, open, close, open, close, close};
        for (String s : balancedDelims) balanced.add(s);
        System.out.println("Balanced test: " + d.isBalanced(balanced));

        // Unbalanced case
        ArrayList<String> unbalanced1 = new ArrayList<String>();
        String[] unbalancedDelims1 = {open, close, close, open};
        for (String s : unbalancedDelims1) unbalanced1.add(s);
        System.out.println("Unbalanced test 1: " + d.isBalanced(unbalanced1));

        // Unbalanced case
        ArrayList<String> unbalanced2 = new ArrayList<String>();
        String[] unbalancedDelims2 = {open};
        for (String s : unbalancedDelims2) unbalanced2.add(s);
        System.out.println("Unbalanced test 2: " + d.isBalanced(unbalanced2));

        // Unbalanced case
        ArrayList<String> unbalanced3 = new ArrayList<String>();
        String[] unbalancedDelims3 = {open, open, close};
        for (String s : unbalancedDelims3) unbalanced3.add(s);
        System.out.println("Unbalanced test 3: " + d.isBalanced(unbalanced3));
    }
}