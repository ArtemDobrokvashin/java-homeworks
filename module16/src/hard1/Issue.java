package hard1;

import java.util.Date;

public class Issue {

    private String id;
    private String title;
    private String description;
    private String state;
    private String category;
    private String assignee;
    private Date date;

    public Issue(String id, String title, String description, String state, String category, String assignee, Date date) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.state = state;
        this.category = category;
        this.assignee = assignee;
        this.date = date;
    }

    public static Builder builder() {
        return  new Builder();
    }

    public static class Builder {
        private String id;
        private String title;
        private String description;
        private String state;
        private String category;
        private String assignee;
        private Date date;

        public Builder id(String id) {

            this.id = id;
            return this;
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder state(String state) {
            this.state = state;
            return this;
        }

        public Builder category(String category) {
            this.category = category;
            return this;
        }

        public Builder assignee(String assignee) {
            this.assignee = assignee;
            return this;
        }

        public Builder date(Date date) {
            this.date = date;
            return this;
        }

        public Issue build() {
            String finalState = (state != null) ? state : "DRAFT";
            String finalCategory = (category != null) ? category : "GENERAL";

            return new Issue(
                    id,
                    title,
                    description,
                    finalState,
                    finalCategory,
                    assignee,
                    date
            );
        }
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getState() {
        return state;
    }

    public String getCategory() {
        return category;
    }

    public String getAssignee() {
        return assignee;
    }

    public Date getDate() {
        return date;
    }
}
