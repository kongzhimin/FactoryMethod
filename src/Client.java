import com.sun.javaws.jnl.XMLUtils;

public class Client {
    public static void main(String[] args) {
        try{
            Log log;
            LogFactory factory;
            factory = (LogFactory) XMLUtils.getBean();
            log = factory.writeLog();
            log.createLog();
        }
        catch (Exception e){
            System.out.println(e.getMessgae());
        }
    }
}
