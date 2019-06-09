package anr;

import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;

public class Excel {

	public static void main(String[] args) throws Exception, IOException
	{
		File f1=new File ("D:\\salman\\Book1.xls");
		Workbook wb=Workbook.getWorkbook(f1);
		Sheet sh=wb.getSheet(0);
		int useredrows=sh.getRows();
		System.out.println(useredrows);
		int numberofuserdcol=sh.getColumns();
		System.out.println(numberofuserdcol);
		String x=sh.getCell(0,0).getContents();
		System.out.println(x);
		String x1=sh.getCell(1,0).getContents();
		System.out.println(x1);
		String x2=sh.getCell(2,0).getContents();
		System.out.println(x2);
	}
}
