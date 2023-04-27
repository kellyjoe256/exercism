abstract class Fighter {

    boolean isVulnerable() {
        return false;
    }

    @Override
    public String toString() {
        return String.format("Fighter is a %s", getClass().getName());
    }

    abstract int damagePoints(Fighter fighter);

}

class Warrior extends Fighter {

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    int damagePoints(Fighter wizard) {
        return wizard.isVulnerable() ? 10 : 6;
    }
}

class Wizard extends Fighter {

    private boolean prepareSpell;

    @Override
    boolean isVulnerable() {
        return ! prepareSpell;
    }

    @Override
    int damagePoints(Fighter warrior) {
        return isVulnerable() ? 3 : 12;
    }

    void prepareSpell() {
        prepareSpell = true;
    }

}
