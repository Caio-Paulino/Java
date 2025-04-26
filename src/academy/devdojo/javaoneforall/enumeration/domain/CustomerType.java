package academy.devdojo.javaoneforall.enumeration.domain;

public enum CustomerType {
    INDIVIDUAL(1),
    COMPANY(2),
    START_UP(3);

    private final int DB_VALUE;

    CustomerType(int dbValue) {
        DB_VALUE = dbValue;
    }

    public int getDB_VALUE() {
        return DB_VALUE;
    }
}
