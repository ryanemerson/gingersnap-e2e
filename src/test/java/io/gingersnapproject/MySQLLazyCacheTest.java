package io.gingersnapproject;

import io.gingersnap_project.v1alpha1.cachespec.DataSource;
import io.gingersnapproject.database.MySQL;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.extension.ExtendWith;

@Tag("mysql")
@ExtendWith(MySQL.class)
public class MySQLLazyCacheTest extends AbstractLazyCacheTest {
    public MySQLLazyCacheTest() {
        super(DataSource.DbType.MYSQL_8, MySQL.PLACEHOLDER);
    }
}
