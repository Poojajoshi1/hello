package selenium.warapp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.Test;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import org.easymock.EasyMock;
import org.junit.Before;

public class testHelloWorld {


	HttpServletRequest mockReq = null;

	HttpServletResponse mockRes = null;

	PrintWriter mockPW = null;

	@Before
 
	public void setUp() throws Exception {

	mockReq = EasyMock.createNiceMock(HttpServletRequest.class);

	mockRes = EasyMock.createNiceMock(HttpServletResponse.class);

	mockPW = EasyMock.createNiceMock(PrintWriter.class);

	}

	@Test

	public void testdoGet() throws IOException, ServletException{

	Hello h = new Hello();

	EasyMock.expect(mockRes.getWriter()).andReturn(mockPW);

	EasyMock.replay(mockRes);

	h.doGet(mockReq, mockRes);

	}

	


	}

