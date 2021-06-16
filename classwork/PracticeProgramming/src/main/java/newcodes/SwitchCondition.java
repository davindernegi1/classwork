/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newcodes;

/**
 *
 * @author mamta
 */
public class SwitchCondition {
    public static void main(String[] args) {
        System.out.println("test");
    int day = 4;
String dayName = "";
switch (day)
{
    case 1:
        dayName = "Monday";
        break;
    case 2:
        dayName = "Tuesday";
        break;
    case 3:
        dayName = "Wednesday";
        break;
    case 4:
        dayName = "Thursday";
        break;
    case 5:
        dayName = "Friday";
        break;
    case 6:
        dayName = "Saturday";
        break;
    case 7:
        dayName = "Sunday";
        break;
    default:
        dayName = "Invalid day";
}
        System.out.println(dayName);
    
    int nday = 4;
String dayType = "";

switch (nday) {
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
        dayType = "Weekday";
            break;
    case 6:
    case 7:
        dayType = "Weekend";
            break;
    default:
        dayType = "Invalid Day";
}

System.out.println(dayType);
    
    
    }
    
}
