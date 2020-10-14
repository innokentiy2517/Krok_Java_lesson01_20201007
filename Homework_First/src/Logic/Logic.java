package Logic;

/*
1. Выводить либо число, либо fizz\buzz\fizzbuzz
2. Каждое из условий if выполняется для каждого числа.
   Возможно оптимизировать таким образом,
   чтобы при выполнении одного из условий,
   следующее уже не проверялось.
   Для этого нужно поменять порядок проверок и использовать цепочки if-else-if.
 */

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
        String result = Integer.toString(i);
        if (Divided_By_Both(i)) {
            result = "FizzBuzz";
        }
        else
        {
            if (Divided_By_Five(i)){
                result = "Buzz";
            }
            else
            {
                if (Divided_By_Three(i)) result = "Fizz";
            }
        }
        return result;
    }
}
