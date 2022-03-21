package hero;

public class Human extends Superhero
{
    public Human (String name, String alterego)
    {
        super(name, alterego);
    }

    @Override
    public boolean hasPower(SuperPower issued_ability) {
        return false;
    }

    @Override
    public int totalPower() {
        return 0;
    }

    @Override
    public void switchIdentity() {

    }

}
