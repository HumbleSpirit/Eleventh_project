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

public class Eleventh_project {

   static int Fact (int num)
        {
            if (num <= 1)
            {
                System.out.println(num + " here");
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
        Fact(5);
    }
    
}
