package demo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface TestDataRepository extends CrudRepository<TestEntity, String> {

    public List<TestEntity> findByTestDataKeyIn(List<String> keys);
}
