public class hashMapBST {
    private Node[] nodes;
    private static final int MAX_C =41;
    public hashMapBST(){
        nodes=new Node[MAX_C];
    }


    public int getHash(String key){

        if (key == null){
            return 0;
        }

        int hash= key.hashCode();

        hash = hash >>> 16;
        hash = hash %MAX_C;
        return hash;
    }

/*

    In case of collitions put new key value pair in BST based on key comparisn.
*/

    public void put(String key,String value){

        int hashOfKey= getHash(key);

        final Node newNode=new Node(key,value);

        if(nodes[hashOfKey] == null){
            nodes[hashOfKey]=newNode;
        }else{
            Node root=new Node[hashOfKey];
            try {
                addToBSTBucket(root, newNode);
            }catch (Exception e){
                e.printStackTrace();
            }

        }

    }
    /**
     * If a collision happens while adding a node to Hashmap, add new node to the hashed bucket represented with a BST.
     *
     * @param root		root of BST bucket
     * @param newNode 	New Node to be added in BST bucket
     */
    private void addToBSTBucket(Node root, final Node newNode){

        if(root == null){
            root=newNode;
        }

        Node currentNode=root;
        Node parentNode=root;

        while(true){
            parentNode=currentNode;

            if(newNode.key.compareTo(currentNode.key)==0){
                currentNode.value=  newNode.value;
                return;
            }else if()
        }
    }

    private static  class Node{
        private String key;
        private String value;
        private Node left;
        private Node right;

        public Node(String key,String value){
            this.key=key;
            this.value=value;
        }
    }

    public static void main(String[] args) {

    }
}

class Node{

}
