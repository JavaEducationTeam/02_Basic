/*
 */
package hu.javagladiators.app.hero;

import java.util.Comparator;

/**
 * @author krisztian
 */
public class AvailableHeroComparator implements Comparator<AvailableHero>{

    @Override
    public int compare(AvailableHero o1, AvailableHero o2) {
        return (o1.getType().getPrioritization()>o2.getType().getPrioritization())?1:-1;
    }
    
}
