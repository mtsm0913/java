public class Course38CSBeginnerLesson1499TicketPrices {
    public static int weekly7DaysSales(int ticketPrice){
        // 関数を完成させてください
        // int diffFromBasePrice = 0;
        // if (ticketPrice == 250) {
        //     return 150_000;
        // } else if (ticketPrice > 250) {
        //     diffFromBasePrice = ticketPrice - 250;
        //     return 150_000 - diffFromBasePrice * 700;
        // } else {
        //     diffFromBasePrice = 250 - ticketPrice;
        //     return 150_000 + diffFromBasePrice * 700;
        // }

        // 模範解答
        return 150_000 + 700 * (250 - ticketPrice);
    }
    public static void main(String[] args){
        System.out.println(weekly7DaysSales(260));   // 143000
        System.out.println(weekly7DaysSales(255));   // 146500
        System.out.println(weekly7DaysSales(220));   // 171000
    }
}