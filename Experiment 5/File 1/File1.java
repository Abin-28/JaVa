import java.io.*;
class File1
{
 public static void main(String args[])
 {
  try
  {
    FileReader f= new FileReader("txtfile.txt");
    BufferedReader b=new BufferedReader(f);
    int j=1;
    String s =b.readLine();
    while(s!=null)
    {
      System.out.print(j+". ");
      System.out.print(s); 
      s=b.readLine();
      System.out.println();   
      j++;
    }
    f.close();
    b.close();
  }
  catch(Exception e)
  {}
 }
}
