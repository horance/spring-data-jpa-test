package demo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TEST_DATA")
public class TestEntity {
    @Id
    @Column(name = "TEST_DATA_KEY", length = 10)
    private String testDataKey;

    @Basic
    @Column(name = "TEST_DATA_VALUE", length = 40)
    private String testDataValue;

    /**
     * @return the testDataKey
     */
    public String getTestDataKey() {
        return testDataKey;
    }

    /**
     * @param testDataKey
     *            the testDataKey to set
     */
    public void setTestDataKey(String testDataKey) {
        this.testDataKey = testDataKey;
    }

    /**
     * @return the testDataValue
     */
    public String getTestDataValue() {
        return testDataValue;
    }

    /**
     * @param testDataValue
     *            the testDataValue to set
     */
    public void setTestDataValue(String testDataValue) {
        this.testDataValue = testDataValue;
    }
}
