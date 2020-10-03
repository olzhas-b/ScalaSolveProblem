object quiz1_5 extends App {
  def subarraySum(nums: Array[Int], k: Int): Int = {
    var m = scala.collection.mutable.Map[Int, Int]();
    var sum = 0;
    var ans = 0;
    m.put(0, 1);
    for(i <- nums) {
      sum += i;
      ans += m.getOrElse(sum - k, 0);
      m.put(sum, m.getOrElse(sum, 0) + 1);
    }
    return ans;
  }
  println(subarraySum(Array(1, 1, 1), 2));
}
