public class Client {
    public static void main(String[] args) {
        System.out.println("打boss------前");
        GameRole gameRole = new GameRole();
        gameRole.initState();
        gameRole.stateDisplay();
        //备份游戏角色内部对象
        NewStateCaretaker newStateCaretaker = new NewStateCaretaker();
        newStateCaretaker.setRoleStateMemento(gameRole.saveState());
        System.out.println("打boss------后");
        gameRole.fight();
        gameRole.stateDisplay();
        System.out.println("读档！！！");
        gameRole.recoverState(newStateCaretaker.getRoleStateMemento());
        gameRole.stateDisplay();
    }
}
