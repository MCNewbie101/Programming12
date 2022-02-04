public class Human {
    private String name;
    private int age;
    private boolean isAlive;
    private String gender;
    private int money;
    private int IQ;

    public Human(String name, int age, boolean isAlive, String gender, int money, int IQ) {
        this.name = name;
        this.age = age;
        this.isAlive = isAlive;
        this.gender = gender;
        this.money = money;
        this.IQ = IQ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getIQ() {
        return IQ;
    }

    public void setIQ(int IQ) {
        this.IQ = IQ;
    }

    public void eat() {

    }

    public void walk() {

    }

    public void die() {
        isAlive = false;
    }

    public void spend(int amount) {
        money -= amount;
    }
}
