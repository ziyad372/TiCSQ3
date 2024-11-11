package Final_assignment;

public class P1 {

    public static void shuffle(String []arr){

            for (int i = 0; i < arr.length; i++) {
                int index = (int) (Math.random() * arr.length);
                String temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            }
    }
    public static void main(String[] args) {

        String []arr = {"2 of Spades","3 of Spades","4 of Spades","5 of Spades","6 of Spades","7 of Spades",
                "8 of Spades","9 of Spades","10 of Spades","2 of Clubs","3 of Clubs","4 of Clubs"
                ,"5 of Clubs","6 of Clubs","7 of Clubs","8 of Clubs","9 of Clubs","10 of Clubs",
                "2 of Hearts","3 of Hearts","4 of Hearts","5 of Hearts","6 of Hearts","7 of Hearts",
                "8 of Hearts","9 of Hearts","10 of Hearts","2 of Diamonds","3 of Diamonds","4 of Diamonds",
                "5 of Diamonds","6 of Diamonds","7 of Diamonds","8 of Diamonds","9 of Diamonds","10 of Diamonds",
                "Ace of Diamonds","Queen of Diamonds","King of Diamonds","Jack of Diamonds",
                "Ace of Hearts","Queen of Hearts","King of Hearts","Jack of Hearts",
                "Ace of Clubs","Queen of Clubs","King of Clubs","Jack of Clubs",
                "Ace of Spades","Queen of Spades","King of Spades","Jack of Spades"};


        int average = 0;

        for (int k = 0; k < 10000; k++){
            shuffle(arr);

            boolean spades = true;
            boolean clubs = true;
            boolean diamonds = true;
            boolean hearts = true;

            String []found = new String[4];
            int countFound = 0;

            int count = 0;

            while (true){
                if (count == 52 || countFound == 4){
                    break;
                }
                String [] data = arr[count].split(" ");
                String word = data[2];

                switch (word){
                    case "Spades":
                        if(spades){
                            spades = false;
                            found[countFound] = arr[count];
                            countFound++;
                        }
                        break;
                    case "Clubs":
                        if(clubs){
                            clubs = false;
                            found[countFound] = arr[count];
                            countFound++;
                        }

                        break;
                    case "Hearts":
                        if(hearts){
                            hearts = false;
                            found[countFound] = arr[count];
                            countFound++;
                        }

                        break;
                    case "Diamonds":
                        if(diamonds){
                            diamonds = false;
                            found[countFound] = arr[count];
                            countFound++;
                        }
                        break;
                    default:
                        break;
                }
                count++;
            }

            System.out.println("no. "+(k+1));
            for (int i = 0; i < 4; i++){
                System.out.println(found[i]);
            }
            System.out.println("Number of Picks: "+count);
            System.out.println("\n");
            average += count;

        }

        System.out.println("The average picks are: "+(average/10000));

    }
}
