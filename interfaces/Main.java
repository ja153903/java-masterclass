package interfaces;

public class Main {
    public static void main(String[] args) {
        DeskPhone timsPhone; // or we can also use ITelephone
        timsPhone = new DeskPhone(123);
        timsPhone.powerOn();
        timsPhone.callPhone(123);
        timsPhone.answer();
    }
}
