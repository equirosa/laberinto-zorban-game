package dl;

public class Logica {
    private static Logica singletonLogica=null;

    public static Logica getLogica(){
        if (singletonLogica==null)
            singletonLogica=new Logica();
        return singletonLogica;
    }

    public Logica(){}

}
