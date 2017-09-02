package xinmai.game.model;

import java.sql.Timestamp;

public class ZhangHao {
    private String sAccount;
    private String sPassword;
    private String sUserName;
    private String sSSNo;
    private String sPhone;
    private String sQuiz;
    private String sAnswer;
    private String sQuiz2;
    private String sAnswer2;
    private String sBirthDay;
    private String sMobilePhone;
    private String sEMail;
    private String sMemo;
    private int ErrorCount;
    private int ActionTick;
    private Timestamp CreateDate;
    private Timestamp UpdateDate;
    private Boolean boDeleted;
    public ZhangHao() {
    }

    public String getsAccount() {
        return sAccount;
    }

    public void setsAccount(String sAccount) {
        this.sAccount = sAccount;
    }

    public String getsPassword() {
        return sPassword;
    }

    public void setsPassword(String sPassword) {
        this.sPassword = sPassword;
    }

    public String getsUserName() {
        return sUserName;
    }

    public void setsUserName(String sUserName) {
        this.sUserName = sUserName;
    }

    public String getsSSNo() {
        return sSSNo;
    }

    public void setsSSNo(String sSSNo) {
        this.sSSNo = sSSNo;
    }

    public String getsPhone() {
        return sPhone;
    }

    public void setsPhone(String sPhone) {
        this.sPhone = sPhone;
    }

    public String getsQuiz() {
        return sQuiz;
    }

    public void setsQuiz(String sQuiz) {
        this.sQuiz = sQuiz;
    }

    public String getsAnswer() {
        return sAnswer;
    }

    public void setsAnswer(String sAnswer) {
        this.sAnswer = sAnswer;
    }

    public String getsQuiz2() {
        return sQuiz2;
    }

    public void setsQuiz2(String sQuiz2) {
        this.sQuiz2 = sQuiz2;
    }

    public String getsAnswer2() {
        return sAnswer2;
    }

    public void setsAnswer2(String sAnswer2) {
        this.sAnswer2 = sAnswer2;
    }

    public String getsBirthDay() {
        return sBirthDay;
    }

    public void setsBirthDay(String sBirthDay) {
        this.sBirthDay = sBirthDay;
    }

    public String getsMobilePhone() {
        return sMobilePhone;
    }

    public void setsMobilePhone(String sMobilePhone) {
        this.sMobilePhone = sMobilePhone;
    }

    public String getsEMail() {
        return sEMail;
    }

    public void setsEMail(String sEMail) {
        this.sEMail = sEMail;
    }

    public String getsMemo() {
        return sMemo;
    }

    public void setsMemo(String sMemo) {
        this.sMemo = sMemo;
    }

    public int getErrorCount() {
        return ErrorCount;
    }

    public void setErrorCount(int errorCount) {
        ErrorCount = errorCount;
    }

    public int getActionTick() {
        return ActionTick;
    }

    public void setActionTick(int actionTick) {
        ActionTick = actionTick;
    }

    public Timestamp getCreateDate() {
        return CreateDate;
    }

    public void setCreateDate(Timestamp createDate) {
        CreateDate = createDate;
    }

    public Timestamp getUpdateDate() {
        return UpdateDate;
    }

    public void setUpdateDate(Timestamp updateDate) {
        UpdateDate = updateDate;
    }

    public Boolean getBoDeleted() {
        return boDeleted;
    }

    public void setBoDeleted(Boolean boDeleted) {
        this.boDeleted = boDeleted;
    }

    @Override
    public String toString() {
        return "ZhangHao{" +
                "sAccount='" + sAccount + '\'' +
                ", sPassword='" + sPassword + '\'' +
                ", sUserName='" + sUserName + '\'' +
                ", sSSNo='" + sSSNo + '\'' +
                ", sPhone='" + sPhone + '\'' +
                ", sQuiz='" + sQuiz + '\'' +
                ", sAnswer='" + sAnswer + '\'' +
                ", sQuiz2='" + sQuiz2 + '\'' +
                ", sAnswer2='" + sAnswer2 + '\'' +
                ", sBirthDay='" + sBirthDay + '\'' +
                ", sMobilePhone='" + sMobilePhone + '\'' +
                ", sEMail='" + sEMail + '\'' +
                ", sMemo='" + sMemo + '\'' +
                ", ErrorCount=" + ErrorCount +
                ", ActionTick=" + ActionTick +
                ", CreateDate=" + CreateDate +
                ", UpdateDate=" + UpdateDate +
                ", boDeleted=" + boDeleted +
                '}';
    }
}
