public class GameRole {
    private int vit;
    private int atk;
    private int def;
    public void initState() {
        this.atk = 100;
        this.def = 100;
        this.vit = 100;
    }
    public void fight() {
        this.atk = 0;
        this.def = 0;
        this.vit = 0;
    }
    public RoleStateMemento saveState() {
        return new RoleStateMemento(atk,def,vit);

    }
    //回复角色初始化状态
    public void recoverState(RoleStateMemento roleStateMemento) {
        //将备忘录状态赋值给当前成员
        this.vit = roleStateMemento.getVit();
        this.atk = roleStateMemento.getAtk();
        this.def = roleStateMemento.getDef();

    }

    public void stateDisplay() {
        System.out.println("角色攻击为"+atk);
        System.out.println("角色生命力为"+vit);
        System.out.println("角色防御力为"+def);


    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
