package joiner;

import java.util.StringJoiner;

public class StringJoinerSample {
    public static void main(String[] args) {
        String[] stringArr = new String[]{"Hwang","JongWuk","is","Study","Hard"};
        StringBuilder builder = new StringBuilder(stringArr[0]);
        builder.append(stringArr[1]);
        builder.append(stringArr[2]);
        builder.append(stringArr[3]);
        builder.append(stringArr[4]);
//        System.out.println(builder.toString());
        StringJoinerSample sample =new StringJoinerSample();
        sample.joinString(stringArr);
    }

    public void joinStringOnlyComma(String[] stringArray){
        StringJoiner joiner = new StringJoiner(",");
        for(String string:stringArray){
            joiner.add(string);
        }
        System.out.println(joiner);
    }
    public void joinString(String[] stringArray){
        StringJoiner joiner = new StringJoiner(",","(",")");
        for(String string:stringArray){
            joiner.add(string);
        }
        System.out.println(joiner);
    }
}
