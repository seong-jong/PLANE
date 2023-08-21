package TEST;

import oracle.jdbc.driver.OracleDriver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBC {
    public static Connection DBConnect()

    {
        Connection con;
        String user = "hyunsang";
        String password = "1111";
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con= DriverManager.getConnection(url,user,password);
            System.out.println("DB 접속 성공!");
        } catch (ClassNotFoundException e) {
            System.out.println("DB 접속 성공 : 드라이버 로딩 실패");
            throw new RuntimeException(e);
        } catch (SQLException e) {
            System.out.println("DB 접속 실패 : 접속 정보 오류!");
            throw new RuntimeException(e);
        }

        return con;
    }
}
