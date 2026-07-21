package middle1;

public abstract class LibraryItem {
    public abstract String getTitle();
    public abstract String getAuthor();
    public abstract String getId();
    public abstract boolean isAvailable();
    public abstract void setAvailable(boolean available);

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        LibraryItem that = (LibraryItem) obj;
        return getId().equals(that.getId());
    }

    @Override
    public int hashCode() {
        return getId().hashCode();
    }
}
