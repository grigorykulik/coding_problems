import java.util.Scanner;

public class Main {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=in.nextLine();
        
        StringBuilder word=new StringBuilder();
        StringBuilder reversedString=new StringBuilder();

        char[] ch=s.toCharArray();
        int i=0;

        while (i!=ch.length)
        {
            while (ch[i]!=' ' && i<ch.length)
            {
                word.append(ch[i]);
                i++;
            }

            word.reverse();
            reversedString.append(word+" ");

            i++;
        }

        System.out.println(reversedString);
    }
}