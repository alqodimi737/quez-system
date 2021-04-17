import java.sql.*;

/**
 * Created by hp on 17/04/2021.
 */
public class Quesin {
private  String quis;
SinglyLinkedList<String> anser=new SinglyLinkedList<>();

    public Quesin() {
    }

    public void toString(int idq) {
        anser anser1=new anser();
        String an1="";
        int id2=0;
        int aad=0;
        String an="";
        try {
            Connection c= DriverManager.getConnection("jdbc:ucanaccess://D:\\db.accdb");
            Statement statement=c.createStatement();
            ResultSet re=statement.executeQuery("select * from quation ");
            while (re.next()){
                if(re.getInt("idq")==idq){
                    quis =re.getString("text");
                    System.out.println(quis);
                    //aad=re.getInt("idq");
                    //an="\n"+an+aad+"-"+re.getString("text")+"       "+"\n\n"+anser1.toString(id2)+"\n\n";
                   // anser1.toString(idq);
                    getanser(idq);
                }
            } c.close();

        }
        catch (SQLException e) {
            e.printStackTrace();
        }


    }


    public void getanser(int idq) {
        int aad=1;
        String an="";
        try {
            Connection c= DriverManager.getConnection("jdbc:ucanaccess://D:\\db.accdb");
            Statement statement=c.createStatement();
            ResultSet re=statement.executeQuery("select * from anser ");
            while (re.next()){
                if(re.getInt("idq")==idq){
                    anser.addFirst(re.getString("textas"));
                    //  an=an+aad+"-"++"     ";
                 //   aad++;
                }
            }
            c.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
       System.out.println(anser.print());

    }



}
