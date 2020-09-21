object leetcode3 extends App{
  def smallerNumbersThanCurrent(nums: Array[Int]): Array[Int] = {
    nums.map(x => nums.count(y => x > y))
  }
  def test1() = {
    val nums = Array(8, 1, 2, 2, 3)
    println(smallerNumbersThanCurrent(nums).foreach(x => print(x + " ")))
  }
  def test2() = {

  }
  test1()
}
