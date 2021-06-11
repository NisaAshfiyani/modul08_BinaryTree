
package tugasBinaryTree;

public class tugasBinaryTreeApp {
    public static void main (String[] args){
        tugasBinaryTree treee = new tugasBinaryTree ();
        TreeeNODE node;
        
        node = new TreeeNODE('D');
        treee.insert(node);
        
        node = new TreeeNODE('B');
        treee.insert(node);
        
        node = new TreeeNODE('A');
        treee.insert(node);
        
        node = new TreeeNODE('C');
        treee.insert(node);
        
        node = new TreeeNODE('F');
        treee.insert(node);
        
        node = new TreeeNODE('E');
        treee.insert(node);
        
        node = new TreeeNODE('G');
        treee.insert(node);
        
        System.out.print("Traversal dengan preorder : ");
        treee.preOrder();
        System.out.print("\nTraversal dengan inorder : ");
        treee.inOrder();
        System.out.print("\nTraversal dengan postorder : ");
        treee.postOrder();
        System.out.println();
        
        
    }
}
