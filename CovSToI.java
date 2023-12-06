public class CovSToI {
    //coverting String Integre by using 2 maethods 1.Integre.valueOf(); 2.String.parseInt();
    public static void main(String arg[])
    {
        // converting String to Int
        String str="345";
        int num=Integer.valueOf(str);
        System.out.println(num);   
        int n=Integer.parseInt(str);
        System.out.println(n);
        IntToString obj=new  IntToString();
        obj.check();

   
    }
}
class IntToString{
    //converting Integer value to String by using three methods 1.String.valueOf(); 2.Integre.toString(); 3.String.format("%d",num);
    public void check()
    {
        int num=678;
        String str=String.valueOf(num);
        System.out.println(str);
        String s=Integer.toString(num);
        System.out.println(s);
       String m=String.format("%d",num);
       System.out.println(m);
    }
}

