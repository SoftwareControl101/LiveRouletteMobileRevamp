package utilities.interfaces;

public interface ResAndStatsCase {
    int getTestCase();
    int getDivision();
    void setResult();
    void setStatistics();
    void saveTestCase(String[] roundResult);
}
