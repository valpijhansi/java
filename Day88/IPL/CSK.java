package IPL;

import IPL.Players.Player;

public class CSK extends iplTeam{
    String BrandAmbassador;
    String Captain;
    int netWorth;
    public String getBrandAmbassador() {
        return BrandAmbassador;
    }
    public void setBrandAmbassador(String brandAmbassador) {
        BrandAmbassador = brandAmbassador;
    }
    public String getCaptain() {
        return Captain;
    }
    public void setCaptain(String captain) {
        Captain = captain;
    }
    public int getNetWorth() {
        return netWorth;
    }
    public void setNetWorth(int netWorth) {
        this.netWorth = netWorth;
    }
    @Override
    public String toString() {
        return "CSK [BrandAmbassador=" + BrandAmbassador + ", Captain=" + Captain + ", netWorth=" + netWorth + "]";
    }
    public void setPlayers(Player[] cskPlayers) {
    }
    
    
}
