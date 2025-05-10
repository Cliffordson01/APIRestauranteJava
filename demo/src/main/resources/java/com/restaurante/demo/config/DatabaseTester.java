
// Adicione esta classe temporária para testar a conexão
package com.restaurante.demo.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.sql.init.dependency.DependsOnDatabaseInitialization;
import org.springframework.stereotype.Component;
import javax.sql.DataSource;
import java.sql.Connection;

@Component
@DependsOnDatabaseInitialization
public class DatabaseTester implements CommandLineRunner {
    private final DataSource dataSource;

    public DatabaseTester(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void run(String... args) throws Exception {
        try (Connection conn = dataSource.getConnection()) {
            System.out.println("✅ Conexão com o PostgreSQL estabelecida com sucesso!");
        } catch (Exception e) {
            System.err.println("❌ Falha na conexão com o PostgreSQL: " + e.getMessage());
        }
    }
}