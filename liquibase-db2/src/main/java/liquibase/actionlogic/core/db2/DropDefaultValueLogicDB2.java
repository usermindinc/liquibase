package liquibase.actionlogic.core.db2;

import liquibase.Scope;
import liquibase.action.Action;
import liquibase.action.core.DropDefaultValueAction;
import liquibase.action.core.StringClauses;
import liquibase.actionlogic.core.DropDefaultValueLogic;
import liquibase.database.Database;
import liquibase.database.core.db2.DB2Database;

public class DropDefaultValueLogicDB2 extends DropDefaultValueLogic {

    @Override
    protected Class<? extends Database> getRequiredDatabase() {
        return DB2Database.class;
    }

    @Override
    protected StringClauses generateSql(DropDefaultValueAction action, Scope scope) {
        return new StringClauses().append("DROP DEFAULT");
    }
}