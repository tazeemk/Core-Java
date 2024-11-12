package Exception_Handling.Object_clonning;

import java.sql.Connection;

public class Outer_Driver implements connection {

//CREATING OBJECT FOR INTERFACE USING ANONYMOUS INNER CLASS

public static void main(String[] args)
{
//public static connection getConnection(){

      connection con = new connection() {
         @Override
         public void createStatement() {

         }

         @Override
         public void preparedStatement() {

         }
      };
      System.out.println(con.toString());
return ;
}
//}

   @Override
   public void createStatement() {

   }

   @Override
   public void preparedStatement() {

   }

}


