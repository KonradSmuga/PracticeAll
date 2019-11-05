package singleton;

public class SynchronizedSingleton {

    private static SynchronizedSingleton synchronizedSingletonInstance = null;

    private SynchronizedSingleton() {

    }

    private static SynchronizedSingleton getInstance() {
        if (synchronizedSingletonInstance == null) {
            synchronized (SynchronizedSingleton.class) {
                if (synchronizedSingletonInstance == null) {
                    synchronizedSingletonInstance = new SynchronizedSingleton();
                }
            }
        }
        return synchronizedSingletonInstance;
    }
}
