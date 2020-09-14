import scala.collection.mutable.Stack;
object Calculator {
   def calculate(n1 : Int,n2 : Int, c : Char) : Int = {
       val res  = c match {
           case '+' => n1 + n2
           case '-' => n1 - n2
           case '*' => n1 * n2
           case '/' => n1 / n2
       }
       return res
   }
   def main(args: Array[String]) {
        var number : List[Int] = List(4, 6, 7, 0, 6, 2);
        var operation : List[Char] = List('-', '+', '*', '-', '*');
        // + 4 - 6 + 7 * 0 - 6 * 2 = -14
        var o = Stack[Char]();
        var num = Stack[Int]();
        o.push('+');
        for(i <- 0 until number.size) {
            if(num.size == 0) {
                num.push(number(i));
            } else {
                if(operation(i - 1) == '*' || operation(i - 1) == '/') {
                    var n1 = num.top;
                    num.pop();
                    num.push(calculate(n1, number(i), operation(i - 1)));
                } else {
                    num.push(number(i));
                    o.push(operation(i - 1));
                }
            }
        }
        if(num.size != o.size) {
            println("invalide input please enter correct input")
        } else {
            var res = 0;
            while(num.size != 0 && o.size != 0) {
                if(o.top == '-') res += -num.top;
                else res += num.top;
                num.pop();
                o.pop();
            }
            println(res)
        }
   }
} 