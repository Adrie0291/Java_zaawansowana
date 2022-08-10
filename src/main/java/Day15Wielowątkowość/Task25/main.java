package Day15Wielow¹tkowoœæ.Task25;

public class main {
    public static void main(String[] args) {
        ConcatenationTask concatenationTask = new ConcatenationTask(150000, "D");
        concatenationTask.startTask();

        Runnable abortingTask = new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                    concatenationTask.abort();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread thread = new Thread(abortingTask);
        thread.start();
        concatenationTask.waitUntilEnd();
        String result = concatenationTask.getResult();
        System.out.println(result.length());
    }
}
