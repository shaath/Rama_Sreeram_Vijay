package methods;

import java.io.IOException;

public class OrgHRMLogin {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		OrgHRMLib om=new OrgHRMLib();
		
		String res=om.Org_Launch("http://orangehrm.qedgetech.com");
		System.out.println("Application Launch "+res);
		
		res=om.Org_Login("Admin", "Qedge123!@#");
		System.out.println("Application Login "+res);
		
		res=om.Org_Logout();
		System.out.println("Application Logout "+res);
		
		om.Org_Close();
		System.out.println("Application Closed Successfully");
				
	}

}
