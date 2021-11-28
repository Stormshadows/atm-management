
package atm;

import java.sql.*;

public class Txn {

    double amount;
    int account_n;

    Txn(double amt, int acc_n) {
        amount = amt;
        account_n = acc_n;        
        
        //Create new Transaction
        String sql = "INSERT INTO ATMLOGIN.ATM_Txn (Txn_Date,Txn_Time,ACCOUNTNUMBER,CRDR,Amount) VALUES (" + "CURRENT_DATE" + "," + "CURRENT_TIME" +  "," + account_n + "," + "'DR'" + "," + amount + ")";

        try (Connection connection = DriverManager.getConnection("jdbc:derby://localhost:1527/ATMDB", "atmlogin", "loginatm");  Statement statement = connection.createStatement();) {
            statement.executeUpdate(sql);
        } catch (SQLException se) {
            System.out.println(se);
        }
    }
}

