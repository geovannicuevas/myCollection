public abstract class Item {
    private String title;

    public void setTitle(String newTitle) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    public Item(){
        title = "";
}
    public Item(String newTitle){
       this.title = newTitle;
    }
    public String getListing() {
        return "";
    }
    @Override
    public String toString(){
        return title;
    }
}
