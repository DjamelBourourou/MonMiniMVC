
package test;

import  javax.servlet.http.HttpServletRequest;
import org.junit.Test;
import static org.mockito.Mockito.*;
public class SimpleMckitoTest {
     
    @Test
    public void testMockitoWorking(){
        HttpServletRequest req=mock(HttpServletRequest.class);
        when(req.getParameter("nom")).thenReturn("Djamel");
        assert
                "Djamel".equals(req.getParameter("nom"));
    }
    
}

