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
       // Fact(5);
        Car2 car4 = new Car2();
        car4.setSpeed(-5);
        System.out.println(car4.getSpeed());
        
    }
    
}
