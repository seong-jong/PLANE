package TEST;

public class Client {
    private int cNum;
    private String cName;
    private String cAccount;
    private int balance;

    public int getcNum() {
        return cNum;
    }

    public void setcNum(int cNum) {
        this.cNum = cNum;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getcAccount() {
        return cAccount;
    }

    public void setcAccount(String cAccount) {
        this.cAccount = cAccount;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "고객 정보 [ " +
                "고객 번호 = " + cNum +
                " , 고객 이름 = " + cName +
                " , 계좌 번호 = " + cAccount +
                " , 계좌 잔액 = " + balance +
                " ]";
    }
}
