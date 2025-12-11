/*
scraper.py
Takes a URl string input and scrapes direct image URLs on the page
*/

import java.util.Scanner;

public class ScraperService {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter site URL: ");
        String url = scanner.nextLine();

        System.out.println("Scraping site \"" + url + "\" ...");

        scanner.close();
    }

}