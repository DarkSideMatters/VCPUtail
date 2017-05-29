package pg;

import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) {
    System.out.println("Welcome to the awesome CPU program");
    
    Program factorial = new Program("01001010", "00010000", "00001100", "11000110", "00010010", "00001111", "00110010", "00000111", "10001100", "01000010", "00100001", "00011000", "00010000", "00010111", "00010000", "00001100", "11000110", "00010011", "00010010", "00000010", "00100001", "00011000");
    Program factorial_tail = new Program("01000010", "00010000", "01001010", "00010000", "00001100", "11001000", "00010010", "00001111", "00110010", "00000111", "10001100", "00011001", "00110101", "00000010", "00100010", "00110010", "00010111", "00100001", "00001100", "10001000");
    
    Machine machine = new Machine();
    machine.load(factorial_tail);
    machine.print(System.out);
   // machine.tick();
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("\n-> Press [ENTER] to run an instruction");
    String input = scanner.nextLine();

    while (!input.equalsIgnoreCase("quit")) {
            machine.tick();
            //machine.print(System.out);
            
            if (!machine.getCpu().isRunning()) {
                break;
            }
            
            machine.print(System.out);
            System.out.println("\n-> Press [ENTER] to run next instruction");
            input = scanner.nextLine();
        }
    }
    
  }
