package hard1;

import java.util.HashSet;

import java.util.Set;

public class Subject {

    private Set<Subscriber> subscribers = new HashSet<Subscriber>();
    private Issue issue;

    public void addObserver(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void publishIssue(Issue newIssue){
        this.issue = newIssue;
        notifyObservers();
    }

    public void removeObserver(Subscriber subscriber) {
        if (subscribers.contains(subscriber)) {
            subscribers.remove(subscriber);
        } else {
            System.out.println("Observer Not Found");
        }
    }

    public void notifyObservers() {
        if (issue != null) {
            for (Subscriber subscriber : subscribers) {
                subscriber.update(issue);
            }
        }
    }

}
