import org.junit.Test;

/**
 * Created by kellidennis on 10/12/16.
 */
public class FindARecipe {

    private ToolBoxUtil toolBox;

    @Test
    public void FindARecipe(){
        toolBox = new ToolBoxUtil("CHROME");
        findARecipe();
    }



    //Search for a dinner recipe

        private void findARecipe(){
            toolBox.getDriver();
            //imp wait 5 secs
            toolBox.impWait();
            //Set Target URL
            toolBox.getDriver().get("http://paleoleap.com/");
            //Click browse recipes
            toolBox.clickBrowseRecipes();
            //click poultry
            toolBox.clickPoultry();
            //click recipe
            toolBox.clickRecipe();

    }
}
