package sample.cpro1221_javafx_project_sample.model;

import java.sql.Date;

public class Accounts {
    public String getAccount_id() {
        return account_id;
    }

    public void setAccount_id(String account_id) {
        this.account_id = account_id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    private String account_id;
    private String userName;
    private String email;
    private Date joinDate;

    public Accounts(String account_id, String userName, String email, Date joinDate) {
        this.account_id = account_id;
        this.userName = userName;
        this.email = email;
        this.joinDate = joinDate;
    }
}
