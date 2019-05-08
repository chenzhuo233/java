//二叉树链表存储表示
class BiTNode{
    private BiTNode lchild,rchild; //左子树和右子树
    private int data;  //数据域

    public BiTNode(int data,BiTNode lchild,BiTNode rchild){
        this.data=data;
        this.lchild=lchild;
        this.rchild=rchild;
    }

    public int getData(){               //返回数据
        return data;
    }
    public void setData(int data){              //初始化
        this.data=data;
    }
    public BiTNode getLchild(){         //返回左子树
        return lchild;
    }
    public  void setLchild(BiTNode lchild){            //初始化左子树
        this.lchild=lchild;
    }
    public BiTNode getRchild(){                 //返回右子树
        return rchild;
    }
    public void setRchild(BiTNode rchild){              //初始化右子树
        this.rchild=rchild;
    }
}

public class czczcz {
    //二叉树的先序和中序
    public BiTNode init() {
        //逆序建立，先建立叶子然后往上走
        BiTNode H = new BiTNode(8, null, null);
        BiTNode E = new BiTNode(5, null, null);
        BiTNode D = new BiTNode(4, null, null);
        BiTNode G = new BiTNode(7, H, null);
        BiTNode C = new BiTNode(3, D, E);
        BiTNode F = new BiTNode(6, null, G);
        BiTNode B = new BiTNode(2, null, C);
        BiTNode A = new BiTNode(1, B, F);
        return A;//返回根节点
    }

    //输出
    public void printBiTNode(BiTNode node) {
        System.out.print(node.getData());
    }

    //先序遍历
    public void CreateTree(BiTNode root) {
        printBiTNode(root);             //先访问输出根节点
        if (root.getLchild() != null)           //如果左子树不为空，递归遍历
            CreateTree(root.getLchild());
        if (root.getRchild() != null)           //如果右子树不为空，递归遍历，传递右子树的值
            CreateTree(root.getRchild());
    }

    public static void main(String[] args) {
        czczcz tree = new czczcz();                 //new一个czczcz的对象
        BiTNode root = tree.init();             //new一个树的节点结构，用方法init建立
        System.out.println("先序遍历");
        tree.CreateTree(root);
    }
}
