public class cc_bad_code_5 {
	private String group;
    public void messageArticle(int age){
        if (age < 25){
            article = "a";
        } else if (age >= 25){
            article = "an";
        }
    }
    public void ageGroup(int age){
        if (age <= 2){
            group = "baby";
        } else if (age > 2 && age <= 10 ){
            group = "child";
        } else if (age > 10 && age <= 17){
            group = "teenager";
        } else if (age > 17 && age <= 24){
            group = "young adult";
        } else if (age > 24 && age <= 60){
            group = "adult";
        } else if (age > 60){
            group = "elderly";
        }
    }
    private static void printGroceries(String[] gList){
        System.out.println("Grocery list:");
       for(String items: gList)
          System.out.print(items + " ");
    }
    public static void main(String args[]) {
    	cc_bad_code_5 AgeGroup = new cc_bad_code_5();
        AgeGroup.printAgeGroup("Marcus", 666);
    }
    public void printAgeGroup(String person, int age){
        messageArticle(age);
        ageGroup(age);
        String guessAgeGroup = String.format("%s is %s %s", person, article, group);
        System.out.println(guessAgeGroup);
    }
    private String article;
}