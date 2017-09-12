/*
 */
package hu.javagladiators.app.hero;

import hu.javagladiators.app.hero.model.AdministratorType;
import hu.javagladiators.app.hero.model.Empire;
import hu.javagladiators.app.hero.model.Hero;
import hu.javagladiators.app.hero.model.Location;
import hu.javagladiators.app.hero.model.Province;
import hu.javagladiators.app.hero.model.WorkPlace;
import hu.javagladiators.app.hero.model.WorkPlaceEmpireFull;
import hu.javagladiators.app.hero.model.WorkPlaceEmpirePart;
import hu.javagladiators.app.hero.model.WorkPlaceProvinceFull;
import hu.javagladiators.app.hero.model.WorkPlaceProvincePart;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author krisztian
 */
public class App {
    
    private static final Hero[] heroes = new Hero[3];
    private static final Empire empire = new Empire("A empire","..");
    private static final WorkPlace[] works = new WorkPlace[2];
    private static final AdministratorType mayor = new AdministratorType((byte)1);
    private static final AdministratorType deputyMayor = new AdministratorType( (byte)2);

    static {
        heroes[0]=new Hero("Pókember", "...", true);
        heroes[1]=new Hero("Hulk", "...", true);
        heroes[2]=new Hero("Alien", "...", false);
        
        empire.addProvince(new Province("A province", null));
        empire.getProvinces().get(0).addLocation(new Location("A Location", null));
        empire.getProvinces().get(0).addLocation(new Location("B Location", null));
        empire.addProvince(new Province("B province", null));
        empire.addProvince(new Province("C province", null));
        
        WorkPlace wpEmpireFull = new WorkPlaceEmpireFull();
        wpEmpireFull.setHero(heroes[0]);
        wpEmpireFull.setValidityStart(new Date());
        wpEmpireFull.setValidityEnd(new Date(System.currentTimeMillis()+1000*60*60*24*10));
        ((WorkPlaceEmpireFull)wpEmpireFull).setEmpire(empire);
        wpEmpireFull.setType(mayor);
        works[0] = wpEmpireFull;

        WorkPlaceProvincePart wpProvincePart = new WorkPlaceProvincePart();
        wpProvincePart.setHero(heroes[1]);
        wpProvincePart.setValidityStart(new Date());
        wpProvincePart.setValidityEnd(new Date(System.currentTimeMillis()+1000*60*60*24*10));
        wpProvincePart.setEmpire(empire);
        wpProvincePart.setProvince(wpProvincePart.getEmpire().getProvinces().get(0));
        wpProvincePart.addLocation(wpProvincePart.getProvince().getLocations().get(0));
        wpProvincePart.setType(deputyMayor);
        works[1] = wpProvincePart;
        
    }
    
    public static void main(String[] args) {
        
        for(Hero hero:heroes){
            if(!hero.isAvailable())
                System.out.println(hero.getName()+" szabadságon van");
        }
        System.out.println(getMainAvailableHero(empire.getProvinces().get(0).getLocations().get(0)).getName());
        for(AvailableHero hero:getAvailableHeroes(empire.getProvinces().get(0).getLocations().get(0))){
            System.out.println(hero.getHero().getName());
        
        }
    }
    
    private static boolean isInclude(Location pLocation, Empire pEmpire){
        for(Province province : pEmpire.getProvinces()){
            if(isInclude(pLocation, province))
                return true;
        }
        return false;
    }

    private static boolean isInclude(Location pLocation, Province pProvince){
        for(Location location : pProvince.getLocations())
            if(location.equals(pLocation))
                return true;
        return false;
    }
    
    private static Hero getMainAvailableHero(Location pLocation) throws NullPointerException{
        List<AvailableHero> res = getAvailableHeroes(pLocation);
        if(res != null && !res.isEmpty())
            return res.get(0).getHero();
        throw new NullPointerException("Nincs illetékes hős");
    }
    
    private static List<AvailableHero> getAvailableHeroes(Location pLocation){
        Set<AvailableHero> availables = new HashSet<>();
        for(WorkPlace wp : works){
            if(wp.isActive(new Date()) && wp.getHero().isAvailable()){
                if(wp instanceof WorkPlaceEmpireFull){
                    WorkPlaceEmpireFull tmpWP = (WorkPlaceEmpireFull)wp;
                    if(isInclude(pLocation, empire))
                        availables.add(new AvailableHero(tmpWP.getHero(),tmpWP.getType()));
                }
                
                if(wp instanceof WorkPlaceProvinceFull){
                    WorkPlaceProvinceFull tmpWP = (WorkPlaceProvinceFull)wp;
                    if(tmpWP.getEmpire().equals(empire)){
                        if(isInclude(pLocation, tmpWP.getProvince()))
                            availables.add(new AvailableHero(tmpWP.getHero(),tmpWP.getType()));
                    }
                }
                
                if(wp instanceof WorkPlaceEmpirePart){
                    WorkPlaceEmpirePart tmpWP = (WorkPlaceEmpirePart)wp;
                    if(isInclude(pLocation, empire)){
                        for(Province province : tmpWP.getProvinces())
                            if(isInclude(pLocation, province))
                                availables.add(new AvailableHero(tmpWP.getHero(),tmpWP.getType()));
                    }
                }

                if(wp instanceof WorkPlaceProvincePart){
                    WorkPlaceProvincePart tmpWP = (WorkPlaceProvincePart)wp;
                    if(isInclude(pLocation, empire)){
                        if(isInclude(pLocation, tmpWP.getProvince()))
                            availables.add(new AvailableHero(tmpWP.getHero(),tmpWP.getType()));
                    }
                }                
            }        
        }
        
        List<AvailableHero> tmp = new ArrayList<>(availables);
        Collections.sort(tmp, new AvailableHeroComparator());
        return tmp;
    }

}
