object leetcode12 extends App {
  def average(salary: Array[Int]): Double = {
    return ( (salary.sum - salary.max - salary.min) / (salary.length - 2.0) ).toDouble;

    return salary.foldLeft((0, Int.MaxValue, Int.MinValue, 0)) {
      (memo, next) =>
        memo match {
          case (sum, min, max, count) =>
            (sum + next, math.min(next, min), math.max(next, max), count + 1)
        }
      }
      match {
        case (sum, min, max, count) => ((sum - min - max) / (count - 2).toDouble)
      }
  }
  def test1(): Unit = {
    // (1 + 2  + 4 + 5) / 4 = 3
    println(average(Array(1, 1, 2, 4, 5, 6)));
  }
  test1();
}
