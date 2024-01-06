/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    public void serialize(TreeNode r, StringBuilder sb) {
        if(r == null)
            sb.append("null").append(",");
        if(r != null) {
            sb.append(r.val).append(",");
            serialize(r.left, sb);
            serialize(r.right, sb);
        }
    }

    public String serialize(TreeNode root) {
        StringBuilder stringBuilder = new StringBuilder();
        serialize(root, stringBuilder);
        return stringBuilder.toString();
    }

    public TreeNode deserialize(Queue<String> q) {
        String value = q.remove();
        if(value.equals("null"))
            return null;
        else {
            TreeNode node = new TreeNode(Integer.valueOf(value));
            node.left = deserialize(q);
            node.right = deserialize(q);
            return node;
        }
    }

    public TreeNode deserialize(String data) {
        Queue<String> list = new LinkedList<>();
        list.addAll(Arrays.asList(data.split(",")));
        return deserialize(list);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));