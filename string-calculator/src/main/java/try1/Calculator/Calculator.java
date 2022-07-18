package try1.Calculator;

public class Calculator {

    private String originValue;
    private String[] values; // 연산자들?
    private int result;

    private void init() {
        if (originValue == null || originValue.isBlank()) throw new IllegalArgumentException("입력값은 공백일 수 없습니다.");
        this.originValue = originValue.trim();

        // value가 무엇? Gae Chu
        values = originValue.split(" ");
        for (int i=0; i<values.length; i++){
            validate(i,values[i]);
        }
    }

    public Calculator(String originValue) {
        this.originValue = originValue;
        init();
    }

    //없 애 죠?
    private void validate(int idx, String one){
        // " 1+ 2+3+4 ".replace(" ", "") -> "1+2+3+4"
        char character = one.charAt(0) ; // "1" " 2"
        if(character == ' ') throw new IllegalArgumentException("입력값에 공백은 허용되지 않습니다.");
        if(idx % 2 == 0){ // 홀수 연산자, 짝수 피연산자
            if(Character.isLetter(character)){ // 짝수인데 문자면
                throw new IllegalArgumentException("입력값이 유효하지 않습니다.");
            }
        }else {
            if(Character.isDigit(character)){ // 홀수인데 숫자면
                throw new IllegalArgumentException("입력값이 유효하지 않습니다.");
            }
        }
    }

    public void calculate(){

        result = Integer.parseInt(values[0]);

        //ㅇㅔ엑 더 러 워 ㅜ.ㅜ
        for(int i=0; i<values.length; i++){
            int a = Integer.parseInt(values[i + 1]);
            switch (values[i]) {
                case "+":
                    plus(a);
                    break;
                case "-":
                    minus(a);
                    break;
                case "*":
                    multiple(a);
                    break;
                case "/":
                    division(a);
                    break;
            }
        }
    }

    public int result(){
        return result;
    }

    private void plus(int a){
        result = result + a;
    }

    private void minus(int a){
        result = result - a;
    }

    private void multiple(int a){
        result = result * a;
    }

    private void division(int a){
        result = result / a;
    }
}
