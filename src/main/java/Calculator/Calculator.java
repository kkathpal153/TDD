package Calculator;

public class Calculator {

    public int add(String input){

        if(input == ""){
            return 0;
        }

        int res[] = stringConversion.convert(input);

        int result=0;

        for(int i=0; i<res.length;++i) {

                result = result + res[i];

        }
        return result;
    }

}
