package try2.Calculator;

import java.util.regex.Pattern;

public class StringExpression {

    private String expr;
    private static final Pattern PATTERN = Pattern.compile("");

    public StringExpression(String expr){
        validate(expr);
        this.expr = expr.replace(" ","");
    }

    public void validate(String expr){
        if(expr==null || expr.isBlank() || isNonMatchesExprPattern(expr)){
            throw new IllegalArgumentException(" 입력하신 문자열이 옳지 않습니다. ");
        }
    }


}
