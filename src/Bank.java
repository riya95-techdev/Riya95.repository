public class Bank {
    private int branchId;
    private String bankName;
    private String bankAdress;
    private String stateIfsCode;
    private int numberOfBranches;

    public Bank() { }

    public Bank(int branchId, String bankName, String bankAdress, String stateIfsCode, int numberOfBranches) {
        this.branchId = branchId;
        this.bankName = bankName;
        this.bankAdress = bankAdress;
        this.stateIfsCode = stateIfsCode;
        this.numberOfBranches = numberOfBranches;
    }

    public int getBranchId() {
        return branchId;
    }

    public void setBranchId(int branchId) {
        this.branchId = branchId;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankAdress() {
        return bankAdress;
    }

    public void setBankAdress(String bankAdress) {
        this.bankAdress = bankAdress;
    }

    public String getStateIfsCode() {
        return stateIfsCode;
    }

    public void setStateIfsCode(String stateIfsCode) {
        this.stateIfsCode = stateIfsCode;
    }

    public int getNumberOfBranches() {
        return numberOfBranches;
    }

    public void setNumberOfBranches(int numberOfBranches) {
        this.numberOfBranches = numberOfBranches;
    }

    // Working methods
    @Override
    public String toString() {
        return "Bank{" +
                "branchId=" + branchId +
                ", bankName='" + bankName + '\'' +
                ", bankAdress='" + bankAdress + '\'' +
                ", stateIfsCode='" + stateIfsCode + '\'' +
                ", numberOfBranches=" + numberOfBranches +
                '}';
    }
}
