package hero;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class EnhancedHuman extends Superhero
{
    private Set<SuperPower> available_abilities;
    private int abilities_sum;
    private boolean enhanced_human;

    public EnhancedHuman(String name, String alter_ego,
                         SuperPower[] inbuiltAbilities)
    {
        super(name, alter_ego);

        available_abilities =
                new HashSet<SuperPower>(Arrays.asList(inbuiltAbilities));

        for (SuperPower ability: available_abilities)
        {
            abilities_sum = abilities_sum + ability.getValue();
        }

        enhanced_human = false;
    }

    /**
     * Gain a new power and update the sum of powers possessed by a hero.
     * @param newAbilities
     */
    public void acquirePowers(SuperPower[] newAbilities)
    {
        for (SuperPower newAbility: newAbilities)
        {
            if (available_abilities.add(newAbility))
            {
                abilities_sum = abilities_sum + newAbility.getValue();
            }
        }
    }

    /**
     * Lose a power and update the sum of powers possessed by a hero.
     * @param removedAbility
     */
    public void deleteAbility(SuperPower[] removedAbility)
    {
        for (SuperPower oldAbility : removedAbility)
        {
            if (available_abilities.remove(oldAbility))
            {
                abilities_sum = abilities_sum - oldAbility.getValue();
            }
        }
    }

    @Override
    public void switchIdentity()
    {
        super.setReal_identity();
        enhanced_human = !enhanced_human;
    }

    @Override
    public boolean hasPower(SuperPower issued_ability)
    {
        return (enhanced_human) &&
                (available_abilities.contains(issued_ability));
    }

    @Override
    public int totalPower()
    {
        return (enhanced_human ? abilities_sum : 0);
    }
}
