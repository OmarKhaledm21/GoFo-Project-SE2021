import Player_Playground_model.PlaygroundOwner;
import Player_Playground_model.Player;
import System_model.SystemValidation;

import java.util.Scanner;

public class Main {
    public static void main(String[] arg){
        SystemValidation sys_ver = new SystemValidation();
        Scanner input = new Scanner(System.in);
        systemMenu();
        int choice = input.nextInt();
        while (choice!=5) {
            int sub_choice;
            String username;
            String password;

            String name;
            String ID;
            String reg_password;
            String phone;
            String location;

            switch (choice) {
                case 1:
                    if(sys_ver.getPlayerCount()==0){
                        System.out.println("No players are registered in the system!");
                    }else{
                        System.out.println("Please enter username and password: ");
                        username = input.next();
                        password = input.next();
                        Player player = sys_ver.playerValidation(username,password);
                        System.out.println("\n1- Display available playgrounds\n2- Book a playground\n3- View bookings\n4- eWaller Menu\n5- Exit");
                        sub_choice= input.nextInt();
                        while (sub_choice!=5) {
                            switch (sub_choice){
                                case 1:
                                    sys_ver.displayPlaygrounds();
                                    break;
                                case 2:
                                    System.out.println("Input number of playground: ");
                                    int playgroundNum = input.nextInt();
                                    player.setBooking(sys_ver.getPlayground(playgroundNum));
                                    break;
                                case 3:
                                    if(player.getBooking()==null){
                                        System.out.println("No Bookings to show!");
                                    }else {
                                        player.displayBookings();
                                    }
                                    break;
                                case 4:
                                    player.init_eWallet();
                                    break;
                                case 5:
                                    break;
                                default:
                                    System.out.println("Invalid choice!");
                                    break;
                            }
                            System.out.println("\n1- Display available playgrounds\n2- Book a playground\n3- View bookings\n4- eWallet Menu\n5- Exit");
                            sub_choice= input.nextInt();
                        }
                    }
                    break;
                case 2:
                    if(sys_ver.getPlaygroundOwnerCount()==0){
                        System.out.println("No playground owners are registered in the system!");
                    }else {
                        System.out.println("Please enter username and password: ");
                        username = input.next();
                        password = input.next();
                        PlaygroundOwner playgroundOwner = sys_ver.playgroundOwnerValidation(username, password);
                        System.out.println("\n1- Register a playground\n2- View my playgrounds\n3- Exit");
                        sub_choice = input.nextInt();
                        while (sub_choice != 3) {
                            String playgroundName;
                            String playgroundLocation;
                            int playgroundSize;
                            int validTimes;
                            double price;
                            switch (sub_choice) {
                                case 1:
                                    System.out.println("Please enter playground name, location, size, valid time slots, price respectively: ");
                                    playgroundName = input.next();
                                    playgroundLocation = input.next();
                                    playgroundSize = input.nextInt();
                                    validTimes = input.nextInt();
                                    price = input.nextDouble();
                                    sys_ver.registerPlayground(playgroundOwner, playgroundName, playgroundLocation, playgroundSize, validTimes, price);
                                    break;
                                case 2:
                                    int playgrounds_count = playgroundOwner.getOwnedPlaygrounds().size();
                                    if(playgrounds_count==0){
                                        System.out.println("You have not registered any playgrounds yet");
                                    }else {
                                        playgroundOwner.displayOwnedPlaygrounds();
                                    }
                                    break;
                                case 3:
                                    break;
                                default:
                                    System.out.println("Invalid choice!");
                                    break;
                            }
                            System.out.println("\n1- Register a playground\n2- View my playgrounds\n3- Exit");
                            sub_choice = input.nextInt();
                        }
                    }
                    break;
                case 3:
                    System.out.println("Please enter your name, ID, password, phone, location respectively: ");
                    name = input.next();
                    ID = input.next();
                    reg_password = input.next();
                    phone = input.next();
                    location = input.next();
                    Player player1 = sys_ver.registerPlayer(name,ID,reg_password,phone,location);
                    System.out.println("\n1- Display available playgrounds\n2- Book a playground\n3- View bookings\n4- eWallet Menu\n5- Exit");
                    sub_choice= input.nextInt();
                    while (sub_choice!=5) {
                        switch (sub_choice){
                            case 1:
                                sys_ver.displayPlaygrounds();
                                break;
                            case 2:
                                System.out.println("Input number of playground: ");
                                int playgroundNum = input.nextInt();
                                player1.setBooking(sys_ver.getPlayground(playgroundNum));
                                break;
                            case 3:
                                player1.displayBookings();
                                break;
                            case 4:
                                player1.init_eWallet();
                                break;
                            case 5:
                                break;
                            default:
                                System.out.println("Invalid choice!");
                                break;
                        }
                        System.out.println("\n1- Display available playgrounds\n2- Book a playground\n3- View bookings\n4- eWallet Menu\n5- Exit");
                        sub_choice= input.nextInt();
                    }
                    break;
                case 4:
                    System.out.println("Please enter your name, ID, password, phone, location respectively: ");
                    name = input.next();
                    ID = input.next();
                    reg_password = input.next();
                    phone = input.next();
                    location = input.next();
                    PlaygroundOwner playgroundOwner1 = sys_ver.registerPlaygroundOwner(name,ID,reg_password,phone,location);
                    System.out.println("\n1- Register a playground\n2- View my playgrounds\n3- Exit");
                    sub_choice= input.nextInt();
                    while (sub_choice!=3) {
                        String playgroundName;
                        String playgroundLocation;
                        int playgroundSize;
                        int validTimes;
                        double price;
                        switch (sub_choice) {
                            case 1:
                                System.out.println("Please enter playground name, location, size, valid time slots, price respectively: ");
                                playgroundName=input.next();
                                playgroundLocation=input.next();
                                playgroundSize=input.nextInt();
                                validTimes= input.nextInt();
                                price= input.nextDouble();
                                sys_ver.registerPlayground(playgroundOwner1,playgroundName,playgroundLocation,playgroundSize,validTimes,price);
                                break;
                            case 2:
                                int playgrounds_count = playgroundOwner1.getOwnedPlaygrounds().size();
                                if(playgrounds_count==0){
                                    System.out.println("You have not registered any playgrounds yet");
                                }else {
                                    playgroundOwner1.displayOwnedPlaygrounds();
                                }
                                break;
                            case 3:
                                break;
                            default:
                                System.out.println("Invalid choice!");
                                break;
                        }
                        System.out.println("\n1- Register a playground\n2- View my playgrounds\n3- Exit");
                        sub_choice=input.nextInt();
                    }
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Invalid option!");
                    break;
            }
            systemMenu();
            choice = input.nextInt();
        }
    }
    public static void systemMenu(){
        System.out.println("*************Welcome to GO-FO*************\n");
        System.out.println("1- Login as Player\n2- Login as Playground Owner\n3- Register as Player\n4- Register as Playground Owner\n5- Exit\n");
    }
}
