import java.io.*;
class File2
{
    public static void main(String[] args) 
    throws Exception
    {
    FileInputStream fin = new FileInputStream("txtfile.txt");
    int c=0, l=1, w=0;
    int ch;
    while((ch = fin.read())!=-1)
    {
        c++;
        if(ch=='\n')
            l++;
        if(ch == ' '||ch=='\n')
            w++;
    }
    System.out.println("Number of Characters = "+(c-1));
    System.out.println("Number of Words = "+w);
    System.out.println("Number of Lines ="+l);
    fin.close();
    }
}