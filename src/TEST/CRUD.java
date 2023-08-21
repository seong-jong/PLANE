package TEST;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CRUD {
    Connection con;
    PreparedStatement pstmt;
    ResultSet rs;

    public void connect(){
        con=DBC.DBConnect();
    }
    public void conclose(){
        try {
            con.close();
            System.out.println("DB 접속 종료!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void bankJoin(Client client) {
        String sql="CREATE INTO BANKT VALUES (?,?,?,?)";
        try {
            pstmt=con.prepareStatement(sql);
            pstmt.setInt(1,client.getcNum());
            pstmt.setString(2, client.getcName());
            pstmt.setString(3, client.getcAccount());
            pstmt.setInt(4,client.getBalance());

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
