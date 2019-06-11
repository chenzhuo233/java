class People{
    /*在茫茫人海中*/
    String people;
    public People(String people){
        this.people=people;
    }
    /*我遇见了你*/
    public void Meet(String you){
        System.out.println("还记得那是一个下午，在茫茫人海中，我遇到了"+you);
    }
    /*我认识了你*/
    public void Know(String you){
        System.out.println("后来因为在一个部门，我又认识了"+you);
    }
    /*我想念你*/
    public void Miss(String you){
       System.out.println("想念"+you+"想念到走在盛开的桂花树下闻到的仅仅只有"+you+"的发香");
    }
    /*我爱上了你*/
    public void Love(String people){
        System.out.println("后来我喜欢"+people);
        System.out.println("喜欢"+people+"就像喜欢春天的熊");
        System.out.println("喜欢"+people+"喜欢到森林里的老虎全部化为黄油");
        System.out.println("总之就是很喜欢"+people);
        System.out.println("I Love U");
    }
    public void Say(String myheart){
        System.out.println("I LOVE U "+myheart);
    }
}
public class Story {
    public static void main(String args[]) {
        People I = new People("你");
        I.Meet("你");
        I.Know("你");
        I.Miss("你");
        I.Love("你");
        I.Say("王漠");
        String req="♥";
        for(float y = (float) 1.5;y>-1.5;y -=0.1)
        {
            for(float x= (float) -1.5;x<1.5;x+= 0.05)
            {
                float a = x*x+y*y-1;
                if((a*a*a-x*x*y*y*y)<=0.0)
                {


                    System.err.print(req);

                }
                else
                    System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}
