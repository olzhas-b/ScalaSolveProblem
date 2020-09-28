object leetcode11 extends App {
  def maxProduct(nums: Array[Int]): Int = {
    return nums.sorted.slice(nums.length - 2, nums.length).reduce((a, b) => (a - 1) * (b - 1));
  }
  def test1(): Unit = {
    //4 * 5 == 20
    println(maxProduct(Array(1, 5, 3, 5, 6)));
  }

  test1();
}
