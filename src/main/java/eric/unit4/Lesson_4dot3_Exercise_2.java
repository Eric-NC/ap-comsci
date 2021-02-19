package eric.unit4;

/*
Microsoft patent an AI to revive your dead loved ones as chatbots
By Suraj Kumar -January 31, 2021
 Share
Ai chatbot
Would you chat with an AI-based bot version of a dead loved one? It�s a question popular dystopian TV show �Black Mirror� asked in its 2nd season. Presently, it appears Microsoft may be readying to ask a similar question of consumers.

A month ago, the U.S. Patent & Trademark Office granted Microsoft a patent for a filing titled � �Creating a Conversational Chatbot of a Specific Person�, first spotted by Input.

Microsoft has been granted a patent that would allow the company to make a chatbot using the personal information of a deceased friend or family member.  

The patent describes creating a chatbot based on the �images, voice data, social media posts, electronic messages�, and more personal data.


 
The idea that you would be able, in the future, to speak to a simulation of someone who has passed on is not new. It is famously the plot of the Black Mirror episode �Be Right Back�, where a young woman uses a service to scrape data from her deceased partner to create a chatbot � and eventually a robot.

A chatbot can then be modeled on the person in question, allowing them to converse with others via a computer.

Obviously, all of this brings the morals and guidelines surrounding post-mortem data into question.

An absence of guidelines surrounding people�s data after they die means that, in theory, anyone could collect the data of a deceased person and give it to a service to create a chatbot without the person�s prior consent.

Will things actually be the equivalent later on? Would guidelines permit companies to make digital versions of human beings without their consent? Would companies take it upon themselves to ask for that consent?

At the moment, answers to the questions surrounding the technology are as murky as the psychological effects surrounding such a service. Obviously, patent filings do not always mean a product will come into existence � the idea might be resurrected years from now, or it might simply be left to rest in peace.

If you like this article so, please follow us on Google News, Facebook, Twitter, and Flipboard for the latest stories and daily updates.

*/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner; // Import the Scanner class to read text files

class Lesson_4dot3_Exercise_2 {
   public static void main(String[] args) {
      String text = readFile(); // use the readFile method to read a textfile
      System.out.println(text);// Prints the content of the text file

      System.out.print("Input a phrase to search: ");

      try (var scanner = new Scanner(System.in)) {
         var keyword = scanner.nextLine();

         System.out.println("Document length = " + text.length());
         System.out.println("Keyword length = " + keyword.length());

         int i = text.indexOf(keyword);
         while (i != -1) {
            System.out.println("Keyword '" + keyword + "' found at index " + i);
            if (i + 1 < text.length()) {
               i = text.indexOf(keyword, i + 1);
            } else break;
         }
      }
   }

   // declare the fidOcurrences method

   // This method read the content of the specific file and returns a string
   public static String readFile() {
      String data = "";
      try {
         return Files.readString(Path.of("AI-to-chatbots.txt"));
      } catch (IOException e) {
         System.out.println("An error occurred. " + e);
      }
      return data;
   }
}