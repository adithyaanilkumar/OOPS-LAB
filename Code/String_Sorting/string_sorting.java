import java.io.*;
class Main:
{
    public static void main(String args[])throws IOException
    {
        String string1;
        String s[]=new String[100];
        int i,j=0,k;
        i=0;
        string1="finish";
        System.out.println("enter a string finishing with finish");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        for(i=0;i<100;i++)
        {
            s[i]=br.readLine();
            j++;
            if(s[i].equals(string1))
            break;
        }
        for(i=0;i<j-1;i++)
        for(k=i+1;k<j-1;k++)
        {
            if(s[k].compareTo(s[i])<0)
            {
            String t=s[i];
            s[i]=s[k];
            s[k]=t;
            }
        }
        System.out.println("the sorted String is");
        for(i=0;i<j-1;i++)
        {
            System.out.print(s[i]+" ");
        }

    }
}
