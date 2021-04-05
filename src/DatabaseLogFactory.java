public abstract class DatabaseLogFactory implements LogFactory{
    public Log writeLog(){
        System.out.println("databaseLogFactory");
        return new DatabaseLog();
    }
}
