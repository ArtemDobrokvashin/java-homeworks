package easy2;

public class House {

    private String address;
    private int constructionYear;

    public House(String address, int constructionYear) {
        this.address = address;
        this.constructionYear = constructionYear;
    }

    public String getAddress() {
        return address;
    }

    public int getConstructionYear() {
        return constructionYear;
    }
}
