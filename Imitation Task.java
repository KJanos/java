class FC {
    public String name;
    protected void setName (String name) {
        this.name = name;
    }
    protected String getName () {
        return name;
    }
    public String color;
    protected void setColor (String color) {
        this.color = color;
    }
    protected String getColor () {
        return color;
    }
    public String captain;
    protected void setCaptain (String captain) {
        this.captain = captain;
    }
    protected String getCaptain () {
        return captain;
    }
    public String director;
    protected void setDirector (String director) {
        this.director = director;
    }
    protected String getDirector () {
        return director;
    }
    public String budget;
    protected void setBudget (String budget) {
        this.budget = budget;
    }
    protected String getBudget () {
        return budget;
    }
    public String coach;
    protected void setCoach (String coach) {
        this.coach = coach;
    }
    protected String getCoach () {
        return coach;
    }
    public String owner;
    protected void setOwner (String owner) {
        this.owner = owner;
    }
    protected String getOwner () {
        return owner;
    }
    public int year;
    protected void setYear (int year) {
        this.year = year;
    }
    protected int getYear () {
        return year;
    }
}


class FC1 extends FC {
    public static void main (String[] args) {
        FC1 chelsea = new FC1();
        chelsea.setName ("Chelsea FC");
        chelsea.setColor ("blue");
        chelsea.setCaptain ("John Terry");
        chelsea.setDirector ("Bruce Buck");
        chelsea.setBudget ("100 000 000 $");
        chelsea.setCoach ("Jose Mourinho");
        chelsea.setOwner ("Roman Abramovich");
        chelsea.setYear (1905);
        System.out.println ("My Club:\nName: " + chelsea.getName() + "\nColor: " + chelsea.getColor() + "\nCaptain: " + chelsea.getCaptain() + "\nDirector: " + chelsea.getDirector() + "\nBudget: " + chelsea.getBudget() + "\nCoach: " + chelsea.getCoach() + "\nOwner: " + chelsea.getOwner() + "\nYear: " + chelsea.getYear());
    }
}


class FC2 extends FC {
    public static void main (String args[]){
        FC1 RM = new FC1();
        RM.setName("Real Madrid FC");
        RM.setColor("Creamy");
        RM.setCaptain("Iker Casillas");
        RM.setDirector("Florentino Perez");
        RM.setBudget("150 000 000 $");
        RM.setCoach("Carlo Ancelotti");
        RM.setOwner("Socios");
        RM.setYear(1902);
        System.out.println ("My Club:\nName: " + RM.getName() + "\nColor: " + RM.getColor() + "\nCaptain: " + RM.getCaptain() + "\nDirector: " + RM.getDirector() + "\nBudget: " + RM.getBudget() + "\nCoach: " + RM.getCoach() + "\nOwner: " + RM.getOwner() + "\nYear: " + RM.getYear());
    } 
}
