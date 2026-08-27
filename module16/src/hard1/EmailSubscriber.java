package hard1;

public class EmailSubscriber implements Subscriber {
    @Override
    public void update(Issue issue) {
        System.out.println("Уведомление " + issue.getAssignee() + "\n" +
                issue.getTitle() + "\n" +
                issue.getDate());
    }
}
