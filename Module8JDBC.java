package Module8JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Module8JDBC {
public static void main(String[] args ) throws SQLException {
String url = "jdbc:mysql://localhost:3306/TestGrades";
String uname = "root";
String password = "123456";
String query = "select * from 11thGradeMathStudents";


try {
Class.forName("com.mysql.cj.jdbc.Driver");
} catch (ClassNotFoundException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
try {
Connection con = DriverManager.getConnection(url, uname, password);
Statement statement = con.createStatement();
ResultSet result = statement.executeQuery(query);

while (result.next()) {
String TestGradesData = "";
for (int i = 1; i <= 6; i++) {
TestGradesData += result.getString(i) + ":";
}
System.out.println(TestGradesData);
}

}
catch (SQLException e) {
e.printStackTrace();
}
}

}