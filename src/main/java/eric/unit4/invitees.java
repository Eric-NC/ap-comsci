package eric.unit4;

class Invitees {
   private final int maxInvitees = 30;
   private final int maxInterestChoices = 4;
   private final int maxMainCourses = 4;
   private String[] Name = new String[maxInvitees];
   private boolean[] RSVP = new boolean[maxInvitees];
   private int[] mainInterest = new int[maxInvitees];
   private int[] mainCourse = new int[maxInvitees];

   public Invitees() {
      populateFirstNames();
      populateLastNames();
      populateRSVP();
      populateMainInterest();
      populateMainCourse();
   }

   public int getMaximumInvitees() {
      return maxInvitees;
   }

   public String getName(int i) {
      return Name[i];
   }

   public boolean getRSVP(int i) {
      return RSVP[i];
   }

   public int getMainInterest(int i) {
      return mainInterest[i];
   }

   public int getMainCourse(int i) {
      return mainCourse[i];
   }

   private void populateFirstNames() {
      String[] nameBank = { "Liam", "Noah", "Oliver", "William", "Elijah", "James", "Benjamin", "Ethan", "Henry",
            "Alexander", "Jacob", "Michael", "Daniel", "Logan", "Jack", "Emma", "Sophia", "Isabella", "Charlotte",
            "Mia", "Abigail", "Emily", "Camila", "Luna", "Avery", "Scarlett", "Penelope", "Victoria", "Grace",
            "Riley" };
      for (int i = 0; i < Name.length; i++)
         Name[i] = nameBank[(int) (Math.random() * maxInvitees)];
   }

   private void populateLastNames() {
      String[] nameBank = { "Smith", "Johnson", "Williams", "Brown", "Jones", "Garcia", "Miller", "Davis", "Rodriguez",
            "Hernandez", "Wilson", "Anderson", "Thomas", "Taylor", "Moore", "Jackson", "Martin", "Thompson", "White",
            "Harris", "Clark", "Lewis", "Robinson", "Walker", "Young", "Allen", "King", "Scott", "Nguen", "Green" };
      for (int i = 0; i < Name.length; i++)
         Name[i] += " " + nameBank[(int) (Math.random() * maxInvitees)];
   }

   private void populateRSVP() {
      for (int i = 0; i < RSVP.length; i++)
         if ((int) (Math.random() * 2) == 1)
            RSVP[i] = true;
         else
            RSVP[i] = false;
   }

   private void populateMainInterest() {
      for (int i = 0; i < mainInterest.length; i++)
         mainInterest[i] = (int) (Math.random() * maxInterestChoices) + 1;
   }

   private void populateMainCourse() {
      for (int i = 0; i < mainCourse.length; i++)
         mainCourse[i] = (int) (Math.random() * maxMainCourses) + 1;

   }
}

class GuessDistribution {
   // NOTE: Made Invitees 0-indexed because why wasn't it in the first place.
   public static void main(String[] args) {
      var invitees = new Invitees();

      isAttending(invitees, 0);
      seatGuests(invitees);
   }

   private static String getInterestName(int i) {
      switch (i) {
         case 1: return "politics";
         case 2: return "sports";
         case 3: return "religion";
         default: return "family";
      }
   }

   private static String getFoodName(int i) {
      switch (i) {
         case 1: return "beef";
         case 2: return "chicken";
         case 3: return "pasta";
         default: return "fish";
      }
   }

   public static void isAttending(Invitees invitees, int attendeeIndex) {
      if (!invitees.getRSVP(attendeeIndex)) {
         System.out.println(invitees.getName(attendeeIndex) + " is not attending.");
      } else {
         System.out.println(
            invitees.getName(attendeeIndex) + " is attending, likes to talk about " + 
            getInterestName(invitees.getMainInterest(attendeeIndex)) + ", and will eat " + 
            getFoodName(invitees.getMainCourse(attendeeIndex)) + ".");
      }
   }

   public static void seatGuests(Invitees invitees) {
      int[][] countByTableByArea = {
         new int[4], new int[4], new int[4], new int[4]
      };
      for (int i = 0; i < invitees.getMaximumInvitees(); i++) {
         int table = invitees.getMainCourse(i);
         int area = invitees.getMainInterest(i);
         
         var isOverflow = ++countByTableByArea[area - 1][table - 1] > 6;
         if (isOverflow) {
            System.out.println("'" + invitees.getName(i) + "' overflowed to area 5.");
         }
      }
   }
}