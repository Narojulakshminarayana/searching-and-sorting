public class StringToDouble {
    public static void main(String arg[])
    {
        String str="56784";
        double d=Double.valueOf(str);
        double v=Double.parseDouble(str);
        System.out.println(d+"  "+v);
        DoubleToString ob=new DoubleToString();
        ob.check();

    }
    
}
class DoubleToString{
    public void check(){
    double d=356486;
    String str=String.valueOf(d);
    String s=Double.toString(d);
   System.out.println(str+" "+s);
 
}
}
