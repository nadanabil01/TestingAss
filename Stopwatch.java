public class Stopwatch {
    public String state = "Normal";
    public String state1 ="Time";
    public int m=0, h=0, D=1, M=1, Y=2000;
    public String [] input(char c){
        if( state.equals("Normal")){
            if(c=='c'){
                state="Update";
                state1= "min";}
            if(c=='b'){
                state ="Alarm";
                state1="Alarm ";
            }
            if(c=='a'){
                if(state1.equals("Time")){
                    state1="Date";
        }else{
                    state1="Time";}
    }
}
        if(state.equals("Update")) {
            if (c == 'd') {
            state = "Normal";
            state1 = "Time";
        }
            if (c == 'a') {
                if (state1.equals("year")) {
                    state = "Normal";
                    state1 = "Time";
                }
                if (state1.equals("Month")) {
                    state1 = "Year";
                }
                if (state1.equals("Day")) {
                    state1 = "Month";
                }
                if (state1.equals("Hour")) {
                    state1 = "Day";
                }
                if (state1.equals("Min") ) {
                    state1 = "Hour";
                }
            }
            if (c == 'b') {
                if (state1.equals("min")) {
                    m++;
                    if (m >= 60) {
                        m = 0;
                    }
                }
                if (state1.equals("Hour")) {
                    h++;
                    if (h >= 24) {
                        h = 0;
                    }
                }
                if (state1.equals("Day")) {
                    D++;
                    if (D > 31) {
                        D = 1;
                    }
                }
                if (state1.equals("Month")) {
                    M++;
                    if (M > 12) {
                        M = 1;
                    }
                }
                if (state1.equals("Year")) {
                    Y++;
                    if (Y > 2100) {
                        Y = 2000;
                    }
                }
            }
        }

        if(state.equals("Alarm")){
            if (c == 'd') {
            state = "Normal";
            state1 = "Time";
        }
            if (c == 'a') {
                state1 = "Chime";
            }
        }

        return new String[]{state, state1, String.valueOf(Y) + "-" + String.valueOf(M) + "-" + String.valueOf(D), String.valueOf(h) + ":" + String.valueOf(m) };
    }

}
