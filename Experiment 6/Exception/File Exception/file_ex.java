import java.io.*;
class file_ex
{
 public static void main(String args[])
 {
  System.out.println("Opening file..");
  try{
  FileInputStream f= new FileInputStream("test.txt");
  System.out.println("File opened");
  
  }
  catch(FileNotFoundException e)
  {
   System.out.println(e);
  }
 }
}
