package hero;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SuperHuman extends Superhero
{
    private Set<SuperPower> available_powers;
    private int total_powers;

    public SuperHuman(String name, String alter_ego,
                      SuperPower[] inbuiltPowers)
    {

        // super: refers to the parent class object immediately.
        super(name, alter_ego);

        //
        available_powers = new HashSet<SuperPower>(Arrays.asList(inbuiltPowers));
        for (SuperPower power: available_powers)
        {
            total_powers = total_powers + power.getValue();
        }
    }

    public void acquirePowers(SuperPower[] newPowers)
    {
        for (SuperPower newPower: newPowers)
        {
            if (available_powers.add(newPower))
            {
                total_powers = total_powers + newPower.getValue();
            }
        }
    }

    public void losePowers(SuperPower[] removedPowers)
    {
        for (SuperPower oldPower : removedPowers)
        {
            if (available_powers.remove(oldPower))
            {
                total_powers = total_powers - oldPower.getValue();
            }
        }
    }

    @Override
    public boolean hasPower(SuperPower issued_ability) {
        return available_powers.contains(issued_ability);
    }


    @Override
    public void switchIdentity() {

    }

    @Override
    public int totalPower() {
        return 0;
    }
}

