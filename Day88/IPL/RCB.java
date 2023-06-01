package IPL;

import IPL.Players.Player;

public class RCB extends iplTeam {
    String BrandAmbassador;
    String Captain;
    double netWorth;
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
    public double getNetWorth() {
        return netWorth;
    }
    public void setNetWorth(double d) {
        this.netWorth = d;
    }
    @Override
    public String toString() {
        return "RCB [BrandAmbassador=" + BrandAmbassador + ", Captain=" + Captain + ", netWorth=" + netWorth + "]";
    }
    public void setPlayers(Player[] rcbPlayers) {
    }

    
}
