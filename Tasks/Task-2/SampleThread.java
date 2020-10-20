class SampleThread extends Thread {

    @Override
    public void run() {
        System.out.println("Little brother is buying pizza...");
        try {
            Thread.sleep(500);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        System.out.println("Little brother bought pizza!");

    }
}
