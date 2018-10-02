package test;

public class Node {
	Node left, right;
	int value;

	Node find(int v){
		Node currentNode = this;
		return findRecursive(currentNode,v);
	}

	Node findRecursive(Node currentNode, int v) {
		while(currentNode!=null){
			if(v==currentNode.value)
				return currentNode;
			else if(v<currentNode.value) {
				if(currentNode.left!=null) {
					if(v==currentNode.left.value)
						return currentNode.left;
					return findRecursive(currentNode.left, v);
				}
				return null;
			}else {
				if(currentNode.right!=null) {
					if(v==currentNode.right.value)
						return currentNode.right;
					return findRecursive(currentNode.right, v);
				}
				return null;
			}
		}
		return null;
	}

}
