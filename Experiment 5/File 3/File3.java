import java.io.*;
class File3
{
 public static void main(String args[])
 {
  try
  {
   FileWriter fw=new FileWriter("File3.txt");
   FileReader fr=new FileReader("File3.txt");      
   fw.write("Name:Abin Skaria\n");
   fw.write("Address:England\n");
   fw.close();
   int i;
   while((i=fr.read())!=-1)
   {
    System.out.print((char)i); 
   }
   fr.close();
  }
  catch(Exception e)
  {System.out.println("Exception occured");}
 }
}