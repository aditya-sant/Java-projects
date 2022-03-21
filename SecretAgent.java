package hero;

public class SecretAgent implements Hero
{
    private String name, altergo, gadget;
    public SecretAgent(String name, String alterego, String gadget) {
        this.name = name;
        this.altergo = alterego;
        this.gadget = gadget;
    }

    public String getGadget()
    {
        return gadget;
    }

    @Override
    public String currentIdentity()
    {
        return name;
    }

    @Override
    public void switchIdentity()
    {
        String x;
        x = name;
        name = altergo;
        altergo = x;
    }
}
