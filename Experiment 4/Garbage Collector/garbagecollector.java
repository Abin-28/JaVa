public class garbagecollector
{
    public static void main(String args[])
    {
        garbagecollector ob1 = new garbagecollector();
        garbagecollector ob2 = new garbagecollector();
        garbagecollector ob3 = new garbagecollector();
        ob1=ob2;
        ob3=null;
        System.gc();
    }
    public void finalize()
    {
      System.out.println("Garbage collected....");
    }
}