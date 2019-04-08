public class Countdown extends ConsoleProgram
{
    public void run()
    {
        countdownFrom(10, 5);
    }
    
    private void countdownFrom(int start, int stop)
    {
        int finalCount = start;
        System.out.println(finalCount);
        while(start > stop) {
            finalCount -= 1;
            start -= 1;
            System.out.println(finalCount);
        }     
    }
}
