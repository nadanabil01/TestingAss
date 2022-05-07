public class Max_n_MIn {
    public static int getMaxValue( int numbers []){
        int maxValue;
        if(numbers.length != 0){
            maxValue =numbers[0];
        for(int i=1; i<numbers.length; i++){
            if (numbers[i]> maxValue) {
                maxValue =numbers[i];
            }
        }
        return maxValue;}
        else
            return -1;
    }
    public static int getMinValue(int numbers[]) {
        int minValue;
        if (numbers.length != 0) {
            minValue = numbers[0];
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] < minValue) {
                    minValue = numbers[i];
                }
            }
            return minValue;
        } else
            return -1;
    }
}

