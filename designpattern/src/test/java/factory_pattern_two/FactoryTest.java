package factory_pattern_two;

public class FactoryTest {

    public static void main(String[] args) {
        SendFactory factory = new SendFactory();
        Sender sender = factory.produceSms();
        sender.Send();
    }
}
