import java.util.Scanner;
import java.util.Random;

public class CyberTraderGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        
        int[] priceHistory = new int[7]; // เก็บราคาย้อนหลัง 7 วัน
        int balance = 1000;
        int inventory = 0;

        // สุ่มราคาเริ่มต้น
        for (int i = 0; i < priceHistory.length; i++) {
            priceHistory[i] = rand.nextInt(50) + 50; 
        }

        System.out.println("\033[1;35m" + "=== CYBER-TRADER 2025: INITIALIZING... ===" + "\033[0m");

        while (true) {
            int currentPrice = priceHistory[priceHistory.length - 1];
            double avg = ArrayStats.calculateAverage(priceHistory);
            int max = ArrayStats.findMaximum(priceHistory);
            
            // --- DRAW MODERN DASHBOARD ---
            System.out.println("\n------------------------------------------");
            System.out.printf(" WALLET: \033[1;32m$%d\033[0m | ASSETS: %d units\n", balance, inventory);
            System.out.println("------------------------------------------");
            
            // วาดกราฟแท่ง (Visual Resolution)
            for (int p : priceHistory) {
                String color = (p >= avg) ? "\033[1;32m" : "\033[1;31m";
                System.out.print(String.format("%3d | ", p));
                System.out.print(color);
                for (int i = 0; i < p / 5; i++) System.out.print("■");
                System.out.println("\033[0m");
            }
            
            System.out.println("------------------------------------------");
            System.out.printf("STAT -> AVG: %.2f | MAX: %d | MIN: %d\n", avg, max, ArrayStats.findMinimum(priceHistory));
            System.out.println("------------------------------------------");
            System.out.print("ACTION: (1)BUY (2)SELL (3)NEXT DAY (0)EXIT: ");
            
            int choice = scanner.nextInt();

            if (choice == 1 && balance >= currentPrice) {
                balance -= currentPrice;
                inventory++;
                System.out.println(">> Purchased at $" + currentPrice);
            } else if (choice == 2 && inventory > 0) {
                balance += currentPrice;
                inventory--;
                System.out.println(">> Sold at $" + currentPrice);
            } else if (choice == 0) break;

            // Update Price History (เลื่อน Array ไปข้างหน้า)
            for (int i = 0; i < priceHistory.length - 1; i++) {
                priceHistory[i] = priceHistory[i + 1];
            }
            priceHistory[priceHistory.length - 1] = rand.nextInt(80) + 40; // ราคาใหม่
        }
        
        System.out.println("\033[1;35m" + "GAME OVER. TOTAL WEALTH: $" + balance + "\033[0m");
    scanner.close();
    }
    
}