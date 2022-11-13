public class FileDemo {
    private static int state = 1;

    private static int n1 = 1;
    private static int n2 = 2;

    public static void main(String[] args) {
        final FileDemo t = new FileDemo();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(n1<100){
                    synchronized (t) {
                        if(state!=1){
                            try {
                                t.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }

                        System.out.println("A=="+n1);
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        n1 += 2;
                        state = 2;
                        t.notifyAll();
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while(n2<=100){
                    synchronized (t) {
                        if(state!=2){
                            try {
                                t.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }

                        System.out.println("B=="+n2);
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        n2 += 2;

                        state = 1;
                        t.notifyAll();
                    }
                }
            }
        }).start();
    }

}