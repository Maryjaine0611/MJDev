import org.junit.Test;

/**
 * Created by kellidennis on 10/3/16.
 */
public class FindCheese {

    private ToolBoxUtil toolBox;

    @Test
    public void FindCheeseTest(){
        toolBox = new ToolBoxUtil("CHROME");
        searchForCheese();
    }

//Google image of cheese

    private void searchForCheese(){
        toolBox.getDriver();
        //imp wait 5 secs
        toolBox.impWait();
        //Set Target URL
        toolBox.getDriver().get("https://www.google.com/");
        //Search for Cheese
        toolBox.searchForCheese();
        //Click images
        toolBox.clickGoogleImages();


    }

}
