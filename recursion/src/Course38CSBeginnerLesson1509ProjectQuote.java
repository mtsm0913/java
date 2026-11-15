class Course38CSBeginnerLesson1509ProjectQuote {
    public static int projectQuote(int devs, int weeks, int hoursPerWeek, int rate, int margin){
        // 関数を完成させてください
        int totalHours = 0;
        int costsPerPerson = 0;
        int costsByTeam = 0;
        int projectQuote = 0;
        totalHours = calTotalHours(weeks, hoursPerWeek);
        costsPerPerson = calCostsPerPerson(totalHours, rate);
        costsByTeam  = calCostsByTeam(devs, costsPerPerson);
        return costsByTeam + margin;
    }
    public static int calTotalHours(int weeks, int hoursPerWeek) {
        return weeks * hoursPerWeek;
    }
    public static int calCostsPerPerson(int totalHours, int rate) {
        return totalHours * rate;
    }
    public static int calCostsByTeam(int devs, int costsPerPerson) {
        return devs * costsPerPerson;
    }
    public static void main(String[] args) {
        System.out.println(projectQuote(3, 4, 40, 5000, 100000));   // 2500000
        System.out.println(projectQuote(1, 1, 40, 3000, 0));        // 120000
        System.out.println(projectQuote(5, 8, 35, 6000, 200000));   // 8600000
    }
}
