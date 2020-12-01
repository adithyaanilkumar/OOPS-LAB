import java.io.*;
class Main
{
    public static void main(String args[])throws IOException
    {
        String s1;
        String s;
        int t,i;
        int flg=1;
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        System.out.println("enter the string");
        s=br.readLine();
        System.out.println("enter the substring to be searched");
        s1=br.readLine();
        t=0;
        i=0;
        s=s+' ';
        s1=s1+' ';
        do
        {
            if(s.indexOf(s1,t)!=-1)
            {
            t=s.indexOf(s1,t);
            System.out.println(t);
            flg=0;
            t=t+s1.length();
            i=t;
            }
           else 
            i++;
        }
        while(i<s.length());
        if(flg==1)
         System.out.println("the substring is not found");
    }
}

