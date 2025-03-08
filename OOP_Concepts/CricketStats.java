import java.util.Scanner;

class CricketStats {
    double matches, innings, notOut, totalRuns;
    double runsGiven, wicketsTaken;
    double runsScored, ballsFaced;
    double ballsBowled, totalWickets;

    CricketStats() {
        Scanner s = new Scanner(System.in);
        System.out.print("Matches Played: ");
        matches = s.nextInt();
        System.out.print("Innings Played: ");
        innings = s.nextInt();
        System.out.print("Number of times batsman remained not out: ");
        notOut = s.nextInt();
        System.out.print("Total runs Scored: ");
        totalRuns = s.nextInt();
        System.out.print("Runs conceded: ");
        runsGiven = s.nextInt();
        System.out.print("Wickets taken by bowler: ");
        wicketsTaken = s.nextInt();
        System.out.print("Runs scored: ");
        runsScored = s.nextInt();
        System.out.print("Balls faced by batsman: ");
        ballsFaced = s.nextInt();
        System.out.print("Total balls bowled: ");
        ballsBowled = s.nextInt();
        System.out.print("Total Wickets: ");
        totalWickets = s.nextInt();
        s.close();
    }

    void battingAverage() {
        double avg = totalRuns / (innings - notOut);
        System.out.println("Batting Average: " + avg);
    }

    void battingStrikeRate() {
        double strikeRate = (runsScored / ballsFaced) * 100;
        System.out.println("Batting Strike Rate: " + strikeRate);
    }

    void bowlingAverage() {
        double bowlAvg = ballsBowled / totalWickets;
        System.out.println("Bowler's Average: " + bowlAvg);
    }

    void bowlingStrikeRate() {
        double bowlStrike = runsGiven / wicketsTaken;
        System.out.println("Bowling Strike Rate: " + bowlStrike);
    }

    public static void main(String args[]) {
        CricketStats player = new CricketStats();
        player.battingAverage();
        player.battingStrikeRate();
        player.bowlingAverage();
        player.bowlingStrikeRate();
    }
}