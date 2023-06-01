package IPL.Players.Country;

import IPL.CSK;
import IPL.RCB;
import IPL.Players.Player;
import IPL.Players.country;




class Main {
    public static void main(String args[]) {
        RCB r = new RCB();
        r.setBrandAmbassador("Ranvir singh");
        r.setNetWorth(697_000000000.0);
        r.setCaptain("Faf du Plessis");


        Player p = new Player();
        p.setName("virat");
        p.setAge(35);
        p.setCountry(country.INDIA);
        
        Player p1 = new Player();
        p1.setName("Ab devillers");
        p1.setCountry(country.NEWZLAND);
         

        Player rcbPlayers[] = {p,p1};
        r.setPlayers(rcbPlayers);

        System.out.println(r);

        CSK c  = new CSK();
        c.setBrandAmbassador("Rohit Sharma");
        c.setNetWorth(127_000);
        c.setCaptain("Ms-Dhoni");

        Player p2= new Player();
        p2.setName("Ms-Dhoni");
        p2.setAge(35);
        p2.setCountry(country.INDIA);
        
        Player p3 = new Player();
        p3.setName("Ab devillers");
        p3.setCountry(country.ENGLAND);

        Player cskPlayers[] = {p2,p3};
        c.setPlayers(cskPlayers);

        System.out.println(c);
         



    }
}
