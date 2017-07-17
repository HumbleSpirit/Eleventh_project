/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eleventh_project;

class Car
    {
        int maxSpeed;
        String name;
        
        void Print()
        {
            System.out.println(this.name);
        }
        Car() //Дефолтный конструктор
        {
            maxSpeed = 0;
            name = "none";
        }
        Car(int maxSpeed, String name) //Конструктор с параметрами
        {
            this.maxSpeed = maxSpeed;
            this.name = name;
        }
    }
class Car2
    {
        private  int Speed;
        private String name;
        
        void Print()
        {
            System.out.println(this.name);
        }
        Car2() //Дефолтный конструктор
        {
            Speed = 0;
            name = "none";
        }
        Car2(int Speed, String name) //Конструктор с параметрами
        {
            this.Speed = Speed;
            this.name = name;
        }
        public void setSpeed(int sp)
        {
            if (sp < 0)
            {
                Speed = 0;
            }
            else
            {
                Speed = sp;
            }
        }
        public int getSpeed()
        {
            return Speed;
            
        }
    }
class Garage
{
    private Car cars[];
    private int count;
    Garage()
    {
        this.cars = new Car[2];
        this.count = 0;
    }
    void Add(Car car)
    {
        if (count == cars.length)
        {
            Car tempCars[] = new Car[cars.length + 2];
            for (int i = 0; i < cars.length; i++)
            {
                tempCars[i] = cars[i];
            }
            cars = tempCars;
        }
        cars[count] = car;
        count++;
    }
    void Del()
    {
        if (count > 0)
        {
            count--;
            cars[count] = null;
        }
    }   
    void Blast()
        {
            cars = null;
        }
    void Print()
    {
        for (int i = 0; i < count; i++)
        {
            System.out.println(cars[i].name + " " +cars[i].maxSpeed);
        }
    }
    void Print2()
    {
        for (int i = 0; i < cars.length; i++) 
        {
            if(cars[i] != null)
            {
                System.out.println(cars[i].name + " " +cars[i].maxSpeed);
            }
            else if(cars[i] == null )
            {
                System.out.println("No cars");
            }
            
        }
    }
    public void setCount(int cnt)
        {
            if (cnt < 0)
            {
                count = 0;
            }
            else
            {
                count = cnt;
            }
        }
        public int getCount()
        {
            return count;
            
        }
}

public class Eleventh_project {

   static int Fact (int num)
        {
            if (num <= 1)
            {
                return  1;
            }
            return Fact(num - 1) * num;
            //System.out.println(Fact);
        }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* Car car1 = null;
        car1 = new Car();
        Car car2 = new Car(50, "McLaren");
        car1.Print();
        car2.Print();*/
       /* System.out.println(Fact(6));
        Car2 car4 = new Car2();
        car4.setSpeed(5);
        System.out.println(car4.getSpeed());*/
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car(50, "lada");
        Garage garage = new Garage();
        garage.Add(car1);
        garage.Add(new Car());
        garage.Add(car3);
        garage.Add(car4);
        garage.Print();
        //garage.Print2();
       //garage.Del();
       // garage.Print();
        garage.Blast();
        //garage.Print();
        garage.Print2();
    }
    
}
