package threads;

public class FestRegistration {
    static class FromFilling extends Thread {
        public void run() {
            System.out.println("Form Filling Started!");
        }
    }

    static class EmailNotification extends Thread {
        public void run() {
            System.out.println("Document upload Started!");

        }    }


    static class DocumentsUpload extends Thread {
        public void run() {
            System.out.println("Confirm mail");

        }
    }

    public static void main(String[] args) {
        FromFilling t1 = new FromFilling();
        DocumentsUpload t2 = new DocumentsUpload();
        EmailNotification t3 = new EmailNotification();
        t1.start();
        t2.start();
        t3.start();

    }


    }
