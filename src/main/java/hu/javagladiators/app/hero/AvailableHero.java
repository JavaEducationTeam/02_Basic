/*
 */
package hu.javagladiators.app.hero;

import hu.javagladiators.app.hero.model.AdministratorType;
import hu.javagladiators.app.hero.model.Hero;
import java.util.Objects;

/**
 * @author krisztian
 */
public class AvailableHero {
    private Hero hero;
    private AdministratorType type;

    public AvailableHero() {
    }

    public AvailableHero(Hero hero, AdministratorType type) {
        this.hero = hero;
        this.type = type;
    }

    public Hero getHero() {
        return hero;
    }

    public void setHero(Hero hero) {
        this.hero = hero;
    }

    public AdministratorType getType() {
        return type;
    }

    public void setType(AdministratorType type) {
        this.type = type;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.hero);
        hash = 89 * hash + Objects.hashCode(this.type);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AvailableHero other = (AvailableHero) obj;
        if (!Objects.equals(this.hero, other.hero)) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        return true;
    }
    
    
}
