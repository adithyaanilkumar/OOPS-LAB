import java.io.*;
public class Main
 {
    public static void main(String args[]) throws IOException
    {
     int i;
     FileReader fin = null;
     FileWriter fout=null;
     try 
     {
        fin = new FileReader("output.txt");
        fout=new FileWriter("copy.txt");
     } 
     catch (IOException e) 
     {
        System.out.println("cant read the file");
     }
     try{System.out.println("content of output.txt");
        do
        {   
            i= fin.read();
            if(i != -1)
            {  
               fout.write((char)i);
                System.out.print((char)i);
            }
        }while(i != -1);
        }
     catch(IOException e)
     {
        System.out.println("error in reading file or writting file");
     }
     fin.close();
     fout.close();
     FileReader fcr= null;
     try
      {
        fcr = new FileReader("copy.txt");
      }
     catch (IOException e) 
     {
        System.out.println("cant read the file");
     }
     try
     {  System.out.println("\ncontent of copy.txtfile ");
        do
        {  
            i= fcr.read();
            if(i != -1)
            {   
                System.out.print((char)i);
            }
        }while(i != -1);
     }
     catch(IOException e)
     {
        System.out.println("error in reading file");
     }
     fcr.close();
    }
}

