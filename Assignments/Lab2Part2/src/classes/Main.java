package classes;

public class Main {

    public static void main(String[] args) {
        LoggerFactory lf = new LoggerFactory();
        Logger l = lf.getLogger();
        l.log("Hello");


    }
}
