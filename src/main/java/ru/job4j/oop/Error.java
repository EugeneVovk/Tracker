package ru.job4j.oop;

public class Error {
    public static void main(String[] args) {
        Error error1 = new Error();
        Error error2 = new Error(true, 1, "AE");
        Error error3 = new Error(false, 0, "NPE");
        Error error4 = new Error(false, 0, "OBE");
        System.out.println(error1);
        System.out.println(error2);
        System.out.println(error3);
        System.out.println(error4);
    }

    boolean active;
    int status;
    String message;

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public Error() {
    }

    @Override
    public String toString() {
        return "Error{" +
                "active=" + active +
                ", status=" + status +
                ", message='" + message + '\'' +
                '}';
    }
}
