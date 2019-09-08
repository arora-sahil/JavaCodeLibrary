package wrapper.examples;

public class BasicBoxingEx {

    public static void main(String args[])
    {
        byte b = 10;
        Byte bWrp = b;
        System.out.println(b);
        b = bWrp;
        System.out.println(bWrp);
        System.out.println(b);

        float f = 15;
        Float fWrp = new Float(f); // previously we use to wrap the primitive into wrapper like this

        Double d = 30.0;
        double  dUnwrp = d.doubleValue();

        System.out.println(d);
        System.out.println(dUnwrp);


    }
}
