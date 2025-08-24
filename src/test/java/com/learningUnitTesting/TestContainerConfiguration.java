package com.learningUnitTesting;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.context.annotation.Bean;
import org.testcontainers.containers.MySQLContainer;
import org.testcontainers.utility.DockerImageName;

import java.time.Duration;

@TestConfiguration
public class TestContainerConfiguration {

    @Bean
    @ServiceConnection
    MySQLContainer<?> mysqlContainer() {
        return new MySQLContainer<>(DockerImageName.parse("mysql:8.0.36"))
                .withDatabaseName("employee")
                .withUsername("test")
                .withPassword("test")
                .withStartupTimeout(Duration.ofMinutes(2));
    }
}
