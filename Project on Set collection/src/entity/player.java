package entity;

public class player {
    private int jerseyno;
    private String name;
    private int runs;
    private int wickets;
    private String team;

    public player() {
    }

    public player(int jerseyno, String name, int runs, int wickets, String team) {
        this.jerseyno = jerseyno;
        this.name = name;
        this.runs = runs;
        this.wickets = wickets;
        this.team = team;
    }

    public int getJerseyno() {
        return jerseyno;
    }

    public void setJerseyno(int jerseyno) {
        this.jerseyno = jerseyno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public int getWickets() {
        return wickets;
    }

    public void setWickets(int wickets) {
        this.wickets = wickets;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return "player [name=" + name + ", team=" + team + "]";
    }
    

    
    
}
