public abstract class FileLogFactory implements LogFactory{
    public Log createLog(){
        System.out.println("FileLogFactory");
        return new FileLog();
    }
}
