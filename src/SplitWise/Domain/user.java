package SplitWise.Domain;

public class user {
    int userId;
    String name;
    String gender;
    long phoneNum;
    String gmailId;

    public user(int userId, String name, String gender, long phoneNum, String gmailId) {
        this.userId = userId;
        this.name = name;
        this.gender = gender;
        this.phoneNum = phoneNum;
        this.gmailId = gmailId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUderId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(long phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getGmailId() {
        return gmailId;
    }

    public void setGmailId(String gmailId) {
        this.gmailId = gmailId;
    }
}
