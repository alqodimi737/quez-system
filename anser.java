import java.sql.*;
public class anser {
  private int  idq;
       private String textas;
SinglyLinkedList<String> anser=new SinglyLinkedList<>();


    public void toString(int idq) {
        int aad=1;
        String an="";
        try {
            Connection c= DriverManager.getConnection("jdbc:ucanaccess://D:\\db.accdb");
            Statement statement=c.createStatement();
            ResultSet re=statement.executeQuery("select * from anser ");
            while (re.next()){
                if(re.getInt("idq")==idq){
                    anser.addFirst(re.getString(aad+"-"+"textas"));
                  //  an=an+aad+"-"++"     ";
                    aad++;
                }
            }
            c.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

        //System.out.println(anser.print());
    }
}
