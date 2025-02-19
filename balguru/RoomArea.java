// A program with multiple class

class Room
{
    //object declaration of room class
    float length;
    float breadth;

    //method to get data 
    void getdata(float a, float b)
    {
        //initializing value for given object
        length=a;
        breadth=b;
    }
}

class RoomArea
{
    public static void main(String[] args) 
    {
        float area;
        Room room1 = new Room(); 
        room1.getdata(14,10);
        area = room1.length * room1.breadth;
        System.out.println("Area = " + area);
        
    }
}