public class StringToLong {
    public static void main(String arg[])
    {//converting String to long
        String str="567";
        long l=Long.valueOf(str);//Long.valueOf();
        long m=Long.parseLong(str);//Long.parseLong();
        System.out.println(l+"   "+m);
        LongToString ob=new LongToString();
        ob.check();

    }
    
}
class LongToString {
    public void check()
    {
         long m=4567783;
         String str=String.valueOf(m);
         String s=Long.toString(m);
        
         System.out.println(str+"  "+s+"  ");
    }
}
