object quiz1_3 extends App {

	var ans = 0;
	var previous = 0;
	def recursion(root: TreeNode) : Unit = {
		if(root == null) {
		    return;  
		} 
		recursion(root.left);
		if(previous != -1) {
		    ans = math.min(ans, math.abs(root.value - previous))
		}
		previous = root.value;
		recursion(root.right);
	}
	def minDiffInBST(root: TreeNode): Int = {
		ans = 101;
		previous = -1;
		recursion(root);
		return ans;
	}

}
