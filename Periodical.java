public class Periodical extends Item {
    private int issueNum;
    public Periodical(int issueNum, String title){
        this.issueNum = issueNum;
        setTitle(title);
    }

    public int getIssueNum() {
        return issueNum;
    }

    public void setIssueNum(int issueNum) {
        this.issueNum = issueNum;
    }
    @Override
    public String getListing(){
        return "Periodical Title - " + getTitle() + "\n" + "Issue# - " + issueNum + "\n";
    }
}
