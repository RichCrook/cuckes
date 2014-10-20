import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.junit.Test;

@RunWith(Cucumber.class)
@CucumberOptions(format = "pretty")
public class CukeTest {
  @Test
  public void doit() {}
}
