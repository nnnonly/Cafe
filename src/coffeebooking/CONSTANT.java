/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffeebooking;

import java.util.Vector;

public class CONSTANT {
    
    public String getCurrentStaticContext(String fileName) {
		return System.getProperty("user.dir") + "\\src\\Interface\\static\\" + fileName;
    }
    
    public static String ICON_COFFE_DIR = "C:\\Users\\DEll\\Desktop\\cafe_96px.png";

    public static Vector getFoodHeader(){
        Vector header = new Vector();
        header.add("Name");
        header.add("Cost");
        header.add("Time Estimate");
        return header;
    }
    
    public static Vector getOrderHeader(){
//        "ID KHTX", "ID", "Name", "Cost", "Amount", "Total"
        Vector header = new Vector();
        header.add("ID");
        header.add("Name");
        header.add("Cost");
        header.add("Amount");
        header.add("Total");
        return header;
    }
}
