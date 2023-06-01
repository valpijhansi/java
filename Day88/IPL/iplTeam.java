package IPL;

public class iplTeam {
    String teamName;
    String teamCaptain;
    int NoOfMembers;
    String state;
    public String getTeamName() {
        return teamName;
    }
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
    public String getTeamCaptain() {
        return teamCaptain;
    }
    public void setTeamCaptain(String teamCaptain) {
        this.teamCaptain = teamCaptain;
    }
    public int getNoOfMembers() {
        return NoOfMembers;
    }
    public void setNoOfMembers(int noOfMembers) {
        NoOfMembers = noOfMembers;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    @Override
    public String toString() {
        return "iplTeam [teamName=" + teamName + ", teamCaptain=" + teamCaptain + ", NoOfMembers=" + NoOfMembers
                + ", state=" + state + "]";
    }
    

    
}
