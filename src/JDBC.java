import java.sql. *;
import java.util.Scanner;

public class JDBC {
    /*
     *JDBC
-	Register [3]
-	Connection [4]
-	Statements [16:  5 points for database (Galamsey/Observatory), 1 pt Initialize connection, 5 pts Query }]: Demo by students
-	ResultSet [2]
[5 points] Design + Creativity
 All classes should be properly documented with Javadoc and include appropriate defensive programming approaches. You may need to research relevant Java Class libraries in order to get help with certain features (such as JDBC for database storage).
- Import the package: java.sql.*
- Load the driver: com.mysql.jdbc.driver
- Register the driver: use method forName() which loads driver
Eg: Class.forName("com.mysql.jdbc.driver")
- Establish connection: Instantiate the interface connection
Connection is an interface therefore we use a getter, getConnection(URL, username, password)
- Create the statement: a. Normal statement b. Prepared statement c. Callable statement
A query can be executed with a statement object.
A predefined query is executed w/ prepared statement
A PL (procedural language: stored procedures) is executed with a callable statement.
Statement st = con.CreateStatement()
- Execute the query: Eg. Fetch the data from a db, insert a value.
ResultSet rs = st.executeQuery("select * from student")//fetches the data and stores it
//Resultset is an interface that holds data. It can hold a data.
- Process result
Your pointer is always before the first value.
rs.next() will move the pointer to the first line of data.
rs.getInt(i) will give you the value in the i-th column
while (rs.next())
    sout(rs.getInt(i))
- Close
st.close();
con.close();
     */

    String query1 = "Select * from Observatory";
    String query2 = "Select * from Galamsey";

    public JDBC(){

        try{
            //Load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Get a connection to a database
            //jdbc:mysql://127.0.0.1:3306/?user=root
            Connection myConn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mydb?","root", "afuaSQL@1");

            //Search for a class that implements Connection or search for a method that
            //gives the instance of connection.
            //DriverManager is a class with getConnection - static method
            System.out.println("Connection established with database");

            //Create a statement
            Statement st = myConn.createStatement();

            //Execute SQL query
            ResultSet rs1 = st.executeQuery(query1);
            ResultSet rs2 = st.executeQuery(query2);

            //Process the result set
            rs1.next();
            rs2.next();
            while (rs1.next()) {
                //System.out.println(rs1.getString("observatoriesName"));
                String name1 = rs1.getString("observatoriesName");
                String 
                while (rs2.next()){
                    String name2 = rs2.getString("GalamseyID");
                }
            }


            //Close
            st.close();
            myConn.close();

        } catch(Exception e){
            System.out.println(e);
            System.out.println("Error connecting.");
        }

    }

    public static void main (String [] args){

        JDBC j1 = new JDBC();


    }
}
