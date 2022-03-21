package hero;

public abstract class Superhero implements Hero
{
    private String temp_identity, alter_ego;

    public Superhero(String real_identity, String full_name)
    {
        this.temp_identity = real_identity;
        this.alter_ego = full_name;
    }


    public String currentIdentity()
    {
        return temp_identity;
    }

    /**
     * Change the hero's current identity by using a temporary variable.
     */
    public void setReal_identity()
    {
        String x = temp_identity;
        temp_identity = alter_ego;
        alter_ego = x;
    }

    /**
     * Check's a hero possesses a certain ability/power.
     * @param issued_ability
     * @return a true or false value
     */
    public abstract boolean hasPower(SuperPower issued_ability);

    /**
     * Calculate the total number of abilities possessed by a hero.
     * @return an integer value, sum of the total number of powers/abilities possessed by a hero.
     */
    public abstract int totalPower();
}
