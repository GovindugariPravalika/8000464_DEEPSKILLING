public class DecoratorTest {

    public static void main(String[] args) {

        System.out.println("Email Only:");
        Notifier emailNotifier = new EmailNotifier();
        emailNotifier.send("Assignment Submitted");

        System.out.println();

        System.out.println("Email + SMS:");
        Notifier smsNotifier =
                new SMSNotifierDecorator(new EmailNotifier());

        smsNotifier.send("Assignment Submitted");

        System.out.println();

        System.out.println("Email + SMS + Slack:");

        Notifier fullNotifier =
                new SlackNotifierDecorator(
                        new SMSNotifierDecorator(
                                new EmailNotifier()
                        ));

        fullNotifier.send("Assignment Submitted");
    }
}