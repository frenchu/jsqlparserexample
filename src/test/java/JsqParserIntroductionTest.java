import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JsqParserIntroductionTest {

    private String query = "SELECT report_id FROM report WHERE NAV > @NavGUI AND status = 'IN_PROGRESS'";

    @Test
    public void verifySQLBuilder(){
        assertEquals(query, JsqlParserIntroduction.buildQuery());
    }
}
