/* For each way of cleaning up the code given in the book chapters, come up with examples that
 * specify what a bad code looks like and how you can clean that code. You can use your previously
 * written codes and clean them up. Create a github folder named cc_homework_2 and save a
 * cc_bad_code file for the example and a cc_clean_code file for any solution (any programming
 * language). Share the github repo link in Microsoft Teams.
 */

public class cc_bad_code_4 {
    private String article;
    private String group;
    
    public static void main(String args[]) {
        cc_bad_code_4 AgeGroup = new cc_bad_code_4();
        AgeGroup.printAgeGroup("Marcus", 666);  // Just an example, don't mind the age!
    }
    
    /* messageArticle function: determines the article (a/an) used for the final message
     * based on the population group based on the input age integer.
     */
    public void messageArticle(int age){
        if (age < 25){
            article = "a";
        } else if (age >= 25){
            article = "an";
        }
    }
    
    /* ageGroup function: if age meets a certain integer range, the person belongs to the
     * specific population group
     */
    
    public void ageGroup(int age){
        if (age <= 2){
            group = "baby"; // up to 2 years old and under is baby
        } else if (age > 2 && age <= 10 ){
            group = "child"; // 3 to 10 years old is child
        } else if (age > 10 && age <= 17){
            group = "teenager"; // 11 to 17 years old is teenager
        } else if (age > 17 && age <= 24){
            group = "young adult"; // 18 to 24 years old is young adult
        } else if (age > 24 && age <= 60){
            group = "adult"; // 25 to 60 years old is adult
        } else if (age > 60){
            group = "elderly"; // above 60 years old is elderly
        }
    }
    
    /* printAgeGroup function: prints the age group guessed by the program based on
     * the age input by the user. 
     */
    public void printAgeGroup(String person, int age){
        messageArticle(age);
        ageGroup(age);
        String guessAgeGroup = String.format("%s is %s %s", person, article, group);
        System.out.println(guessAgeGroup);
    }
}