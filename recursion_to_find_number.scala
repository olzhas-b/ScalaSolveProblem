object recursion_to_find_number extends App {
  def recursion_find_x(nums : List[Int], x : Int): Any = {
    if(nums.length == 0) return false;
    if(nums.head == x) return true;
    return recursion_find_x(nums.tail, x)
  }
  def test1() = {
    var nums = List(1, 2, 3, 4);
    println(recursion_find_x(nums, 3));
  }
  def test2() = {
    var nums : List[Int] = List(1, 2, 3, 4, 5);
    println(recursion_find_x(nums, 6));
  }
  test1();
  test2();
}
