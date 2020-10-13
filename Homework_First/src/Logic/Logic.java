package Logic;

public class Logic {
    //Проверка делимости на 3
    boolean Divided_By_Three(int i){
        return i % 3 == 0;
    }

    //Проверка делимости на 5
    boolean Divided_By_Five(int i){
        return i % 5 == 0;
    }

    //Проверка делимости на 3 и 5
    boolean Divided_By_Both(int i){
        return (i % 3 == 0) && (i % 5 == 0);
    }

    //Проверка делимости
    public String Check_Division(int i) {
        String result = "";
        if (Divided_By_Three(i)) result =  "Fizz";
        if(Divided_By_Five(i)) result =  "Buzz";
        if(Divided_By_Both(i)) result = "FizzBuzz";
        return result;
    }
}
