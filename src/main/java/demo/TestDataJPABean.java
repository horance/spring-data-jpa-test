package demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestDataJPABean {
    @Autowired
    private TestDataRepository testDataRepository;

    public void run(String[] args) {
        List<String> keys = Arrays.asList(new String[] { "a", "b", "c", "d", "e" });
        testDataRepository.findByTestDataKeyIn(keys);
        List<String> keys2 = Arrays.asList(new String[] { "a", "b" });
        testDataRepository.findByTestDataKeyIn(keys2);
    }
}
