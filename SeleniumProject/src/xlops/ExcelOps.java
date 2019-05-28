package xlops;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import methods.OrgHRMLib;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelOps {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		Date d=new Date();
		System.out.println(d);
		
		DateFormat f1=new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
		String x=f1.format(d);
		System.out.println(x);
		
		String y=((x.replace("/", "")).replace(" ", "")).replace(":","");
		System.out.println(y);
		
		String xlpath="F:\\Rama_Ram_Vijay_Recordings\\Workspace\\SeleniumProject\\src\\testdata\\Emp_TestData.xlsx";
		String xlout="F:\\Rama_Ram_Vijay_Recordings\\Workspace\\SeleniumProject\\src\\results\\EmpRes"+y+".xlsx";
		FileInputStream fi=new FileInputStream(xlpath);
		
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("EmpReg");
		
//		XSSFRow r=ws.getRow(9);
//		XSSFCell c=r.getCell(1);
		
//		System.out.println(c.getStringCellValue());
		
		int Rc=ws.getLastRowNum();
		System.out.println(Rc);
		
		OrgHRMLib om=new OrgHRMLib();
		om.Org_Launch("http://orangehrm.qedgetech.com");
		om.Org_Login("Admin", "Qedge123!@#");
		
		for (int i = 1; i <= Rc; i++)
		{
			XSSFRow r=ws.getRow(i);
			
			XSSFCell c=r.getCell(0);
			XSSFCell c1=r.getCell(1);
			XSSFCell c2=r.getCell(2);
			XSSFCell c3=r.createCell(3);
			
			String f=c.getStringCellValue();
			String l=c1.getStringCellValue();
			String Eid=c2.getStringCellValue();
			
			System.out.println(f+"---"+l+"---"+Eid);
			
			String res=om.Org_EmpReg(f, l, Eid);
			
			c3.setCellValue(res);
		}
		
		FileOutputStream fo=new FileOutputStream(xlout);
		wb.write(fo);
		wb.close();
		om.Org_Logout();
		om.Org_Close();
		
	}

}