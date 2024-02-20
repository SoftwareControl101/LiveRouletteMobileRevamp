package utilities.interfaces;

public interface PayoutCase {
    int getTestCase();
    void setBetOption();
    void getBetOption();
    void computeTestCase(String[] roundResult);
    void saveTestCase(String[] roundResult);
}
