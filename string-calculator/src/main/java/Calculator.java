public class Calculator {

    private String[] values;
    private int result;

    public void init(String s) {
        /*
        for( int i = 0; i < s.length(); i++){
            validate(i,s.charAt(i));
        }
        */
        values = s.split(" ");
    }

    /*
    public void validate(int idx, char chr){
        if(idx % 2 == 0){ // 1 + 2

        }
    }
    */

    public void calculate(){

        result = Integer.parseInt(values[0]);

        for(int i=0; i<values.length; i++){
            switch (values[i]) {
                case "+":
                    plus(Integer.parseInt(values[i + 1]));
                    break;
                case "-":
                    minus(Integer.parseInt(values[i + 1]));
                    break;
                case "*":
                    multiple(Integer.parseInt(values[i + 1]));
                    break;
                case "/":
                    division(Integer.parseInt(values[i + 1]));
                    break;
            }
        }
    }

    public int result(){
        return result;
    }

    public void plus(int a){
        result = result + a;
    }

    public void minus(int a){
        result = result - a;
    }

    public void multiple(int a){
        result = result * a;
    }

    public void division(int a){
        result = result / a;
    }
}
