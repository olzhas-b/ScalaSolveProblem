object leetcode2 {
  class ListNode(_x: Int = 0, _next: ListNode = null) {
    var next: ListNode = _next
    var x: Int = _x;
  }
  def getDecimalValue(head: ListNode): Int = {
    var ans = 0;
    var iterator = head;
    var k = 0;
    while(iterator != null) {
      iterator = iterator.next;
      k += 1;
    }
    iterator = head;
    k -= 1;
    while(iterator != null) {
      ans += Math.pow(2, k).toInt * iterator.x;
      k -= 1;
      iterator = iterator.next;
    }
    return ans;
  }
}
