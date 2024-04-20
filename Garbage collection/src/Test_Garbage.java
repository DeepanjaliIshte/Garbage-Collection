
public class Test_Garbage {
	@Override
    protected void finalize() {
        System.out.println("finalize() method called");
    }

    public static void main(String[] args) {
        Test_Garbage obj = new Test_Garbage();
        obj = null; // The object becomes eligible for garbage collection

        // Requesting JVM to call Garbage Collector
       System.gc();
        System.out.println("Garbage Collection requested");
    }
}

