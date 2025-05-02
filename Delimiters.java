import java.util.ArrayList;

public class Delimiters {
    private String openDel;
    private String closeDel;

    public Delimiters(String open, String close) 
    {
        openDel = open;
        closeDel = close;
    }

    public ArrayList<String> getDelimitersList(String[] tokens) 
    {
        ArrayList<String> delimiters = new ArrayList<String>();
        for (String s : tokens) 
        {
            if (s.equals(openDel) || s.equals(closeDel)) 
            {
                delimiters.add(s);
            }
        }
        return delimiters;
    }

    public boolean isBalanced(ArrayList<String> delimiters) 
    {
        int opens = 0;
        int closes = 0;
        for (String s : delimiters) 
        {
            if (s.equals(openDel)) opens++;
            if (s.equals(closeDel)) closes++;
            if (closes > opens) return false;
        }
        return opens == closes;
    }
}