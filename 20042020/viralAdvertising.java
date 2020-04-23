    static int viralAdvertising(int n) 
    {
        int shared =5,day =1,liked=2, total =2;
        while(day != n)
        {
            shared = liked*3;
            liked = (int)(Math.floor(shared/2));
            total += liked;
            System.out.println(day+":"+shared+":"+liked+":"+total );
            day++;   
        }
        return total;
    }