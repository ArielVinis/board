package br.com.board;

import static br.com.board.persistence.config.ConnectionConfig.getConnection;

import java.sql.SQLException;

import br.com.board.persistence.migration.MigrationStrategy;
import br.com.board.ui.MainMenu;

public class Main {

    public static void main(String[] args) throws SQLException {
        try (var connection = getConnection()) {
            new MigrationStrategy(connection).executeMigration();
        }
        new MainMenu().execute();
    }

}
