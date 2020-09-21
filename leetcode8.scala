object leetcode8 {
  class CustomFunction {
    def f(x : Int, y : Int): Unit = {
      // something
    }

  }
  def findSolution(customfunction: CustomFunction, z: Int): List[List[Int]] = {
    var ans = List[List[Int]]();
    for(i <- 1 until 1001) {
      for(j <- 1 until 1001) {
        var res = customfunction.f(i, j);
        if(res == z) ans :+= List(i, j);
      }
    }
    return ans;
  }
}
