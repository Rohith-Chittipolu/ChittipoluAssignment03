package q12;

public class finalze {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Execute finalize method");
        super.finalize();
    }
    
    public static void main(String[] args) throws Exception {
        finalze object = new finalze();
        object = null;
        System.gc();
        Thread.sleep(1000);
    }
}
