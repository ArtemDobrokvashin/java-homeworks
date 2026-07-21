package middle1;

public class Magazine extends LibraryItem{

    private String author;
    private String title;
    private String id;
    private boolean available;


    public Magazine(String author, String title, String id){
        this.author = author;
        this.title = title;
        if (id == null || id.isEmpty()) {
            throw new IllegalArgumentException("ID не может быть пустым");
        }
        this.id = id;
        this.available = true;
    }


    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public String getAuthor() {
        return this.author;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public boolean isAvailable() {
        return available;
    }

    @Override
    public void setAvailable(boolean available) {
        this.available = available;
    }
}
