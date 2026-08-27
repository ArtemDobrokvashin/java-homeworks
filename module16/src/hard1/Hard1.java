package hard1;

public class Hard1 {
    public static void main(String[] args) {
        Subject subject = new Subject();

        Subscriber emailSubscriber = new EmailSubscriber();
        subject.addObserver(emailSubscriber);

        Issue issue = Issue.builder()
                .id("1")
                .title("Как стать Java-разработчиком")
                .description("Советы от профессионалов")
                .build();

        subject.publishIssue(issue);

        System.out.println("\n--- Проверка данных выпуска ---");
        System.out.println("ID: " + issue.getId());
        System.out.println("Title: " + issue.getTitle());
        System.out.println("Description: " + issue.getDescription());
        System.out.println("Статус: " + issue.getState());
        System.out.println("Категория: " + issue.getCategory());
    }
}
