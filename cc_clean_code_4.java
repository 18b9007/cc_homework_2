// cc_clean_code_4: refactored code for cc_bad_code_4 (Chapter 4 scenarios)

public class cc_clean_code_4 {
    private String article;
    private String group;
    
    public static void main(String args[]) {
        cc_clean_code_4 AgeGroup = new cc_clean_code_4();
        AgeGroup.printAgeGroup("Marcus", 666);
    }
    
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

    public void printAgeGroup(String person, int age){
        messageArticle(age);
        ageGroup(age);
        String guessAgeGroup = String.format("%s is %s %s", person, article, group);
        System.out.println(guessAgeGroup);
    }
}