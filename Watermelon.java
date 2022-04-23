import java.util.Scanner;
public class Watermelon{
    public String Watermelonn(double w) {
        if (w >= 1 && w <= 100) {
            if(w == 2){
                return "Doesn't get divided to two even numbers";
            }
            if (w > 2) {
                if (w % 2 == 0)
                    return "Yes";
                else
                    return "No";
            } else
                return "No";
        } else
            return "Out Of Range";
    }
}
