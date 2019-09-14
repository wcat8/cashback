import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class main {
    public static void main(String[] args) {
       int amountInRegular = 100;
       int amountInHigh = 1000;
       int amountInSpecial = 10_000;

       int percentInRegular = 1;
       int percentInHigh = 5;
       int percentInCpecial = 30;

       int result = (
               amountInRegular * percentInRegular +
               amountInHigh * percentInHigh +
               amountInSpecial * percentInCpecial
       ) / 100;

       int cashback=result;
       int cashbacklimit = 3000;
       if (cashback > cashbacklimit) {
           cashback=cashbacklimit;
       cashback = cashbacklimit;
       }

       System.out.println(result);
    }
}



