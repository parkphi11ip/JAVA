//package oop.multi2;
//
////다음 요구사항에 맞게 프로그램을 구현
////
////요구사항
////
////- 드론(Drone), 비행기(Airplane), 기차(Train), 버스(Bus), 전동킥보드(Kickboard) 클래스를 준비
////- 드론과 전동킥보드는 전기로 움직이는 전자제품(Electronic) 입니다.
////	- 전자제품은 반드시 전원을 켜고(on) 끄는(off) 기능이 있어야 합니다.
////	- 메세지는 단순 텍스트 메세지로 출력하도록 구현합니다(ex : OOO의 전원을 켭니다 / 끕니다)
////- 드론, 버스, 비행기, 기차, 전동킥보드는 이동수단(Transportation) 입니다.
////	- 이동수단은 반드시 이동(move) 기능이 있어야 합니다.
////	- 메세지는 단순 텍스트 메세지로 출력하도록 구현합니다(ex : OOO가 이동합니다)
////- 드론과 비행기는 비행이 가능(Flyable)한 공통점이 있습니다
////	- 비행이 가능한 물체들은 반드시 비행(fly) 기능이 있어야 합니다.
////	- 메세지는 단순 텍스트 메세지로 출력하도록 구현합니다(ex : OOO가 비행합니다)
////- 비행기, 기차는 예약이 가능한(Reserve) 공통점이 있습니다
////	- 예약이 가능한 객체들에는 반드시 예약(reservation)이라는 기능이 있어야 합니다
////	- 메세지는 단순 텍스트 메세지로 출력하도록 구현합니다(ex : OOO를 예약합니다)
////- 모든 일반 클래스의 객체를 만들어서 이용 가능한 기능을 호출해보세요
//
//interface Electronic {
//    public void turnOn();
//    public void turnOff();
//}
//
//interface Transportation {
//    public void move();
//}
//
//interface Flyable {
//    public void fly();
//}
//
//interface Reserve {
//    public void reservation();
//}
//
//class Drone implements Electronic, Transportation, Flyable {
//    public void turnOn() {
//        System.out.println("Drone's power is on");
//    }
//    public void turnOff() {
//        System.out.println("Drone's power is off");
//    }
//    public void move() {
//        System.out.println("Drone is moving");
//    }
//    public void fly() {
//        System.out.println("Drone is flying");
//    }
//}
//
//class Airplane implements Transportation, Flyable, Reserve {
//    public void move() {
//        System.out.println("Airplane is moving");
//    }
//    public void fly() {
//        System.out.println("Airplane is flying");
//    }
//    public void reservation() {
//        System.out.println("Airplane Reservation is done.");
//    }
//}
//
//class Train implements Transportation, Reserve {
//    public void move() {
//        System.out.println("Train is moving");
//    }
//    public void reservation() {
//        System.out.println("Train Reservation is done.");
//    }
//}
//
//class Bus implements Transportation {
//    public void move() {
//        System.out.println("Bus is moving");
//    }
//}
//
//class Kickboard implements Electronic, Transportation {
//    public void turnOn() {
//        System.out.println("Kickboard's power is on");
//    }
//    public void turnOff() {
//        System.out.println("Kickboard's power is off");
//    }
//    public void move() {
//        System.out.println("Kickboard is moving");
//    }
//}
