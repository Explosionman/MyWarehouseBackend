package ru.rybinskov.warehouse.repository_test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;
import ru.rybinskov.warehouse.repository.BrandRepository;

@DataJpaTest
@ActiveProfiles("test")
public class RepositoryBrandTest {

    @Autowired
    private BrandRepository brandRepository;
}
