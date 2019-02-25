package learner.venky.jokesapp.infrastructure;

public class DataSource {

    private String dbUrl;
    private String dbUserName;
    private String dbPassword;

    public String getDbUrl() {
        return dbUrl;
    }

    public void setDbUrl(String dbUrl) {
        this.dbUrl = dbUrl;
    }

    public String getDbUserName() {
        return dbUserName;
    }

    public void setDbUserName(String dbUserName) {
        this.dbUserName = dbUserName;
    }

    public String getDbPassword() {
        return dbPassword;
    }

    public void setDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
    }

    @Override
    public String toString() {
        return "DataSource{" +
                "dbUrl='" + dbUrl + '\'' +
                ", dbUserName='" + dbUserName + '\'' +
                ", dbPassword='" + dbPassword + '\'' +
                '}';
    }
}
