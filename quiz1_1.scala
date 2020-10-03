object quiz1_1 extends App {
  class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
      var value: Int = _value
      var left: TreeNode = _left
      var right: TreeNode = _right
    }
  def recursionSum(root: TreeNode, L: Int, R: Int) : Int = {
    var sum = 0;
    if(root.value >= L && root.value <= R) sum += root.value;
    var sum1 = 0; var sum2 = 0;
    if(root.left != null)
      sum1 = recursionSum(root.left, L, R);
    if(root.right != null)
      sum2 = recursionSum(root.right, L, R);
    return sum1 + sum2 + sum;
  }
  def rangeSumBST(root: TreeNode, L: Int, R: Int): Int = {
    return recursionSum(root, L, R);
  }
}
