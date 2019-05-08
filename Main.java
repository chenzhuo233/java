class player {
    String name;
    int age;
    public player(String name,int age) {
        this.name = name;
        this.age=age;
        System.out.println("player:" + name);
    }
    void speaking() {
        System.out.print("My name is:" + name + "\nI'm " + age + " years old!");
    }
    void aaa(){
        System.out.print("我的第一个java项目\n");
    }
}

    public class Main{
    public static void main(String[] args){
        player p1=new player("陈卓",19);
        p1.aaa();
        p1.speaking();
    }
}


