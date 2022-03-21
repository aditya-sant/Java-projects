package hero;

public interface Hero
{
    /**
     * Function to be overidden by subclasses Superhero, Human, Enhanced Human and Super Human
     * @return the superhero's current alias/name.
     */
    public String currentIdentity();

    /**
     * Switches the current name to the superhero/agent's secret identity.
     */
    public void switchIdentity();
}
