package Exception_Handling.Object_clonning;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public interface connection
{
    void createStatement();
    void    preparedStatement();

    Statement stm = connection.stm;

    public static void main(String[] args) {
        System.out.println(stm.toString());
    }


}
